In Microsoft Semantic Kernel Java, the concept of **invocation** is central to interacting with AI models and invoking functions or plugins. Here's a summary of relevant components and features related to invocation in Semantic Kernel using Java:

### InvocationContext Class

The `InvocationContext` class is used to supply a context for invoking a Kernel or KernelFunction. This class can be customized with various settings to control the invocation behavior.

- **Usage**:
  - **Builder Pattern**: You can create an instance using the `builder()` method.
  - **Copy Existing Context**: Use the `copy()` method to create a new instance by copying values from another `InvocationContext`.

```java
InvocationContext context = InvocationContext.builder().build();
```

### Function Invocation Modes

There are two primary function invocation modes in Semantic Kernel:

1. **Auto Function Invocation**: The default mode where Semantic Kernel automatically invokes functions selected by the AI model. It's a fully automated process where function results are managed seamlessly.

```java
InvocationContext invocationContext = new InvocationContext.Builder()
    .withToolCallBehavior(ToolCallBehavior.allowAllKernelFunctions(true))
    .build();
```

2. **Manual Function Invocation**: This mode provides more control to the developer by allowing manual intervention in the function invocation process. It returns a list of functions chosen by the AI model, and the developer can decide which ones to invoke.

### Invoking Functions with Options

- **AgentInvokeOptions**: You may supply `AgentInvokeOptions` when invoking a function. This options class allows configuring additional settings such as kernels, instructions, and invocation context.

```java
// Example invocation with additional instructions
agent.invokeAsync("What is the capital of France?",
    null, // null AgentThread
    AgentInvokeOptions.builder()
        .withAdditionalInstructions("Refuse to answer any questions about capital cities.")
        .build()
);
```

### Managing InvocationContext

You can manage the `InvocationContext` to handle different parameters and tailoring them to your needs, for example, by configuring tool call behaviors or prompt execution settings.

### Important Notes

- **Streaming Function Invocation** in Java is not supported yet; however, updates are anticipated.
- **Observability** in Semantic Kernel is currently not available for Java.
- **FunctionCallContent and FunctionResultContent** are classes used to represent AI model function calls and the resulting outcome. They are crucial when handling manual invocations.

This summarizes the essential components and practices for invoking functions within Microsoft Semantic Kernel using Java. By using these functions, developers can effectively manage communication with AI models and plugins.

