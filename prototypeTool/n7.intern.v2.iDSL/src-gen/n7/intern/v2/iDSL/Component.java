/**
 */
package n7.intern.v2.iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link n7.intern.v2.iDSL.Component#getName <em>Name</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.Component#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.Component#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see n7.intern.v2.iDSL.IDSLPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see n7.intern.v2.iDSL.IDSLPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link n7.intern.v2.iDSL.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Rate</em>' attribute.
	 * @see #setSamplingRate(int)
	 * @see n7.intern.v2.iDSL.IDSLPackage#getComponent_SamplingRate()
	 * @model
	 * @generated
	 */
	int getSamplingRate();

	/**
	 * Sets the value of the '{@link n7.intern.v2.iDSL.Component#getSamplingRate <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' attribute.
	 * @see #getSamplingRate()
	 * @generated
	 */
	void setSamplingRate(int value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getComponent_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // Component
