/**
 */
package org.nasdanika.models.semantickernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prompt Template Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateRef <em>Template Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateFormat <em>Template Format</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptTemplateConfig()
 * @model
 * @generated
 */
public interface PromptTemplateConfig extends Invocable {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(int)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptTemplateConfig_Schema()
	 * @model default="1"
	 * @generated
	 */
	int getSchema();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(int value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptTemplateConfig_Template()
	 * @model
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Template Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Ref</em>' attribute.
	 * @see #setTemplateRef(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptTemplateConfig_TemplateRef()
	 * @model
	 * @generated
	 */
	String getTemplateRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateRef <em>Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Ref</em>' attribute.
	 * @see #getTemplateRef()
	 * @generated
	 */
	void setTemplateRef(String value);

	/**
	 * Returns the value of the '<em><b>Template Format</b></em>' attribute.
	 * The default value is <code>"semantic-kernel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Format</em>' attribute.
	 * @see #setTemplateFormat(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptTemplateConfig_TemplateFormat()
	 * @model default="semantic-kernel"
	 * @generated
	 */
	String getTemplateFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptTemplateConfig#getTemplateFormat <em>Template Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Format</em>' attribute.
	 * @see #getTemplateFormat()
	 * @generated
	 */
	void setTemplateFormat(String value);

} // PromptTemplateConfig
