The `JsonSchemaResponseFormat` class in the Microsoft Semantic Kernel Java library represents a response format that follows a JSON schema. The `jsonSchema` property within this class is used to define the structure and rules of the expected JSON response.

### Usage

To use this property, you typically work with the `JsonSchemaResponseFormat.Builder` class, which allows you to construct a `JsonSchemaResponseFormat` instance by setting various parameters, including the `jsonSchema`.

### Setting the JSON Schema

Here's how you can set the `jsonSchema` using the builder pattern:

```java
import com.microsoft.semantickernel.orchestration.responseformat.JsonSchemaResponseFormat;
import com.microsoft.semantickernel.orchestration.responseformat.JsonSchemaResponseFormat.Builder;

public class Example {
    public static void main(String[] args) {
        JsonSchemaResponseFormat responseFormat = new Builder()
            .setJsonSchema("{\"type\": \"object\", \"properties\": {\"name\": {\"type\": \"string\"}}}")
            .build();
        
        // Use the responseFormat object as needed
    }
}
```

### Explanation

- **`setJsonSchema(String jsonSchema)`:** This method is used to define the JSON schema by providing a string representation of the schema. The schema describes the JSON object's structure, such as data types and required properties.

- **`build()`:** Once all desired properties are set, the `build()` method is called to create an instance of `JsonSchemaResponseFormat`.

This approach ensures that the JSON responses conform to a predefined structure, which can be beneficial for validating data consistency and integrity in applications using the Semantic Kernel.

