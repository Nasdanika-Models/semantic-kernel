/**
 */
package org.nasdanika.models.semantickernel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Invocation Return Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semantickernel.SemantickernelPackage#getInvocationReturnMode()
 * @model
 * @generated
 */
public enum InvocationReturnMode implements Enumerator {
	/**
	 * The '<em><b>FULL HISTORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_HISTORY(0, "FULL_HISTORY", "FULL_HISTORY"),

	/**
	 * The '<em><b>NEW MESSAGES ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_MESSAGES_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_MESSAGES_ONLY(1, "NEW_MESSAGES_ONLY", "NEW_MESSAGES_ONLY"),

	/**
	 * The '<em><b>LAST MESSAGE ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_MESSAGE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_MESSAGE_ONLY(2, "LAST_MESSAGE_ONLY", "LAST_MESSAGE_ONLY");

	/**
	 * The '<em><b>FULL HISTORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_HISTORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULL_HISTORY_VALUE = 0;

	/**
	 * The '<em><b>NEW MESSAGES ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_MESSAGES_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_MESSAGES_ONLY_VALUE = 1;

	/**
	 * The '<em><b>LAST MESSAGE ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_MESSAGE_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_MESSAGE_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Invocation Return Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InvocationReturnMode[] VALUES_ARRAY =
		new InvocationReturnMode[] {
			FULL_HISTORY,
			NEW_MESSAGES_ONLY,
			LAST_MESSAGE_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Invocation Return Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InvocationReturnMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Invocation Return Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvocationReturnMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvocationReturnMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invocation Return Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvocationReturnMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvocationReturnMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invocation Return Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvocationReturnMode get(int value) {
		switch (value) {
			case FULL_HISTORY_VALUE: return FULL_HISTORY;
			case NEW_MESSAGES_ONLY_VALUE: return NEW_MESSAGES_ONLY;
			case LAST_MESSAGE_ONLY_VALUE: return LAST_MESSAGE_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InvocationReturnMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InvocationReturnMode
