/**
 */
package org.nasdanika.models.semantickernel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kernel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semantickernel.Kernel#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.Kernel#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.Kernel#getAiServiceSelector <em>Ai Service Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.semantickernel.Kernel#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getKernel()
 * @model
 * @generated
 */
public interface Kernel extends ModelElement, Documented {
	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.models.semantickernel.Hook},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' map.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getKernel_Hooks()
	 * @model mapType="org.nasdanika.models.semantickernel.HookEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.semantickernel.Hook&gt;"
	 * @generated
	 */
	EMap<String, Hook> getHooks();

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semantickernel.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getKernel_Plugins()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Plugin> getPlugins();

	/**
	 * Returns the value of the '<em><b>Ai Service Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai Service Selector</em>' containment reference.
	 * @see #setAiServiceSelector(AIServiceSelector)
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getKernel_AiServiceSelector()
	 * @model containment="true"
	 * @generated
	 */
	AIServiceSelector getAiServiceSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semantickernel.Kernel#getAiServiceSelector <em>Ai Service Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai Service Selector</em>' containment reference.
	 * @see #getAiServiceSelector()
	 * @generated
	 */
	void setAiServiceSelector(AIServiceSelector value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.semantickernel.AIService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getKernel_Services()
	 * @model
	 * @generated
	 */
	EList<AIService> getServices();

} // Kernel
