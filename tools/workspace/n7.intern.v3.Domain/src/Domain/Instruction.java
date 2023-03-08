/**
 */
package Domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.Instruction#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link Domain.Instruction#getLanguage <em>Language</em>}</li>
 *   <li>{@link Domain.Instruction#getImportID <em>Import ID</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see Domain.DomainPackage#getInstruction_FunctionName()
	 * @model required="true"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link Domain.Instruction#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link Domain.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #setLanguage(Language)
	 * @see Domain.DomainPackage#getInstruction_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link Domain.Instruction#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Import ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import ID</em>' attribute.
	 * @see #setImportID(String)
	 * @see Domain.DomainPackage#getInstruction_ImportID()
	 * @model required="true"
	 * @generated
	 */
	String getImportID();

	/**
	 * Sets the value of the '{@link Domain.Instruction#getImportID <em>Import ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import ID</em>' attribute.
	 * @see #getImportID()
	 * @generated
	 */
	void setImportID(String value);

} // Instruction
