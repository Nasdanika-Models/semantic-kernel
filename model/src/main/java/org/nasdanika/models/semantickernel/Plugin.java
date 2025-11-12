/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.Plugin#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semantickernel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPlugin_Functions()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Plugin
