/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage
 * @generated
 */
public interface SemantickernelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemantickernelFactory eINSTANCE = org.nasdanika.models.semantickernel.impl.SemantickernelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kernel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kernel</em>'.
	 * @generated
	 */
	Kernel createKernel();

	/**
	 * Returns a new object of class '<em>AI Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Service</em>'.
	 * @generated
	 */
	AIService createAIService();

	/**
	 * Returns a new object of class '<em>AI Service Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Service Selector</em>'.
	 * @generated
	 */
	AIServiceSelector createAIServiceSelector();

	/**
	 * Returns a new object of class '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin</em>'.
	 * @generated
	 */
	Plugin createPlugin();

	/**
	 * Returns a new object of class '<em>Invocable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocable</em>'.
	 * @generated
	 */
	Invocable createInvocable();

	/**
	 * Returns a new object of class '<em>Prompt Template Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt Template Config</em>'.
	 * @generated
	 */
	PromptTemplateConfig createPromptTemplateConfig();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Spel Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spel Function</em>'.
	 * @generated
	 */
	SpelFunction createSpelFunction();

	/**
	 * Returns a new object of class '<em>Scripted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Function</em>'.
	 * @generated
	 */
	ScriptedFunction createScriptedFunction();

	/**
	 * Returns a new object of class '<em>Prompt Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt Function</em>'.
	 * @generated
	 */
	PromptFunction createPromptFunction();

	/**
	 * Returns a new object of class '<em>Input Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Variable</em>'.
	 * @generated
	 */
	InputVariable createInputVariable();

	/**
	 * Returns a new object of class '<em>Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Variable</em>'.
	 * @generated
	 */
	OutputVariable createOutputVariable();

	/**
	 * Returns a new object of class '<em>Prompt Execution Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt Execution Settings</em>'.
	 * @generated
	 */
	PromptExecutionSettings createPromptExecutionSettings();

	/**
	 * Returns a new object of class '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook</em>'.
	 * @generated
	 */
	Hook createHook();

	/**
	 * Returns a new object of class '<em>Function Invoked Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Invoked Hook</em>'.
	 * @generated
	 */
	FunctionInvokedHook createFunctionInvokedHook();

	/**
	 * Returns a new object of class '<em>Function Invoking Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Invoking Hook</em>'.
	 * @generated
	 */
	FunctionInvokingHook createFunctionInvokingHook();

	/**
	 * Returns a new object of class '<em>Post Chat Completion Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Chat Completion Hook</em>'.
	 * @generated
	 */
	PostChatCompletionHook createPostChatCompletionHook();

	/**
	 * Returns a new object of class '<em>Pre Chat Completion Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Chat Completion Hook</em>'.
	 * @generated
	 */
	PreChatCompletionHook createPreChatCompletionHook();

	/**
	 * Returns a new object of class '<em>Pre Tool Call Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Tool Call Hook</em>'.
	 * @generated
	 */
	PreToolCallHook createPreToolCallHook();

	/**
	 * Returns a new object of class '<em>Prompt Rendered Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt Rendered Hook</em>'.
	 * @generated
	 */
	PromptRenderedHook createPromptRenderedHook();

	/**
	 * Returns a new object of class '<em>Prompt Rendering Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt Rendering Hook</em>'.
	 * @generated
	 */
	PromptRenderingHook createPromptRenderingHook();

	/**
	 * Returns a new object of class '<em>Audio To Text Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio To Text Service</em>'.
	 * @generated
	 */
	AudioToTextService createAudioToTextService();

	/**
	 * Returns a new object of class '<em>Open Ai Audio To Text Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Ai Audio To Text Service</em>'.
	 * @generated
	 */
	OpenAiAudioToTextService createOpenAiAudioToTextService();

	/**
	 * Returns a new object of class '<em>Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedding Generation Service</em>'.
	 * @generated
	 */
	EmbeddingGenerationService createEmbeddingGenerationService();

	/**
	 * Returns a new object of class '<em>Text Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Embedding Generation Service</em>'.
	 * @generated
	 */
	TextEmbeddingGenerationService createTextEmbeddingGenerationService();

	/**
	 * Returns a new object of class '<em>Open AI Text Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open AI Text Embedding Generation Service</em>'.
	 * @generated
	 */
	OpenAITextEmbeddingGenerationService createOpenAITextEmbeddingGenerationService();

	/**
	 * Returns a new object of class '<em>Text AI Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text AI Service</em>'.
	 * @generated
	 */
	TextAIService createTextAIService();

	/**
	 * Returns a new object of class '<em>Chat Completion Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chat Completion Service</em>'.
	 * @generated
	 */
	ChatCompletionService createChatCompletionService();

	/**
	 * Returns a new object of class '<em>Gemini Chat Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gemini Chat Completion</em>'.
	 * @generated
	 */
	GeminiChatCompletion createGeminiChatCompletion();

	/**
	 * Returns a new object of class '<em>Open AI Chat Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open AI Chat Completion</em>'.
	 * @generated
	 */
	OpenAIChatCompletion createOpenAIChatCompletion();

	/**
	 * Returns a new object of class '<em>Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Generation Service</em>'.
	 * @generated
	 */
	TextGenerationService createTextGenerationService();

	/**
	 * Returns a new object of class '<em>Gemini Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gemini Text Generation Service</em>'.
	 * @generated
	 */
	GeminiTextGenerationService createGeminiTextGenerationService();

	/**
	 * Returns a new object of class '<em>Hugging Face Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hugging Face Text Generation Service</em>'.
	 * @generated
	 */
	HuggingFaceTextGenerationService createHuggingFaceTextGenerationService();

	/**
	 * Returns a new object of class '<em>Open AI Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open AI Text Generation Service</em>'.
	 * @generated
	 */
	OpenAITextGenerationService createOpenAITextGenerationService();

	/**
	 * Returns a new object of class '<em>Text To Audio Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text To Audio Service</em>'.
	 * @generated
	 */
	TextToAudioService createTextToAudioService();

	/**
	 * Returns a new object of class '<em>Open Ai Text To Audio Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Ai Text To Audio Service</em>'.
	 * @generated
	 */
	OpenAiTextToAudioService createOpenAiTextToAudioService();

	/**
	 * Returns a new object of class '<em>Invocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation Context</em>'.
	 * @generated
	 */
	InvocationContext createInvocationContext();

	/**
	 * Returns a new object of class '<em>Semantic Kernel Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Kernel Telemetry</em>'.
	 * @generated
	 */
	SemanticKernelTelemetry createSemanticKernelTelemetry();

	/**
	 * Returns a new object of class '<em>Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Format</em>'.
	 * @generated
	 */
	ResponseFormat createResponseFormat();

	/**
	 * Returns a new object of class '<em>Json Object Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Object Response Format</em>'.
	 * @generated
	 */
	JsonObjectResponseFormat createJsonObjectResponseFormat();

	/**
	 * Returns a new object of class '<em>Json Schema Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Schema Response Format</em>'.
	 * @generated
	 */
	JsonSchemaResponseFormat createJsonSchemaResponseFormat();

	/**
	 * Returns a new object of class '<em>Text Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Response Format</em>'.
	 * @generated
	 */
	TextResponseFormat createTextResponseFormat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemantickernelPackage getSemantickernelPackage();

} //SemantickernelFactory
