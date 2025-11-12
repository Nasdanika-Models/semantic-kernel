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

import org.nasdanika.models.semantickernel.Hook;
import org.nasdanika.models.semantickernel.InvocationContext;
import org.nasdanika.models.semantickernel.InvocationReturnMode;
import org.nasdanika.models.semantickernel.PromptExecutionSettings;
import org.nasdanika.models.semantickernel.SemanticKernelTelemetry;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getPromptExecutionSettings <em>Prompt Execution Settings</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getTelemetry <em>Telemetry</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InvocationContextImpl#getInvocationReturnModel <em>Invocation Return Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationContextImpl extends ModelElementImpl implements InvocationContext {
	/**
	 * The default value of the '{@link #getInvocationReturnModel() <em>Invocation Return Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationReturnModel()
	 * @generated
	 * @ordered
	 */
	protected static final InvocationReturnMode INVOCATION_RETURN_MODEL_EDEFAULT = InvocationReturnMode.FULL_HISTORY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.INVOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Hook> getHooks() {
		return (EMap<String, Hook>)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__HOOKS, SemantickernelPackage.Literals.INVOCATION_CONTEXT__HOOKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptExecutionSettings getPromptExecutionSettings() {
		return (PromptExecutionSettings)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS, SemantickernelPackage.Literals.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPromptExecutionSettings(PromptExecutionSettings newPromptExecutionSettings, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPromptExecutionSettings, SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromptExecutionSettings(PromptExecutionSettings newPromptExecutionSettings) {
		eDynamicSet(SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS, SemantickernelPackage.Literals.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS, newPromptExecutionSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticKernelTelemetry getTelemetry() {
		return (SemanticKernelTelemetry)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY, SemantickernelPackage.Literals.INVOCATION_CONTEXT__TELEMETRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelemetry(SemanticKernelTelemetry newTelemetry, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTelemetry, SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelemetry(SemanticKernelTelemetry newTelemetry) {
		eDynamicSet(SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY, SemantickernelPackage.Literals.INVOCATION_CONTEXT__TELEMETRY, newTelemetry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvocationReturnMode getInvocationReturnModel() {
		return (InvocationReturnMode)eDynamicGet(SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL, SemantickernelPackage.Literals.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvocationReturnModel(InvocationReturnMode newInvocationReturnModel) {
		eDynamicSet(SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL, SemantickernelPackage.Literals.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL, newInvocationReturnModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.INVOCATION_CONTEXT__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS:
				return basicSetPromptExecutionSettings(null, msgs);
			case SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY:
				return basicSetTelemetry(null, msgs);
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
			case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION:
				return getDocumentation();
			case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP:
				return getContextHelp();
			case SemantickernelPackage.INVOCATION_CONTEXT__HOOKS:
				if (coreType) return getHooks();
				else return getHooks().map();
			case SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS:
				return getPromptExecutionSettings();
			case SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY:
				return getTelemetry();
			case SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL:
				return getInvocationReturnModel();
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
			case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__HOOKS:
				((EStructuralFeature.Setting)getHooks()).set(newValue);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS:
				setPromptExecutionSettings((PromptExecutionSettings)newValue);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY:
				setTelemetry((SemanticKernelTelemetry)newValue);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL:
				setInvocationReturnModel((InvocationReturnMode)newValue);
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
			case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__HOOKS:
				getHooks().clear();
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS:
				setPromptExecutionSettings((PromptExecutionSettings)null);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY:
				setTelemetry((SemanticKernelTelemetry)null);
				return;
			case SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL:
				setInvocationReturnModel(INVOCATION_RETURN_MODEL_EDEFAULT);
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
			case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case SemantickernelPackage.INVOCATION_CONTEXT__HOOKS:
				return !getHooks().isEmpty();
			case SemantickernelPackage.INVOCATION_CONTEXT__PROMPT_EXECUTION_SETTINGS:
				return getPromptExecutionSettings() != null;
			case SemantickernelPackage.INVOCATION_CONTEXT__TELEMETRY:
				return getTelemetry() != null;
			case SemantickernelPackage.INVOCATION_CONTEXT__INVOCATION_RETURN_MODEL:
				return getInvocationReturnModel() != INVOCATION_RETURN_MODEL_EDEFAULT;
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
				case SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return SemantickernelPackage.INVOCATION_CONTEXT__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return SemantickernelPackage.INVOCATION_CONTEXT__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InvocationContextImpl
