The `HuggingFaceTextGenerationService` class in Microsoft's Semantic Kernel Java is a service designed to generate text using the Hugging Face API. It belongs to the package `com.microsoft.semantickernel.aiservices.huggingface.services` and implements the `TextGenerationService` interface. This class provides methods to handle text generation tasks and allows users to retrieve both streaming and non-streaming text results.

### Constructor
You can create an instance of the `HuggingFaceTextGenerationService` using its constructor. It requires a model ID, a service ID, and a `HuggingFaceClient`.

```java
HuggingFaceTextGenerationService service = new HuggingFaceTextGenerationService("modelId", "serviceId", client);
```

### Builder Pattern
To create a `HuggingFaceTextGenerationService` instance, you can use the builder pattern provided by the class.

```java
HuggingFaceTextGenerationService.Builder builder = HuggingFaceTextGenerationService.builder();
// configure the builder as needed and then build the service
HuggingFaceTextGenerationService service = builder.build();
```

### Methods
- **getModelId()**
  - Returns the model ID used by the service.
  
  ```java
  String modelId = service.getModelId();
  ```

- **getServiceId()**
  - Returns the service ID.
  
  ```java
  String serviceId = service.getServiceId();
  ```

- **getTextContentsAsync**
  - Retrieves the text generation results for a given prompt and settings asynchronously.
  
  ```java
  Mono<List<TextContent>> textContents = service.getTextContentsAsync("prompt", executionSettings, kernel);
  ```

- **getStreamingTextContentsAsync**
  - Retrieves the streaming text results for a given prompt and settings asynchronously.
  
  ```java
  Flux<StreamingTextContent> streamingContents = service.getStreamingTextContentsAsync("prompt", executionSettings, kernel);
  ```

The class is part of the Maven artifact `com.microsoft.semantic-kernel:semantickernel-aiservices-huggingface:1.4.0`, and you can include it in your project by adding the corresponding dependency.

