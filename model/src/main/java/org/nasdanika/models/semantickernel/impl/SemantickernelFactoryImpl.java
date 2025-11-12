/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.semantickernel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemantickernelFactoryImpl extends EFactoryImpl implements SemantickernelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemantickernelFactory init() {
		try {
			SemantickernelFactory theSemantickernelFactory = (SemantickernelFactory)EPackage.Registry.INSTANCE.getEFactory(SemantickernelPackage.eNS_URI);
			if (theSemantickernelFactory != null) {
				return theSemantickernelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemantickernelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemantickernelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SemantickernelPackage.KERNEL: return createKernel();
			case SemantickernelPackage.AI_SERVICE: return createAIService();
			case SemantickernelPackage.AI_SERVICE_SELECTOR: return createAIServiceSelector();
			case SemantickernelPackage.PLUGIN: return createPlugin();
			case SemantickernelPackage.INVOCABLE: return createInvocable();
			case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG: return createPromptTemplateConfig();
			case SemantickernelPackage.FUNCTION: return createFunction();
			case SemantickernelPackage.SPEL_FUNCTION: return createSpelFunction();
			case SemantickernelPackage.SCRIPTED_FUNCTION: return createScriptedFunction();
			case SemantickernelPackage.PROMPT_FUNCTION: return createPromptFunction();
			case SemantickernelPackage.INPUT_VARIABLE: return createInputVariable();
			case SemantickernelPackage.OUTPUT_VARIABLE: return createOutputVariable();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS: return createPromptExecutionSettings();
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY: return (EObject)createTokenSelectionBiasesEntry();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS_ENTRY: return (EObject)createPromptExecutionSettingsEntry();
			case SemantickernelPackage.HOOK: return createHook();
			case SemantickernelPackage.HOOK_ENTRY: return (EObject)createHookEntry();
			case SemantickernelPackage.FUNCTION_INVOKED_HOOK: return createFunctionInvokedHook();
			case SemantickernelPackage.FUNCTION_INVOKING_HOOK: return createFunctionInvokingHook();
			case SemantickernelPackage.POST_CHAT_COMPLETION_HOOK: return createPostChatCompletionHook();
			case SemantickernelPackage.PRE_CHAT_COMPLETION_HOOK: return createPreChatCompletionHook();
			case SemantickernelPackage.PRE_TOOL_CALL_HOOK: return createPreToolCallHook();
			case SemantickernelPackage.PROMPT_RENDERED_HOOK: return createPromptRenderedHook();
			case SemantickernelPackage.PROMPT_RENDERING_HOOK: return createPromptRenderingHook();
			case SemantickernelPackage.AUDIO_TO_TEXT_SERVICE: return createAudioToTextService();
			case SemantickernelPackage.OPEN_AI_AUDIO_TO_TEXT_SERVICE: return createOpenAiAudioToTextService();
			case SemantickernelPackage.EMBEDDING_GENERATION_SERVICE: return createEmbeddingGenerationService();
			case SemantickernelPackage.TEXT_EMBEDDING_GENERATION_SERVICE: return createTextEmbeddingGenerationService();
			case SemantickernelPackage.OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE: return createOpenAITextEmbeddingGenerationService();
			case SemantickernelPackage.TEXT_AI_SERVICE: return createTextAIService();
			case SemantickernelPackage.CHAT_COMPLETION_SERVICE: return createChatCompletionService();
			case SemantickernelPackage.GEMINI_CHAT_COMPLETION: return createGeminiChatCompletion();
			case SemantickernelPackage.OPEN_AI_CHAT_COMPLETION: return createOpenAIChatCompletion();
			case SemantickernelPackage.TEXT_GENERATION_SERVICE: return createTextGenerationService();
			case SemantickernelPackage.GEMINI_TEXT_GENERATION_SERVICE: return createGeminiTextGenerationService();
			case SemantickernelPackage.HUGGING_FACE_TEXT_GENERATION_SERVICE: return createHuggingFaceTextGenerationService();
			case SemantickernelPackage.OPEN_AI_TEXT_GENERATION_SERVICE: return createOpenAITextGenerationService();
			case SemantickernelPackage.TEXT_TO_AUDIO_SERVICE: return createTextToAudioService();
			case SemantickernelPackage.OPEN_AI_TEXT_TO_AUDIO_SERVICE: return createOpenAiTextToAudioService();
			case SemantickernelPackage.INVOCATION_CONTEXT: return createInvocationContext();
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY: return createSemanticKernelTelemetry();
			case SemantickernelPackage.RESPONSE_FORMAT: return createResponseFormat();
			case SemantickernelPackage.JSON_OBJECT_RESPONSE_FORMAT: return createJsonObjectResponseFormat();
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT: return createJsonSchemaResponseFormat();
			case SemantickernelPackage.TEXT_RESPONSE_FORMAT: return createTextResponseFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SemantickernelPackage.INVOCATION_RETURN_MODE:
				return createInvocationReturnModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SemantickernelPackage.INVOCATION_RETURN_MODE:
				return convertInvocationReturnModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kernel createKernel() {
		KernelImpl kernel = new KernelImpl();
		return kernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIService createAIService() {
		AIServiceImpl aiService = new AIServiceImpl();
		return aiService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIServiceSelector createAIServiceSelector() {
		AIServiceSelectorImpl aiServiceSelector = new AIServiceSelectorImpl();
		return aiServiceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invocable createInvocable() {
		InvocableImpl invocable = new InvocableImpl();
		return invocable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptTemplateConfig createPromptTemplateConfig() {
		PromptTemplateConfigImpl promptTemplateConfig = new PromptTemplateConfigImpl();
		return promptTemplateConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpelFunction createSpelFunction() {
		SpelFunctionImpl spelFunction = new SpelFunctionImpl();
		return spelFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptedFunction createScriptedFunction() {
		ScriptedFunctionImpl scriptedFunction = new ScriptedFunctionImpl();
		return scriptedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptFunction createPromptFunction() {
		PromptFunctionImpl promptFunction = new PromptFunctionImpl();
		return promptFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputVariable createInputVariable() {
		InputVariableImpl inputVariable = new InputVariableImpl();
		return inputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputVariable createOutputVariable() {
		OutputVariableImpl outputVariable = new OutputVariableImpl();
		return outputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptExecutionSettings createPromptExecutionSettings() {
		PromptExecutionSettingsImpl promptExecutionSettings = new PromptExecutionSettingsImpl();
		return promptExecutionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Integer, Integer> createTokenSelectionBiasesEntry() {
		TokenSelectionBiasesEntryImpl tokenSelectionBiasesEntry = new TokenSelectionBiasesEntryImpl();
		return tokenSelectionBiasesEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, PromptExecutionSettings> createPromptExecutionSettingsEntry() {
		PromptExecutionSettingsEntryImpl promptExecutionSettingsEntry = new PromptExecutionSettingsEntryImpl();
		return promptExecutionSettingsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hook createHook() {
		HookImpl hook = new HookImpl();
		return hook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Hook> createHookEntry() {
		HookEntryImpl hookEntry = new HookEntryImpl();
		return hookEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionInvokedHook createFunctionInvokedHook() {
		FunctionInvokedHookImpl functionInvokedHook = new FunctionInvokedHookImpl();
		return functionInvokedHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionInvokingHook createFunctionInvokingHook() {
		FunctionInvokingHookImpl functionInvokingHook = new FunctionInvokingHookImpl();
		return functionInvokingHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostChatCompletionHook createPostChatCompletionHook() {
		PostChatCompletionHookImpl postChatCompletionHook = new PostChatCompletionHookImpl();
		return postChatCompletionHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreChatCompletionHook createPreChatCompletionHook() {
		PreChatCompletionHookImpl preChatCompletionHook = new PreChatCompletionHookImpl();
		return preChatCompletionHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreToolCallHook createPreToolCallHook() {
		PreToolCallHookImpl preToolCallHook = new PreToolCallHookImpl();
		return preToolCallHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptRenderedHook createPromptRenderedHook() {
		PromptRenderedHookImpl promptRenderedHook = new PromptRenderedHookImpl();
		return promptRenderedHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptRenderingHook createPromptRenderingHook() {
		PromptRenderingHookImpl promptRenderingHook = new PromptRenderingHookImpl();
		return promptRenderingHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioToTextService createAudioToTextService() {
		AudioToTextServiceImpl audioToTextService = new AudioToTextServiceImpl();
		return audioToTextService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAiAudioToTextService createOpenAiAudioToTextService() {
		OpenAiAudioToTextServiceImpl openAiAudioToTextService = new OpenAiAudioToTextServiceImpl();
		return openAiAudioToTextService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmbeddingGenerationService createEmbeddingGenerationService() {
		EmbeddingGenerationServiceImpl embeddingGenerationService = new EmbeddingGenerationServiceImpl();
		return embeddingGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextEmbeddingGenerationService createTextEmbeddingGenerationService() {
		TextEmbeddingGenerationServiceImpl textEmbeddingGenerationService = new TextEmbeddingGenerationServiceImpl();
		return textEmbeddingGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAITextEmbeddingGenerationService createOpenAITextEmbeddingGenerationService() {
		OpenAITextEmbeddingGenerationServiceImpl openAITextEmbeddingGenerationService = new OpenAITextEmbeddingGenerationServiceImpl();
		return openAITextEmbeddingGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextAIService createTextAIService() {
		TextAIServiceImpl textAIService = new TextAIServiceImpl();
		return textAIService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChatCompletionService createChatCompletionService() {
		ChatCompletionServiceImpl chatCompletionService = new ChatCompletionServiceImpl();
		return chatCompletionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeminiChatCompletion createGeminiChatCompletion() {
		GeminiChatCompletionImpl geminiChatCompletion = new GeminiChatCompletionImpl();
		return geminiChatCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAIChatCompletion createOpenAIChatCompletion() {
		OpenAIChatCompletionImpl openAIChatCompletion = new OpenAIChatCompletionImpl();
		return openAIChatCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextGenerationService createTextGenerationService() {
		TextGenerationServiceImpl textGenerationService = new TextGenerationServiceImpl();
		return textGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeminiTextGenerationService createGeminiTextGenerationService() {
		GeminiTextGenerationServiceImpl geminiTextGenerationService = new GeminiTextGenerationServiceImpl();
		return geminiTextGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HuggingFaceTextGenerationService createHuggingFaceTextGenerationService() {
		HuggingFaceTextGenerationServiceImpl huggingFaceTextGenerationService = new HuggingFaceTextGenerationServiceImpl();
		return huggingFaceTextGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAITextGenerationService createOpenAITextGenerationService() {
		OpenAITextGenerationServiceImpl openAITextGenerationService = new OpenAITextGenerationServiceImpl();
		return openAITextGenerationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextToAudioService createTextToAudioService() {
		TextToAudioServiceImpl textToAudioService = new TextToAudioServiceImpl();
		return textToAudioService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAiTextToAudioService createOpenAiTextToAudioService() {
		OpenAiTextToAudioServiceImpl openAiTextToAudioService = new OpenAiTextToAudioServiceImpl();
		return openAiTextToAudioService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvocationContext createInvocationContext() {
		InvocationContextImpl invocationContext = new InvocationContextImpl();
		return invocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticKernelTelemetry createSemanticKernelTelemetry() {
		SemanticKernelTelemetryImpl semanticKernelTelemetry = new SemanticKernelTelemetryImpl();
		return semanticKernelTelemetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseFormat createResponseFormat() {
		ResponseFormatImpl responseFormat = new ResponseFormatImpl();
		return responseFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonObjectResponseFormat createJsonObjectResponseFormat() {
		JsonObjectResponseFormatImpl jsonObjectResponseFormat = new JsonObjectResponseFormatImpl();
		return jsonObjectResponseFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonSchemaResponseFormat createJsonSchemaResponseFormat() {
		JsonSchemaResponseFormatImpl jsonSchemaResponseFormat = new JsonSchemaResponseFormatImpl();
		return jsonSchemaResponseFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextResponseFormat createTextResponseFormat() {
		TextResponseFormatImpl textResponseFormat = new TextResponseFormatImpl();
		return textResponseFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationReturnMode createInvocationReturnModeFromString(EDataType eDataType, String initialValue) {
		InvocationReturnMode result = InvocationReturnMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationReturnModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemantickernelPackage getSemantickernelPackage() {
		return (SemantickernelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemantickernelPackage getPackage() {
		return SemantickernelPackage.eINSTANCE;
	}

} //SemantickernelFactoryImpl
