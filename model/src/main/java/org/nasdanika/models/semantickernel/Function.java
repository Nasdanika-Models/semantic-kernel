/**
 */
package org.nasdanika.models.semantickernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.Function#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Invocable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(OutputVariable)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getFunction_Type()
	 * @model containment="true"
	 * @generated
	 */
	OutputVariable getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.Function#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OutputVariable value);

} // Function
