In Microsoft Semantic Kernel, when defining functions within plugins, a function is a key component and may possess a "function type property." This property provides metadata about the function, such as its name and parameters, that can be used by AI models to understand and invoke it. 

### Function Type Property in Java

In Java, functions are typically annotated using `@DefineKernelFunction`, which includes metadata about the function. This metadata is essential for Semantic Kernel to serialize the function and its parameters, enabling it to communicate with AI models effectively.

Here's a quick breakdown:

1. **Annotate Functions:**
   Use the `@DefineKernelFunction` annotation to expose methods as kernel functions, providing a name and description. This makes the function discoverable by AI models.

    ```java
    @DefineKernelFunction(
        name = "get_pizza_menu", 
        description = "Get the pizza menu."
    )
    public Mono<Menu> getPizzaMenuAsync() {
        return pizzaService.getMenu();
    }
    ```

2. **Parameter Annotations:**
   Each function parameter can be annotated using `@KernelFunctionParameter`, specifying its name, description, type, and whether it is required. This annotation helps the AI model understand the context and structure of the parameters it has to handle.

    ```java
    public Mono<CartDelta> addPizzaToCart(
        @KernelFunctionParameter(name = "size", description = "The size of the pizza", type = com.pizzashopo.PizzaSize.class, required = true)
        PizzaSize size,
        @KernelFunctionParameter(name = "toppings", description = "The toppings to add to the pizza", type = com.pizzashopo.PizzaToppings.class)
        List<PizzaToppings> toppings
    ) {
        // Function logic here
    }
    ```

3. **Function Execution:**
    Once functions are defined with annotations, they can be serialized into JSON schema. This schema is utilized for interactions between your Java code and AI models, allowing the models to make function calls with understanding of the expected inputs and outputs.

4. **Example Usage:**

    In practice, implementing a function requires adding it to the Semantic Kernel, which then uses the metadata you’ve defined to inform the AI model how to correctly invoke this function. Functions with the `@DefineKernelFunction` annotation will be auto-discovered and made available as callable entities by an AI agent.

These annotations help keep the function signatures clear and descriptive, aiding the AI model in making correct function calls.

By following this approach, developers ensure that their Java functions are properly understood and can interact effectively with AI models through Semantic Kernel.

