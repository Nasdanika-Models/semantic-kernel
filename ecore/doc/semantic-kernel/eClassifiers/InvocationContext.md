## InvocationContext Class in Microsoft Semantic Kernel (Java)

The `InvocationContext` class is part of the `com.microsoft.semantickernel.orchestration` package and is used to store execution settings and additional context when invoking functions within the Semantic Kernel. It helps customize the behavior of function invocation and interaction with the AI models.

### Key Methods and Usage

1. **Building an InvocationContext**

   You can create an instance of `InvocationContext` using its `Builder` class. The builder allows you to set various parameters such as context variable converters, kernel hooks, prompt execution settings, return mode, and tool call behavior.

   ```java
   InvocationContext context = InvocationContext.builder()
       .withContextVariableConverter(yourConverter)
       .withKernelHooks(kernelHooks)
       .withPromptExecutionSettings(promptExecutionSettings)
       .withReturnMode(InvocationReturnMode.NEW_MESSAGES_ONLY)
       .withToolCallBehavior(toolCallBehavior)
       .build();
   ```

2. **Method Details**

   - `build()`: Compiles the `InvocationContext` instance with configured settings.
   
     ```java
     InvocationContext context = builder.build();
     ```

   - `withContextVariableConverter()`: Adds a context variable type converter.

     ```java
     builder.withContextVariableConverter(contextVariableTypes);
     ```

   - `withKernelHooks()`: Adds kernel hooks to the builder.

     ```java
     builder.withKernelHooks(kernelHooks);
     ```

   - `withPromptExecutionSettings()`: Adds prompt execution settings.

     ```java
     builder.withPromptExecutionSettings(promptExecutionSettings);
     ```

   - `withReturnMode()`: Sets the return mode for the invocation.
   
     ```java
     builder.withReturnMode(InvocationReturnMode.COMPLETE_RESULT);
     ```

   - `withToolCallBehavior()`: Adds tool call behavior to the builder.
   
     ```java
     builder.withToolCallBehavior(toolCallBehavior);
     ```

### Example Usage

Suppose you want to invoke a function in the Semantic Kernel with a specific setup, you can compose your invocation context and use it in relevant service calls.

```java
InvocationContext context = InvocationContext.builder()
    .withReturnMode(InvocationReturnMode.NEW_MESSAGES_ONLY)
    .withPromptExecutionSettings(new PromptExecutionSettings())
    .build();

// Use the context in a kernel service call
kernel.invokeFunction("pluginName", "functionName", context);
```

The `InvocationContext` class and its builder provide a flexible and modular way to configure invocation settings, ensuring that functions called within the Semantic Kernel can be tailored to different scenarios and requirements.

