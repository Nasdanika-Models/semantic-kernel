/**
 */
package org.nasdanika.models.semantickernel.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;
import org.nasdanika.models.semantickernel.*;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage
 * @generated
 */
public class SemantickernelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemantickernelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemantickernelSwitch() {
		if (modelPackage == null) {
			modelPackage = SemantickernelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SemantickernelPackage.KERNEL: {
				Kernel kernel = (Kernel)theEObject;
				T result = caseKernel(kernel);
				if (result == null) result = caseModelElement(kernel);
				if (result == null) result = caseDocumented(kernel);
				if (result == null) result = caseMarked(kernel);
				if (result == null) result = caseAdaptable(kernel);
				if (result == null) result = caseIMarked(kernel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.AI_SERVICE: {
				AIService aiService = (AIService)theEObject;
				T result = caseAIService(aiService);
				if (result == null) result = caseModelElement(aiService);
				if (result == null) result = caseDocumented(aiService);
				if (result == null) result = caseMarked(aiService);
				if (result == null) result = caseAdaptable(aiService);
				if (result == null) result = caseIMarked(aiService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.AI_SERVICE_SELECTOR: {
				AIServiceSelector aiServiceSelector = (AIServiceSelector)theEObject;
				T result = caseAIServiceSelector(aiServiceSelector);
				if (result == null) result = caseModelElement(aiServiceSelector);
				if (result == null) result = caseDocumented(aiServiceSelector);
				if (result == null) result = caseMarked(aiServiceSelector);
				if (result == null) result = caseAdaptable(aiServiceSelector);
				if (result == null) result = caseIMarked(aiServiceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PLUGIN: {
				Plugin plugin = (Plugin)theEObject;
				T result = casePlugin(plugin);
				if (result == null) result = caseDocumentedNamedElement(plugin);
				if (result == null) result = caseNamedElement(plugin);
				if (result == null) result = caseDocumented(plugin);
				if (result == null) result = caseModelElement(plugin);
				if (result == null) result = caseMarked(plugin);
				if (result == null) result = caseAdaptable(plugin);
				if (result == null) result = caseIMarked(plugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.INVOCABLE: {
				Invocable invocable = (Invocable)theEObject;
				T result = caseInvocable(invocable);
				if (result == null) result = caseDocumentedNamedElement(invocable);
				if (result == null) result = caseNamedElement(invocable);
				if (result == null) result = caseDocumented(invocable);
				if (result == null) result = caseModelElement(invocable);
				if (result == null) result = caseMarked(invocable);
				if (result == null) result = caseAdaptable(invocable);
				if (result == null) result = caseIMarked(invocable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG: {
				PromptTemplateConfig promptTemplateConfig = (PromptTemplateConfig)theEObject;
				T result = casePromptTemplateConfig(promptTemplateConfig);
				if (result == null) result = caseInvocable(promptTemplateConfig);
				if (result == null) result = caseDocumentedNamedElement(promptTemplateConfig);
				if (result == null) result = caseNamedElement(promptTemplateConfig);
				if (result == null) result = caseDocumented(promptTemplateConfig);
				if (result == null) result = caseModelElement(promptTemplateConfig);
				if (result == null) result = caseMarked(promptTemplateConfig);
				if (result == null) result = caseAdaptable(promptTemplateConfig);
				if (result == null) result = caseIMarked(promptTemplateConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseInvocable(function);
				if (result == null) result = caseDocumentedNamedElement(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = caseDocumented(function);
				if (result == null) result = caseModelElement(function);
				if (result == null) result = caseMarked(function);
				if (result == null) result = caseAdaptable(function);
				if (result == null) result = caseIMarked(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.SPEL_FUNCTION: {
				SpelFunction spelFunction = (SpelFunction)theEObject;
				T result = caseSpelFunction(spelFunction);
				if (result == null) result = caseFunction(spelFunction);
				if (result == null) result = caseInvocable(spelFunction);
				if (result == null) result = caseDocumentedNamedElement(spelFunction);
				if (result == null) result = caseNamedElement(spelFunction);
				if (result == null) result = caseDocumented(spelFunction);
				if (result == null) result = caseModelElement(spelFunction);
				if (result == null) result = caseMarked(spelFunction);
				if (result == null) result = caseAdaptable(spelFunction);
				if (result == null) result = caseIMarked(spelFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.SCRIPTED_FUNCTION: {
				ScriptedFunction scriptedFunction = (ScriptedFunction)theEObject;
				T result = caseScriptedFunction(scriptedFunction);
				if (result == null) result = caseFunction(scriptedFunction);
				if (result == null) result = caseInvocable(scriptedFunction);
				if (result == null) result = caseDocumentedNamedElement(scriptedFunction);
				if (result == null) result = caseNamedElement(scriptedFunction);
				if (result == null) result = caseDocumented(scriptedFunction);
				if (result == null) result = caseModelElement(scriptedFunction);
				if (result == null) result = caseMarked(scriptedFunction);
				if (result == null) result = caseAdaptable(scriptedFunction);
				if (result == null) result = caseIMarked(scriptedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_FUNCTION: {
				PromptFunction promptFunction = (PromptFunction)theEObject;
				T result = casePromptFunction(promptFunction);
				if (result == null) result = caseFunction(promptFunction);
				if (result == null) result = casePromptTemplateConfig(promptFunction);
				if (result == null) result = caseInvocable(promptFunction);
				if (result == null) result = caseDocumentedNamedElement(promptFunction);
				if (result == null) result = caseNamedElement(promptFunction);
				if (result == null) result = caseDocumented(promptFunction);
				if (result == null) result = caseModelElement(promptFunction);
				if (result == null) result = caseMarked(promptFunction);
				if (result == null) result = caseAdaptable(promptFunction);
				if (result == null) result = caseIMarked(promptFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.INPUT_VARIABLE: {
				InputVariable inputVariable = (InputVariable)theEObject;
				T result = caseInputVariable(inputVariable);
				if (result == null) result = caseDocumentedNamedElement(inputVariable);
				if (result == null) result = caseNamedElement(inputVariable);
				if (result == null) result = caseDocumented(inputVariable);
				if (result == null) result = caseModelElement(inputVariable);
				if (result == null) result = caseMarked(inputVariable);
				if (result == null) result = caseAdaptable(inputVariable);
				if (result == null) result = caseIMarked(inputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OUTPUT_VARIABLE: {
				OutputVariable outputVariable = (OutputVariable)theEObject;
				T result = caseOutputVariable(outputVariable);
				if (result == null) result = caseModelElement(outputVariable);
				if (result == null) result = caseDocumented(outputVariable);
				if (result == null) result = caseMarked(outputVariable);
				if (result == null) result = caseAdaptable(outputVariable);
				if (result == null) result = caseIMarked(outputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS: {
				PromptExecutionSettings promptExecutionSettings = (PromptExecutionSettings)theEObject;
				T result = casePromptExecutionSettings(promptExecutionSettings);
				if (result == null) result = caseModelElement(promptExecutionSettings);
				if (result == null) result = caseDocumented(promptExecutionSettings);
				if (result == null) result = caseMarked(promptExecutionSettings);
				if (result == null) result = caseAdaptable(promptExecutionSettings);
				if (result == null) result = caseIMarked(promptExecutionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, Integer> tokenSelectionBiasesEntry = (Map.Entry<Integer, Integer>)theEObject;
				T result = caseTokenSelectionBiasesEntry(tokenSelectionBiasesEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, PromptExecutionSettings> promptExecutionSettingsEntry = (Map.Entry<String, PromptExecutionSettings>)theEObject;
				T result = casePromptExecutionSettingsEntry(promptExecutionSettingsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.HOOK: {
				Hook hook = (Hook)theEObject;
				T result = caseHook(hook);
				if (result == null) result = caseModelElement(hook);
				if (result == null) result = caseDocumented(hook);
				if (result == null) result = caseMarked(hook);
				if (result == null) result = caseAdaptable(hook);
				if (result == null) result = caseIMarked(hook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.HOOK_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Hook> hookEntry = (Map.Entry<String, Hook>)theEObject;
				T result = caseHookEntry(hookEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.FUNCTION_INVOKED_HOOK: {
				FunctionInvokedHook functionInvokedHook = (FunctionInvokedHook)theEObject;
				T result = caseFunctionInvokedHook(functionInvokedHook);
				if (result == null) result = caseHook(functionInvokedHook);
				if (result == null) result = caseModelElement(functionInvokedHook);
				if (result == null) result = caseDocumented(functionInvokedHook);
				if (result == null) result = caseMarked(functionInvokedHook);
				if (result == null) result = caseAdaptable(functionInvokedHook);
				if (result == null) result = caseIMarked(functionInvokedHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.FUNCTION_INVOKING_HOOK: {
				FunctionInvokingHook functionInvokingHook = (FunctionInvokingHook)theEObject;
				T result = caseFunctionInvokingHook(functionInvokingHook);
				if (result == null) result = caseHook(functionInvokingHook);
				if (result == null) result = caseModelElement(functionInvokingHook);
				if (result == null) result = caseDocumented(functionInvokingHook);
				if (result == null) result = caseMarked(functionInvokingHook);
				if (result == null) result = caseAdaptable(functionInvokingHook);
				if (result == null) result = caseIMarked(functionInvokingHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.POST_CHAT_COMPLETION_HOOK: {
				PostChatCompletionHook postChatCompletionHook = (PostChatCompletionHook)theEObject;
				T result = casePostChatCompletionHook(postChatCompletionHook);
				if (result == null) result = caseHook(postChatCompletionHook);
				if (result == null) result = caseModelElement(postChatCompletionHook);
				if (result == null) result = caseDocumented(postChatCompletionHook);
				if (result == null) result = caseMarked(postChatCompletionHook);
				if (result == null) result = caseAdaptable(postChatCompletionHook);
				if (result == null) result = caseIMarked(postChatCompletionHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PRE_CHAT_COMPLETION_HOOK: {
				PreChatCompletionHook preChatCompletionHook = (PreChatCompletionHook)theEObject;
				T result = casePreChatCompletionHook(preChatCompletionHook);
				if (result == null) result = caseHook(preChatCompletionHook);
				if (result == null) result = caseModelElement(preChatCompletionHook);
				if (result == null) result = caseDocumented(preChatCompletionHook);
				if (result == null) result = caseMarked(preChatCompletionHook);
				if (result == null) result = caseAdaptable(preChatCompletionHook);
				if (result == null) result = caseIMarked(preChatCompletionHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PRE_TOOL_CALL_HOOK: {
				PreToolCallHook preToolCallHook = (PreToolCallHook)theEObject;
				T result = casePreToolCallHook(preToolCallHook);
				if (result == null) result = caseHook(preToolCallHook);
				if (result == null) result = caseModelElement(preToolCallHook);
				if (result == null) result = caseDocumented(preToolCallHook);
				if (result == null) result = caseMarked(preToolCallHook);
				if (result == null) result = caseAdaptable(preToolCallHook);
				if (result == null) result = caseIMarked(preToolCallHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_RENDERED_HOOK: {
				PromptRenderedHook promptRenderedHook = (PromptRenderedHook)theEObject;
				T result = casePromptRenderedHook(promptRenderedHook);
				if (result == null) result = caseHook(promptRenderedHook);
				if (result == null) result = caseModelElement(promptRenderedHook);
				if (result == null) result = caseDocumented(promptRenderedHook);
				if (result == null) result = caseMarked(promptRenderedHook);
				if (result == null) result = caseAdaptable(promptRenderedHook);
				if (result == null) result = caseIMarked(promptRenderedHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.PROMPT_RENDERING_HOOK: {
				PromptRenderingHook promptRenderingHook = (PromptRenderingHook)theEObject;
				T result = casePromptRenderingHook(promptRenderingHook);
				if (result == null) result = caseHook(promptRenderingHook);
				if (result == null) result = caseModelElement(promptRenderingHook);
				if (result == null) result = caseDocumented(promptRenderingHook);
				if (result == null) result = caseMarked(promptRenderingHook);
				if (result == null) result = caseAdaptable(promptRenderingHook);
				if (result == null) result = caseIMarked(promptRenderingHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.AUDIO_TO_TEXT_SERVICE: {
				AudioToTextService audioToTextService = (AudioToTextService)theEObject;
				T result = caseAudioToTextService(audioToTextService);
				if (result == null) result = caseAIService(audioToTextService);
				if (result == null) result = caseModelElement(audioToTextService);
				if (result == null) result = caseDocumented(audioToTextService);
				if (result == null) result = caseMarked(audioToTextService);
				if (result == null) result = caseAdaptable(audioToTextService);
				if (result == null) result = caseIMarked(audioToTextService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OPEN_AI_AUDIO_TO_TEXT_SERVICE: {
				OpenAiAudioToTextService openAiAudioToTextService = (OpenAiAudioToTextService)theEObject;
				T result = caseOpenAiAudioToTextService(openAiAudioToTextService);
				if (result == null) result = caseAudioToTextService(openAiAudioToTextService);
				if (result == null) result = caseAIService(openAiAudioToTextService);
				if (result == null) result = caseModelElement(openAiAudioToTextService);
				if (result == null) result = caseDocumented(openAiAudioToTextService);
				if (result == null) result = caseMarked(openAiAudioToTextService);
				if (result == null) result = caseAdaptable(openAiAudioToTextService);
				if (result == null) result = caseIMarked(openAiAudioToTextService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.EMBEDDING_GENERATION_SERVICE: {
				EmbeddingGenerationService embeddingGenerationService = (EmbeddingGenerationService)theEObject;
				T result = caseEmbeddingGenerationService(embeddingGenerationService);
				if (result == null) result = caseAIService(embeddingGenerationService);
				if (result == null) result = caseModelElement(embeddingGenerationService);
				if (result == null) result = caseDocumented(embeddingGenerationService);
				if (result == null) result = caseMarked(embeddingGenerationService);
				if (result == null) result = caseAdaptable(embeddingGenerationService);
				if (result == null) result = caseIMarked(embeddingGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TEXT_EMBEDDING_GENERATION_SERVICE: {
				TextEmbeddingGenerationService textEmbeddingGenerationService = (TextEmbeddingGenerationService)theEObject;
				T result = caseTextEmbeddingGenerationService(textEmbeddingGenerationService);
				if (result == null) result = caseEmbeddingGenerationService(textEmbeddingGenerationService);
				if (result == null) result = caseAIService(textEmbeddingGenerationService);
				if (result == null) result = caseModelElement(textEmbeddingGenerationService);
				if (result == null) result = caseDocumented(textEmbeddingGenerationService);
				if (result == null) result = caseMarked(textEmbeddingGenerationService);
				if (result == null) result = caseAdaptable(textEmbeddingGenerationService);
				if (result == null) result = caseIMarked(textEmbeddingGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE: {
				OpenAITextEmbeddingGenerationService openAITextEmbeddingGenerationService = (OpenAITextEmbeddingGenerationService)theEObject;
				T result = caseOpenAITextEmbeddingGenerationService(openAITextEmbeddingGenerationService);
				if (result == null) result = caseTextEmbeddingGenerationService(openAITextEmbeddingGenerationService);
				if (result == null) result = caseEmbeddingGenerationService(openAITextEmbeddingGenerationService);
				if (result == null) result = caseAIService(openAITextEmbeddingGenerationService);
				if (result == null) result = caseModelElement(openAITextEmbeddingGenerationService);
				if (result == null) result = caseDocumented(openAITextEmbeddingGenerationService);
				if (result == null) result = caseMarked(openAITextEmbeddingGenerationService);
				if (result == null) result = caseAdaptable(openAITextEmbeddingGenerationService);
				if (result == null) result = caseIMarked(openAITextEmbeddingGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TEXT_AI_SERVICE: {
				TextAIService textAIService = (TextAIService)theEObject;
				T result = caseTextAIService(textAIService);
				if (result == null) result = caseAIService(textAIService);
				if (result == null) result = caseModelElement(textAIService);
				if (result == null) result = caseDocumented(textAIService);
				if (result == null) result = caseMarked(textAIService);
				if (result == null) result = caseAdaptable(textAIService);
				if (result == null) result = caseIMarked(textAIService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.CHAT_COMPLETION_SERVICE: {
				ChatCompletionService chatCompletionService = (ChatCompletionService)theEObject;
				T result = caseChatCompletionService(chatCompletionService);
				if (result == null) result = caseTextAIService(chatCompletionService);
				if (result == null) result = caseAIService(chatCompletionService);
				if (result == null) result = caseModelElement(chatCompletionService);
				if (result == null) result = caseDocumented(chatCompletionService);
				if (result == null) result = caseMarked(chatCompletionService);
				if (result == null) result = caseAdaptable(chatCompletionService);
				if (result == null) result = caseIMarked(chatCompletionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.GEMINI_CHAT_COMPLETION: {
				GeminiChatCompletion geminiChatCompletion = (GeminiChatCompletion)theEObject;
				T result = caseGeminiChatCompletion(geminiChatCompletion);
				if (result == null) result = caseChatCompletionService(geminiChatCompletion);
				if (result == null) result = caseTextAIService(geminiChatCompletion);
				if (result == null) result = caseAIService(geminiChatCompletion);
				if (result == null) result = caseModelElement(geminiChatCompletion);
				if (result == null) result = caseDocumented(geminiChatCompletion);
				if (result == null) result = caseMarked(geminiChatCompletion);
				if (result == null) result = caseAdaptable(geminiChatCompletion);
				if (result == null) result = caseIMarked(geminiChatCompletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OPEN_AI_CHAT_COMPLETION: {
				OpenAIChatCompletion openAIChatCompletion = (OpenAIChatCompletion)theEObject;
				T result = caseOpenAIChatCompletion(openAIChatCompletion);
				if (result == null) result = caseChatCompletionService(openAIChatCompletion);
				if (result == null) result = caseTextAIService(openAIChatCompletion);
				if (result == null) result = caseAIService(openAIChatCompletion);
				if (result == null) result = caseModelElement(openAIChatCompletion);
				if (result == null) result = caseDocumented(openAIChatCompletion);
				if (result == null) result = caseMarked(openAIChatCompletion);
				if (result == null) result = caseAdaptable(openAIChatCompletion);
				if (result == null) result = caseIMarked(openAIChatCompletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TEXT_GENERATION_SERVICE: {
				TextGenerationService textGenerationService = (TextGenerationService)theEObject;
				T result = caseTextGenerationService(textGenerationService);
				if (result == null) result = caseTextAIService(textGenerationService);
				if (result == null) result = caseAIService(textGenerationService);
				if (result == null) result = caseModelElement(textGenerationService);
				if (result == null) result = caseDocumented(textGenerationService);
				if (result == null) result = caseMarked(textGenerationService);
				if (result == null) result = caseAdaptable(textGenerationService);
				if (result == null) result = caseIMarked(textGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.GEMINI_TEXT_GENERATION_SERVICE: {
				GeminiTextGenerationService geminiTextGenerationService = (GeminiTextGenerationService)theEObject;
				T result = caseGeminiTextGenerationService(geminiTextGenerationService);
				if (result == null) result = caseTextGenerationService(geminiTextGenerationService);
				if (result == null) result = caseTextAIService(geminiTextGenerationService);
				if (result == null) result = caseAIService(geminiTextGenerationService);
				if (result == null) result = caseModelElement(geminiTextGenerationService);
				if (result == null) result = caseDocumented(geminiTextGenerationService);
				if (result == null) result = caseMarked(geminiTextGenerationService);
				if (result == null) result = caseAdaptable(geminiTextGenerationService);
				if (result == null) result = caseIMarked(geminiTextGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.HUGGING_FACE_TEXT_GENERATION_SERVICE: {
				HuggingFaceTextGenerationService huggingFaceTextGenerationService = (HuggingFaceTextGenerationService)theEObject;
				T result = caseHuggingFaceTextGenerationService(huggingFaceTextGenerationService);
				if (result == null) result = caseTextGenerationService(huggingFaceTextGenerationService);
				if (result == null) result = caseTextAIService(huggingFaceTextGenerationService);
				if (result == null) result = caseAIService(huggingFaceTextGenerationService);
				if (result == null) result = caseModelElement(huggingFaceTextGenerationService);
				if (result == null) result = caseDocumented(huggingFaceTextGenerationService);
				if (result == null) result = caseMarked(huggingFaceTextGenerationService);
				if (result == null) result = caseAdaptable(huggingFaceTextGenerationService);
				if (result == null) result = caseIMarked(huggingFaceTextGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OPEN_AI_TEXT_GENERATION_SERVICE: {
				OpenAITextGenerationService openAITextGenerationService = (OpenAITextGenerationService)theEObject;
				T result = caseOpenAITextGenerationService(openAITextGenerationService);
				if (result == null) result = caseTextGenerationService(openAITextGenerationService);
				if (result == null) result = caseTextAIService(openAITextGenerationService);
				if (result == null) result = caseAIService(openAITextGenerationService);
				if (result == null) result = caseModelElement(openAITextGenerationService);
				if (result == null) result = caseDocumented(openAITextGenerationService);
				if (result == null) result = caseMarked(openAITextGenerationService);
				if (result == null) result = caseAdaptable(openAITextGenerationService);
				if (result == null) result = caseIMarked(openAITextGenerationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TEXT_TO_AUDIO_SERVICE: {
				TextToAudioService textToAudioService = (TextToAudioService)theEObject;
				T result = caseTextToAudioService(textToAudioService);
				if (result == null) result = caseAIService(textToAudioService);
				if (result == null) result = caseModelElement(textToAudioService);
				if (result == null) result = caseDocumented(textToAudioService);
				if (result == null) result = caseMarked(textToAudioService);
				if (result == null) result = caseAdaptable(textToAudioService);
				if (result == null) result = caseIMarked(textToAudioService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.OPEN_AI_TEXT_TO_AUDIO_SERVICE: {
				OpenAiTextToAudioService openAiTextToAudioService = (OpenAiTextToAudioService)theEObject;
				T result = caseOpenAiTextToAudioService(openAiTextToAudioService);
				if (result == null) result = caseTextToAudioService(openAiTextToAudioService);
				if (result == null) result = caseAIService(openAiTextToAudioService);
				if (result == null) result = caseModelElement(openAiTextToAudioService);
				if (result == null) result = caseDocumented(openAiTextToAudioService);
				if (result == null) result = caseMarked(openAiTextToAudioService);
				if (result == null) result = caseAdaptable(openAiTextToAudioService);
				if (result == null) result = caseIMarked(openAiTextToAudioService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.INVOCATION_CONTEXT: {
				InvocationContext invocationContext = (InvocationContext)theEObject;
				T result = caseInvocationContext(invocationContext);
				if (result == null) result = caseModelElement(invocationContext);
				if (result == null) result = caseDocumented(invocationContext);
				if (result == null) result = caseMarked(invocationContext);
				if (result == null) result = caseAdaptable(invocationContext);
				if (result == null) result = caseIMarked(invocationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY: {
				SemanticKernelTelemetry semanticKernelTelemetry = (SemanticKernelTelemetry)theEObject;
				T result = caseSemanticKernelTelemetry(semanticKernelTelemetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.RESPONSE_FORMAT: {
				ResponseFormat responseFormat = (ResponseFormat)theEObject;
				T result = caseResponseFormat(responseFormat);
				if (result == null) result = caseModelElement(responseFormat);
				if (result == null) result = caseDocumented(responseFormat);
				if (result == null) result = caseMarked(responseFormat);
				if (result == null) result = caseAdaptable(responseFormat);
				if (result == null) result = caseIMarked(responseFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.JSON_OBJECT_RESPONSE_FORMAT: {
				JsonObjectResponseFormat jsonObjectResponseFormat = (JsonObjectResponseFormat)theEObject;
				T result = caseJsonObjectResponseFormat(jsonObjectResponseFormat);
				if (result == null) result = caseResponseFormat(jsonObjectResponseFormat);
				if (result == null) result = caseModelElement(jsonObjectResponseFormat);
				if (result == null) result = caseDocumented(jsonObjectResponseFormat);
				if (result == null) result = caseMarked(jsonObjectResponseFormat);
				if (result == null) result = caseAdaptable(jsonObjectResponseFormat);
				if (result == null) result = caseIMarked(jsonObjectResponseFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT: {
				JsonSchemaResponseFormat jsonSchemaResponseFormat = (JsonSchemaResponseFormat)theEObject;
				T result = caseJsonSchemaResponseFormat(jsonSchemaResponseFormat);
				if (result == null) result = caseResponseFormat(jsonSchemaResponseFormat);
				if (result == null) result = caseModelElement(jsonSchemaResponseFormat);
				if (result == null) result = caseDocumented(jsonSchemaResponseFormat);
				if (result == null) result = caseMarked(jsonSchemaResponseFormat);
				if (result == null) result = caseAdaptable(jsonSchemaResponseFormat);
				if (result == null) result = caseIMarked(jsonSchemaResponseFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemantickernelPackage.TEXT_RESPONSE_FORMAT: {
				TextResponseFormat textResponseFormat = (TextResponseFormat)theEObject;
				T result = caseTextResponseFormat(textResponseFormat);
				if (result == null) result = caseResponseFormat(textResponseFormat);
				if (result == null) result = caseModelElement(textResponseFormat);
				if (result == null) result = caseDocumented(textResponseFormat);
				if (result == null) result = caseMarked(textResponseFormat);
				if (result == null) result = caseAdaptable(textResponseFormat);
				if (result == null) result = caseIMarked(textResponseFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kernel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kernel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKernel(Kernel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIService(AIService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Service Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Service Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIServiceSelector(AIServiceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugin(Plugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocable(Invocable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Template Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Template Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptTemplateConfig(PromptTemplateConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spel Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spel Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpelFunction(SpelFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripted Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripted Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptedFunction(ScriptedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptFunction(PromptFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariable(InputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariable(OutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Execution Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Execution Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptExecutionSettings(PromptExecutionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Selection Biases Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Selection Biases Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenSelectionBiasesEntry(Map.Entry<Integer, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Execution Settings Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Execution Settings Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptExecutionSettingsEntry(Map.Entry<String, PromptExecutionSettings> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook(Hook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookEntry(Map.Entry<String, Hook> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Invoked Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Invoked Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInvokedHook(FunctionInvokedHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Invoking Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Invoking Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInvokingHook(FunctionInvokingHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Chat Completion Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Chat Completion Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostChatCompletionHook(PostChatCompletionHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Chat Completion Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Chat Completion Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreChatCompletionHook(PreChatCompletionHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Tool Call Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Tool Call Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreToolCallHook(PreToolCallHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Rendered Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Rendered Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptRenderedHook(PromptRenderedHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Rendering Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Rendering Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptRenderingHook(PromptRenderingHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio To Text Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio To Text Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioToTextService(AudioToTextService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Ai Audio To Text Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Ai Audio To Text Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAiAudioToTextService(OpenAiAudioToTextService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedding Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddingGenerationService(EmbeddingGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Embedding Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextEmbeddingGenerationService(TextEmbeddingGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open AI Text Embedding Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open AI Text Embedding Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAITextEmbeddingGenerationService(OpenAITextEmbeddingGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text AI Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text AI Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAIService(TextAIService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chat Completion Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chat Completion Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChatCompletionService(ChatCompletionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gemini Chat Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gemini Chat Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeminiChatCompletion(GeminiChatCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open AI Chat Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open AI Chat Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAIChatCompletion(OpenAIChatCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextGenerationService(TextGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gemini Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gemini Text Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeminiTextGenerationService(GeminiTextGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hugging Face Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hugging Face Text Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuggingFaceTextGenerationService(HuggingFaceTextGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open AI Text Generation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open AI Text Generation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAITextGenerationService(OpenAITextGenerationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text To Audio Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text To Audio Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextToAudioService(TextToAudioService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Ai Text To Audio Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Ai Text To Audio Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAiTextToAudioService(OpenAiTextToAudioService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationContext(InvocationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Kernel Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Kernel Telemetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticKernelTelemetry(SemanticKernelTelemetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseFormat(ResponseFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Object Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Object Response Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonObjectResponseFormat(JsonObjectResponseFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Schema Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Schema Response Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonSchemaResponseFormat(JsonSchemaResponseFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Response Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Response Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextResponseFormat(TextResponseFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SemantickernelSwitch
