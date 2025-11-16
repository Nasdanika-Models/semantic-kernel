The `JsonSchemaResponseFormat` in Microsoft Semantic Kernel for Java is a representation of a response in JSON schema format. It is part of the `com.microsoft.semantickernel.orchestration.responseformat` package. This format is useful when you need to define the structure of responses in your AI orchestration tasks, ensuring they adhere to a specified JSON schema.

### Key Components

- **JsonSchemaResponseFormat.Builder Class**: A builder class that helps create instances of `JsonSchemaResponseFormat`. It provides various methods to set the details of the JSON schema.

#### Constructor

No explicit constructor details are provided for `JsonSchemaResponseFormat`, but you can use the builder to construct it.

#### Methods

- **build()**: Finalizes and creates an instance of `JsonSchemaResponseFormat`.

  ```java
  JsonSchemaResponseFormat format = new JsonSchemaResponseFormat.Builder()
      .setJsonSchema("your-json-schema")
      .build();
  ```

- **setJsonResponseSchema(JsonResponseSchema jsonResponseSchema)**: Sets the JSON response schema using an instance of `JsonResponseSchema`.

  ```java
  JsonSchemaResponseFormat.Builder builder = new JsonSchemaResponseFormat.Builder();
  builder.setJsonResponseSchema(jsonResponseSchema);
  ```

- **setJsonSchema(String jsonSchema)**: Directly sets the JSON schema string.

  ```java
  builder.setJsonSchema("{ \"type\": \"object\", \"properties\": { \"name\": { \"type\": \"string\" } } }");
  ```

- **setName(String name)**: Sets the name for the JSON schema.

  ```java
  builder.setName("SampleSchema");
  ```

- **setResponseFormat(Class<?> clazz)**: Sets the response format by using a class with Jackson to generate the schema.

  ```java
  builder.setResponseFormat(SampleClass.class);
  ```

- **setStrict(boolean strict)**: Specifies whether the JSON schema should be strictly enforced.

  ```java
  builder.setStrict(true);
  ```

### Usage Example

Here is a complete example showing how to utilize the `JsonSchemaResponseFormat.Builder`:

```java
JsonSchemaResponseFormat format = new JsonSchemaResponseFormat.Builder()
    .setJsonSchema("{ \"type\": \"object\", \"properties\": { \"name\": { \"type\": \"string\" } } }")
    .setName("SampleSchema")
    .setStrict(true)
    .build();
```

Make sure to include necessary packages and handle exceptions as required in your application context. This summary provides an overview of configuring and using the `JsonSchemaResponseFormat` with customization options through the builder pattern.

