// Copyright (c) Microsoft. All rights reserved.
package org.nasdanika.models.semantickernel.test;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.azure.ai.openai.OpenAIAsyncClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.core.credential.KeyCredential;
import com.google.gson.Gson;
import com.microsoft.semantickernel.Kernel;
import com.microsoft.semantickernel.aiservices.openai.chatcompletion.OpenAIChatCompletion;
import com.microsoft.semantickernel.contextvariables.ContextVariableTypeConverter;
import com.microsoft.semantickernel.contextvariables.ContextVariableTypes;
import com.microsoft.semantickernel.hooks.KernelHooks;
import com.microsoft.semantickernel.orchestration.InvocationContext;
import com.microsoft.semantickernel.orchestration.InvocationContext.Builder;
import com.microsoft.semantickernel.orchestration.InvocationReturnMode;
import com.microsoft.semantickernel.orchestration.ToolCallBehavior;
import com.microsoft.semantickernel.plugin.KernelPlugin;
import com.microsoft.semantickernel.plugin.KernelPluginFactory;
import com.microsoft.semantickernel.services.chatcompletion.AuthorRole;
import com.microsoft.semantickernel.services.chatcompletion.ChatCompletionService;
import com.microsoft.semantickernel.services.chatcompletion.ChatHistory;
import com.microsoft.semantickernel.services.chatcompletion.ChatMessageContent;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;

public class App {

    private static final String CLIENT_KEY = System.getenv("OPENAI_API_KEY");
//    private static final String AZURE_CLIENT_KEY = System.getenv("AZURE_CLIENT_KEY");

    // Only required if AZURE_CLIENT_KEY is set
    private static final String CLIENT_ENDPOINT = "https://api.openai.com/v1/chat/completions"; // System.getenv("CLIENT_ENDPOINT");
    private static final String MODEL_ID = System.getenv()
        .getOrDefault("MODEL_ID", "gpt-4o");

    public static void main(String[] args) throws Exception {
    	OpenTelemetry openTelemetry = GlobalOpenTelemetry.get();
    	Tracer tracer = openTelemetry.getTracer("Microsoft.SemanticKernel");
    	Span span = tracer.spanBuilder("KernelFunctionExecution").startSpan();
    	span.setAttribute("Start", new Date().toString());
    	try (Scope scope = span.makeCurrent()) {
	        OpenAIAsyncClient client;
	
	//        if (AZURE_CLIENT_KEY != null) {
	//            client = new OpenAIClientBuilder()
	//                .credential(new AzureKeyCredential(AZURE_CLIENT_KEY))
	//                .endpoint(CLIENT_ENDPOINT)
	//                .buildAsyncClient();
	//
	//        } else {
	            client = new OpenAIClientBuilder()
	                .credential(new KeyCredential(CLIENT_KEY))
	                .buildAsyncClient();
	//        }
	
	        // Create your AI service client
	        ChatCompletionService chatService = OpenAIChatCompletion.builder()
	            .withModelId(MODEL_ID)
	            .withOpenAIAsyncClient(client)
	            .build();
	        // Create a plugin (the LightsPlugin class is defined separately)
	        KernelPlugin lightPlugin = KernelPluginFactory.createFromObject(new LightsPlugin(),
	            "LightsPlugin");
	
	        // Create a kernel with Azure OpenAI chat completion and plugin
	        Kernel.Builder builder = Kernel.builder();
	        builder.withAIService(ChatCompletionService.class, chatService);
	        builder.withPlugin(lightPlugin);
	        // Build the kernel
	        Kernel kernel = builder.build();
	
			ContextVariableTypeConverter<LightModel> contextVariableConverter = ContextVariableTypeConverter.builder(LightModel.class)
			    .toPromptString(App::toPromptString)
			    .build();
			
			ContextVariableTypes.addGlobalConverter(contextVariableConverter);
	
	        KernelHooks hook = new KernelHooks();
	
	        hook.addPreToolCallHook((context) -> {
	            System.out.println("Pre-tool call hook");
	            return context;
	        });
	
	        hook.addPreChatCompletionHook(
	            (context) -> {
	                System.out.println("Pre-chat completion hook");
	                return context;
	            });
	
	        hook.addPostChatCompletionHook(
	            (context) -> {
	                System.out.println("Post-chat completion hook");
	                return context;
	            });
	
	        kernel.getGlobalKernelHooks().addHooks(hook);
	
	        // Enable planning
	        InvocationContext invocationContext = new Builder()
	            .withReturnMode(InvocationReturnMode.LAST_MESSAGE_ONLY)
	            .withToolCallBehavior(ToolCallBehavior.allowAllKernelFunctions(true))
	            .withContextVariableConverter(contextVariableConverter)
	            .build();
	
	        ChatCompletionService chatCompletionService = kernel.getService(ChatCompletionService.class);
	
	        
	        // Create a history to store the conversation
	        ChatHistory history = new ChatHistory();
	        // Initiate a back-and-forth chat
	        try (Scanner scanner = new Scanner(System.in)) {
		        String userInput;
		        do {
		            // Collect user input
		            System.out.print("User > ");
		            userInput = scanner.nextLine();
		            // Add user input
		            history.addUserMessage(userInput);
		            List<ChatMessageContent<?>> results = chatCompletionService
		            		.getChatMessageContentsAsync(history, kernel, invocationContext)
		            		.contextWrite(reactor.util.context.Context.of("otel-context", io.opentelemetry.context.Context.current()))	            		
		            		.block();
		            for (ChatMessageContent<?> result : results) {
		                // Print the results
		                if (result.getAuthorRole() == AuthorRole.ASSISTANT && result.getContent() != null) {
		                    System.out.println("Assistant > " + result);
		                }
		                // Add the message from the agent to the chat history
		                history.addMessage(result);
		            }
		        } while (userInput != null && !userInput.isEmpty());
		        
		    	span.setAttribute("Start", new Date().toString());
	        }
    	} finally {
    		span.end();
    	}
    }
    
    private static String toPromptString(LightModel lightModel) {
    	String ret = new Gson().toJson(lightModel);
    	System.out.println("*** " + ret);
    	return ret;
    }
        
}
