/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EMap;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.InvocationContext#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.InvocationContext#getPromptExecutionSettings <em>Prompt Execution Settings</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.InvocationContext#getTelemetry <em>Telemetry</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.InvocationContext#getInvocationReturnModel <em>Invocation Return Model</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationContext()
 * @model
 * @generated
 */
public interface InvocationContext extends ModelElement, Documented {
	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.models.semantickernel.Hook},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' map.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationContext_Hooks()
	 * @model mapType="org.nasdanika.models.semantickernel.HookEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.semantickernel.Hook&gt;"
	 * @generated
	 */
	EMap<String, Hook> getHooks();

	/**
	 * Returns the value of the '<em><b>Prompt Execution Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt Execution Settings</em>' containment reference.
	 * @see #setPromptExecutionSettings(PromptExecutionSettings)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationContext_PromptExecutionSettings()
	 * @model containment="true"
	 * @generated
	 */
	PromptExecutionSettings getPromptExecutionSettings();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.InvocationContext#getPromptExecutionSettings <em>Prompt Execution Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt Execution Settings</em>' containment reference.
	 * @see #getPromptExecutionSettings()
	 * @generated
	 */
	void setPromptExecutionSettings(PromptExecutionSettings value);

	/**
	 * Returns the value of the '<em><b>Telemetry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telemetry</em>' containment reference.
	 * @see #setTelemetry(SemanticKernelTelemetry)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationContext_Telemetry()
	 * @model containment="true"
	 * @generated
	 */
	SemanticKernelTelemetry getTelemetry();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.InvocationContext#getTelemetry <em>Telemetry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telemetry</em>' containment reference.
	 * @see #getTelemetry()
	 * @generated
	 */
	void setTelemetry(SemanticKernelTelemetry value);

	/**
	 * Returns the value of the '<em><b>Invocation Return Model</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.semantickernel.InvocationReturnMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Return Model</em>' attribute.
	 * @see org.nasdanika.models.semantickernel.InvocationReturnMode
	 * @see #setInvocationReturnModel(InvocationReturnMode)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationContext_InvocationReturnModel()
	 * @model
	 * @generated
	 */
	InvocationReturnMode getInvocationReturnModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.InvocationContext#getInvocationReturnModel <em>Invocation Return Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Return Model</em>' attribute.
	 * @see org.nasdanika.models.semantickernel.InvocationReturnMode
	 * @see #getInvocationReturnModel()
	 * @generated
	 */
	void setInvocationReturnModel(InvocationReturnMode value);

} // InvocationContext
