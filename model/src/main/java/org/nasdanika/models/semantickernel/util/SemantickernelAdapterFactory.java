/**
 */
package org.nasdanika.models.semantickernel.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.common.Adaptable;
import org.nasdanika.models.semantickernel.*;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage
 * @generated
 */
public class SemantickernelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemantickernelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemantickernelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SemantickernelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemantickernelSwitch<Adapter> modelSwitch =
		new SemantickernelSwitch<Adapter>() {
			@Override
			public Adapter caseKernel(Kernel object) {
				return createKernelAdapter();
			}
			@Override
			public Adapter caseAIService(AIService object) {
				return createAIServiceAdapter();
			}
			@Override
			public Adapter caseAIServiceSelector(AIServiceSelector object) {
				return createAIServiceSelectorAdapter();
			}
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter caseInvocable(Invocable object) {
				return createInvocableAdapter();
			}
			@Override
			public Adapter casePromptTemplateConfig(PromptTemplateConfig object) {
				return createPromptTemplateConfigAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseSpelFunction(SpelFunction object) {
				return createSpelFunctionAdapter();
			}
			@Override
			public Adapter caseScriptedFunction(ScriptedFunction object) {
				return createScriptedFunctionAdapter();
			}
			@Override
			public Adapter casePromptFunction(PromptFunction object) {
				return createPromptFunctionAdapter();
			}
			@Override
			public Adapter caseInputVariable(InputVariable object) {
				return createInputVariableAdapter();
			}
			@Override
			public Adapter caseOutputVariable(OutputVariable object) {
				return createOutputVariableAdapter();
			}
			@Override
			public Adapter casePromptExecutionSettings(PromptExecutionSettings object) {
				return createPromptExecutionSettingsAdapter();
			}
			@Override
			public Adapter caseTokenSelectionBiasesEntry(Map.Entry<Integer, Integer> object) {
				return createTokenSelectionBiasesEntryAdapter();
			}
			@Override
			public Adapter casePromptExecutionSettingsEntry(Map.Entry<String, PromptExecutionSettings> object) {
				return createPromptExecutionSettingsEntryAdapter();
			}
			@Override
			public Adapter caseHook(Hook object) {
				return createHookAdapter();
			}
			@Override
			public Adapter caseHookEntry(Map.Entry<String, Hook> object) {
				return createHookEntryAdapter();
			}
			@Override
			public Adapter caseFunctionInvokedHook(FunctionInvokedHook object) {
				return createFunctionInvokedHookAdapter();
			}
			@Override
			public Adapter caseFunctionInvokingHook(FunctionInvokingHook object) {
				return createFunctionInvokingHookAdapter();
			}
			@Override
			public Adapter casePostChatCompletionHook(PostChatCompletionHook object) {
				return createPostChatCompletionHookAdapter();
			}
			@Override
			public Adapter casePreChatCompletionHook(PreChatCompletionHook object) {
				return createPreChatCompletionHookAdapter();
			}
			@Override
			public Adapter casePreToolCallHook(PreToolCallHook object) {
				return createPreToolCallHookAdapter();
			}
			@Override
			public Adapter casePromptRenderedHook(PromptRenderedHook object) {
				return createPromptRenderedHookAdapter();
			}
			@Override
			public Adapter casePromptRenderingHook(PromptRenderingHook object) {
				return createPromptRenderingHookAdapter();
			}
			@Override
			public Adapter caseAudioToTextService(AudioToTextService object) {
				return createAudioToTextServiceAdapter();
			}
			@Override
			public Adapter caseOpenAiAudioToTextService(OpenAiAudioToTextService object) {
				return createOpenAiAudioToTextServiceAdapter();
			}
			@Override
			public Adapter caseEmbeddingGenerationService(EmbeddingGenerationService object) {
				return createEmbeddingGenerationServiceAdapter();
			}
			@Override
			public Adapter caseTextEmbeddingGenerationService(TextEmbeddingGenerationService object) {
				return createTextEmbeddingGenerationServiceAdapter();
			}
			@Override
			public Adapter caseOpenAITextEmbeddingGenerationService(OpenAITextEmbeddingGenerationService object) {
				return createOpenAITextEmbeddingGenerationServiceAdapter();
			}
			@Override
			public Adapter caseTextAIService(TextAIService object) {
				return createTextAIServiceAdapter();
			}
			@Override
			public Adapter caseChatCompletionService(ChatCompletionService object) {
				return createChatCompletionServiceAdapter();
			}
			@Override
			public Adapter caseGeminiChatCompletion(GeminiChatCompletion object) {
				return createGeminiChatCompletionAdapter();
			}
			@Override
			public Adapter caseOpenAIChatCompletion(OpenAIChatCompletion object) {
				return createOpenAIChatCompletionAdapter();
			}
			@Override
			public Adapter caseTextGenerationService(TextGenerationService object) {
				return createTextGenerationServiceAdapter();
			}
			@Override
			public Adapter caseGeminiTextGenerationService(GeminiTextGenerationService object) {
				return createGeminiTextGenerationServiceAdapter();
			}
			@Override
			public Adapter caseHuggingFaceTextGenerationService(HuggingFaceTextGenerationService object) {
				return createHuggingFaceTextGenerationServiceAdapter();
			}
			@Override
			public Adapter caseOpenAITextGenerationService(OpenAITextGenerationService object) {
				return createOpenAITextGenerationServiceAdapter();
			}
			@Override
			public Adapter caseTextToAudioService(TextToAudioService object) {
				return createTextToAudioServiceAdapter();
			}
			@Override
			public Adapter caseOpenAiTextToAudioService(OpenAiTextToAudioService object) {
				return createOpenAiTextToAudioServiceAdapter();
			}
			@Override
			public Adapter caseInvocationContext(InvocationContext object) {
				return createInvocationContextAdapter();
			}
			@Override
			public Adapter caseSemanticKernelTelemetry(SemanticKernelTelemetry object) {
				return createSemanticKernelTelemetryAdapter();
			}
			@Override
			public Adapter caseResponseFormat(ResponseFormat object) {
				return createResponseFormatAdapter();
			}
			@Override
			public Adapter caseJsonObjectResponseFormat(JsonObjectResponseFormat object) {
				return createJsonObjectResponseFormatAdapter();
			}
			@Override
			public Adapter caseJsonSchemaResponseFormat(JsonSchemaResponseFormat object) {
				return createJsonSchemaResponseFormatAdapter();
			}
			@Override
			public Adapter caseTextResponseFormat(TextResponseFormat object) {
				return createTextResponseFormatAdapter();
			}
			@Override
			public Adapter caseIMarked(Marked object) {
				return createIMarkedAdapter();
			}
			@Override
			public Adapter caseMarked(org.nasdanika.ncore.Marked object) {
				return createMarkedAdapter();
			}
			@Override
			public Adapter caseAdaptable(Adaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseDocumented(Documented object) {
				return createDocumentedAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDocumentedNamedElement(DocumentedNamedElement object) {
				return createDocumentedNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.Kernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.Kernel
	 * @generated
	 */
	public Adapter createKernelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.AIService <em>AI Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.AIService
	 * @generated
	 */
	public Adapter createAIServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.AIServiceSelector <em>AI Service Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.AIServiceSelector
	 * @generated
	 */
	public Adapter createAIServiceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.Invocable <em>Invocable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.Invocable
	 * @generated
	 */
	public Adapter createInvocableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig <em>Prompt Template Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig
	 * @generated
	 */
	public Adapter createPromptTemplateConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.SpelFunction <em>Spel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.SpelFunction
	 * @generated
	 */
	public Adapter createSpelFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.ScriptedFunction <em>Scripted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction
	 * @generated
	 */
	public Adapter createScriptedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PromptFunction <em>Prompt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PromptFunction
	 * @generated
	 */
	public Adapter createPromptFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.InputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.InputVariable
	 * @generated
	 */
	public Adapter createInputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OutputVariable
	 * @generated
	 */
	public Adapter createOutputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings <em>Prompt Execution Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings
	 * @generated
	 */
	public Adapter createPromptExecutionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Token Selection Biases Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createTokenSelectionBiasesEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Prompt Execution Settings Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPromptExecutionSettingsEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.Hook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.Hook
	 * @generated
	 */
	public Adapter createHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Hook Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createHookEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.FunctionInvokedHook <em>Function Invoked Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.FunctionInvokedHook
	 * @generated
	 */
	public Adapter createFunctionInvokedHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.FunctionInvokingHook <em>Function Invoking Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.FunctionInvokingHook
	 * @generated
	 */
	public Adapter createFunctionInvokingHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PostChatCompletionHook <em>Post Chat Completion Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PostChatCompletionHook
	 * @generated
	 */
	public Adapter createPostChatCompletionHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PreChatCompletionHook <em>Pre Chat Completion Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PreChatCompletionHook
	 * @generated
	 */
	public Adapter createPreChatCompletionHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PreToolCallHook <em>Pre Tool Call Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PreToolCallHook
	 * @generated
	 */
	public Adapter createPreToolCallHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PromptRenderedHook <em>Prompt Rendered Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PromptRenderedHook
	 * @generated
	 */
	public Adapter createPromptRenderedHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.PromptRenderingHook <em>Prompt Rendering Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.PromptRenderingHook
	 * @generated
	 */
	public Adapter createPromptRenderingHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.AudioToTextService <em>Audio To Text Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.AudioToTextService
	 * @generated
	 */
	public Adapter createAudioToTextServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OpenAiAudioToTextService <em>Open Ai Audio To Text Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OpenAiAudioToTextService
	 * @generated
	 */
	public Adapter createOpenAiAudioToTextServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.EmbeddingGenerationService <em>Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.EmbeddingGenerationService
	 * @generated
	 */
	public Adapter createEmbeddingGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.TextEmbeddingGenerationService <em>Text Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.TextEmbeddingGenerationService
	 * @generated
	 */
	public Adapter createTextEmbeddingGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OpenAITextEmbeddingGenerationService <em>Open AI Text Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OpenAITextEmbeddingGenerationService
	 * @generated
	 */
	public Adapter createOpenAITextEmbeddingGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.TextAIService <em>Text AI Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.TextAIService
	 * @generated
	 */
	public Adapter createTextAIServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.ChatCompletionService <em>Chat Completion Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.ChatCompletionService
	 * @generated
	 */
	public Adapter createChatCompletionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.GeminiChatCompletion <em>Gemini Chat Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.GeminiChatCompletion
	 * @generated
	 */
	public Adapter createGeminiChatCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OpenAIChatCompletion <em>Open AI Chat Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OpenAIChatCompletion
	 * @generated
	 */
	public Adapter createOpenAIChatCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.TextGenerationService <em>Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.TextGenerationService
	 * @generated
	 */
	public Adapter createTextGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.GeminiTextGenerationService <em>Gemini Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.GeminiTextGenerationService
	 * @generated
	 */
	public Adapter createGeminiTextGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.HuggingFaceTextGenerationService <em>Hugging Face Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.HuggingFaceTextGenerationService
	 * @generated
	 */
	public Adapter createHuggingFaceTextGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OpenAITextGenerationService <em>Open AI Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OpenAITextGenerationService
	 * @generated
	 */
	public Adapter createOpenAITextGenerationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.TextToAudioService <em>Text To Audio Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.TextToAudioService
	 * @generated
	 */
	public Adapter createTextToAudioServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.OpenAiTextToAudioService <em>Open Ai Text To Audio Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.OpenAiTextToAudioService
	 * @generated
	 */
	public Adapter createOpenAiTextToAudioServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.InvocationContext <em>Invocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.InvocationContext
	 * @generated
	 */
	public Adapter createInvocationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.SemanticKernelTelemetry <em>Semantic Kernel Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.SemanticKernelTelemetry
	 * @generated
	 */
	public Adapter createSemanticKernelTelemetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.ResponseFormat <em>Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.ResponseFormat
	 * @generated
	 */
	public Adapter createResponseFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.JsonObjectResponseFormat <em>Json Object Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.JsonObjectResponseFormat
	 * @generated
	 */
	public Adapter createJsonObjectResponseFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat <em>Json Schema Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.JsonSchemaResponseFormat
	 * @generated
	 */
	public Adapter createJsonSchemaResponseFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.semantickernel.TextResponseFormat <em>Text Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.semantickernel.TextResponseFormat
	 * @generated
	 */
	public Adapter createTextResponseFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.persistence.Marked <em>IMarked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.persistence.Marked
	 * @generated
	 */
	public Adapter createIMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Marked
	 * @generated
	 */
	public Adapter createMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.common.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.common.Adaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Documented
	 * @generated
	 */
	public Adapter createDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.DocumentedNamedElement <em>Documented Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.DocumentedNamedElement
	 * @generated
	 */
	public Adapter createDocumentedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SemantickernelAdapterFactory
