The `InvocationContext` class in Microsoft Semantic Kernel Java allows customization of prompt execution parameters. One key aspect you can configure through the `InvocationContext` is `PromptExecutionSettings`, which dictate how a prompt is processed by the AI model. Here's a summary of the `PromptExecutionSettings` features and property settings you can manipulate:

### PromptExecutionSettings Configuration Summary

- **Service ID**: Specifies the ID of the AI service to use for prompt execution.
- **Model ID**: Defines the ID of the model for executing prompts.
- **Temperature**: Controls the randomness of the model output; lower values produce more deterministic results.
- **Top P**: Determines the diversity of tokens considered for the next word prediction based on cumulative probability.
- **Presence Penalty**: Encourages or discourages diversity of token usage in the output.
- **Frequency Penalty**: Affects the model's likelihood of repeating tokens in the output.
- **Max Tokens**: The limit for the number of tokens generated in the output.
- **Results Per Prompt**: Number of potential responses generated for each prompt.
- **Stop Sequences**: Specify when the model should stop generating further tokens.
- **Token Selection Biases**: Bias which tokens are more or less likely to appear in the output.

### Java Code Snippets

To use `PromptExecutionSettings` with an `InvocationContext`, you typically create and build `PromptExecutionSettings` and set it in the `InvocationContext`. Here's an example:

```java
import com.microsoft.semantickernel.orchestration.PromptExecutionSettings;
import com.microsoft.semantickernel.orchestration.InvocationContext;
import java.util.List;
import java.util.Map;

public class InvocationExample {
    public static void main(String[] args) {
        // Create a PromptExecutionSettings object
        PromptExecutionSettings settings = new PromptExecutionSettings(
            "service-id",
            "model-id",
            1.0, // temperature
            1.0, // topP
            0.0, // presencePenalty
            0.0, // frequencyPenalty
            256, // maxTokens
            1,   // resultsPerPrompt
            1,   // bestOf
            "userId",
            List.of("stopSequence"),
            Map.of(123, 1) // tokenSelectionBiases
        );

        // Adding PromptExecutionSettings to InvocationContext
        InvocationContext context = InvocationContext.builder()
            .withPromptExecutionSettings(settings)
            .build();

        // ... Use the context for executing prompts
    }
}
```

This code demonstrates how to configure and set prompt execution settings within an invocation context. This configuration is critical for tailoring AI prompts to specific needs, such as invoking a desired model with particular behavioral settings.

