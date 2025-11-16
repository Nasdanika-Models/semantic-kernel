# ChatCompletionService (Java) — Summary and Usage

- Namespace: com.microsoft.semantickernel.services.chatcompletion
- Artifact: com.microsoft.semantic-kernel:semantickernel-api:1.4.0
- Definition: ChatCompletionService is the Java interface for chat-based LLM interaction in Semantic Kernel. It extends TextAIService and provides async APIs (Project Reactor) to generate chat responses from either a ChatHistory or a raw prompt string.

Key related types:
- ChatHistory: maintains ordered messages across roles (user, assistant, system).
- ChatMessageContent<T>: represents a returned message.
- AuthorRole: enum for message roles.
- StreamingChatContent<T>: streaming content type (see note on streaming below).

## Core methods
- Mono<List<ChatMessageContent<?>>> getChatMessageContentsAsync(ChatHistory chatHistory, Kernel kernel, InvocationContext invocationContext)
- Mono<List<ChatMessageContent<?>>> getChatMessageContentsAsync(String prompt, Kernel kernel, InvocationContext invocationContext)
- Flux<StreamingChatContent<?>> getStreamingChatMessageContentsAsync(ChatHistory chatHistory, Kernel kernel, InvocationContext invocationContext)
- Flux<StreamingChatContent<?>> getStreamingChatMessageContentsAsync(String prompt, Kernel kernel, InvocationContext invocationContext)

Note: Documentation states streaming responses are currently unavailable in Semantic Kernel for Java.

## Add a provider implementation and register with the Kernel
Typically you use a connector (e.g., OpenAI) that implements ChatCompletionService.

```java
import com.azure.ai.openai.OpenAIAsyncClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.microsoft.semantickernel.Kernel;
import com.microsoft.semantickernel.aiservices.openai.chatcompletion.OpenAIChatCompletion;
import com.microsoft.semantickernel.services.chatcompletion.ChatCompletionService;

// Build provider client (Azure OpenAI or OpenAI)
// Example: OpenAI (non-Azure)
OpenAIAsyncClient client = new OpenAIClientBuilder()
    .credential(openAIClientCredentials)
    .buildAsyncClient();

// Create the chat completion service
ChatCompletionService chat = OpenAIChatCompletion.builder()
    .withOpenAIAsyncClient(client)
    .withModelId("gpt-4o-mini") // your model id
    .build();

// Register service in the kernel
Kernel kernel = Kernel.builder()
    .withAIService(ChatCompletionService.class, chat)
    .build();
```

Retrieve the service later:
```java
ChatCompletionService chatCompletionService = kernel.getService(ChatCompletionService.class);
```

## Non‑streaming chat with ChatHistory
```java
import com.microsoft.semantickernel.services.chatcompletion.ChatHistory;
import com.microsoft.semantickernel.services.chatcompletion.ChatMessageContent;
import com.microsoft.semantickernel.orchestration.InvocationContext;

ChatHistory history = new ChatHistory();
history.addSystemMessage("You are a helpful assistant.");
history.addUserMessage("Hello, how are you?");

// Optional: configure invocation (see function calling below)
InvocationContext invocationContext = null;

// Invoke
List<ChatMessageContent<?>> results = chatCompletionService
    .getChatMessageContentsAsync(history, kernel, invocationContext)
    .block();

// Print and append returned messages
results.forEach(r -> System.out.println(r.getContent()));
// By default, ChatCompletionService returns only the new messages — add them to continue the thread:
history.addAll(results);
```

Prompt-only (no prior ChatHistory) usage:
```java
List<ChatMessageContent<?>> results = chatCompletionService
    .getChatMessageContentsAsync("Write a haiku about mountains", kernel, null)
    .block();

results.forEach(r -> System.out.println(r.getContent()));
```

## Function calling (tools) via InvocationContext
To enable auto function calling (planning), you must:
- Register plugins on the Kernel (so functions are discoverable).
- Pass the Kernel and an InvocationContext that allows tool calls.

```java
import com.microsoft.semantickernel.orchestration.InvocationContext;
import com.microsoft.semantickernel.orchestration.InvocationReturnMode;
import com.microsoft.semantickernel.orchestration.ToolCallBehavior;

// Example InvocationContext enabling tool calls to kernel functions
InvocationContext ctx = new InvocationContext.Builder()
    .withReturnMode(InvocationReturnMode.LAST_MESSAGE_ONLY)
    .withToolCallBehavior(ToolCallBehavior.allowAllKernelFunctions(true))
    .build();

List<ChatMessageContent<?>> results = chatCompletionService
    .getChatMessageContentsAsync(history, kernel, ctx)
    .block();
```

Important:
- The Kernel must be supplied when invoking ChatCompletionService for function calling to work (plugins are registered on the Kernel).
- If you disable auto-invoke, your application is responsible for invoking tool calls and then appending tool results to ChatHistory.

## Notes and limitations (Java)
- Streaming: Documentation notes streaming responses are not supported in Semantic Kernel for Java.
- Chat history reduction: Not available in Java.
- Simulated tool-call message injection APIs (as in .NET/Python) are not supported in Java; manual handling is required when auto-invoke is disabled.

## Package index (what’s in the chatcompletion package)
- ChatHistory: build and manage conversation state.
- ChatMessageContent<T>: message container returned by services.
- ChatCompletionService: the primary interface you call.
- StreamingChatContent<T>: type for streaming chunks (API present; streaming not supported per docs).
- AuthorRole: identifies message authors (User, Assistant, System).

