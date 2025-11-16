module org.nasdanika.models.semantickernel.runtime {
		
	requires transitive org.nasdanika.models.semantickernel;
	requires transitive semantickernel.api;	
	
	exports org.nasdanika.models.semantickernel.runtime;
	opens org.nasdanika.models.semantickernel.runtime to org.nasdanika.common; // For reflection
	
}
