/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.semantickernel.OutputVariable;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.OutputVariableImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.OutputVariableImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.OutputVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputVariableImpl extends ModelElementImpl implements OutputVariable {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.OUTPUT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(SemantickernelPackage.OUTPUT_VARIABLE__TYPE, SemantickernelPackage.Literals.OUTPUT_VARIABLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(SemantickernelPackage.OUTPUT_VARIABLE__TYPE, SemantickernelPackage.Literals.OUTPUT_VARIABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
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
			case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION:
				return getDocumentation();
			case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP:
				return getContextHelp();
			case SemantickernelPackage.OUTPUT_VARIABLE__TYPE:
				return getType();
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
			case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.OUTPUT_VARIABLE__TYPE:
				setType((String)newValue);
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
			case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case SemantickernelPackage.OUTPUT_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case SemantickernelPackage.OUTPUT_VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
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
				case SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return SemantickernelPackage.OUTPUT_VARIABLE__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return SemantickernelPackage.OUTPUT_VARIABLE__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OutputVariableImpl
