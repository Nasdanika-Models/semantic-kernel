package org.nasdanika.models.semantickernel.doc.tests;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;
import org.nasdanika.models.semantickernel.Kernel;
import org.nasdanika.models.semantickernel.SemantickernelFactory;

public class TestDocSiteGen {
	
	protected Kernel createSampleKernel(CapabilityLoader capabilityLoader) {
		// Building
		SemantickernelFactory semanticKernelFactory = SemantickernelFactory.eINSTANCE;
		Kernel kernel = semanticKernelFactory.createKernel();
		
		return kernel;
	}	
	
	@Test
	public void testGenerateCrewDocSite() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Kernel kernel = createSampleKernel(capabilityLoader);		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
				Collections.singleton(kernel), 
				context,
				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
				null, // Predicate<Object> factoryPredicate,
				null, // Predicate<EPackage> ePackagePredicate,
				diagnosticConsumer,
				progressMonitor);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "kernel-actions.xmi");
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "kernel-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			@Override
			protected Context createContext(ProgressMonitor progressMonitor) {
				return context;
			}
			
		};		
		
		String siteMapDomain = "https://something.org";		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				Theme.Cerulean.pageTemplateCdnURI, 
				siteMapDomain, 
				new File("target/sample-kernel-docs"),  
				new File("target/kernel-doc-site-work-dir"), 
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
		
		if (errorCount != 4) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}				
	}
	
}
