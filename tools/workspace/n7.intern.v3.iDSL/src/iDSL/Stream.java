/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.Stream#getStreamdescriptors <em>Streamdescriptors</em>}</li>
 *   <li>{@link iDSL.Stream#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends EObject {
	/**
	 * Returns the value of the '<em><b>Streamdescriptors</b></em>' reference list.
	 * The list contents are of type {@link iDSL.StreamDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streamdescriptors</em>' reference list.
	 * @see iDSL.IDSLPackage#getStream_Streamdescriptors()
	 * @model
	 * @generated
	 */
	EList<StreamDescriptor> getStreamdescriptors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getStream_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.Stream#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Stream
