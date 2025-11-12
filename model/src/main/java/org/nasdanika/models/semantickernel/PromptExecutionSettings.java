/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prompt Execution Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getService <em>Service</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getModel <em>Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTopP <em>Top P</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getPresensePenalty <em>Presense Penalty</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getFrequencyPenalty <em>Frequency Penalty</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getBestOf <em>Best Of</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResultsPerPrompt <em>Results Per Prompt</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getStopSequences <em>Stop Sequences</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResponseFormat <em>Response Format</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTokenSelectionBiases <em>Token Selection Biases</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings()
 * @model
 * @generated
 */
public interface PromptExecutionSettings extends ModelElement, Documented {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(Double)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_Temperature()
	 * @model
	 * @generated
	 */
	Double getTemperature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Double value);

	/**
	 * Returns the value of the '<em><b>Top P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top P</em>' attribute.
	 * @see #setTopP(Double)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_TopP()
	 * @model
	 * @generated
	 */
	Double getTopP();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getTopP <em>Top P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top P</em>' attribute.
	 * @see #getTopP()
	 * @generated
	 */
	void setTopP(Double value);

	/**
	 * Returns the value of the '<em><b>Presense Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presense Penalty</em>' attribute.
	 * @see #setPresensePenalty(Double)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_PresensePenalty()
	 * @model
	 * @generated
	 */
	Double getPresensePenalty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getPresensePenalty <em>Presense Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presense Penalty</em>' attribute.
	 * @see #getPresensePenalty()
	 * @generated
	 */
	void setPresensePenalty(Double value);

	/**
	 * Returns the value of the '<em><b>Frequency Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Penalty</em>' attribute.
	 * @see #setFrequencyPenalty(Double)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_FrequencyPenalty()
	 * @model
	 * @generated
	 */
	Double getFrequencyPenalty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getFrequencyPenalty <em>Frequency Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Penalty</em>' attribute.
	 * @see #getFrequencyPenalty()
	 * @generated
	 */
	void setFrequencyPenalty(Double value);

	/**
	 * Returns the value of the '<em><b>Max Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Tokens</em>' attribute.
	 * @see #setMaxTokens(Integer)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_MaxTokens()
	 * @model
	 * @generated
	 */
	Integer getMaxTokens();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getMaxTokens <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Tokens</em>' attribute.
	 * @see #getMaxTokens()
	 * @generated
	 */
	void setMaxTokens(Integer value);

	/**
	 * Returns the value of the '<em><b>Best Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Of</em>' attribute.
	 * @see #setBestOf(Integer)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_BestOf()
	 * @model
	 * @generated
	 */
	Integer getBestOf();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getBestOf <em>Best Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Of</em>' attribute.
	 * @see #getBestOf()
	 * @generated
	 */
	void setBestOf(Integer value);

	/**
	 * Returns the value of the '<em><b>Results Per Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Per Prompt</em>' attribute.
	 * @see #setResultsPerPrompt(Integer)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_ResultsPerPrompt()
	 * @model
	 * @generated
	 */
	Integer getResultsPerPrompt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResultsPerPrompt <em>Results Per Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Per Prompt</em>' attribute.
	 * @see #getResultsPerPrompt()
	 * @generated
	 */
	void setResultsPerPrompt(Integer value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Stop Sequences</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Sequences</em>' attribute list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_StopSequences()
	 * @model
	 * @generated
	 */
	EList<String> getStopSequences();

	/**
	 * Returns the value of the '<em><b>Response Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Format</em>' containment reference.
	 * @see #setResponseFormat(ResponseFormat)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_ResponseFormat()
	 * @model containment="true"
	 * @generated
	 */
	ResponseFormat getResponseFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.PromptExecutionSettings#getResponseFormat <em>Response Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Format</em>' containment reference.
	 * @see #getResponseFormat()
	 * @generated
	 */
	void setResponseFormat(ResponseFormat value);

	/**
	 * Returns the value of the '<em><b>Token Selection Biases</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Selection Biases</em>' map.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getPromptExecutionSettings_TokenSelectionBiases()
	 * @model mapType="org.nasdanika.models.semantickernel.TokenSelectionBiasesEntry&lt;org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Integer, Integer> getTokenSelectionBiases();

} // PromptExecutionSettings
