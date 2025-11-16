### PromptExecutionSettings `stopSequences` Property

In the context of the Microsoft Semantic Kernel Java API, the `stopSequences` property within the `PromptExecutionSettings` class is used to determine the sequences at which the language model should stop generating text output during prompt execution. This is helpful for controlling the content and ensuring that the generation halts after encountering specific sequences.

#### Key Information
- **Type**: `List<String>`
- **Purpose**: Specifies the stop sequences that will trigger the model to stop generating text when encountered.
- **Usage**: Can be set using a builder or directly when creating an instance of `PromptExecutionSettings`.

#### How to Use `stopSequences` in Java

You can set this property while using the builder for `PromptExecutionSettings`, or when constructing an instance directly:

```java
import com.microsoft.semantickernel.orchestration.PromptExecutionSettings;

import java.util.List;
import java.util.Arrays;

// Using the builder to set stop sequences
PromptExecutionSettings settings = PromptExecutionSettings.builder()
    .withStopSequences(Arrays.asList("STOP", "END"))
    .build();

// Accessing the stop sequences
List<String> stopSequences = settings.getStopSequences();
System.out.println("Stop Sequences: " + stopSequences);
```

In this example:
1. A list of stop sequences is defined using `Arrays.asList("STOP", "END")`.
2. This list is passed to the `withStopSequences` method of the `PromptExecutionSettings.Builder`.
3. The `build()` method creates an instance of `PromptExecutionSettings` with the specified stop sequences.
4. The stop sequences are then retrieved using the `getStopSequences()` method.

