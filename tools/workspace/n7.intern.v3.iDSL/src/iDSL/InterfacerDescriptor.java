/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfacer Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.InterfacerDescriptor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getInputdataflowdescriptors <em>Inputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getOutputdataflowdescriptors <em>Outputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getAnomynousinputdataflowdescriptors <em>Anomynousinputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.InterfacerDescriptor#getAnomynousoutputdataflowdescriptors <em>Anomynousoutputdataflowdescriptors</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getInterfacerDescriptor()
 * @model
 * @generated
 */
public interface InterfacerDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DomainParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.InterfacerDescriptor#getName <em>Name</em>}' attribute.
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
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iDSL.InterfacerDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inputdataflowdescriptors</b></em>' reference list.
	 * The list contents are of type {@link iDSL.DataFlowDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputdataflowdescriptors</em>' reference list.
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Inputdataflowdescriptors()
	 * @model required="true"
	 * @generated
	 */
	EList<DataFlowDescriptor> getInputdataflowdescriptors();

	/**
	 * Returns the value of the '<em><b>Outputdataflowdescriptors</b></em>' reference list.
	 * The list contents are of type {@link iDSL.DataFlowDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputdataflowdescriptors</em>' reference list.
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Outputdataflowdescriptors()
	 * @model
	 * @generated
	 */
	EList<DataFlowDescriptor> getOutputdataflowdescriptors();

	/**
	 * Returns the value of the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DataHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anomynousinputdataflowdescriptors</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Anomynousinputdataflowdescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataHolder> getAnomynousinputdataflowdescriptors();

	/**
	 * Returns the value of the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.DataHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anomynousoutputdataflowdescriptors</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getInterfacerDescriptor_Anomynousoutputdataflowdescriptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataHolder> getAnomynousoutputdataflowdescriptors();

} // InterfacerDescriptor
