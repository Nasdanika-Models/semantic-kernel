### PromptExecutionSettings Class

The `PromptExecutionSettings` class in the Microsoft Semantic Kernel Java SDK provides configuration settings for executing AI prompts. This class resides in the `com.microsoft.semantickernel.orchestration` package and is a part of the `semantickernel-api` Maven artifact.

#### Key Features

- **Default Values**: Provides default settings for various execution parameters such as max tokens, temperature, and presence penalty.
- **Field Summary**:
  - **DEFAULT_BEST_OF**: Default value is `1`.
  - **DEFAULT_FREQUENCY_PENALTY**: Default value is `0.0`.
  - **DEFAULT_MAX_TOKENS**: Default value is `256`.
  - **DEFAULT_PRESENCE_PENALTY**: Default value is `0.0`.
  - **DEFAULT_RESULTS_PER_PROMPT**: Default value is `1`.
  - **DEFAULT_SERVICE_ID**: Default value is `"default"`.
  - **DEFAULT_TEMPERATURE**: Default value is `1.0`.
  - **DEFAULT_TOP_P**: Default value is `1.0`.

#### Constructor and Method Summary

- **Constructor**:
  ```java
  public PromptExecutionSettings(String serviceId, String modelId,
                                 Double temperature, Double topP,
                                 Double presencePenalty, Double frequencyPenalty,
                                 Integer maxTokens, Integer resultsPerPrompt,
                                 Integer bestOf, String user,
                                 List<String> stopSequences,
                                 Map<Integer, Integer> tokenSelectionBiases,
                                 ResponseFormat responseFormat)
  ```

- **Builder Method**:
  - `builder()`: Creates a new builder for `PromptExecutionSettings`.
  - Example:
    ```java
    PromptExecutionSettings.Builder builder = PromptExecutionSettings.builder();
    ```

- **Common Methods**:
  - **getBestOf()**: Returns threshold for considering a result.
  - **getFrequencyPenalty()**: Returns the penalty applied to frequency.
  - **getMaxTokens()**: Determines the max number of tokens for output.

- **Example Usage**:
  ```java
  PromptExecutionSettings executionSettings = PromptExecutionSettings.builder()
      .withModelId("gpt-3.5-turbo")
      .withMaxTokens(500)
      .withTemperature(0.7)
      .build();
  ```

This class is fundamental in defining how AI prompts are executed within the Semantic Kernel framework. By utilizing the `PromptExecutionSettings.Builder`, developers can easily configure their AI interaction settings to suit their application's requirements.

