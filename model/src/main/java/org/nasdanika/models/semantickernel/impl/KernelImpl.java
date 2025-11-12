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

import org.nasdanika.models.semantickernel.AIService;
import org.nasdanika.models.semantickernel.AIServiceSelector;
import org.nasdanika.models.semantickernel.Hook;
import org.nasdanika.models.semantickernel.Kernel;
import org.nasdanika.models.semantickernel.Plugin;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kernel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getAiServiceSelector <em>Ai Service Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.KernelImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KernelImpl extends ModelElementImpl implements Kernel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KernelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.KERNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.KERNEL__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.KERNEL__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Hook> getHooks() {
		return (EMap<String, Hook>)eDynamicGet(SemantickernelPackage.KERNEL__HOOKS, SemantickernelPackage.Literals.KERNEL__HOOKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Plugin> getPlugins() {
		return (EList<Plugin>)eDynamicGet(SemantickernelPackage.KERNEL__PLUGINS, SemantickernelPackage.Literals.KERNEL__PLUGINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AIServiceSelector getAiServiceSelector() {
		return (AIServiceSelector)eDynamicGet(SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR, SemantickernelPackage.Literals.KERNEL__AI_SERVICE_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAiServiceSelector(AIServiceSelector newAiServiceSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAiServiceSelector, SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAiServiceSelector(AIServiceSelector newAiServiceSelector) {
		eDynamicSet(SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR, SemantickernelPackage.Literals.KERNEL__AI_SERVICE_SELECTOR, newAiServiceSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AIService> getServices() {
		return (EList<AIService>)eDynamicGet(SemantickernelPackage.KERNEL__SERVICES, SemantickernelPackage.Literals.KERNEL__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.KERNEL__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.KERNEL__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.KERNEL__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.KERNEL__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR:
				return basicSetAiServiceSelector(null, msgs);
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
			case SemantickernelPackage.KERNEL__DOCUMENTATION:
				return getDocumentation();
			case SemantickernelPackage.KERNEL__CONTEXT_HELP:
				return getContextHelp();
			case SemantickernelPackage.KERNEL__HOOKS:
				if (coreType) return getHooks();
				else return getHooks().map();
			case SemantickernelPackage.KERNEL__PLUGINS:
				return getPlugins();
			case SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR:
				return getAiServiceSelector();
			case SemantickernelPackage.KERNEL__SERVICES:
				return getServices();
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
			case SemantickernelPackage.KERNEL__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.KERNEL__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.KERNEL__HOOKS:
				((EStructuralFeature.Setting)getHooks()).set(newValue);
				return;
			case SemantickernelPackage.KERNEL__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends Plugin>)newValue);
				return;
			case SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR:
				setAiServiceSelector((AIServiceSelector)newValue);
				return;
			case SemantickernelPackage.KERNEL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends AIService>)newValue);
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
			case SemantickernelPackage.KERNEL__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SemantickernelPackage.KERNEL__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case SemantickernelPackage.KERNEL__HOOKS:
				getHooks().clear();
				return;
			case SemantickernelPackage.KERNEL__PLUGINS:
				getPlugins().clear();
				return;
			case SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR:
				setAiServiceSelector((AIServiceSelector)null);
				return;
			case SemantickernelPackage.KERNEL__SERVICES:
				getServices().clear();
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
			case SemantickernelPackage.KERNEL__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SemantickernelPackage.KERNEL__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case SemantickernelPackage.KERNEL__HOOKS:
				return !getHooks().isEmpty();
			case SemantickernelPackage.KERNEL__PLUGINS:
				return !getPlugins().isEmpty();
			case SemantickernelPackage.KERNEL__AI_SERVICE_SELECTOR:
				return getAiServiceSelector() != null;
			case SemantickernelPackage.KERNEL__SERVICES:
				return !getServices().isEmpty();
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
				case SemantickernelPackage.KERNEL__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case SemantickernelPackage.KERNEL__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return SemantickernelPackage.KERNEL__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return SemantickernelPackage.KERNEL__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //KernelImpl
