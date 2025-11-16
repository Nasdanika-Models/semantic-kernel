The `InvocationReturnMode` enum in Microsoft Semantic Kernel Java outlines the mode in which function invocations should return results, especially relevant when dealing with a history of previous invocations, such as in chat completions.

### FULL_HISTORY

The `FULL_HISTORY` property is a part of the `InvocationReturnMode` enum that specifies when a function invocation returns results, it should include the full history of messages up until that invocation. This is useful when you need complete context or a comprehensive history of interactions for tasks such as chat operations where retaining past conversations is essential.

#### Example Usage in Java

Here is a sample code snippet demonstrating the use of the `FULL_HISTORY` property with a chat completion service:

```java
import com.microsoft.semantickernel.Kernel;
import com.microsoft.semantickernel.aiservices.openai.chatcompletion.OpenAIChatCompletion;
import com.microsoft.semantickernel.orchestration.InvocationContext;
import com.microsoft.semantickernel.orchestration.InvocationReturnMode;
import com.microsoft.semantickernel.services.chatcompletion.ChatCompletionService;
import com.microsoft.semantickernel.services.chatcompletion.ChatHistory;
import com.microsoft.semantickernel.services.chatcompletion.ChatMessageContent;

// Assume necessary setup for OpenAIChatCompletion and Kernel is done above...

// Create the chat completion service
ChatCompletionService chatCompletionService = OpenAIChatCompletion.builder()
    .withModelId("model-id")
    .withOpenAIAsyncClient(client)
    .build();

// Create a kernel with the chat completion service
Kernel kernel = Kernel.builder()
    .withAIService(ChatCompletionService.class, chatCompletionService)
    .build();

// Configure the invocation context to return full history
InvocationContext invocationContext = new InvocationContext.Builder()
    .withReturnMode(InvocationReturnMode.FULL_HISTORY)
    .build();

// Create a history object to hold the conversation
ChatHistory history = new ChatHistory();
history.addUserMessage("Hello, how are you?");

// Perform the chat completion function invocation
List<ChatMessageContent<?>> results = chatCompletionService
    .getChatMessageContentsAsync(history, kernel, invocationContext)
    .block();

// Output the full history
for (ChatMessageContent<?> result : results) {
    System.out.println("Role: " + result.getAuthorRole() + ", Message: " + result.getContent());
}
```

In this example, the chat completion system uses the `FULL_HISTORY` option to ensure that the complete conversation history is included in the results, which can be critical for applications where understanding the full context of a chat session is necessary.

