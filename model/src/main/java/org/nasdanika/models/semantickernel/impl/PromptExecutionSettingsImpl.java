/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.semantickernel.PromptExecutionSettings;
import org.nasdanika.models.semantickernel.ResponseFormat;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prompt Execution Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getTopP <em>Top P</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getPresensePenalty <em>Presense Penalty</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getFrequencyPenalty <em>Frequency Penalty</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getBestOf <em>Best Of</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getResultsPerPrompt <em>Results Per Prompt</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getStopSequences <em>Stop Sequences</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getResponseFormat <em>Response Format</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptExecutionSettingsImpl#getTokenSelectionBiases <em>Token Selection Biases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PromptExecutionSettingsImpl extends ModelElementImpl implements PromptExecutionSettings {
	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEMPERATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTopP() <em>Top P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopP()
	 * @generated
	 * @ordered
	 */
	protected static final Double TOP_P_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPresensePenalty() <em>Presense Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresensePenalty()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRESENSE_PENALTY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFrequencyPenalty() <em>Frequency Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final Double FREQUENCY_PENALTY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxTokens() <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTokens()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_TOKENS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBestOf() <em>Best Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOf()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BEST_OF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResultsPerPrompt() <em>Results Per Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsPerPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESULTS_PER_PROMPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromptExecutionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(String newService) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTemperature() {
		return (Double)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__TEMPERATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(Double newTemperature) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__TEMPERATURE, newTemperature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTopP() {
		return (Double)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__TOP_P, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopP(Double newTopP) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__TOP_P, newTopP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getPresensePenalty() {
		return (Double)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresensePenalty(Double newPresensePenalty) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY, newPresensePenalty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getFrequencyPenalty() {
		return (Double)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequencyPenalty(Double newFrequencyPenalty) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY, newFrequencyPenalty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxTokens() {
		return (Integer)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTokens(Integer newMaxTokens) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS, newMaxTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBestOf() {
		return (Integer)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__BEST_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestOf(Integer newBestOf) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__BEST_OF, newBestOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResultsPerPrompt() {
		return (Integer)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsPerPrompt(Integer newResultsPerPrompt) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT, newResultsPerPrompt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getStopSequences() {
		return (EList<String>)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseFormat getResponseFormat() {
		return (ResponseFormat)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseFormat(ResponseFormat newResponseFormat, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResponseFormat, SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseFormat(ResponseFormat newResponseFormat) {
		eDynamicSet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT, newResponseFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<Integer, Integer> getTokenSelectionBiases() {
		return (EMap<Integer, Integer>)eDynamicGet(SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES, SemantickernelPackage.Literals.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT:
				return basicSetResponseFormat(null, msgs);
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES:
				return ((InternalEList<?>)getTokenSelectionBiases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION:
				return getDocumentation();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP:
				return getContextHelp();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE:
				return getService();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL:
				return getModel();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE:
				return getTemperature();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P:
				return getTopP();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY:
				return getPresensePenalty();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY:
				return getFrequencyPenalty();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS:
				return getMaxTokens();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF:
				return getBestOf();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT:
				return getResultsPerPrompt();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER:
				return getUser();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES:
				return getStopSequences();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT:
				return getResponseFormat();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES:
				if (coreType) return getTokenSelectionBiases();
				else return getTokenSelectionBiases().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE:
				setService((String)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL:
				setModel((String)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P:
				setTopP((Double)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY:
				setPresensePenalty((Double)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY:
				setFrequencyPenalty((Double)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS:
				setMaxTokens((Integer)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF:
				setBestOf((Integer)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT:
				setResultsPerPrompt((Integer)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER:
				setUser((String)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES:
				getStopSequences().clear();
				getStopSequences().addAll((Collection<? extends String>)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT:
				setResponseFormat((ResponseFormat)newValue);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES:
				((EStructuralFeature.Setting)getTokenSelectionBiases()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P:
				setTopP(TOP_P_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY:
				setPresensePenalty(PRESENSE_PENALTY_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY:
				setFrequencyPenalty(FREQUENCY_PENALTY_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS:
				setMaxTokens(MAX_TOKENS_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF:
				setBestOf(BEST_OF_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT:
				setResultsPerPrompt(RESULTS_PER_PROMPT_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER:
				setUser(USER_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES:
				getStopSequences().clear();
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT:
				setResponseFormat((ResponseFormat)null);
				return;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES:
				getTokenSelectionBiases().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__SERVICE:
				return SERVICE_EDEFAULT == null ? getService() != null : !SERVICE_EDEFAULT.equals(getService());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? getTemperature() != null : !TEMPERATURE_EDEFAULT.equals(getTemperature());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOP_P:
				return TOP_P_EDEFAULT == null ? getTopP() != null : !TOP_P_EDEFAULT.equals(getTopP());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__PRESENSE_PENALTY:
				return PRESENSE_PENALTY_EDEFAULT == null ? getPresensePenalty() != null : !PRESENSE_PENALTY_EDEFAULT.equals(getPresensePenalty());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__FREQUENCY_PENALTY:
				return FREQUENCY_PENALTY_EDEFAULT == null ? getFrequencyPenalty() != null : !FREQUENCY_PENALTY_EDEFAULT.equals(getFrequencyPenalty());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__MAX_TOKENS:
				return MAX_TOKENS_EDEFAULT == null ? getMaxTokens() != null : !MAX_TOKENS_EDEFAULT.equals(getMaxTokens());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__BEST_OF:
				return BEST_OF_EDEFAULT == null ? getBestOf() != null : !BEST_OF_EDEFAULT.equals(getBestOf());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESULTS_PER_PROMPT:
				return RESULTS_PER_PROMPT_EDEFAULT == null ? getResultsPerPrompt() != null : !RESULTS_PER_PROMPT_EDEFAULT.equals(getResultsPerPrompt());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__USER:
				return USER_EDEFAULT == null ? getUser() != null : !USER_EDEFAULT.equals(getUser());
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__STOP_SEQUENCES:
				return !getStopSequences().isEmpty();
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__RESPONSE_FORMAT:
				return getResponseFormat() != null;
			case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__TOKEN_SELECTION_BIASES:
				return !getTokenSelectionBiases().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return SemantickernelPackage.PROMPT_EXECUTION_SETTINGS__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PromptExecutionSettingsImpl
