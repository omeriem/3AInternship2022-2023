/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.StreamDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.StreamDescriptor#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link iDSL.StreamDescriptor#getType <em>Type</em>}</li>
 *   <li>{@link iDSL.StreamDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.StreamDescriptor#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getStreamDescriptor()
 * @model
 * @generated
 */
public interface StreamDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getStreamDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.StreamDescriptor#getName <em>Name</em>}' attribute.
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
	 * @see iDSL.IDSLPackage#getStreamDescriptor_SamplingRate()
	 * @model required="true"
	 * @generated
	 */
	int getSamplingRate();

	/**
	 * Sets the value of the '{@link iDSL.StreamDescriptor#getSamplingRate <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' attribute.
	 * @see #getSamplingRate()
	 * @generated
	 */
	void setSamplingRate(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iDSL.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iDSL.Type
	 * @see #setType(Type)
	 * @see iDSL.IDSLPackage#getStreamDescriptor_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link iDSL.StreamDescriptor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iDSL.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iDSL.IDSLPackage#getStreamDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iDSL.StreamDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DomainParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getStreamDescriptor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainParameter> getParameters();

} // StreamDescriptor
