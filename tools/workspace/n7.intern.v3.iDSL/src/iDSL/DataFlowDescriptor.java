/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.DataFlowDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.DataFlowDescriptor#getStreamdescriptors <em>Streamdescriptors</em>}</li>
 *   <li>{@link iDSL.DataFlowDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.DataFlowDescriptor#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getDataFlowDescriptor()
 * @model
 * @generated
 */
public interface DataFlowDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getDataFlowDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.DataFlowDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.StreamDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streamdescriptors</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getDataFlowDescriptor_Streamdescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<StreamDescriptor> getStreamdescriptors();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iDSL.IDSLPackage#getDataFlowDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iDSL.DataFlowDescriptor#getDescription <em>Description</em>}' attribute.
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
	 * @see iDSL.IDSLPackage#getDataFlowDescriptor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainParameter> getParameters();

} // DataFlowDescriptor
