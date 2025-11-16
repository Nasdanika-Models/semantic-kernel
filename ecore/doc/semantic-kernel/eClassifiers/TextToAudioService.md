### Microsoft Semantic Kernel Java: TextToAudioService

The `TextToAudioService` in Microsoft Semantic Kernel Java provides the capability to convert text to audio using OpenAI's text-to-audio services.

#### `OpenAiTextToAudioService`

The `OpenAiTextToAudioService` class is an implementation of the `TextToAudioService` interface, which utilizes OpenAI's text-to-audio capabilities.

##### Constructor

```java
public OpenAiTextToAudioService(OpenAIAsyncClient client, String modelId, String deploymentName)
```
- **Parameters**:
  - `client`: The OpenAI client used to access the service.
  - `modelId`: The model identifier for text-to-audio conversion.
  - `deploymentName`: The deployment name within OpenAI.

##### Methods

- **`builder()`**: 
  - Creates a new builder for setting up an `OpenAiTextToAudioService` instance.

```java
OpenAiTextToAudioService.Builder builder = OpenAiTextToAudioService.builder();
```

- **`getAudioContentAsync(String text, TextToAudioExecutionSettings executionSettings)`**:
  - Converts text to audio content asynchronously.
  - **Parameters**:
    - `text`: The text to be converted into audio.
    - `executionSettings`: Settings for how the text should be converted to audio.

```java
Mono<AudioContent> audioContentMono = openAiService.getAudioContentAsync("Hello, world!", new TextToAudioExecutionSettings());
```

#### Example Usage

```java
OpenAIAsyncClient client = new OpenAIClientBuilder()
    .credential(new AzureKeyCredential("your-api-key"))
    .endpoint("your-endpoint")
    .buildAsyncClient();

OpenAiTextToAudioService textToAudioService = new OpenAiTextToAudioService(client, "modelId", "deploymentName");

TextToAudioExecutionSettings settings = new TextToAudioExecutionSettings();

Mono<AudioContent> audioContent = textToAudioService.getAudioContentAsync("Convert this text to audio", settings);
```

This setup allows for leveraging OpenAI's service within the Java environment to transform text inputs into audio outputs, offering a seamless integration for applications requiring text-to-speech capabilities.

