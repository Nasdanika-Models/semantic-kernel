/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.semantickernel.InputVariable;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.InputVariableImpl#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputVariableImpl extends DocumentedNamedElementImpl implements InputVariable {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.INPUT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(SemantickernelPackage.INPUT_VARIABLE__TYPE, SemantickernelPackage.Literals.INPUT_VARIABLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(SemantickernelPackage.INPUT_VARIABLE__TYPE, SemantickernelPackage.Literals.INPUT_VARIABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return (String)eDynamicGet(SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE, SemantickernelPackage.Literals.INPUT_VARIABLE__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		eDynamicSet(SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE, SemantickernelPackage.Literals.INPUT_VARIABLE__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return (Boolean)eDynamicGet(SemantickernelPackage.INPUT_VARIABLE__REQUIRED, SemantickernelPackage.Literals.INPUT_VARIABLE__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		eDynamicSet(SemantickernelPackage.INPUT_VARIABLE__REQUIRED, SemantickernelPackage.Literals.INPUT_VARIABLE__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEnumValues() {
		return (EList<String>)eDynamicGet(SemantickernelPackage.INPUT_VARIABLE__ENUM_VALUES, SemantickernelPackage.Literals.INPUT_VARIABLE__ENUM_VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.INPUT_VARIABLE__TYPE:
				return getType();
			case SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE:
				return getDefaultValue();
			case SemantickernelPackage.INPUT_VARIABLE__REQUIRED:
				return isRequired();
			case SemantickernelPackage.INPUT_VARIABLE__ENUM_VALUES:
				return getEnumValues();
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
			case SemantickernelPackage.INPUT_VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__ENUM_VALUES:
				getEnumValues().clear();
				getEnumValues().addAll((Collection<? extends String>)newValue);
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
			case SemantickernelPackage.INPUT_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case SemantickernelPackage.INPUT_VARIABLE__ENUM_VALUES:
				getEnumValues().clear();
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
			case SemantickernelPackage.INPUT_VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case SemantickernelPackage.INPUT_VARIABLE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case SemantickernelPackage.INPUT_VARIABLE__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case SemantickernelPackage.INPUT_VARIABLE__ENUM_VALUES:
				return !getEnumValues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputVariableImpl
