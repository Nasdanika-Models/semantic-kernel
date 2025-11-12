/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.semantickernel.AIService;
import org.nasdanika.models.semantickernel.AIServiceSelector;
import org.nasdanika.models.semantickernel.AudioToTextService;
import org.nasdanika.models.semantickernel.ChatCompletionService;
import org.nasdanika.models.semantickernel.EmbeddingGenerationService;
import org.nasdanika.models.semantickernel.Function;
import org.nasdanika.models.semantickernel.FunctionInvokedHook;
import org.nasdanika.models.semantickernel.FunctionInvokingHook;
import org.nasdanika.models.semantickernel.GeminiChatCompletion;
import org.nasdanika.models.semantickernel.GeminiTextGenerationService;
import org.nasdanika.models.semantickernel.Hook;
import org.nasdanika.models.semantickernel.HuggingFaceTextGenerationService;
import org.nasdanika.models.semantickernel.InputVariable;
import org.nasdanika.models.semantickernel.Invocable;
import org.nasdanika.models.semantickernel.InvocationContext;
import org.nasdanika.models.semantickernel.InvocationReturnMode;
import org.nasdanika.models.semantickernel.JsonObjectResponseFormat;
import org.nasdanika.models.semantickernel.JsonSchemaResponseFormat;
import org.nasdanika.models.semantickernel.Kernel;
import org.nasdanika.models.semantickernel.OpenAIChatCompletion;
import org.nasdanika.models.semantickernel.OpenAITextEmbeddingGenerationService;
import org.nasdanika.models.semantickernel.OpenAITextGenerationService;
import org.nasdanika.models.semantickernel.OpenAiAudioToTextService;
import org.nasdanika.models.semantickernel.OpenAiTextToAudioService;
import org.nasdanika.models.semantickernel.OutputVariable;
import org.nasdanika.models.semantickernel.Plugin;
import org.nasdanika.models.semantickernel.PostChatCompletionHook;
import org.nasdanika.models.semantickernel.PreChatCompletionHook;
import org.nasdanika.models.semantickernel.PreToolCallHook;
import org.nasdanika.models.semantickernel.PromptExecutionSettings;
import org.nasdanika.models.semantickernel.PromptFunction;
import org.nasdanika.models.semantickernel.PromptRenderedHook;
import org.nasdanika.models.semantickernel.PromptRenderingHook;
import org.nasdanika.models.semantickernel.PromptTemplateConfig;
import org.nasdanika.models.semantickernel.ResponseFormat;
import org.nasdanika.models.semantickernel.ScriptedFunction;
import org.nasdanika.models.semantickernel.SemanticKernelTelemetry;
import org.nasdanika.models.semantickernel.SemantickernelFactory;
import org.nasdanika.models.semantickernel.SemantickernelPackage;
import org.nasdanika.models.semantickernel.SpelFunction;
import org.nasdanika.models.semantickernel.TextAIService;
import org.nasdanika.models.semantickernel.TextEmbeddingGenerationService;
import org.nasdanika.models.semantickernel.TextGenerationService;
import org.nasdanika.models.semantickernel.TextResponseFormat;
import org.nasdanika.models.semantickernel.TextToAudioService;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemantickernelPackageImpl extends EPackageImpl implements SemantickernelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kernelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiServiceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiServiceSelectorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptTemplateConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spelFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptExecutionSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenSelectionBiasesEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptExecutionSettingsEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInvokedHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInvokingHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postChatCompletionHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preChatCompletionHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preToolCallHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptRenderedHookEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptRenderingHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioToTextServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAiAudioToTextServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddingGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEmbeddingGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAITextEmbeddingGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAIServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatCompletionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geminiChatCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAIChatCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geminiTextGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass huggingFaceTextGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAITextGenerationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textToAudioServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAiTextToAudioServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticKernelTelemetryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonObjectResponseFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonSchemaResponseFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textResponseFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invocationReturnModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemantickernelPackageImpl() {
		super(eNS_URI, SemantickernelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SemantickernelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemantickernelPackage init() {
		if (isInited) return (SemantickernelPackage)EPackage.Registry.INSTANCE.getEPackage(SemantickernelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemantickernelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemantickernelPackageImpl theSemantickernelPackage = registeredSemantickernelPackage instanceof SemantickernelPackageImpl ? (SemantickernelPackageImpl)registeredSemantickernelPackage : new SemantickernelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSemantickernelPackage.createPackageContents();

		// Initialize created meta-data
		theSemantickernelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemantickernelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemantickernelPackage.eNS_URI, theSemantickernelPackage);
		return theSemantickernelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKernel() {
		return kernelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKernel_Hooks() {
		return (EReference)kernelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKernel_Plugins() {
		return (EReference)kernelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKernel_AiServiceSelector() {
		return (EReference)kernelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKernel_Services() {
		return (EReference)kernelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIService() {
		return aiServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIService_Model() {
		return (EAttribute)aiServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAIService_Service() {
		return (EAttribute)aiServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAIServiceSelector() {
		return aiServiceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlugin_Functions() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvocable() {
		return invocableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocable_Parameters() {
		return (EReference)invocableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocable_PromptExecutionSettings() {
		return (EReference)invocableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptTemplateConfig() {
		return promptTemplateConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptTemplateConfig_Schema() {
		return (EAttribute)promptTemplateConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptTemplateConfig_Template() {
		return (EAttribute)promptTemplateConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptTemplateConfig_TemplateRef() {
		return (EAttribute)promptTemplateConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptTemplateConfig_TemplateFormat() {
		return (EAttribute)promptTemplateConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Type() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpelFunction() {
		return spelFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpelFunction_Expression() {
		return (EAttribute)spelFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptedFunction() {
		return scriptedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptedFunction_EngineNames() {
		return (EAttribute)scriptedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptedFunction_EngineMimeTypes() {
		return (EAttribute)scriptedFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptedFunction_EngineExtensions() {
		return (EAttribute)scriptedFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptedFunction_Script() {
		return (EAttribute)scriptedFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptedFunction_ScriptRef() {
		return (EAttribute)scriptedFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptFunction() {
		return promptFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputVariable() {
		return inputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputVariable_Type() {
		return (EAttribute)inputVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputVariable_DefaultValue() {
		return (EAttribute)inputVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputVariable_Required() {
		return (EAttribute)inputVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputVariable_EnumValues() {
		return (EAttribute)inputVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputVariable() {
		return outputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputVariable_Type() {
		return (EAttribute)outputVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptExecutionSettings() {
		return promptExecutionSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_Service() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_Model() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_Temperature() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_TopP() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_PresensePenalty() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_FrequencyPenalty() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_MaxTokens() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_BestOf() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_ResultsPerPrompt() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_User() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettings_StopSequences() {
		return (EAttribute)promptExecutionSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPromptExecutionSettings_ResponseFormat() {
		return (EReference)promptExecutionSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPromptExecutionSettings_TokenSelectionBiases() {
		return (EReference)promptExecutionSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTokenSelectionBiasesEntry() {
		return tokenSelectionBiasesEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenSelectionBiasesEntry_Key() {
		return (EAttribute)tokenSelectionBiasesEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenSelectionBiasesEntry_Value() {
		return (EAttribute)tokenSelectionBiasesEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptExecutionSettingsEntry() {
		return promptExecutionSettingsEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromptExecutionSettingsEntry_Key() {
		return (EAttribute)promptExecutionSettingsEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPromptExecutionSettingsEntry_Value() {
		return (EReference)promptExecutionSettingsEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHook() {
		return hookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHook_Priority() {
		return (EAttribute)hookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHookEntry() {
		return hookEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHookEntry_Key() {
		return (EAttribute)hookEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHookEntry_Value() {
		return (EReference)hookEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionInvokedHook() {
		return functionInvokedHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionInvokingHook() {
		return functionInvokingHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostChatCompletionHook() {
		return postChatCompletionHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreChatCompletionHook() {
		return preChatCompletionHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreToolCallHook() {
		return preToolCallHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptRenderedHook() {
		return promptRenderedHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromptRenderingHook() {
		return promptRenderingHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioToTextService() {
		return audioToTextServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenAiAudioToTextService() {
		return openAiAudioToTextServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmbeddingGenerationService() {
		return embeddingGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextEmbeddingGenerationService() {
		return textEmbeddingGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenAITextEmbeddingGenerationService() {
		return openAITextEmbeddingGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextAIService() {
		return textAIServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChatCompletionService() {
		return chatCompletionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeminiChatCompletion() {
		return geminiChatCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenAIChatCompletion() {
		return openAIChatCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextGenerationService() {
		return textGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeminiTextGenerationService() {
		return geminiTextGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHuggingFaceTextGenerationService() {
		return huggingFaceTextGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenAITextGenerationService() {
		return openAITextGenerationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextToAudioService() {
		return textToAudioServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenAiTextToAudioService() {
		return openAiTextToAudioServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvocationContext() {
		return invocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocationContext_Hooks() {
		return (EReference)invocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocationContext_PromptExecutionSettings() {
		return (EReference)invocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocationContext_Telemetry() {
		return (EReference)invocationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvocationContext_InvocationReturnModel() {
		return (EAttribute)invocationContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemanticKernelTelemetry() {
		return semanticKernelTelemetryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemanticKernelTelemetry_Tracer() {
		return (EAttribute)semanticKernelTelemetryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseFormat() {
		return responseFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonObjectResponseFormat() {
		return jsonObjectResponseFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonSchemaResponseFormat() {
		return jsonSchemaResponseFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaResponseFormat_JsonSchema() {
		return (EAttribute)jsonSchemaResponseFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaResponseFormat_JsonSchemaRef() {
		return (EAttribute)jsonSchemaResponseFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJsonSchemaResponseFormat_Type() {
		return (EReference)jsonSchemaResponseFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextResponseFormat() {
		return textResponseFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInvocationReturnMode() {
		return invocationReturnModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemantickernelFactory getSemantickernelFactory() {
		return (SemantickernelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kernelEClass = createEClass(KERNEL);
		createEReference(kernelEClass, KERNEL__HOOKS);
		createEReference(kernelEClass, KERNEL__PLUGINS);
		createEReference(kernelEClass, KERNEL__AI_SERVICE_SELECTOR);
		createEReference(kernelEClass, KERNEL__SERVICES);

		aiServiceEClass = createEClass(AI_SERVICE);
		createEAttribute(aiServiceEClass, AI_SERVICE__MODEL);
		createEAttribute(aiServiceEClass, AI_SERVICE__SERVICE);

		aiServiceSelectorEClass = createEClass(AI_SERVICE_SELECTOR);

		pluginEClass = createEClass(PLUGIN);
		createEReference(pluginEClass, PLUGIN__FUNCTIONS);

		invocableEClass = createEClass(INVOCABLE);
		createEReference(invocableEClass, INVOCABLE__PARAMETERS);
		createEReference(invocableEClass, INVOCABLE__PROMPT_EXECUTION_SETTINGS);

		promptTemplateConfigEClass = createEClass(PROMPT_TEMPLATE_CONFIG);
		createEAttribute(promptTemplateConfigEClass, PROMPT_TEMPLATE_CONFIG__SCHEMA);
		createEAttribute(promptTemplateConfigEClass, PROMPT_TEMPLATE_CONFIG__TEMPLATE);
		createEAttribute(promptTemplateConfigEClass, PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF);
		createEAttribute(promptTemplateConfigEClass, PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__TYPE);

		spelFunctionEClass = createEClass(SPEL_FUNCTION);
		createEAttribute(spelFunctionEClass, SPEL_FUNCTION__EXPRESSION);

		scriptedFunctionEClass = createEClass(SCRIPTED_FUNCTION);
		createEAttribute(scriptedFunctionEClass, SCRIPTED_FUNCTION__ENGINE_NAMES);
		createEAttribute(scriptedFunctionEClass, SCRIPTED_FUNCTION__ENGINE_MIME_TYPES);
		createEAttribute(scriptedFunctionEClass, SCRIPTED_FUNCTION__ENGINE_EXTENSIONS);
		createEAttribute(scriptedFunctionEClass, SCRIPTED_FUNCTION__SCRIPT);
		createEAttribute(scriptedFunctionEClass, SCRIPTED_FUNCTION__SCRIPT_REF);

		promptFunctionEClass = createEClass(PROMPT_FUNCTION);

		inputVariableEClass = createEClass(INPUT_VARIABLE);
		createEAttribute(inputVariableEClass, INPUT_VARIABLE__TYPE);
		createEAttribute(inputVariableEClass, INPUT_VARIABLE__DEFAULT_VALUE);
		createEAttribute(inputVariableEClass, INPUT_VARIABLE__REQUIRED);
		createEAttribute(inputVariableEClass, INPUT_VARIABLE__ENUM_VALUES);

		outputVariableEClass = createEClass(OUTPUT_VARIABLE);
		createEAttribute(outputVariableEClass, OUTPUT_VARIABLE__TYPE);

		promptExecutionSettingsEClass = createEClass(PROMPT_EXECUTION_SETTINGS);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__SERVICE);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__MODEL);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__TEMPERATURE);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__TOP_P);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__MAX_TOKENS);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__BEST_OF);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__USER);
		createEAttribute(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES);
		createEReference(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT);
		createEReference(promptExecutionSettingsEClass, PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES);

		tokenSelectionBiasesEntryEClass = createEClass(TOKEN_SELECTION_BIASES_ENTRY);
		createEAttribute(tokenSelectionBiasesEntryEClass, TOKEN_SELECTION_BIASES_ENTRY__KEY);
		createEAttribute(tokenSelectionBiasesEntryEClass, TOKEN_SELECTION_BIASES_ENTRY__VALUE);

		promptExecutionSettingsEntryEClass = createEClass(PROMPT_EXECUTION_SETTINGS_ENTRY);
		createEAttribute(promptExecutionSettingsEntryEClass, PROMPT_EXECUTION_SETTINGS_ENTRY__KEY);
		createEReference(promptExecutionSettingsEntryEClass, PROMPT_EXECUTION_SETTINGS_ENTRY__VALUE);

		hookEClass = createEClass(HOOK);
		createEAttribute(hookEClass, HOOK__PRIORITY);

		hookEntryEClass = createEClass(HOOK_ENTRY);
		createEAttribute(hookEntryEClass, HOOK_ENTRY__KEY);
		createEReference(hookEntryEClass, HOOK_ENTRY__VALUE);

		functionInvokedHookEClass = createEClass(FUNCTION_INVOKED_HOOK);

		functionInvokingHookEClass = createEClass(FUNCTION_INVOKING_HOOK);

		postChatCompletionHookEClass = createEClass(POST_CHAT_COMPLETION_HOOK);

		preChatCompletionHookEClass = createEClass(PRE_CHAT_COMPLETION_HOOK);

		preToolCallHookEClass = createEClass(PRE_TOOL_CALL_HOOK);

		promptRenderedHookEClass = createEClass(PROMPT_RENDERED_HOOK);

		promptRenderingHookEClass = createEClass(PROMPT_RENDERING_HOOK);

		audioToTextServiceEClass = createEClass(AUDIO_TO_TEXT_SERVICE);

		openAiAudioToTextServiceEClass = createEClass(OPEN_AI_AUDIO_TO_TEXT_SERVICE);

		embeddingGenerationServiceEClass = createEClass(EMBEDDING_GENERATION_SERVICE);

		textEmbeddingGenerationServiceEClass = createEClass(TEXT_EMBEDDING_GENERATION_SERVICE);

		openAITextEmbeddingGenerationServiceEClass = createEClass(OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE);

		textAIServiceEClass = createEClass(TEXT_AI_SERVICE);

		chatCompletionServiceEClass = createEClass(CHAT_COMPLETION_SERVICE);

		geminiChatCompletionEClass = createEClass(GEMINI_CHAT_COMPLETION);

		openAIChatCompletionEClass = createEClass(OPEN_AI_CHAT_COMPLETION);

		textGenerationServiceEClass = createEClass(TEXT_GENERATION_SERVICE);

		geminiTextGenerationServiceEClass = createEClass(GEMINI_TEXT_GENERATION_SERVICE);

		huggingFaceTextGenerationServiceEClass = createEClass(HUGGING_FACE_TEXT_GENERATION_SERVICE);

		openAITextGenerationServiceEClass = createEClass(OPEN_AI_TEXT_GENERATION_SERVICE);

		textToAudioServiceEClass = createEClass(TEXT_TO_AUDIO_SERVICE);

		openAiTextToAudioServiceEClass = createEClass(OPEN_AI_TEXT_TO_AUDIO_SERVICE);

		invocationContextEClass = createEClass(INVOCATION_CONTEXT);
		createEReference(invocationContextEClass, INVOCATION_CONTEXT__HOOKS);
		createEReference(invocationContextEClass, INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS);
		createEReference(invocationContextEClass, INVOCATION_CONTEXT__TELEMETRY);
		createEAttribute(invocationContextEClass, INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL);

		semanticKernelTelemetryEClass = createEClass(SEMANTIC_KERNEL_TELEMETRY);
		createEAttribute(semanticKernelTelemetryEClass, SEMANTIC_KERNEL_TELEMETRY__TRACER);

		responseFormatEClass = createEClass(RESPONSE_FORMAT);

		jsonObjectResponseFormatEClass = createEClass(JSON_OBJECT_RESPONSE_FORMAT);

		jsonSchemaResponseFormatEClass = createEClass(JSON_SCHEMA_RESPONSE_FORMAT);
		createEAttribute(jsonSchemaResponseFormatEClass, JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA);
		createEAttribute(jsonSchemaResponseFormatEClass, JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF);
		createEReference(jsonSchemaResponseFormatEClass, JSON_SCHEMA_RESPONSE_FORMAT__TYPE);

		textResponseFormatEClass = createEClass(TEXT_RESPONSE_FORMAT);

		// Create enums
		invocationReturnModeEEnum = createEEnum(INVOCATION_RETURN_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kernelEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		kernelEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		aiServiceEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		aiServiceEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		aiServiceSelectorEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		aiServiceSelectorEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		pluginEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		invocableEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		promptTemplateConfigEClass.getESuperTypes().add(this.getInvocable());
		functionEClass.getESuperTypes().add(this.getInvocable());
		spelFunctionEClass.getESuperTypes().add(this.getFunction());
		scriptedFunctionEClass.getESuperTypes().add(this.getFunction());
		promptFunctionEClass.getESuperTypes().add(this.getFunction());
		promptFunctionEClass.getESuperTypes().add(this.getPromptTemplateConfig());
		inputVariableEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		outputVariableEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		outputVariableEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		promptExecutionSettingsEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		promptExecutionSettingsEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		hookEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		hookEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		functionInvokedHookEClass.getESuperTypes().add(this.getHook());
		functionInvokingHookEClass.getESuperTypes().add(this.getHook());
		postChatCompletionHookEClass.getESuperTypes().add(this.getHook());
		preChatCompletionHookEClass.getESuperTypes().add(this.getHook());
		preToolCallHookEClass.getESuperTypes().add(this.getHook());
		promptRenderedHookEClass.getESuperTypes().add(this.getHook());
		promptRenderingHookEClass.getESuperTypes().add(this.getHook());
		audioToTextServiceEClass.getESuperTypes().add(this.getAIService());
		openAiAudioToTextServiceEClass.getESuperTypes().add(this.getAudioToTextService());
		embeddingGenerationServiceEClass.getESuperTypes().add(this.getAIService());
		textEmbeddingGenerationServiceEClass.getESuperTypes().add(this.getEmbeddingGenerationService());
		openAITextEmbeddingGenerationServiceEClass.getESuperTypes().add(this.getTextEmbeddingGenerationService());
		textAIServiceEClass.getESuperTypes().add(this.getAIService());
		chatCompletionServiceEClass.getESuperTypes().add(this.getTextAIService());
		geminiChatCompletionEClass.getESuperTypes().add(this.getChatCompletionService());
		openAIChatCompletionEClass.getESuperTypes().add(this.getChatCompletionService());
		textGenerationServiceEClass.getESuperTypes().add(this.getTextAIService());
		geminiTextGenerationServiceEClass.getESuperTypes().add(this.getTextGenerationService());
		huggingFaceTextGenerationServiceEClass.getESuperTypes().add(this.getTextGenerationService());
		openAITextGenerationServiceEClass.getESuperTypes().add(this.getTextGenerationService());
		textToAudioServiceEClass.getESuperTypes().add(this.getAIService());
		openAiTextToAudioServiceEClass.getESuperTypes().add(this.getTextToAudioService());
		invocationContextEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		invocationContextEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		responseFormatEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		responseFormatEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		jsonObjectResponseFormatEClass.getESuperTypes().add(this.getResponseFormat());
		jsonSchemaResponseFormatEClass.getESuperTypes().add(this.getResponseFormat());
		textResponseFormatEClass.getESuperTypes().add(this.getResponseFormat());

		// Initialize classes, features, and operations; add parameters
		initEClass(kernelEClass, Kernel.class, "Kernel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKernel_Hooks(), this.getHookEntry(), null, "hooks", null, 0, -1, Kernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKernel_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, Kernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKernel_Plugins().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getKernel_AiServiceSelector(), this.getAIServiceSelector(), null, "aiServiceSelector", null, 0, 1, Kernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKernel_Services(), this.getAIService(), null, "services", null, 0, -1, Kernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiServiceEClass, AIService.class, "AIService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIService_Model(), ecorePackage.getEString(), "model", null, 0, 1, AIService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIService_Service(), ecorePackage.getEString(), "service", null, 0, 1, AIService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiServiceSelectorEClass, AIServiceSelector.class, "AIServiceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlugin_Functions(), this.getFunction(), null, "functions", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPlugin_Functions().getEKeys().add(theNcorePackage.getNamedElement_Name());

		initEClass(invocableEClass, Invocable.class, "Invocable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocable_Parameters(), this.getInputVariable(), null, "parameters", null, 0, -1, Invocable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getInvocable_Parameters().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getInvocable_PromptExecutionSettings(), this.getPromptExecutionSettingsEntry(), null, "promptExecutionSettings", null, 0, -1, Invocable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promptTemplateConfigEClass, PromptTemplateConfig.class, "PromptTemplateConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromptTemplateConfig_Schema(), ecorePackage.getEInt(), "schema", "1", 0, 1, PromptTemplateConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptTemplateConfig_Template(), ecorePackage.getEString(), "template", null, 0, 1, PromptTemplateConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptTemplateConfig_TemplateRef(), ecorePackage.getEString(), "templateRef", null, 0, 1, PromptTemplateConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptTemplateConfig_TemplateFormat(), ecorePackage.getEString(), "templateFormat", "semantic-kernel", 0, 1, PromptTemplateConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Type(), this.getOutputVariable(), null, "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spelFunctionEClass, SpelFunction.class, "SpelFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpelFunction_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, SpelFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptedFunctionEClass, ScriptedFunction.class, "ScriptedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptedFunction_EngineNames(), ecorePackage.getEString(), "engineNames", null, 0, -1, ScriptedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptedFunction_EngineMimeTypes(), ecorePackage.getEString(), "engineMimeTypes", null, 0, -1, ScriptedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptedFunction_EngineExtensions(), ecorePackage.getEString(), "engineExtensions", null, 0, -1, ScriptedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptedFunction_Script(), ecorePackage.getEString(), "script", null, 0, 1, ScriptedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptedFunction_ScriptRef(), ecorePackage.getEString(), "scriptRef", null, 0, 1, ScriptedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promptFunctionEClass, PromptFunction.class, "PromptFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputVariableEClass, InputVariable.class, "InputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, InputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputVariable_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, InputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputVariable_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, InputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputVariable_EnumValues(), ecorePackage.getEString(), "enumValues", null, 0, -1, InputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputVariableEClass, OutputVariable.class, "OutputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, OutputVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promptExecutionSettingsEClass, PromptExecutionSettings.class, "PromptExecutionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromptExecutionSettings_Service(), theEcorePackage.getEString(), "service", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_Model(), ecorePackage.getEString(), "model", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_Temperature(), ecorePackage.getEDoubleObject(), "temperature", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_TopP(), ecorePackage.getEDoubleObject(), "topP", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_PresensePenalty(), ecorePackage.getEDoubleObject(), "presensePenalty", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_FrequencyPenalty(), ecorePackage.getEDoubleObject(), "frequencyPenalty", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_MaxTokens(), ecorePackage.getEIntegerObject(), "maxTokens", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_BestOf(), ecorePackage.getEIntegerObject(), "bestOf", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_ResultsPerPrompt(), ecorePackage.getEIntegerObject(), "resultsPerPrompt", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_User(), ecorePackage.getEString(), "user", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromptExecutionSettings_StopSequences(), ecorePackage.getEString(), "stopSequences", null, 0, -1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPromptExecutionSettings_ResponseFormat(), this.getResponseFormat(), null, "responseFormat", null, 0, 1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPromptExecutionSettings_TokenSelectionBiases(), this.getTokenSelectionBiasesEntry(), null, "tokenSelectionBiases", null, 0, -1, PromptExecutionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenSelectionBiasesEntryEClass, Map.Entry.class, "TokenSelectionBiasesEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenSelectionBiasesEntry_Key(), ecorePackage.getEIntegerObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenSelectionBiasesEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promptExecutionSettingsEntryEClass, Map.Entry.class, "PromptExecutionSettingsEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromptExecutionSettingsEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPromptExecutionSettingsEntry_Value(), this.getPromptExecutionSettings(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookEClass, Hook.class, "Hook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHook_Priority(), ecorePackage.getEInt(), "priority", "50", 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookEntryEClass, Map.Entry.class, "HookEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHookEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHookEntry_Value(), this.getHook(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInvokedHookEClass, FunctionInvokedHook.class, "FunctionInvokedHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionInvokingHookEClass, FunctionInvokingHook.class, "FunctionInvokingHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postChatCompletionHookEClass, PostChatCompletionHook.class, "PostChatCompletionHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preChatCompletionHookEClass, PreChatCompletionHook.class, "PreChatCompletionHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preToolCallHookEClass, PreToolCallHook.class, "PreToolCallHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(promptRenderedHookEClass, PromptRenderedHook.class, "PromptRenderedHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(promptRenderingHookEClass, PromptRenderingHook.class, "PromptRenderingHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(audioToTextServiceEClass, AudioToTextService.class, "AudioToTextService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAiAudioToTextServiceEClass, OpenAiAudioToTextService.class, "OpenAiAudioToTextService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(embeddingGenerationServiceEClass, EmbeddingGenerationService.class, "EmbeddingGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEmbeddingGenerationServiceEClass, TextEmbeddingGenerationService.class, "TextEmbeddingGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAITextEmbeddingGenerationServiceEClass, OpenAITextEmbeddingGenerationService.class, "OpenAITextEmbeddingGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textAIServiceEClass, TextAIService.class, "TextAIService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chatCompletionServiceEClass, ChatCompletionService.class, "ChatCompletionService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geminiChatCompletionEClass, GeminiChatCompletion.class, "GeminiChatCompletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAIChatCompletionEClass, OpenAIChatCompletion.class, "OpenAIChatCompletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textGenerationServiceEClass, TextGenerationService.class, "TextGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geminiTextGenerationServiceEClass, GeminiTextGenerationService.class, "GeminiTextGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(huggingFaceTextGenerationServiceEClass, HuggingFaceTextGenerationService.class, "HuggingFaceTextGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAITextGenerationServiceEClass, OpenAITextGenerationService.class, "OpenAITextGenerationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textToAudioServiceEClass, TextToAudioService.class, "TextToAudioService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAiTextToAudioServiceEClass, OpenAiTextToAudioService.class, "OpenAiTextToAudioService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invocationContextEClass, InvocationContext.class, "InvocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationContext_Hooks(), this.getHookEntry(), null, "hooks", null, 0, -1, InvocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocationContext_PromptExecutionSettings(), this.getPromptExecutionSettings(), null, "promptExecutionSettings", null, 0, 1, InvocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocationContext_Telemetry(), this.getSemanticKernelTelemetry(), null, "telemetry", null, 0, 1, InvocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvocationContext_InvocationReturnModel(), this.getInvocationReturnMode(), "invocationReturnModel", null, 0, 1, InvocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticKernelTelemetryEClass, SemanticKernelTelemetry.class, "SemanticKernelTelemetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticKernelTelemetry_Tracer(), ecorePackage.getEString(), "tracer", null, 0, 1, SemanticKernelTelemetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseFormatEClass, ResponseFormat.class, "ResponseFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonObjectResponseFormatEClass, JsonObjectResponseFormat.class, "JsonObjectResponseFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonSchemaResponseFormatEClass, JsonSchemaResponseFormat.class, "JsonSchemaResponseFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonSchemaResponseFormat_JsonSchema(), ecorePackage.getEString(), "jsonSchema", null, 0, 1, JsonSchemaResponseFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaResponseFormat_JsonSchemaRef(), ecorePackage.getEString(), "jsonSchemaRef", null, 0, 1, JsonSchemaResponseFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsonSchemaResponseFormat_Type(), theEcorePackage.getEClassifier(), null, "type", null, 0, 1, JsonSchemaResponseFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textResponseFormatEClass, TextResponseFormat.class, "TextResponseFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(invocationReturnModeEEnum, InvocationReturnMode.class, "InvocationReturnMode");
		addEEnumLiteral(invocationReturnModeEEnum, InvocationReturnMode.FULL_HISTORY);
		addEEnumLiteral(invocationReturnModeEEnum, InvocationReturnMode.NEW_MESSAGES_ONLY);
		addEEnumLiteral(invocationReturnModeEEnum, InvocationReturnMode.LAST_MESSAGE_ONLY);

		// Create resource
		createResource(eNS_URI);
	}

} //SemantickernelPackageImpl
