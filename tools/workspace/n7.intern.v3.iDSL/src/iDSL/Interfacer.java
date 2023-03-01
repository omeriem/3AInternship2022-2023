/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfacer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.Interfacer#getInputs <em>Inputs</em>}</li>
 *   <li>{@link iDSL.Interfacer#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link iDSL.Interfacer#getInterfacerdescriptor <em>Interfacerdescriptor</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getInterfacer()
 * @model
 * @generated
 */
public interface Interfacer extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link iDSL.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see iDSL.IDSLPackage#getInterfacer_Inputs()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link iDSL.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see iDSL.IDSLPackage#getInterfacer_Outputs()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getOutputs();

	/**
	 * Returns the value of the '<em><b>Interfacerdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacerdescriptor</em>' reference.
	 * @see #setInterfacerdescriptor(InterfacerDescriptor)
	 * @see iDSL.IDSLPackage#getInterfacer_Interfacerdescriptor()
	 * @model
	 * @generated
	 */
	InterfacerDescriptor getInterfacerdescriptor();

	/**
	 * Sets the value of the '{@link iDSL.Interfacer#getInterfacerdescriptor <em>Interfacerdescriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfacerdescriptor</em>' reference.
	 * @see #getInterfacerdescriptor()
	 * @generated
	 */
	void setInterfacerdescriptor(InterfacerDescriptor value);

} // Interfacer
