/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.Invocable#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.Invocable#getPromptExecutionSettings <em>Prompt Execution Settings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocable()
 * @model
 * @generated
 */
public interface Invocable extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semantickernel.InputVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocable_Parameters()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<InputVariable> getParameters();

	/**
	 * Returns the value of the '<em><b>Prompt Execution Settings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.models.semantickernel.PromptExecutionSettings},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt Execution Settings</em>' map.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocable_PromptExecutionSettings()
	 * @model mapType="org.nasdanika.models.semantickernel.PromptExecutionSettingsEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.semantickernel.PromptExecutionSettings&gt;"
	 * @generated
	 */
	EMap<String, PromptExecutionSettings> getPromptExecutionSettings();

} // Invocable
