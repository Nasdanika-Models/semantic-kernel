/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Schema Response Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchema <em>Json Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchemaRef <em>Json Schema Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getJsonSchemaResponseFormat()
 * @model
 * @generated
 */
public interface JsonSchemaResponseFormat extends ResponseFormat {
	/**
	 * Returns the value of the '<em><b>Json Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Schema</em>' attribute.
	 * @see #setJsonSchema(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getJsonSchemaResponseFormat_JsonSchema()
	 * @model
	 * @generated
	 */
	String getJsonSchema();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchema <em>Json Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Schema</em>' attribute.
	 * @see #getJsonSchema()
	 * @generated
	 */
	void setJsonSchema(String value);

	/**
	 * Returns the value of the '<em><b>Json Schema Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Schema Ref</em>' attribute.
	 * @see #setJsonSchemaRef(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getJsonSchemaResponseFormat_JsonSchemaRef()
	 * @model
	 * @generated
	 */
	String getJsonSchemaRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getJsonSchemaRef <em>Json Schema Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Schema Ref</em>' attribute.
	 * @see #getJsonSchemaRef()
	 * @generated
	 */
	void setJsonSchemaRef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClassifier)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getJsonSchemaResponseFormat_Type()
	 * @model
	 * @generated
	 */
	EClassifier getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.JsonSchemaResponseFormat#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClassifier value);

} // JsonSchemaResponseFormat
