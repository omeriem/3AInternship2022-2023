/**
 */
package n7.intern.v2.iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TFramework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link n7.intern.v2.iDSL.IoTFramework#getComponents <em>Components</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.IoTFramework#getName <em>Name</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.IoTFramework#getDescription <em>Description</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.IoTFramework#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see n7.intern.v2.iDSL.IDSLPackage#getIoTFramework()
 * @model
 * @generated
 */
public interface IoTFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getIoTFramework_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see n7.intern.v2.iDSL.IDSLPackage#getIoTFramework_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link n7.intern.v2.iDSL.IoTFramework#getName <em>Name</em>}' attribute.
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
	 * @see n7.intern.v2.iDSL.IDSLPackage#getIoTFramework_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link n7.intern.v2.iDSL.IoTFramework#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getIoTFramework_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

} // IoTFramework
