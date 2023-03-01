/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.Function#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.Function#getFunctionimport <em>Functionimport</em>}</li>
 *   <li>{@link iDSL.Function#getFunctionoutputs <em>Functionoutputs</em>}</li>
 *   <li>{@link iDSL.Function#getFunctionparameters <em>Functionparameters</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDSL.IDSLPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDSL.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functionimport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionimport</em>' containment reference.
	 * @see #setFunctionimport(FunctionPrefix)
	 * @see iDSL.IDSLPackage#getFunction_Functionimport()
	 * @model containment="true"
	 * @generated
	 */
	FunctionPrefix getFunctionimport();

	/**
	 * Sets the value of the '{@link iDSL.Function#getFunctionimport <em>Functionimport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionimport</em>' containment reference.
	 * @see #getFunctionimport()
	 * @generated
	 */
	void setFunctionimport(FunctionPrefix value);

	/**
	 * Returns the value of the '<em><b>Functionoutputs</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionoutputs</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getFunction_Functionoutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getFunctionoutputs();

	/**
	 * Returns the value of the '<em><b>Functionparameters</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionparameters</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getFunction_Functionparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getFunctionparameters();

} // Function
