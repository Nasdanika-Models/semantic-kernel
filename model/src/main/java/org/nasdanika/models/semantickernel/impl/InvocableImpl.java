/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.semantickernel.InputVariable;
import org.nasdanika.models.semantickernel.Invocable;
import org.nasdanika.models.semantickernel.PromptExecutionSettings;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocableImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocableImpl#getPromptExecutionSettings <em>Prompt Execution Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocableImpl extends DocumentedNamedElementImpl implements Invocable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.INVOCABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InputVariable> getParameters() {
		return (EList<InputVariable>)eDynamicGet(SemantickernelPackage.INVOCABLE__PARAMETERS, SemantickernelPackage.Literals.INVOCABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, PromptExecutionSettings> getPromptExecutionSettings() {
		return (EMap<String, PromptExecutionSettings>)eDynamicGet(SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS, SemantickernelPackage.Literals.INVOCABLE__PROMPT_EXECUTION_SETTINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.INVOCABLE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS:
				return ((InternalEList<?>)getPromptExecutionSettings()).basicRemove(otherEnd, msgs);
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
			case SemantickernelPackage.INVOCABLE__PARAMETERS:
				return getParameters();
			case SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS:
				if (coreType) return getPromptExecutionSettings();
				else return getPromptExecutionSettings().map();
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
			case SemantickernelPackage.INVOCABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends InputVariable>)newValue);
				return;
			case SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS:
				((EStructuralFeature.Setting)getPromptExecutionSettings()).set(newValue);
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
			case SemantickernelPackage.INVOCABLE__PARAMETERS:
				getParameters().clear();
				return;
			case SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS:
				getPromptExecutionSettings().clear();
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
			case SemantickernelPackage.INVOCABLE__PARAMETERS:
				return !getParameters().isEmpty();
			case SemantickernelPackage.INVOCABLE__PROMPT_EXECUTION_SETTINGS:
				return !getPromptExecutionSettings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvocableImpl
