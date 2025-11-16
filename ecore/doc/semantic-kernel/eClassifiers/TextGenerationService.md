The `TextGenerationService` in Microsoft Semantic Kernel for Java is an interface that allows developers to integrate different AI text generation services into their applications. Two main implementations of this service are the `OpenAITextGenerationService` and `HuggingFaceTextGenerationService`.

### OpenAITextGenerationService

This class is an OpenAI implementation of the `TextGenerationService` interface. It provides methods to generate text using the OpenAI models and supports both streaming and non-streaming text content generation.

#### Constructor
To create an instance of `OpenAITextGenerationService`, you need to provide an `OpenAIAsyncClient`, `modelId`, `serviceId`, and `deploymentName`.

```java
OpenAIAsyncClient client = new OpenAIClientBuilder()
    .credential(new AzureKeyCredential("YOUR_KEY"))
    .endpoint("YOUR_ENDPOINT")
    .buildAsyncClient();

OpenAITextGenerationService textGenerationService = new OpenAITextGenerationService(client, "model-id", "service-id", "deployment-name");
```

#### Methods
- **getStreamingTextContentsAsync**: Generates text content in a streaming fashion.
- **getTextContentsAsync**: Generates text content in a non-streaming fashion.

### HuggingFaceTextGenerationService

This class implements the `TextGenerationService` interface using the Hugging Face API, allowing text generation with Hugging Face models.

#### Constructor
To instantiate a `HuggingFaceTextGenerationService`, you must pass a `modelId`, `serviceId`, and a `HuggingFaceClient`.

```java
HuggingFaceClient client = new HuggingFaceClient("YOUR_API_TOKEN");

HuggingFaceTextGenerationService textGenerationService = new HuggingFaceTextGenerationService("model-id", "service-id", client);
```

#### Methods
- **getStreamingTextContentsAsync**: Supports streaming text generation.
- **getTextContentsAsync**: Provides non-streaming text generation capabilities.

### Example Usage

Here's an example of how you might use a `TextGenerationService` in a hypothetical application:

```java
Kernel kernel = Kernel.builder()
    .withAIService(TextGenerationService.class, textGenerationService)
    .build();

String prompt = "Generate a short story about AI";
PromptExecutionSettings settings = new PromptExecutionSettings();

List<TextContent> responses = textGenerationService.getTextContentsAsync(prompt, settings, kernel).block();

for (TextContent content : responses) {
    System.out.println(content.getContent());
}
```

This setup demonstrates integrating a text generation service with the Semantic Kernel to generate AI-driven text outputs using different underlying AI models (OpenAI or Hugging Face).

