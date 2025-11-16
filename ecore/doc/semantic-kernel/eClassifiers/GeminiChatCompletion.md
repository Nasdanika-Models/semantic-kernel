The `GeminiChatCompletion` class in Microsoft Semantic Kernel Java is a specialized implementation for generating chat completions using the Gemini model. It is part of the `com.microsoft.semantickernel.aiservices.google.chatcompletion` package and extends the `GeminiService` class, implementing the `ChatCompletionService` interface.

### Key Features:
- **Builder Pattern**: Provides a static `builder()` method to create instances using a fluent API.
- **Async Methods**: Supports asynchronous operations for retrieving chat message contents and streaming chat messages.

### Constructor:
To create an instance of `GeminiChatCompletion`, you need to pass a `VertexAI` client and a model ID:

```java
VertexAI client = // Initialize your VertexAI client
String modelId = "your-model-id";
GeminiChatCompletion geminiChatCompletion = new GeminiChatCompletion(client, modelId);
```

### Methods:

1. **Async Chat Message Retrieval**:
   - Use `getChatMessageContentsAsync` to retrieve chat messages asynchronously.

   ```java
   ChatHistory chatHistory = new ChatHistory();  // Assume this is initialized
   Kernel kernel = new Kernel();  // Assume this is initialized
   InvocationContext invocationContext = new InvocationContext();  // Assume this is initialized

   Mono<List<ChatMessageContent<?>>> chatContents = geminiChatCompletion.getChatMessageContentsAsync(chatHistory, kernel, invocationContext);
   ```

2. **Async Streaming Chat Message Retrieval**:
   - For streaming capabilities, use `getStreamingChatMessageContentsAsync`.

   ```java
   Flux<StreamingChatContent<?>> streamingContents = geminiChatCompletion.getStreamingChatMessageContentsAsync(chatHistory, kernel, invocationContext);
   ```

3. **Function Calls**:
   - The class can perform function calls using `performFunctionCall`.

   ```java
   GeminiFunctionCall geminiFunctionCall = // Initialize your Gemini function call
   Mono<GeminiFunctionCall> functionResult = geminiChatCompletion.performFunctionCall(kernel, invocationContext, geminiFunctionCall);
   ```

These methods leverage the reactive programming model in Java through `Mono` and `Flux` from Project Reactor, allowing developers to handle asynchronous data streams effectively. The `GeminiChatCompletion` class supports integration with Google's Vertex AI to provide dynamic chat completion services in your Semantic Kernel Java applications.

