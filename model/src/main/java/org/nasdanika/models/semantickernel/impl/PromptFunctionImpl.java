/**
 */
package org.nasdanika.models.semantickernel.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.semantickernel.PromptFunction;
import org.nasdanika.models.semantickernel.PromptTemplateConfig;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prompt Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl#getTemplateRef <em>Template Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.PromptFunctionImpl#getTemplateFormat <em>Template Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PromptFunctionImpl extends FunctionImpl implements PromptFunction {
	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEMA_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemplateRef() <em>Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemplateFormat() <em>Template Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_FORMAT_EDEFAULT = "semantic-kernel";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromptFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.PROMPT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSchema() {
		return (Integer)eDynamicGet(SemantickernelPackage.PROMPT_FUNCTION__SCHEMA, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__SCHEMA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(int newSchema) {
		eDynamicSet(SemantickernelPackage.PROMPT_FUNCTION__SCHEMA, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplate() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(String newTemplate) {
		eDynamicSet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateRef() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateRef(String newTemplateRef) {
		eDynamicSet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF, newTemplateRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateFormat() {
		return (String)eDynamicGet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateFormat(String newTemplateFormat) {
		eDynamicSet(SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT, SemantickernelPackage.Literals.PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT, newTemplateFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.PROMPT_FUNCTION__SCHEMA:
				return getSchema();
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE:
				return getTemplate();
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF:
				return getTemplateRef();
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT:
				return getTemplateFormat();
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
			case SemantickernelPackage.PROMPT_FUNCTION__SCHEMA:
				setSchema((Integer)newValue);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF:
				setTemplateRef((String)newValue);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT:
				setTemplateFormat((String)newValue);
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
			case SemantickernelPackage.PROMPT_FUNCTION__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF:
				setTemplateRef(TEMPLATE_REF_EDEFAULT);
				return;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT:
				setTemplateFormat(TEMPLATE_FORMAT_EDEFAULT);
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
			case SemantickernelPackage.PROMPT_FUNCTION__SCHEMA:
				return getSchema() != SCHEMA_EDEFAULT;
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? getTemplate() != null : !TEMPLATE_EDEFAULT.equals(getTemplate());
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF:
				return TEMPLATE_REF_EDEFAULT == null ? getTemplateRef() != null : !TEMPLATE_REF_EDEFAULT.equals(getTemplateRef());
			case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT:
				return TEMPLATE_FORMAT_EDEFAULT == null ? getTemplateFormat() != null : !TEMPLATE_FORMAT_EDEFAULT.equals(getTemplateFormat());
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
		if (baseClass == PromptTemplateConfig.class) {
			switch (derivedFeatureID) {
				case SemantickernelPackage.PROMPT_FUNCTION__SCHEMA: return SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__SCHEMA;
				case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE: return SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE;
				case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF: return SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF;
				case SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT: return SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT;
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
		if (baseClass == PromptTemplateConfig.class) {
			switch (baseFeatureID) {
				case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__SCHEMA: return SemantickernelPackage.PROMPT_FUNCTION__SCHEMA;
				case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE: return SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE;
				case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE_REF: return SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_REF;
				case SemantickernelPackage.PROMPT_TEMPLATE_CONFIG__TEMPLATE_FORMAT: return SemantickernelPackage.PROMPT_FUNCTION__TEMPLATE_FORMAT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PromptFunctionImpl
