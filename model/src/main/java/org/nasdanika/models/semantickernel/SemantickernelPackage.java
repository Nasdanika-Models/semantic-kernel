/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semantickernel.SemantickernelFactory
 * @model kind="package"
 * @generated
 */
public interface SemantickernelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semantickernel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/semantic-kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.semantic-kernel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemantickernelPackage eINSTANCE = org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.KernelImpl <em>Kernel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.KernelImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getKernel()
	 * @generated
	 */
	int KERNEL = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__HOOKS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__PLUGINS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ai Service Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__AI_SERVICE_SELECTOR = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL__SERVICES = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERNEL_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl <em>AI Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.AIServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAIService()
	 * @generated
	 */
	int AI_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__MODEL = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE__SERVICE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AI Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>AI Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.AIServiceSelectorImpl <em>AI Service Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.AIServiceSelectorImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAIServiceSelector()
	 * @generated
	 */
	int AI_SERVICE_SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AI Service Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AI Service Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SERVICE_SELECTOR_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PluginImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__FUNCTIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.InvocableImpl <em>Invocable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.InvocableImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocable()
	 * @generated
	 */
	int INVOCABLE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__PARAMETERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE__PROMPT_EXECUTION_SETTINGS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Invocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCABLE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptTemplateConfigImpl <em>Prompt Template Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptTemplateConfigImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptTemplateConfig()
	 * @generated
	 */
	int PROMPT_TEMPLATE_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__MARKERS = INVOCABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__URIS = INVOCABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__DESCRIPTION = INVOCABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__UUID = INVOCABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__LABEL_PROTOTYPE = INVOCABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__REPRESENTATIONS = INVOCABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__ANNOTATIONS = INVOCABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__NAME = INVOCABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__DOCUMENTATION = INVOCABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__CONTEXT_HELP = INVOCABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__PARAMETERS = INVOCABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__PROMPT_EXECUTION_SETTINGS = INVOCABLE__PROMPT_EXECUTION_SETTINGS;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__SCHEMA = INVOCABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__TEMPLATE = INVOCABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF = INVOCABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT = INVOCABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prompt Template Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG_FEATURE_COUNT = INVOCABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prompt Template Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_TEMPLATE_CONFIG_OPERATION_COUNT = INVOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.FunctionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MARKERS = INVOCABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__URIS = INVOCABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = INVOCABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__UUID = INVOCABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LABEL_PROTOTYPE = INVOCABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REPRESENTATIONS = INVOCABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = INVOCABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = INVOCABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = INVOCABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CONTEXT_HELP = INVOCABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = INVOCABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PROMPT_EXECUTION_SETTINGS = INVOCABLE__PROMPT_EXECUTION_SETTINGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = INVOCABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = INVOCABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = INVOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.SpelFunctionImpl <em>Spel Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.SpelFunctionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getSpelFunction()
	 * @generated
	 */
	int SPEL_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__MARKERS = FUNCTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__URIS = FUNCTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__UUID = FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__LABEL_PROTOTYPE = FUNCTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__REPRESENTATIONS = FUNCTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__DOCUMENTATION = FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__CONTEXT_HELP = FUNCTION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__PROMPT_EXECUTION_SETTINGS = FUNCTION__PROMPT_EXECUTION_SETTINGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION__EXPRESSION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spel Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spel Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl <em>Scripted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getScriptedFunction()
	 * @generated
	 */
	int SCRIPTED_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__MARKERS = FUNCTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__URIS = FUNCTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__UUID = FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__LABEL_PROTOTYPE = FUNCTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__REPRESENTATIONS = FUNCTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__DOCUMENTATION = FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__CONTEXT_HELP = FUNCTION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__PROMPT_EXECUTION_SETTINGS = FUNCTION__PROMPT_EXECUTION_SETTINGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Engine Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__ENGINE_NAMES = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__ENGINE_MIME_TYPES = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engine Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__ENGINE_EXTENSIONS = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__SCRIPT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION__SCRIPT_REF = FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scripted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scripted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl <em>Prompt Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptFunctionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptFunction()
	 * @generated
	 */
	int PROMPT_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__MARKERS = FUNCTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__URIS = FUNCTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__UUID = FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__LABEL_PROTOTYPE = FUNCTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__REPRESENTATIONS = FUNCTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__DOCUMENTATION = FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__CONTEXT_HELP = FUNCTION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__PROMPT_EXECUTION_SETTINGS = FUNCTION__PROMPT_EXECUTION_SETTINGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__TYPE = FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__SCHEMA = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__TEMPLATE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__TEMPLATE_REF = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION__TEMPLATE_FORMAT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prompt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prompt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl <em>Input Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.InputVariableImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInputVariable()
	 * @generated
	 */
	int INPUT_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__TYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__DEFAULT_VALUE = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__REQUIRED = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__ENUM_VALUES = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Input Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OutputVariableImpl <em>Output Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OutputVariableImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOutputVariable()
	 * @generated
	 */
	int OUTPUT_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__TYPE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl <em>Prompt Execution Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptExecutionSettings()
	 * @generated
	 */
	int PROMPT_EXECUTION_SETTINGS = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__SERVICE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__MODEL = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__TEMPERATURE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__TOP_P = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Presense Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frequency Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__MAX_TOKENS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Best Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__BEST_OF = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Results Per Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__USER = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stop Sequences</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Response Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Token Selection Biases</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Prompt Execution Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Prompt Execution Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl <em>Token Selection Biases Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTokenSelectionBiasesEntry()
	 * @generated
	 */
	int TOKEN_SELECTION_BIASES_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTION_BIASES_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTION_BIASES_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Token Selection Biases Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTION_BIASES_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Selection Biases Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTION_BIASES_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsEntryImpl <em>Prompt Execution Settings Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsEntryImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptExecutionSettingsEntry()
	 * @generated
	 */
	int PROMPT_EXECUTION_SETTINGS_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Prompt Execution Settings Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prompt Execution Settings Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_EXECUTION_SETTINGS_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.HookImpl <em>Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.HookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHook()
	 * @generated
	 */
	int HOOK = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__PRIORITY = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.HookEntryImpl <em>Hook Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.HookEntryImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHookEntry()
	 * @generated
	 */
	int HOOK_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hook Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hook Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.FunctionInvokedHookImpl <em>Function Invoked Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.FunctionInvokedHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunctionInvokedHook()
	 * @generated
	 */
	int FUNCTION_INVOKED_HOOK = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Function Invoked Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Invoked Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKED_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.FunctionInvokingHookImpl <em>Function Invoking Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.FunctionInvokingHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunctionInvokingHook()
	 * @generated
	 */
	int FUNCTION_INVOKING_HOOK = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Function Invoking Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Invoking Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOKING_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PostChatCompletionHookImpl <em>Post Chat Completion Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PostChatCompletionHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPostChatCompletionHook()
	 * @generated
	 */
	int POST_CHAT_COMPLETION_HOOK = 19;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Post Chat Completion Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Chat Completion Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CHAT_COMPLETION_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PreChatCompletionHookImpl <em>Pre Chat Completion Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PreChatCompletionHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPreChatCompletionHook()
	 * @generated
	 */
	int PRE_CHAT_COMPLETION_HOOK = 20;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Pre Chat Completion Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Chat Completion Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHAT_COMPLETION_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PreToolCallHookImpl <em>Pre Tool Call Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PreToolCallHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPreToolCallHook()
	 * @generated
	 */
	int PRE_TOOL_CALL_HOOK = 21;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Pre Tool Call Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Tool Call Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TOOL_CALL_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptRenderedHookImpl <em>Prompt Rendered Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptRenderedHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptRenderedHook()
	 * @generated
	 */
	int PROMPT_RENDERED_HOOK = 22;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Prompt Rendered Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prompt Rendered Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERED_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.PromptRenderingHookImpl <em>Prompt Rendering Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.PromptRenderingHookImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptRenderingHook()
	 * @generated
	 */
	int PROMPT_RENDERING_HOOK = 23;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__DESCRIPTION = HOOK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__UUID = HOOK__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__LABEL_PROTOTYPE = HOOK__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__REPRESENTATIONS = HOOK__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__ANNOTATIONS = HOOK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__CONTEXT_HELP = HOOK__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK__PRIORITY = HOOK__PRIORITY;

	/**
	 * The number of structural features of the '<em>Prompt Rendering Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prompt Rendering Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_RENDERING_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.AudioToTextServiceImpl <em>Audio To Text Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.AudioToTextServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAudioToTextService()
	 * @generated
	 */
	int AUDIO_TO_TEXT_SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__MARKERS = AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__URIS = AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__DESCRIPTION = AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__UUID = AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__LABEL_PROTOTYPE = AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__REPRESENTATIONS = AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__ANNOTATIONS = AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__DOCUMENTATION = AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__CONTEXT_HELP = AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__MODEL = AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE__SERVICE = AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Audio To Text Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE_FEATURE_COUNT = AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Audio To Text Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TO_TEXT_SERVICE_OPERATION_COUNT = AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OpenAiAudioToTextServiceImpl <em>Open Ai Audio To Text Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OpenAiAudioToTextServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAiAudioToTextService()
	 * @generated
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE = 25;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__MARKERS = AUDIO_TO_TEXT_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__URIS = AUDIO_TO_TEXT_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__DESCRIPTION = AUDIO_TO_TEXT_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__UUID = AUDIO_TO_TEXT_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__LABEL_PROTOTYPE = AUDIO_TO_TEXT_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__REPRESENTATIONS = AUDIO_TO_TEXT_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__ANNOTATIONS = AUDIO_TO_TEXT_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__DOCUMENTATION = AUDIO_TO_TEXT_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__CONTEXT_HELP = AUDIO_TO_TEXT_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__MODEL = AUDIO_TO_TEXT_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE__SERVICE = AUDIO_TO_TEXT_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Open Ai Audio To Text Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE_FEATURE_COUNT = AUDIO_TO_TEXT_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Ai Audio To Text Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_AUDIO_TO_TEXT_SERVICE_OPERATION_COUNT = AUDIO_TO_TEXT_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.EmbeddingGenerationServiceImpl <em>Embedding Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.EmbeddingGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getEmbeddingGenerationService()
	 * @generated
	 */
	int EMBEDDING_GENERATION_SERVICE = 26;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__MARKERS = AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__URIS = AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__DESCRIPTION = AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__UUID = AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__LABEL_PROTOTYPE = AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__REPRESENTATIONS = AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__ANNOTATIONS = AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__DOCUMENTATION = AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__CONTEXT_HELP = AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__MODEL = AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE__SERVICE = AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE_FEATURE_COUNT = AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_GENERATION_SERVICE_OPERATION_COUNT = AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TextEmbeddingGenerationServiceImpl <em>Text Embedding Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TextEmbeddingGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextEmbeddingGenerationService()
	 * @generated
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__MARKERS = EMBEDDING_GENERATION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__URIS = EMBEDDING_GENERATION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__DESCRIPTION = EMBEDDING_GENERATION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__UUID = EMBEDDING_GENERATION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__LABEL_PROTOTYPE = EMBEDDING_GENERATION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__REPRESENTATIONS = EMBEDDING_GENERATION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__ANNOTATIONS = EMBEDDING_GENERATION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__DOCUMENTATION = EMBEDDING_GENERATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__CONTEXT_HELP = EMBEDDING_GENERATION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__MODEL = EMBEDDING_GENERATION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE__SERVICE = EMBEDDING_GENERATION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Text Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE_FEATURE_COUNT = EMBEDDING_GENERATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EMBEDDING_GENERATION_SERVICE_OPERATION_COUNT = EMBEDDING_GENERATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OpenAITextEmbeddingGenerationServiceImpl <em>Open AI Text Embedding Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OpenAITextEmbeddingGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAITextEmbeddingGenerationService()
	 * @generated
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE = 28;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__MARKERS = TEXT_EMBEDDING_GENERATION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__URIS = TEXT_EMBEDDING_GENERATION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__DESCRIPTION = TEXT_EMBEDDING_GENERATION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__UUID = TEXT_EMBEDDING_GENERATION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__LABEL_PROTOTYPE = TEXT_EMBEDDING_GENERATION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__REPRESENTATIONS = TEXT_EMBEDDING_GENERATION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__ANNOTATIONS = TEXT_EMBEDDING_GENERATION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__DOCUMENTATION = TEXT_EMBEDDING_GENERATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__CONTEXT_HELP = TEXT_EMBEDDING_GENERATION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__MODEL = TEXT_EMBEDDING_GENERATION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE__SERVICE = TEXT_EMBEDDING_GENERATION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Open AI Text Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE_FEATURE_COUNT = TEXT_EMBEDDING_GENERATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open AI Text Embedding Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE_OPERATION_COUNT = TEXT_EMBEDDING_GENERATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TextAIServiceImpl <em>Text AI Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TextAIServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextAIService()
	 * @generated
	 */
	int TEXT_AI_SERVICE = 29;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__MARKERS = AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__URIS = AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__DESCRIPTION = AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__UUID = AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__LABEL_PROTOTYPE = AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__REPRESENTATIONS = AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__ANNOTATIONS = AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__DOCUMENTATION = AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__CONTEXT_HELP = AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__MODEL = AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE__SERVICE = AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Text AI Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE_FEATURE_COUNT = AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text AI Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AI_SERVICE_OPERATION_COUNT = AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.ChatCompletionServiceImpl <em>Chat Completion Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.ChatCompletionServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getChatCompletionService()
	 * @generated
	 */
	int CHAT_COMPLETION_SERVICE = 30;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__MARKERS = TEXT_AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__URIS = TEXT_AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__DESCRIPTION = TEXT_AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__UUID = TEXT_AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__LABEL_PROTOTYPE = TEXT_AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__REPRESENTATIONS = TEXT_AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__ANNOTATIONS = TEXT_AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__DOCUMENTATION = TEXT_AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__CONTEXT_HELP = TEXT_AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__MODEL = TEXT_AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE__SERVICE = TEXT_AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Chat Completion Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE_FEATURE_COUNT = TEXT_AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chat Completion Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_COMPLETION_SERVICE_OPERATION_COUNT = TEXT_AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.GeminiChatCompletionImpl <em>Gemini Chat Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.GeminiChatCompletionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getGeminiChatCompletion()
	 * @generated
	 */
	int GEMINI_CHAT_COMPLETION = 31;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__MARKERS = CHAT_COMPLETION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__URIS = CHAT_COMPLETION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__DESCRIPTION = CHAT_COMPLETION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__UUID = CHAT_COMPLETION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__LABEL_PROTOTYPE = CHAT_COMPLETION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__REPRESENTATIONS = CHAT_COMPLETION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__ANNOTATIONS = CHAT_COMPLETION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__DOCUMENTATION = CHAT_COMPLETION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__CONTEXT_HELP = CHAT_COMPLETION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__MODEL = CHAT_COMPLETION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION__SERVICE = CHAT_COMPLETION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Gemini Chat Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION_FEATURE_COUNT = CHAT_COMPLETION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gemini Chat Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_CHAT_COMPLETION_OPERATION_COUNT = CHAT_COMPLETION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OpenAIChatCompletionImpl <em>Open AI Chat Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OpenAIChatCompletionImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAIChatCompletion()
	 * @generated
	 */
	int OPEN_AI_CHAT_COMPLETION = 32;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__MARKERS = CHAT_COMPLETION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__URIS = CHAT_COMPLETION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__DESCRIPTION = CHAT_COMPLETION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__UUID = CHAT_COMPLETION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__LABEL_PROTOTYPE = CHAT_COMPLETION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__REPRESENTATIONS = CHAT_COMPLETION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__ANNOTATIONS = CHAT_COMPLETION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__DOCUMENTATION = CHAT_COMPLETION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__CONTEXT_HELP = CHAT_COMPLETION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__MODEL = CHAT_COMPLETION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION__SERVICE = CHAT_COMPLETION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Open AI Chat Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION_FEATURE_COUNT = CHAT_COMPLETION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open AI Chat Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_CHAT_COMPLETION_OPERATION_COUNT = CHAT_COMPLETION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TextGenerationServiceImpl <em>Text Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TextGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextGenerationService()
	 * @generated
	 */
	int TEXT_GENERATION_SERVICE = 33;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__MARKERS = TEXT_AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__URIS = TEXT_AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__DESCRIPTION = TEXT_AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__UUID = TEXT_AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE = TEXT_AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__REPRESENTATIONS = TEXT_AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__ANNOTATIONS = TEXT_AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__DOCUMENTATION = TEXT_AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__CONTEXT_HELP = TEXT_AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__MODEL = TEXT_AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE__SERVICE = TEXT_AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE_FEATURE_COUNT = TEXT_AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_GENERATION_SERVICE_OPERATION_COUNT = TEXT_AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.GeminiTextGenerationServiceImpl <em>Gemini Text Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.GeminiTextGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getGeminiTextGenerationService()
	 * @generated
	 */
	int GEMINI_TEXT_GENERATION_SERVICE = 34;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__MARKERS = TEXT_GENERATION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__URIS = TEXT_GENERATION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__DESCRIPTION = TEXT_GENERATION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__UUID = TEXT_GENERATION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE = TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__REPRESENTATIONS = TEXT_GENERATION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__ANNOTATIONS = TEXT_GENERATION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__DOCUMENTATION = TEXT_GENERATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__CONTEXT_HELP = TEXT_GENERATION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__MODEL = TEXT_GENERATION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE__SERVICE = TEXT_GENERATION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Gemini Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE_FEATURE_COUNT = TEXT_GENERATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gemini Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMINI_TEXT_GENERATION_SERVICE_OPERATION_COUNT = TEXT_GENERATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.HuggingFaceTextGenerationServiceImpl <em>Hugging Face Text Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.HuggingFaceTextGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHuggingFaceTextGenerationService()
	 * @generated
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE = 35;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__MARKERS = TEXT_GENERATION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__URIS = TEXT_GENERATION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__DESCRIPTION = TEXT_GENERATION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__UUID = TEXT_GENERATION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE = TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__REPRESENTATIONS = TEXT_GENERATION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__ANNOTATIONS = TEXT_GENERATION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__DOCUMENTATION = TEXT_GENERATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__CONTEXT_HELP = TEXT_GENERATION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__MODEL = TEXT_GENERATION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE__SERVICE = TEXT_GENERATION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Hugging Face Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE_FEATURE_COUNT = TEXT_GENERATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hugging Face Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUGGING_FACE_TEXT_GENERATION_SERVICE_OPERATION_COUNT = TEXT_GENERATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OpenAITextGenerationServiceImpl <em>Open AI Text Generation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OpenAITextGenerationServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAITextGenerationService()
	 * @generated
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE = 36;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__MARKERS = TEXT_GENERATION_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__URIS = TEXT_GENERATION_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__DESCRIPTION = TEXT_GENERATION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__UUID = TEXT_GENERATION_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE = TEXT_GENERATION_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__REPRESENTATIONS = TEXT_GENERATION_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__ANNOTATIONS = TEXT_GENERATION_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__DOCUMENTATION = TEXT_GENERATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__CONTEXT_HELP = TEXT_GENERATION_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__MODEL = TEXT_GENERATION_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE__SERVICE = TEXT_GENERATION_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Open AI Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE_FEATURE_COUNT = TEXT_GENERATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open AI Text Generation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_GENERATION_SERVICE_OPERATION_COUNT = TEXT_GENERATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TextToAudioServiceImpl <em>Text To Audio Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TextToAudioServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextToAudioService()
	 * @generated
	 */
	int TEXT_TO_AUDIO_SERVICE = 37;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__MARKERS = AI_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__URIS = AI_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__DESCRIPTION = AI_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__UUID = AI_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__LABEL_PROTOTYPE = AI_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__REPRESENTATIONS = AI_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__ANNOTATIONS = AI_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__DOCUMENTATION = AI_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__CONTEXT_HELP = AI_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__MODEL = AI_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE__SERVICE = AI_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Text To Audio Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE_FEATURE_COUNT = AI_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text To Audio Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_AUDIO_SERVICE_OPERATION_COUNT = AI_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.OpenAiTextToAudioServiceImpl <em>Open Ai Text To Audio Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.OpenAiTextToAudioServiceImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAiTextToAudioService()
	 * @generated
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE = 38;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__MARKERS = TEXT_TO_AUDIO_SERVICE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__URIS = TEXT_TO_AUDIO_SERVICE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__DESCRIPTION = TEXT_TO_AUDIO_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__UUID = TEXT_TO_AUDIO_SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__LABEL_PROTOTYPE = TEXT_TO_AUDIO_SERVICE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__REPRESENTATIONS = TEXT_TO_AUDIO_SERVICE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__ANNOTATIONS = TEXT_TO_AUDIO_SERVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__DOCUMENTATION = TEXT_TO_AUDIO_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__CONTEXT_HELP = TEXT_TO_AUDIO_SERVICE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__MODEL = TEXT_TO_AUDIO_SERVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE__SERVICE = TEXT_TO_AUDIO_SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Open Ai Text To Audio Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE_FEATURE_COUNT = TEXT_TO_AUDIO_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Ai Text To Audio Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_AI_TEXT_TO_AUDIO_SERVICE_OPERATION_COUNT = TEXT_TO_AUDIO_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl <em>Invocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.InvocationContextImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocationContext()
	 * @generated
	 */
	int INVOCATION_CONTEXT = 39;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__HOOKS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prompt Execution Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Telemetry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__TELEMETRY = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invocation Return Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Invocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Invocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_CONTEXT_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.SemanticKernelTelemetryImpl <em>Semantic Kernel Telemetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.SemanticKernelTelemetryImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getSemanticKernelTelemetry()
	 * @generated
	 */
	int SEMANTIC_KERNEL_TELEMETRY = 40;

	/**
	 * The feature id for the '<em><b>Tracer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_KERNEL_TELEMETRY__TRACER = 0;

	/**
	 * The number of structural features of the '<em>Semantic Kernel Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_KERNEL_TELEMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantic Kernel Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_KERNEL_TELEMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.ResponseFormatImpl <em>Response Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.ResponseFormatImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getResponseFormat()
	 * @generated
	 */
	int RESPONSE_FORMAT = 41;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FORMAT_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.JsonObjectResponseFormatImpl <em>Json Object Response Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.JsonObjectResponseFormatImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getJsonObjectResponseFormat()
	 * @generated
	 */
	int JSON_OBJECT_RESPONSE_FORMAT = 42;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__MARKERS = RESPONSE_FORMAT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__URIS = RESPONSE_FORMAT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__DESCRIPTION = RESPONSE_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__UUID = RESPONSE_FORMAT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__LABEL_PROTOTYPE = RESPONSE_FORMAT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__REPRESENTATIONS = RESPONSE_FORMAT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__ANNOTATIONS = RESPONSE_FORMAT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__DOCUMENTATION = RESPONSE_FORMAT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT__CONTEXT_HELP = RESPONSE_FORMAT__CONTEXT_HELP;

	/**
	 * The number of structural features of the '<em>Json Object Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT_FEATURE_COUNT = RESPONSE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Object Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_RESPONSE_FORMAT_OPERATION_COUNT = RESPONSE_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl <em>Json Schema Response Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getJsonSchemaResponseFormat()
	 * @generated
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT = 43;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__MARKERS = RESPONSE_FORMAT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__URIS = RESPONSE_FORMAT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__DESCRIPTION = RESPONSE_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__UUID = RESPONSE_FORMAT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__LABEL_PROTOTYPE = RESPONSE_FORMAT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__REPRESENTATIONS = RESPONSE_FORMAT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__ANNOTATIONS = RESPONSE_FORMAT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__DOCUMENTATION = RESPONSE_FORMAT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__CONTEXT_HELP = RESPONSE_FORMAT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Json Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA = RESPONSE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Json Schema Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF = RESPONSE_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT__TYPE = RESPONSE_FORMAT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Json Schema Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT_FEATURE_COUNT = RESPONSE_FORMAT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Json Schema Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_RESPONSE_FORMAT_OPERATION_COUNT = RESPONSE_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.impl.TextResponseFormatImpl <em>Text Response Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.impl.TextResponseFormatImpl
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextResponseFormat()
	 * @generated
	 */
	int TEXT_RESPONSE_FORMAT = 44;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__MARKERS = RESPONSE_FORMAT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__URIS = RESPONSE_FORMAT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__DESCRIPTION = RESPONSE_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__UUID = RESPONSE_FORMAT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__LABEL_PROTOTYPE = RESPONSE_FORMAT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__REPRESENTATIONS = RESPONSE_FORMAT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__ANNOTATIONS = RESPONSE_FORMAT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__DOCUMENTATION = RESPONSE_FORMAT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT__CONTEXT_HELP = RESPONSE_FORMAT__CONTEXT_HELP;

	/**
	 * The number of structural features of the '<em>Text Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT_FEATURE_COUNT = RESPONSE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Response Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RESPONSE_FORMAT_OPERATION_COUNT = RESPONSE_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semantickernel.InvocationReturnMode <em>Invocation Return Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semantickernel.InvocationReturnMode
	 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocationReturnMode()
	 * @generated
	 */
	int INVOCATION_RETURN_MODE = 45;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.Kernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kernel</em>'.
	 * @see org.nasdanika.models.semantickernel.Kernel
	 * @generated
	 */
	EClass getKernel();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.semantickernel.Kernel#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Hooks</em>'.
	 * @see org.nasdanika.models.semantickernel.Kernel#getHooks()
	 * @see #getKernel()
	 * @generated
	 */
	EReference getKernel_Hooks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semantickernel.Kernel#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.nasdanika.models.semantickernel.Kernel#getPlugins()
	 * @see #getKernel()
	 * @generated
	 */
	EReference getKernel_Plugins();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semantickernel.Kernel#getAiServiceSelector <em>Ai Service Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ai Service Selector</em>'.
	 * @see org.nasdanika.models.semantickernel.Kernel#getAiServiceSelector()
	 * @see #getKernel()
	 * @generated
	 */
	EReference getKernel_AiServiceSelector();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.semantickernel.Kernel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.nasdanika.models.semantickernel.Kernel#getServices()
	 * @see #getKernel()
	 * @generated
	 */
	EReference getKernel_Services();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.AIService <em>AI Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Service</em>'.
	 * @see org.nasdanika.models.semantickernel.AIService
	 * @generated
	 */
	EClass getAIService();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.AIService#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.models.semantickernel.AIService#getModel()
	 * @see #getAIService()
	 * @generated
	 */
	EAttribute getAIService_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.AIService#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.nasdanika.models.semantickernel.AIService#getService()
	 * @see #getAIService()
	 * @generated
	 */
	EAttribute getAIService_Service();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.AIServiceSelector <em>AI Service Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Service Selector</em>'.
	 * @see org.nasdanika.models.semantickernel.AIServiceSelector
	 * @generated
	 */
	EClass getAIServiceSelector();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.nasdanika.models.semantickernel.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semantickernel.Plugin#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.nasdanika.models.semantickernel.Plugin#getFunctions()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Functions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.Invocable <em>Invocable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocable</em>'.
	 * @see org.nasdanika.models.semantickernel.Invocable
	 * @generated
	 */
	EClass getInvocable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semantickernel.Invocable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.models.semantickernel.Invocable#getParameters()
	 * @see #getInvocable()
	 * @generated
	 */
	EReference getInvocable_Parameters();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.semantickernel.Invocable#getPromptExecutionSettings <em>Prompt Execution Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Prompt Execution Settings</em>'.
	 * @see org.nasdanika.models.semantickernel.Invocable#getPromptExecutionSettings()
	 * @see #getInvocable()
	 * @generated
	 */
	EReference getInvocable_PromptExecutionSettings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig <em>Prompt Template Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Template Config</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig
	 * @generated
	 */
	EClass getPromptTemplateConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig#getSchema()
	 * @see #getPromptTemplateConfig()
	 * @generated
	 */
	EAttribute getPromptTemplateConfig_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplate()
	 * @see #getPromptTemplateConfig()
	 * @generated
	 */
	EAttribute getPromptTemplateConfig_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateRef <em>Template Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Ref</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateRef()
	 * @see #getPromptTemplateConfig()
	 * @generated
	 */
	EAttribute getPromptTemplateConfig_TemplateRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateFormat <em>Template Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Format</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateFormat()
	 * @see #getPromptTemplateConfig()
	 * @generated
	 */
	EAttribute getPromptTemplateConfig_TemplateFormat();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.nasdanika.models.semantickernel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semantickernel.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.models.semantickernel.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.SpelFunction <em>Spel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spel Function</em>'.
	 * @see org.nasdanika.models.semantickernel.SpelFunction
	 * @generated
	 */
	EClass getSpelFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.SpelFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.models.semantickernel.SpelFunction#getExpression()
	 * @see #getSpelFunction()
	 * @generated
	 */
	EAttribute getSpelFunction_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.ScriptedFunction <em>Scripted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Function</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction
	 * @generated
	 */
	EClass getScriptedFunction();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineNames <em>Engine Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Engine Names</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction#getEngineNames()
	 * @see #getScriptedFunction()
	 * @generated
	 */
	EAttribute getScriptedFunction_EngineNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineMimeTypes <em>Engine Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Engine Mime Types</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction#getEngineMimeTypes()
	 * @see #getScriptedFunction()
	 * @generated
	 */
	EAttribute getScriptedFunction_EngineMimeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineExtensions <em>Engine Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Engine Extensions</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction#getEngineExtensions()
	 * @see #getScriptedFunction()
	 * @generated
	 */
	EAttribute getScriptedFunction_EngineExtensions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction#getScript()
	 * @see #getScriptedFunction()
	 * @generated
	 */
	EAttribute getScriptedFunction_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScriptRef <em>Script Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Ref</em>'.
	 * @see org.nasdanika.models.semantickernel.ScriptedFunction#getScriptRef()
	 * @see #getScriptedFunction()
	 * @generated
	 */
	EAttribute getScriptedFunction_ScriptRef();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PromptFunction <em>Prompt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Function</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptFunction
	 * @generated
	 */
	EClass getPromptFunction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.InputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variable</em>'.
	 * @see org.nasdanika.models.semantickernel.InputVariable
	 * @generated
	 */
	EClass getInputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.InputVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.semantickernel.InputVariable#getType()
	 * @see #getInputVariable()
	 * @generated
	 */
	EAttribute getInputVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.InputVariable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.nasdanika.models.semantickernel.InputVariable#getDefaultValue()
	 * @see #getInputVariable()
	 * @generated
	 */
	EAttribute getInputVariable_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.InputVariable#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.models.semantickernel.InputVariable#isRequired()
	 * @see #getInputVariable()
	 * @generated
	 */
	EAttribute getInputVariable_Required();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.semantickernel.InputVariable#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Values</em>'.
	 * @see org.nasdanika.models.semantickernel.InputVariable#getEnumValues()
	 * @see #getInputVariable()
	 * @generated
	 */
	EAttribute getInputVariable_EnumValues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variable</em>'.
	 * @see org.nasdanika.models.semantickernel.OutputVariable
	 * @generated
	 */
	EClass getOutputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.OutputVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.semantickernel.OutputVariable#getType()
	 * @see #getOutputVariable()
	 * @generated
	 */
	EAttribute getOutputVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings <em>Prompt Execution Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Execution Settings</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings
	 * @generated
	 */
	EClass getPromptExecutionSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getService()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getModel()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getTemperature()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTopP <em>Top P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top P</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getTopP()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_TopP();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getPresensePenalty <em>Presense Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presense Penalty</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getPresensePenalty()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_PresensePenalty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getFrequencyPenalty <em>Frequency Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Penalty</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getFrequencyPenalty()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_FrequencyPenalty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getMaxTokens <em>Max Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Tokens</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getMaxTokens()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_MaxTokens();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getBestOf <em>Best Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Of</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getBestOf()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_BestOf();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResultsPerPrompt <em>Results Per Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Per Prompt</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getResultsPerPrompt()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_ResultsPerPrompt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getUser()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_User();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getStopSequences <em>Stop Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stop Sequences</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getStopSequences()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EAttribute getPromptExecutionSettings_StopSequences();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResponseFormat <em>Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Format</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getResponseFormat()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EReference getPromptExecutionSettings_ResponseFormat();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTokenSelectionBiases <em>Token Selection Biases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Token Selection Biases</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptExecutionSettings#getTokenSelectionBiases()
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	EReference getPromptExecutionSettings_TokenSelectionBiases();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Token Selection Biases Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Selection Biases Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getTokenSelectionBiasesEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTokenSelectionBiasesEntry()
	 * @generated
	 */
	EAttribute getTokenSelectionBiasesEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTokenSelectionBiasesEntry()
	 * @generated
	 */
	EAttribute getTokenSelectionBiasesEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Prompt Execution Settings Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Execution Settings Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.models.semantickernel.PromptExecutionSettings" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getPromptExecutionSettingsEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPromptExecutionSettingsEntry()
	 * @generated
	 */
	EAttribute getPromptExecutionSettingsEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPromptExecutionSettingsEntry()
	 * @generated
	 */
	EReference getPromptExecutionSettingsEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.Hook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.Hook
	 * @generated
	 */
	EClass getHook();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.Hook#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.nasdanika.models.semantickernel.Hook#getPriority()
	 * @see #getHook()
	 * @generated
	 */
	EAttribute getHook_Priority();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Hook Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.models.semantickernel.Hook" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getHookEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHookEntry()
	 * @generated
	 */
	EAttribute getHookEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHookEntry()
	 * @generated
	 */
	EReference getHookEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.FunctionInvokedHook <em>Function Invoked Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Invoked Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.FunctionInvokedHook
	 * @generated
	 */
	EClass getFunctionInvokedHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.FunctionInvokingHook <em>Function Invoking Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Invoking Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.FunctionInvokingHook
	 * @generated
	 */
	EClass getFunctionInvokingHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PostChatCompletionHook <em>Post Chat Completion Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Chat Completion Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.PostChatCompletionHook
	 * @generated
	 */
	EClass getPostChatCompletionHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PreChatCompletionHook <em>Pre Chat Completion Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Chat Completion Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.PreChatCompletionHook
	 * @generated
	 */
	EClass getPreChatCompletionHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PreToolCallHook <em>Pre Tool Call Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Tool Call Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.PreToolCallHook
	 * @generated
	 */
	EClass getPreToolCallHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PromptRenderedHook <em>Prompt Rendered Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Rendered Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptRenderedHook
	 * @generated
	 */
	EClass getPromptRenderedHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.PromptRenderingHook <em>Prompt Rendering Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt Rendering Hook</em>'.
	 * @see org.nasdanika.models.semantickernel.PromptRenderingHook
	 * @generated
	 */
	EClass getPromptRenderingHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.AudioToTextService <em>Audio To Text Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio To Text Service</em>'.
	 * @see org.nasdanika.models.semantickernel.AudioToTextService
	 * @generated
	 */
	EClass getAudioToTextService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OpenAiAudioToTextService <em>Open Ai Audio To Text Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Ai Audio To Text Service</em>'.
	 * @see org.nasdanika.models.semantickernel.OpenAiAudioToTextService
	 * @generated
	 */
	EClass getOpenAiAudioToTextService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.EmbeddingGenerationService <em>Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedding Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.EmbeddingGenerationService
	 * @generated
	 */
	EClass getEmbeddingGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.TextEmbeddingGenerationService <em>Text Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Embedding Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.TextEmbeddingGenerationService
	 * @generated
	 */
	EClass getTextEmbeddingGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OpenAITextEmbeddingGenerationService <em>Open AI Text Embedding Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open AI Text Embedding Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.OpenAITextEmbeddingGenerationService
	 * @generated
	 */
	EClass getOpenAITextEmbeddingGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.TextAIService <em>Text AI Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text AI Service</em>'.
	 * @see org.nasdanika.models.semantickernel.TextAIService
	 * @generated
	 */
	EClass getTextAIService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.ChatCompletionService <em>Chat Completion Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chat Completion Service</em>'.
	 * @see org.nasdanika.models.semantickernel.ChatCompletionService
	 * @generated
	 */
	EClass getChatCompletionService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.GeminiChatCompletion <em>Gemini Chat Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gemini Chat Completion</em>'.
	 * @see org.nasdanika.models.semantickernel.GeminiChatCompletion
	 * @generated
	 */
	EClass getGeminiChatCompletion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OpenAIChatCompletion <em>Open AI Chat Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open AI Chat Completion</em>'.
	 * @see org.nasdanika.models.semantickernel.OpenAIChatCompletion
	 * @generated
	 */
	EClass getOpenAIChatCompletion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.TextGenerationService <em>Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.TextGenerationService
	 * @generated
	 */
	EClass getTextGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.GeminiTextGenerationService <em>Gemini Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gemini Text Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.GeminiTextGenerationService
	 * @generated
	 */
	EClass getGeminiTextGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.HuggingFaceTextGenerationService <em>Hugging Face Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hugging Face Text Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.HuggingFaceTextGenerationService
	 * @generated
	 */
	EClass getHuggingFaceTextGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OpenAITextGenerationService <em>Open AI Text Generation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open AI Text Generation Service</em>'.
	 * @see org.nasdanika.models.semantickernel.OpenAITextGenerationService
	 * @generated
	 */
	EClass getOpenAITextGenerationService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.TextToAudioService <em>Text To Audio Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text To Audio Service</em>'.
	 * @see org.nasdanika.models.semantickernel.TextToAudioService
	 * @generated
	 */
	EClass getTextToAudioService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.OpenAiTextToAudioService <em>Open Ai Text To Audio Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Ai Text To Audio Service</em>'.
	 * @see org.nasdanika.models.semantickernel.OpenAiTextToAudioService
	 * @generated
	 */
	EClass getOpenAiTextToAudioService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.InvocationContext <em>Invocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Context</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationContext
	 * @generated
	 */
	EClass getInvocationContext();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.semantickernel.InvocationContext#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Hooks</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationContext#getHooks()
	 * @see #getInvocationContext()
	 * @generated
	 */
	EReference getInvocationContext_Hooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semantickernel.InvocationContext#getPromptExecutionSettings <em>Prompt Execution Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt Execution Settings</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationContext#getPromptExecutionSettings()
	 * @see #getInvocationContext()
	 * @generated
	 */
	EReference getInvocationContext_PromptExecutionSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semantickernel.InvocationContext#getTelemetry <em>Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telemetry</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationContext#getTelemetry()
	 * @see #getInvocationContext()
	 * @generated
	 */
	EReference getInvocationContext_Telemetry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.InvocationContext#getInvocationReturnModel <em>Invocation Return Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invocation Return Model</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationContext#getInvocationReturnModel()
	 * @see #getInvocationContext()
	 * @generated
	 */
	EAttribute getInvocationContext_InvocationReturnModel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.SemanticKernelTelemetry <em>Semantic Kernel Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Kernel Telemetry</em>'.
	 * @see org.nasdanika.models.semantickernel.SemanticKernelTelemetry
	 * @generated
	 */
	EClass getSemanticKernelTelemetry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.SemanticKernelTelemetry#getTracer <em>Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracer</em>'.
	 * @see org.nasdanika.models.semantickernel.SemanticKernelTelemetry#getTracer()
	 * @see #getSemanticKernelTelemetry()
	 * @generated
	 */
	EAttribute getSemanticKernelTelemetry_Tracer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.ResponseFormat <em>Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Format</em>'.
	 * @see org.nasdanika.models.semantickernel.ResponseFormat
	 * @generated
	 */
	EClass getResponseFormat();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.JsonObjectResponseFormat <em>Json Object Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Object Response Format</em>'.
	 * @see org.nasdanika.models.semantickernel.JsonObjectResponseFormat
	 * @generated
	 */
	EClass getJsonObjectResponseFormat();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat <em>Json Schema Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Schema Response Format</em>'.
	 * @see org.nasdanika.models.semantickernel.JsonSchemaResponseFormat
	 * @generated
	 */
	EClass getJsonSchemaResponseFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchema <em>Json Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Schema</em>'.
	 * @see org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchema()
	 * @see #getJsonSchemaResponseFormat()
	 * @generated
	 */
	EAttribute getJsonSchemaResponseFormat_JsonSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchemaRef <em>Json Schema Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Schema Ref</em>'.
	 * @see org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchemaRef()
	 * @see #getJsonSchemaResponseFormat()
	 * @generated
	 */
	EAttribute getJsonSchemaResponseFormat_JsonSchemaRef();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getType()
	 * @see #getJsonSchemaResponseFormat()
	 * @generated
	 */
	EReference getJsonSchemaResponseFormat_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semantickernel.TextResponseFormat <em>Text Response Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Response Format</em>'.
	 * @see org.nasdanika.models.semantickernel.TextResponseFormat
	 * @generated
	 */
	EClass getTextResponseFormat();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.semantickernel.InvocationReturnMode <em>Invocation Return Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invocation Return Mode</em>'.
	 * @see org.nasdanika.models.semantickernel.InvocationReturnMode
	 * @generated
	 */
	EEnum getInvocationReturnMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemantickernelFactory getSemantickernelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.KernelImpl <em>Kernel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.KernelImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getKernel()
		 * @generated
		 */
		EClass KERNEL = eINSTANCE.getKernel();
		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERNEL__HOOKS = eINSTANCE.getKernel_Hooks();
		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERNEL__PLUGINS = eINSTANCE.getKernel_Plugins();
		/**
		 * The meta object literal for the '<em><b>Ai Service Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERNEL__AI_SERVICE_SELECTOR = eINSTANCE.getKernel_AiServiceSelector();
		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERNEL__SERVICES = eINSTANCE.getKernel_Services();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl <em>AI Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.AIServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAIService()
		 * @generated
		 */
		EClass AI_SERVICE = eINSTANCE.getAIService();
		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SERVICE__MODEL = eINSTANCE.getAIService_Model();
		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SERVICE__SERVICE = eINSTANCE.getAIService_Service();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.AIServiceSelectorImpl <em>AI Service Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.AIServiceSelectorImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAIServiceSelector()
		 * @generated
		 */
		EClass AI_SERVICE_SELECTOR = eINSTANCE.getAIServiceSelector();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PluginImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();
		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__FUNCTIONS = eINSTANCE.getPlugin_Functions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.InvocableImpl <em>Invocable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.InvocableImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocable()
		 * @generated
		 */
		EClass INVOCABLE = eINSTANCE.getInvocable();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCABLE__PARAMETERS = eINSTANCE.getInvocable_Parameters();
		/**
		 * The meta object literal for the '<em><b>Prompt Execution Settings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCABLE__PROMPT_EXECUTION_SETTINGS = eINSTANCE.getInvocable_PromptExecutionSettings();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptTemplateConfigImpl <em>Prompt Template Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptTemplateConfigImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptTemplateConfig()
		 * @generated
		 */
		EClass PROMPT_TEMPLATE_CONFIG = eINSTANCE.getPromptTemplateConfig();
		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_TEMPLATE_CONFIG__SCHEMA = eINSTANCE.getPromptTemplateConfig_Schema();
		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_TEMPLATE_CONFIG__TEMPLATE = eINSTANCE.getPromptTemplateConfig_Template();
		/**
		 * The meta object literal for the '<em><b>Template Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF = eINSTANCE.getPromptTemplateConfig_TemplateRef();
		/**
		 * The meta object literal for the '<em><b>Template Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT = eINSTANCE.getPromptTemplateConfig_TemplateFormat();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.FunctionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.SpelFunctionImpl <em>Spel Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.SpelFunctionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getSpelFunction()
		 * @generated
		 */
		EClass SPEL_FUNCTION = eINSTANCE.getSpelFunction();
		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEL_FUNCTION__EXPRESSION = eINSTANCE.getSpelFunction_Expression();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl <em>Scripted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getScriptedFunction()
		 * @generated
		 */
		EClass SCRIPTED_FUNCTION = eINSTANCE.getScriptedFunction();
		/**
		 * The meta object literal for the '<em><b>Engine Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FUNCTION__ENGINE_NAMES = eINSTANCE.getScriptedFunction_EngineNames();
		/**
		 * The meta object literal for the '<em><b>Engine Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FUNCTION__ENGINE_MIME_TYPES = eINSTANCE.getScriptedFunction_EngineMimeTypes();
		/**
		 * The meta object literal for the '<em><b>Engine Extensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FUNCTION__ENGINE_EXTENSIONS = eINSTANCE.getScriptedFunction_EngineExtensions();
		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FUNCTION__SCRIPT = eINSTANCE.getScriptedFunction_Script();
		/**
		 * The meta object literal for the '<em><b>Script Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_FUNCTION__SCRIPT_REF = eINSTANCE.getScriptedFunction_ScriptRef();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl <em>Prompt Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptFunctionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptFunction()
		 * @generated
		 */
		EClass PROMPT_FUNCTION = eINSTANCE.getPromptFunction();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl <em>Input Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.InputVariableImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInputVariable()
		 * @generated
		 */
		EClass INPUT_VARIABLE = eINSTANCE.getInputVariable();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_VARIABLE__TYPE = eINSTANCE.getInputVariable_Type();
		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_VARIABLE__DEFAULT_VALUE = eINSTANCE.getInputVariable_DefaultValue();
		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_VARIABLE__REQUIRED = eINSTANCE.getInputVariable_Required();
		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_VARIABLE__ENUM_VALUES = eINSTANCE.getInputVariable_EnumValues();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OutputVariableImpl <em>Output Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OutputVariableImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOutputVariable()
		 * @generated
		 */
		EClass OUTPUT_VARIABLE = eINSTANCE.getOutputVariable();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_VARIABLE__TYPE = eINSTANCE.getOutputVariable_Type();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl <em>Prompt Execution Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptExecutionSettings()
		 * @generated
		 */
		EClass PROMPT_EXECUTION_SETTINGS = eINSTANCE.getPromptExecutionSettings();
		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__SERVICE = eINSTANCE.getPromptExecutionSettings_Service();
		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__MODEL = eINSTANCE.getPromptExecutionSettings_Model();
		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__TEMPERATURE = eINSTANCE.getPromptExecutionSettings_Temperature();
		/**
		 * The meta object literal for the '<em><b>Top P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__TOP_P = eINSTANCE.getPromptExecutionSettings_TopP();
		/**
		 * The meta object literal for the '<em><b>Presense Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY = eINSTANCE.getPromptExecutionSettings_PresensePenalty();
		/**
		 * The meta object literal for the '<em><b>Frequency Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY = eINSTANCE.getPromptExecutionSettings_FrequencyPenalty();
		/**
		 * The meta object literal for the '<em><b>Max Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__MAX_TOKENS = eINSTANCE.getPromptExecutionSettings_MaxTokens();
		/**
		 * The meta object literal for the '<em><b>Best Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__BEST_OF = eINSTANCE.getPromptExecutionSettings_BestOf();
		/**
		 * The meta object literal for the '<em><b>Results Per Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT = eINSTANCE.getPromptExecutionSettings_ResultsPerPrompt();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__USER = eINSTANCE.getPromptExecutionSettings_User();
		/**
		 * The meta object literal for the '<em><b>Stop Sequences</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES = eINSTANCE.getPromptExecutionSettings_StopSequences();
		/**
		 * The meta object literal for the '<em><b>Response Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT = eINSTANCE.getPromptExecutionSettings_ResponseFormat();
		/**
		 * The meta object literal for the '<em><b>Token Selection Biases</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES = eINSTANCE.getPromptExecutionSettings_TokenSelectionBiases();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl <em>Token Selection Biases Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTokenSelectionBiasesEntry()
		 * @generated
		 */
		EClass TOKEN_SELECTION_BIASES_ENTRY = eINSTANCE.getTokenSelectionBiasesEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_SELECTION_BIASES_ENTRY__KEY = eINSTANCE.getTokenSelectionBiasesEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_SELECTION_BIASES_ENTRY__VALUE = eINSTANCE.getTokenSelectionBiasesEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsEntryImpl <em>Prompt Execution Settings Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsEntryImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptExecutionSettingsEntry()
		 * @generated
		 */
		EClass PROMPT_EXECUTION_SETTINGS_ENTRY = eINSTANCE.getPromptExecutionSettingsEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT_EXECUTION_SETTINGS_ENTRY__KEY = eINSTANCE.getPromptExecutionSettingsEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMPT_EXECUTION_SETTINGS_ENTRY__VALUE = eINSTANCE.getPromptExecutionSettingsEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.HookImpl <em>Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.HookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHook()
		 * @generated
		 */
		EClass HOOK = eINSTANCE.getHook();
		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK__PRIORITY = eINSTANCE.getHook_Priority();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.HookEntryImpl <em>Hook Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.HookEntryImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHookEntry()
		 * @generated
		 */
		EClass HOOK_ENTRY = eINSTANCE.getHookEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK_ENTRY__KEY = eINSTANCE.getHookEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_ENTRY__VALUE = eINSTANCE.getHookEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.FunctionInvokedHookImpl <em>Function Invoked Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.FunctionInvokedHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunctionInvokedHook()
		 * @generated
		 */
		EClass FUNCTION_INVOKED_HOOK = eINSTANCE.getFunctionInvokedHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.FunctionInvokingHookImpl <em>Function Invoking Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.FunctionInvokingHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getFunctionInvokingHook()
		 * @generated
		 */
		EClass FUNCTION_INVOKING_HOOK = eINSTANCE.getFunctionInvokingHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PostChatCompletionHookImpl <em>Post Chat Completion Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PostChatCompletionHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPostChatCompletionHook()
		 * @generated
		 */
		EClass POST_CHAT_COMPLETION_HOOK = eINSTANCE.getPostChatCompletionHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PreChatCompletionHookImpl <em>Pre Chat Completion Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PreChatCompletionHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPreChatCompletionHook()
		 * @generated
		 */
		EClass PRE_CHAT_COMPLETION_HOOK = eINSTANCE.getPreChatCompletionHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PreToolCallHookImpl <em>Pre Tool Call Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PreToolCallHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPreToolCallHook()
		 * @generated
		 */
		EClass PRE_TOOL_CALL_HOOK = eINSTANCE.getPreToolCallHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptRenderedHookImpl <em>Prompt Rendered Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptRenderedHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptRenderedHook()
		 * @generated
		 */
		EClass PROMPT_RENDERED_HOOK = eINSTANCE.getPromptRenderedHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.PromptRenderingHookImpl <em>Prompt Rendering Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.PromptRenderingHookImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getPromptRenderingHook()
		 * @generated
		 */
		EClass PROMPT_RENDERING_HOOK = eINSTANCE.getPromptRenderingHook();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.AudioToTextServiceImpl <em>Audio To Text Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.AudioToTextServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getAudioToTextService()
		 * @generated
		 */
		EClass AUDIO_TO_TEXT_SERVICE = eINSTANCE.getAudioToTextService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OpenAiAudioToTextServiceImpl <em>Open Ai Audio To Text Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OpenAiAudioToTextServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAiAudioToTextService()
		 * @generated
		 */
		EClass OPEN_AI_AUDIO_TO_TEXT_SERVICE = eINSTANCE.getOpenAiAudioToTextService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.EmbeddingGenerationServiceImpl <em>Embedding Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.EmbeddingGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getEmbeddingGenerationService()
		 * @generated
		 */
		EClass EMBEDDING_GENERATION_SERVICE = eINSTANCE.getEmbeddingGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TextEmbeddingGenerationServiceImpl <em>Text Embedding Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TextEmbeddingGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextEmbeddingGenerationService()
		 * @generated
		 */
		EClass TEXT_EMBEDDING_GENERATION_SERVICE = eINSTANCE.getTextEmbeddingGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OpenAITextEmbeddingGenerationServiceImpl <em>Open AI Text Embedding Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OpenAITextEmbeddingGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAITextEmbeddingGenerationService()
		 * @generated
		 */
		EClass OPEN_AI_TEXT_EMBEDDING_GENERATION_SERVICE = eINSTANCE.getOpenAITextEmbeddingGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TextAIServiceImpl <em>Text AI Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TextAIServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextAIService()
		 * @generated
		 */
		EClass TEXT_AI_SERVICE = eINSTANCE.getTextAIService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.ChatCompletionServiceImpl <em>Chat Completion Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.ChatCompletionServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getChatCompletionService()
		 * @generated
		 */
		EClass CHAT_COMPLETION_SERVICE = eINSTANCE.getChatCompletionService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.GeminiChatCompletionImpl <em>Gemini Chat Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.GeminiChatCompletionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getGeminiChatCompletion()
		 * @generated
		 */
		EClass GEMINI_CHAT_COMPLETION = eINSTANCE.getGeminiChatCompletion();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OpenAIChatCompletionImpl <em>Open AI Chat Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OpenAIChatCompletionImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAIChatCompletion()
		 * @generated
		 */
		EClass OPEN_AI_CHAT_COMPLETION = eINSTANCE.getOpenAIChatCompletion();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TextGenerationServiceImpl <em>Text Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TextGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextGenerationService()
		 * @generated
		 */
		EClass TEXT_GENERATION_SERVICE = eINSTANCE.getTextGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.GeminiTextGenerationServiceImpl <em>Gemini Text Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.GeminiTextGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getGeminiTextGenerationService()
		 * @generated
		 */
		EClass GEMINI_TEXT_GENERATION_SERVICE = eINSTANCE.getGeminiTextGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.HuggingFaceTextGenerationServiceImpl <em>Hugging Face Text Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.HuggingFaceTextGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getHuggingFaceTextGenerationService()
		 * @generated
		 */
		EClass HUGGING_FACE_TEXT_GENERATION_SERVICE = eINSTANCE.getHuggingFaceTextGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OpenAITextGenerationServiceImpl <em>Open AI Text Generation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OpenAITextGenerationServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAITextGenerationService()
		 * @generated
		 */
		EClass OPEN_AI_TEXT_GENERATION_SERVICE = eINSTANCE.getOpenAITextGenerationService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TextToAudioServiceImpl <em>Text To Audio Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TextToAudioServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextToAudioService()
		 * @generated
		 */
		EClass TEXT_TO_AUDIO_SERVICE = eINSTANCE.getTextToAudioService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.OpenAiTextToAudioServiceImpl <em>Open Ai Text To Audio Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.OpenAiTextToAudioServiceImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getOpenAiTextToAudioService()
		 * @generated
		 */
		EClass OPEN_AI_TEXT_TO_AUDIO_SERVICE = eINSTANCE.getOpenAiTextToAudioService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl <em>Invocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.InvocationContextImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocationContext()
		 * @generated
		 */
		EClass INVOCATION_CONTEXT = eINSTANCE.getInvocationContext();
		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_CONTEXT__HOOKS = eINSTANCE.getInvocationContext_Hooks();
		/**
		 * The meta object literal for the '<em><b>Prompt Execution Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS = eINSTANCE.getInvocationContext_PromptExecutionSettings();
		/**
		 * The meta object literal for the '<em><b>Telemetry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_CONTEXT__TELEMETRY = eINSTANCE.getInvocationContext_Telemetry();
		/**
		 * The meta object literal for the '<em><b>Invocation Return Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL = eINSTANCE.getInvocationContext_InvocationReturnModel();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.SemanticKernelTelemetryImpl <em>Semantic Kernel Telemetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.SemanticKernelTelemetryImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getSemanticKernelTelemetry()
		 * @generated
		 */
		EClass SEMANTIC_KERNEL_TELEMETRY = eINSTANCE.getSemanticKernelTelemetry();
		/**
		 * The meta object literal for the '<em><b>Tracer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_KERNEL_TELEMETRY__TRACER = eINSTANCE.getSemanticKernelTelemetry_Tracer();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.ResponseFormatImpl <em>Response Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.ResponseFormatImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getResponseFormat()
		 * @generated
		 */
		EClass RESPONSE_FORMAT = eINSTANCE.getResponseFormat();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.JsonObjectResponseFormatImpl <em>Json Object Response Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.JsonObjectResponseFormatImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getJsonObjectResponseFormat()
		 * @generated
		 */
		EClass JSON_OBJECT_RESPONSE_FORMAT = eINSTANCE.getJsonObjectResponseFormat();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl <em>Json Schema Response Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getJsonSchemaResponseFormat()
		 * @generated
		 */
		EClass JSON_SCHEMA_RESPONSE_FORMAT = eINSTANCE.getJsonSchemaResponseFormat();
		/**
		 * The meta object literal for the '<em><b>Json Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA = eINSTANCE.getJsonSchemaResponseFormat_JsonSchema();
		/**
		 * The meta object literal for the '<em><b>Json Schema Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF = eINSTANCE.getJsonSchemaResponseFormat_JsonSchemaRef();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_SCHEMA_RESPONSE_FORMAT__TYPE = eINSTANCE.getJsonSchemaResponseFormat_Type();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.impl.TextResponseFormatImpl <em>Text Response Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.impl.TextResponseFormatImpl
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getTextResponseFormat()
		 * @generated
		 */
		EClass TEXT_RESPONSE_FORMAT = eINSTANCE.getTextResponseFormat();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semantickernel.InvocationReturnMode <em>Invocation Return Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semantickernel.InvocationReturnMode
		 * @see org.nasdanika.models.semantickernel.impl.SemantickernelPackageImpl#getInvocationReturnMode()
		 * @generated
		 */
		EEnum INVOCATION_RETURN_MODE = eINSTANCE.getInvocationReturnMode();

	}

} //SemantickernelPackage
