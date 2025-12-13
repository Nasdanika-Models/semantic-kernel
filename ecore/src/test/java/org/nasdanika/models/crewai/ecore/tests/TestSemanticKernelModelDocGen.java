package org.nasdanika.models.crewai.ecore.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.persistence.MarkerFactory;
import org.nasdanika.exec.content.ContentFactory;
import org.nasdanika.exec.content.Interpolator;
import org.nasdanika.exec.content.Markdown;
import org.nasdanika.exec.content.Text;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreNodeProcessorFactory;
import org.nasdanika.models.semantickernel.SemantickernelPackage;
import org.nasdanika.models.semantickernel.ecore.EcoreGenSemanticKernelProcessorsFactory;
import org.nasdanika.ncore.ModelElement;
//import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestSemanticKernelModelDocGen {
	
	@Test
	public void testGenerateSemanticKernelModelDoc() throws IOException, DiagnosticException {
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		List<Function<URI,Action>> actionProviders = new ArrayList<>();		
		actionProviders.add(this::getAction);
		EcoreGenSemanticKernelProcessorsFactory ecoreGenSemanticKernelProcessorFactory = new EcoreGenSemanticKernelProcessorsFactory(context);		
		EcoreNodeProcessorFactory ecoreNodeProcessorFactory = new EcoreNodeProcessorFactory(
				context, 
				(uri, pm) -> {
					for (Function<URI, Action> ap: actionProviders) {
						Action prototype = ap.apply(uri);
						if (prototype != null) {
							return prototype;
						}
					}
					return null;
				},
				diagnosticConsumer,
				ecoreGenSemanticKernelProcessorFactory);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "semantic-kernel.xmi");
		
		
		Map<EPackage, URI> packageURIMap = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),	
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/"))	
			);
			
		EcoreHtmlAppGenerator eCoreHtmlAppGenerator = new EcoreHtmlAppGenerator(
				SemantickernelPackage.eINSTANCE, 
				packageURIMap, 
				ecoreNodeProcessorFactory);
		
		eCoreHtmlAppGenerator.generateHtmlAppModel(diagnosticConsumer, output, progressMonitor);
				
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		URI pageTeplateURI = URI.createFileURI(new File("page-template.yml").getAbsolutePath());//.appendFragment("/");
		String siteMapDomain = "https://semantic-kernel.models.nasdanika.org";		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path) && !path.startsWith("images/") && !path.startsWith("libraries/");			
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTeplateURI, // Theme.Cerulean.pageTemplateCdnURI, 
				siteMapDomain, 
				new File("../docs"), 
				new File("target/doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errorCount != 100) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
	}
	
	private static final URI BASE_URI = URI.createURI("ecore://nasdanika.org/models/");
	private static final File docDir = new File("doc");
	
	protected Action getAction(URI uri) {
		URI relative = uri.deresolve(BASE_URI);
		if (relative.isRelative()) {
			relative = relative.appendFileExtension("md");
	        Path base = Paths.get(docDir.getPath());
	        Path fullPath = base.resolve(relative.toString());

	        try {
				Files.createDirectories(fullPath.getParent());
				File file = fullPath.toFile();
				if (!file.isFile()) {
					Files.writeString(fullPath, "");
				} else {
					String documentation = Files.readString(fullPath);
					if (!Util.isBlank(documentation)) {
						Action ret = AppFactory.eINSTANCE.createAction();
						Markdown markdown = ContentFactory.eINSTANCE.createMarkdown();
						Interpolator interpolator = ContentFactory.eINSTANCE.createInterpolator();
						Text text = ContentFactory.eINSTANCE.createText();
						text.setContent(documentation);
						interpolator.setSource(text);
						markdown.setSource(interpolator);
						markdown.setStyle(true);
						
						org.nasdanika.ncore.Marker marker = MarkerFactory.INSTANCE.createMarker(fullPath.toString(), null);
						markdown.getMarkers().add(marker); 
						ret.getContent().add(markdown);
						
						return ret;
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return null;						
	}
				
}
