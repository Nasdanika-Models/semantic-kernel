/**
 */
package org.nasdanika.models.semantickernel;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.Hook#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getHook()
 * @model
 * @generated
 */
public interface Hook extends ModelElement, Documented {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getHook_Priority()
	 * @model default="50"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.Hook#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // Hook
