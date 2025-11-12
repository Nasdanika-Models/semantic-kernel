import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.semantickernel.util.SemanticKernelEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.semantickernel {
	exports org.nasdanika.models.semantickernel;
	exports org.nasdanika.models.semantickernel.impl;
	exports org.nasdanika.models.semantickernel.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.emf;
	
	provides CapabilityFactory with SemanticKernelEPackageResourceSetCapabilityFactory;
	
}