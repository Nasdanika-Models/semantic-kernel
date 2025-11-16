The `InvocationContext` class in Microsoft Semantic Kernel for Java handles the context passed to a `Kernel` or `KernelFunction` invocation. Among its various properties, the `invocationReturnMode` property specifies how the invocation's return should be handled. This property comes into play when executing function calls or prompts to determine the nature of the response.

### InvocationReturnMode

`InvocationReturnMode` is an enumeration that dictates the response mode for a function or prompt invocation. It controls how the results are communicated back to the calling process. The typical modes can include options like returning only new messages or returning all messages.

### Usage in Code

Here is a code snippet demonstrating how to set the `invocationReturnMode` using the builder pattern in `InvocationContext.Builder`:

```java
import com.microsoft.semantickernel.orchestration.InvocationContext;
import com.microsoft.semantickernel.orchestration.InvocationReturnMode;

public class InvocationContextExample {
    public static void main(String[] args) {
        // Create a builder for InvocationContext
        InvocationContext.Builder contextBuilder = InvocationContext.builder();
        
        // Set the invocation return mode
        contextBuilder.withReturnMode(InvocationReturnMode.NEW_MESSAGES_ONLY);
        
        // Build the InvocationContext
        InvocationContext context = contextBuilder.build();
        
        // The InvocationContext is now configured to return only new messages
    }
}
```

### Key Points

- **InvocationContext**: Holds contextual information for kernel or kernel function invocations.
- **InvocationReturnMode**: An enum that determines how the returned results from a function or prompt invocation should be handled.
- **Builder Pattern**: The `InvocationContext.Builder` is used to construct an `InvocationContext` with the desired settings, including `invocationReturnMode`.

This setup allows developers to configure the return behavior of function calls and tailor the response handling to the needs of their application context.

