/**
 */
package org.nasdanika.models.semantickernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.semantickernel.ScriptedFunction;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl#getEngineNames <em>Engine Names</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl#getEngineMimeTypes <em>Engine Mime Types</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl#getEngineExtensions <em>Engine Extensions</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.ScriptedFunctionImpl#getScriptRef <em>Script Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptedFunctionImpl extends FunctionImpl implements ScriptedFunction {
	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScriptRef() <em>Script Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_REF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.SCRIPTED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEngineNames() {
		return (EList<String>)eDynamicGet(SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_NAMES, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__ENGINE_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEngineMimeTypes() {
		return (EList<String>)eDynamicGet(SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEngineExtensions() {
		return (EList<String>)eDynamicGet(SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScript() {
		return (String)eDynamicGet(SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__SCRIPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(String newScript) {
		eDynamicSet(SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptRef() {
		return (String)eDynamicGet(SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__SCRIPT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptRef(String newScriptRef) {
		eDynamicSet(SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF, SemantickernelPackage.Literals.SCRIPTED_FUNCTION__SCRIPT_REF, newScriptRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_NAMES:
				return getEngineNames();
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES:
				return getEngineMimeTypes();
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS:
				return getEngineExtensions();
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT:
				return getScript();
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF:
				return getScriptRef();
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
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_NAMES:
				getEngineNames().clear();
				getEngineNames().addAll((Collection<? extends String>)newValue);
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES:
				getEngineMimeTypes().clear();
				getEngineMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS:
				getEngineExtensions().clear();
				getEngineExtensions().addAll((Collection<? extends String>)newValue);
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT:
				setScript((String)newValue);
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF:
				setScriptRef((String)newValue);
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
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_NAMES:
				getEngineNames().clear();
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES:
				getEngineMimeTypes().clear();
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS:
				getEngineExtensions().clear();
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF:
				setScriptRef(SCRIPT_REF_EDEFAULT);
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
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_NAMES:
				return !getEngineNames().isEmpty();
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_MIME_TYPES:
				return !getEngineMimeTypes().isEmpty();
			case SemantickernelPackage.SCRIPTED_FUNCTION__ENGINE_EXTENSIONS:
				return !getEngineExtensions().isEmpty();
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT:
				return SCRIPT_EDEFAULT == null ? getScript() != null : !SCRIPT_EDEFAULT.equals(getScript());
			case SemantickernelPackage.SCRIPTED_FUNCTION__SCRIPT_REF:
				return SCRIPT_REF_EDEFAULT == null ? getScriptRef() != null : !SCRIPT_REF_EDEFAULT.equals(getScriptRef());
		}
		return super.eIsSet(featureID);
	}

} //ScriptedFunctionImpl
