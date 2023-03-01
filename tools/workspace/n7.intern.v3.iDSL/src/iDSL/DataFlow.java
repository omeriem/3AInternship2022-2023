/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.DataFlow#getStreams <em>Streams</em>}</li>
 *   <li>{@link iDSL.DataFlow#getDataflowdescriptor <em>Dataflowdescriptor</em>}</li>
 *   <li>{@link iDSL.DataFlow#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Streams</b></em>' reference list.
	 * The list contents are of type {@link iDSL.Stream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streams</em>' reference list.
	 * @see iDSL.IDSLPackage#getDataFlow_Streams()
	 * @model
	 * @generated
	 */
	EList<Stream> getStreams();

	/**
	 * Returns the value of the '<em><b>Dataflowdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflowdescriptor</em>' reference.
	 * @see #setDataflowdescriptor(DataFlowDescriptor)
	 * @see iDSL.IDSLPackage#getDataFlow_Dataflowdescriptor()
	 * @model
	 * @generated
	 */
	DataFlowDescriptor getDataflowdescriptor();

	/**
	 * Sets the value of the '{@link iDSL.DataFlow#getDataflowdescriptor <em>Dataflowdescriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataflowdescriptor</em>' reference.
	 * @see #getDataflowdescriptor()
	 * @generated
	 */
	void setDataflowdescriptor(DataFlowDescriptor value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getDataFlow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.DataFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataFlow
