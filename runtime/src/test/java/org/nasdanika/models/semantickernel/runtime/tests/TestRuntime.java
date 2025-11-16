package org.nasdanika.models.semantickernel.runtime.tests;

public class TestRuntime {
	
//	protected Kernel createSampleKernel(CapabilityLoader capabilityLoader) {
//		// Building
//		SemantickernelFactory semanticKernelFactory = SemantickernelFactory.eINSTANCE;
//		Kernel kernel = semanticKernelFactory.createKernel();
//		
//		return kernel;
//	}	
//	
//	@Test
//	public void testGenerateCrewDocSite() throws Exception {
//		CapabilityLoader capabilityLoader = new CapabilityLoader();
//		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
//		Kernel kernel = createSampleKernel(capabilityLoader);		
//		MutableContext context = Context.EMPTY_CONTEXT.fork();
//		
//		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
//		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
//				Collections.singleton(kernel), 
//				context,
//				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
//				null, // Predicate<Object> factoryPredicate,
//				null, // Predicate<EPackage> ePackagePredicate,
//				diagnosticConsumer,
//				progressMonitor);
//		
//		File actionModelsDir = new File("target\\action-models\\");
//		actionModelsDir.mkdirs();
//		File output = new File(actionModelsDir, "kernel-actions.xmi");
//		htmlAppGenerator.generateHtmlAppModel(
//				diagnosticConsumer, 
//				output,
//				progressMonitor);
//				
//		// Generating a web site
//		String rootActionResource = "kernel-actions.yml";
//		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
//		
//		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
//			
//			@Override
//			protected Context createContext(ProgressMonitor progressMonitor) {
//				return context;
//			}
//			
//		};		
//		
//		String siteMapDomain = "https://something.org";		
//		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
//				rootActionURI, 
//				Theme.Cerulean.pageTemplateCdnURI, 
//				siteMapDomain, 
//				new File("target/sample-kernel-docs"),  
//				new File("target/kernel-doc-site-work-dir"), 
//				true);
//				
//		int errorCount = 0;
//		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
//			System.err.println(ee.getKey());
//			for (String error: ee.getValue()) {
//				System.err.println("\t" + error);
//				++errorCount;
//			}
//		}
//		
//		System.out.println("There are " + errorCount + " site errors");
//		
//		if (errorCount != 4) {
//			throw new ExecutionException("There are problems with pages: " + errorCount);
//		}				
//	}
	
}
