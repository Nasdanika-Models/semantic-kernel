import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.semantickernel.ecore.ECoreGenSemanticKernelProcessorsCapabilityFactory;

module org.nasdanika.models.semantickernel.ecore {
		
	requires transitive org.nasdanika.models.semantickernel;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.semantickernel.ecore;
	opens org.nasdanika.models.semantickernel.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenSemanticKernelProcessorsCapabilityFactory; 		
	
}
