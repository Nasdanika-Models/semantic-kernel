/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineNames <em>Engine Names</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineMimeTypes <em>Engine Mime Types</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.ScriptedFunction#getEngineExtensions <em>Engine Extensions</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScript <em>Script</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScriptRef <em>Script Ref</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction()
 * @model
 * @generated
 */
public interface ScriptedFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Engine Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Names</em>' attribute list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction_EngineNames()
	 * @model
	 * @generated
	 */
	EList<String> getEngineNames();

	/**
	 * Returns the value of the '<em><b>Engine Mime Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Mime Types</em>' attribute list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction_EngineMimeTypes()
	 * @model
	 * @generated
	 */
	EList<String> getEngineMimeTypes();

	/**
	 * Returns the value of the '<em><b>Engine Extensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Extensions</em>' attribute list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction_EngineExtensions()
	 * @model
	 * @generated
	 */
	EList<String> getEngineExtensions();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Ref</em>' attribute.
	 * @see #setScriptRef(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getScriptedFunction_ScriptRef()
	 * @model
	 * @generated
	 */
	String getScriptRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.ScriptedFunction#getScriptRef <em>Script Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Ref</em>' attribute.
	 * @see #getScriptRef()
	 * @generated
	 */
	void setScriptRef(String value);

} // ScriptedFunction
