/**
 */
package org.nasdanika.models.semantickernel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.nasdanika.models.semantickernel.JsonSchemaResponseFormat;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Schema Response Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl#getJsonSchema <em>Json Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl#getJsonSchemaRef <em>Json Schema Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.JsonSchemaResponseFormatImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonSchemaResponseFormatImpl extends ResponseFormatImpl implements JsonSchemaResponseFormat {
	/**
	 * The default value of the '{@link #getJsonSchema() <em>Json Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_SCHEMA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJsonSchemaRef() <em>Json Schema Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonSchemaRef()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_SCHEMA_REF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonSchemaResponseFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonSchema() {
		return (String)eDynamicGet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonSchema(String newJsonSchema) {
		eDynamicSet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA, newJsonSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonSchemaRef() {
		return (String)eDynamicGet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonSchemaRef(String newJsonSchemaRef) {
		eDynamicSet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF, newJsonSchemaRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getType() {
		return (EClassifier)eDynamicGet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetType() {
		return (EClassifier)eDynamicGet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EClassifier newType) {
		eDynamicSet(SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, SemantickernelPackage.Literals.JSON_SCHEMA_RESPONSE_FORMAT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA:
				return getJsonSchema();
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF:
				return getJsonSchemaRef();
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA:
				setJsonSchema((String)newValue);
				return;
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF:
				setJsonSchemaRef((String)newValue);
				return;
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE:
				setType((EClassifier)newValue);
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
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA:
				setJsonSchema(JSON_SCHEMA_EDEFAULT);
				return;
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF:
				setJsonSchemaRef(JSON_SCHEMA_REF_EDEFAULT);
				return;
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE:
				setType((EClassifier)null);
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
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA:
				return JSON_SCHEMA_EDEFAULT == null ? getJsonSchema() != null : !JSON_SCHEMA_EDEFAULT.equals(getJsonSchema());
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__JSON_SCHEMA_REF:
				return JSON_SCHEMA_REF_EDEFAULT == null ? getJsonSchemaRef() != null : !JSON_SCHEMA_REF_EDEFAULT.equals(getJsonSchemaRef());
			case SemantickernelPackage.JSON_SCHEMA_RESPONSE_FORMAT__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //JsonSchemaResponseFormatImpl
