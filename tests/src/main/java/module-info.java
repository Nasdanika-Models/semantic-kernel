module org.nasdanika.models.semantickernel.test {
		
	requires transitive org.nasdanika.models.semantickernel.runtime;
	requires io.opentelemetry.api;
	requires com.azure.ai.openai;
	requires semantickernel.aiservices.openai;
	requires io.opentelemetry.context;
	requires google.cloud.vertexai;
	requires reactor.netty.http;
	requires reactor.netty.core;
	requires org.json;
	requires org.jsoup;
	
	
	exports org.nasdanika.models.semantickernel.test;
	opens org.nasdanika.models.semantickernel.test; // For reflection
	
}
