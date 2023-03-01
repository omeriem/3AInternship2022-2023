/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iot Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.IotFramework#getInterfacers <em>Interfacers</em>}</li>
 *   <li>{@link iDSL.IotFramework#getDataflows <em>Dataflows</em>}</li>
 *   <li>{@link iDSL.IotFramework#getDataflowdescriptors <em>Dataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.IotFramework#getInterfacerdescriptors <em>Interfacerdescriptors</em>}</li>
 *   <li>{@link iDSL.IotFramework#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.IotFramework#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getIotFramework()
 * @model
 * @generated
 */
public interface IotFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfacers</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.Interfacer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacers</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getIotFramework_Interfacers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interfacer> getInterfacers();

	/**
	 * Returns the value of the '<em><b>Dataflows</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflows</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getIotFramework_Dataflows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataFlow> getDataflows();

	/**
	 * Returns the value of the '<em><b>Dataflowdescriptors</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DataFlowDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflowdescriptors</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getIotFramework_Dataflowdescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlowDescriptor> getDataflowdescriptors();

	/**
	 * Returns the value of the '<em><b>Interfacerdescriptors</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.InterfacerDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacerdescriptors</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getIotFramework_Interfacerdescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfacerDescriptor> getInterfacerdescriptors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getIotFramework_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.IotFramework#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iDSL.IDSLPackage#getIotFramework_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iDSL.IotFramework#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // IotFramework
