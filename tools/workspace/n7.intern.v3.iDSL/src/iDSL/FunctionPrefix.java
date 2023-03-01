/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.FunctionPrefix#getImportnames <em>Importnames</em>}</li>
 *   <li>{@link iDSL.FunctionPrefix#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getFunctionPrefix()
 * @model
 * @generated
 */
public interface FunctionPrefix extends EObject {
	/**
	 * Returns the value of the '<em><b>Importnames</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importnames</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getFunctionPrefix_Importnames()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getImportnames();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see iDSL.IDSLPackage#getFunctionPrefix_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link iDSL.FunctionPrefix#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // FunctionPrefix
