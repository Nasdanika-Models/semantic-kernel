/**
 */
package org.nasdanika.models.semantickernel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semantickernel.SemanticKernelTelemetry;
import org.nasdanika.models.semantickernel.SemantickernelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Kernel Telemetry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.impl.SemanticKernelTelemetryImpl#getTracer <em>Tracer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticKernelTelemetryImpl extends MinimalEObjectImpl.Container implements SemanticKernelTelemetry {
	/**
	 * The default value of the '{@link #getTracer() <em>Tracer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracer()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticKernelTelemetryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemantickernelPackage.Literals.SEMANTIC_KERNEL_TELEMETRY;
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
	@Override
	public String getTracer() {
		return (String)eDynamicGet(SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER, SemantickernelPackage.Literals.SEMANTIC_KERNEL_TELEMETRY__TRACER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTracer(String newTracer) {
		eDynamicSet(SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER, SemantickernelPackage.Literals.SEMANTIC_KERNEL_TELEMETRY__TRACER, newTracer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER:
				return getTracer();
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
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER:
				setTracer((String)newValue);
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
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER:
				setTracer(TRACER_EDEFAULT);
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
			case SemantickernelPackage.SEMANTIC_KERNEL_TELEMETRY__TRACER:
				return TRACER_EDEFAULT == null ? getTracer() != null : !TRACER_EDEFAULT.equals(getTracer());
		}
		return super.eIsSet(featureID);
	}

} //SemanticKernelTelemetryImpl
