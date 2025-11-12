/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Kernel Telemetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.SemanticKernelTelemetry#getTracer <em>Tracer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getSemanticKernelTelemetry()
 * @model
 * @generated
 */
public interface SemanticKernelTelemetry extends EObject {
	/**
	 * Returns the value of the '<em><b>Tracer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracer</em>' attribute.
	 * @see #setTracer(String)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getSemanticKernelTelemetry_Tracer()
	 * @model
	 * @generated
	 */
	String getTracer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.SemanticKernelTelemetry#getTracer <em>Tracer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracer</em>' attribute.
	 * @see #getTracer()
	 * @generated
	 */
	void setTracer(String value);

} // SemanticKernelTelemetry
