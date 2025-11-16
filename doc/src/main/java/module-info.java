import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.semantickernel.doc.SemanticKernelNodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.semantickernel.doc {
		
	requires transitive org.nasdanika.models.semantickernel;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.semantickernel.doc;
	opens org.nasdanika.models.semantickernel.doc; // For loading resources

	provides CapabilityFactory with	SemanticKernelNodeProcessorFactoryCapabilityFactory;
	
}
