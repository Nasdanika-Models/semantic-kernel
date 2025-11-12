/**
 */
package org.nasdanika.models.semantickernel.impl;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semantickernel.SemantickernelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Selection Biases Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.TokenSelectionBiasesEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenSelectionBiasesEntryImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<Integer,Integer> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTypedValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenSelectionBiasesEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.TOKEN_SELECTION_BIASES_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTypedKey() {
		return (Integer)eDynamicGet(SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY, SemantickernelPackage.Literals.TOKEN_SELECTION_BIASES_ENTRY__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(Integer newKey) {
		eDynamicSet(SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY, SemantickernelPackage.Literals.TOKEN_SELECTION_BIASES_ENTRY__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTypedValue() {
		return (Integer)eDynamicGet(SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE, SemantickernelPackage.Literals.TOKEN_SELECTION_BIASES_ENTRY__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(Integer newValue) {
		eDynamicSet(SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE, SemantickernelPackage.Literals.TOKEN_SELECTION_BIASES_ENTRY__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY:
				return getTypedKey();
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE:
				return getTypedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY:
				setTypedKey((Integer)newValue);
				return;
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE:
				setTypedValue((Integer)newValue);
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
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY:
				setTypedKey(KEY_EDEFAULT);
				return;
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE:
				setTypedValue(VALUE_EDEFAULT);
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
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__KEY:
				return KEY_EDEFAULT == null ? getTypedKey() != null : !KEY_EDEFAULT.equals(getTypedKey());
			case SemantickernelPackage.TOKEN_SELECTION_BIASES_ENTRY__VALUE:
				return VALUE_EDEFAULT == null ? getTypedValue() != null : !VALUE_EDEFAULT.equals(getTypedValue());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(Integer key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer setValue(Integer value) {
		Integer oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<Integer, Integer> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<Integer, Integer>)container.eGet(eContainmentFeature());
	}

} //TokenSelectionBiasesEntryImpl
