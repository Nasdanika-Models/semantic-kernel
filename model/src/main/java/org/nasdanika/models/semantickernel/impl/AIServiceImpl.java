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
import org.nasdanika.models.semantickernel.AIService;
import org.nasdanika.models.semantickernel.SemantickernelPackage;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.AIServiceImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIServiceImpl extends ModelElementImpl implements AIService {
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
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.AI_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.AI_SERVICE__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(SemantickernelPackage.AI_SERVICE__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(SemantickernelPackage.AI_SERVICE__MODEL, SemantickernelPackage.Literals.AI_SERVICE__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(SemantickernelPackage.AI_SERVICE__MODEL, SemantickernelPackage.Literals.AI_SERVICE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService() {
		return (String)eDynamicGet(SemantickernelPackage.AI_SERVICE__SERVICE, SemantickernelPackage.Literals.AI_SERVICE__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(String newService) {
		eDynamicSet(SemantickernelPackage.AI_SERVICE__SERVICE, SemantickernelPackage.Literals.AI_SERVICE__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemantickernelPackage.AI_SERVICE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP:
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
			case SemantickernelPackage.AI_SERVICE__DOCUMENTATION:
				return getDocumentation();
			case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP:
				return getContextHelp();
			case SemantickernelPackage.AI_SERVICE__MODEL:
				return getModel();
			case SemantickernelPackage.AI_SERVICE__SERVICE:
				return getService();
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
			case SemantickernelPackage.AI_SERVICE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case SemantickernelPackage.AI_SERVICE__MODEL:
				setModel((String)newValue);
				return;
			case SemantickernelPackage.AI_SERVICE__SERVICE:
				setService((String)newValue);
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
			case SemantickernelPackage.AI_SERVICE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case SemantickernelPackage.AI_SERVICE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case SemantickernelPackage.AI_SERVICE__SERVICE:
				setService(SERVICE_EDEFAULT);
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
			case SemantickernelPackage.AI_SERVICE__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case SemantickernelPackage.AI_SERVICE__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
			case SemantickernelPackage.AI_SERVICE__SERVICE:
				return SERVICE_EDEFAULT == null ? getService() != null : !SERVICE_EDEFAULT.equals(getService());
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
				case SemantickernelPackage.AI_SERVICE__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case SemantickernelPackage.AI_SERVICE__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return SemantickernelPackage.AI_SERVICE__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return SemantickernelPackage.AI_SERVICE__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AIServiceImpl
