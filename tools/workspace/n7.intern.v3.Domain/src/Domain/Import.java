/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.Import#getLanguage <em>Language</em>}</li>
 *   <li>{@link Domain.Import#getReferences <em>References</em>}</li>
 *   <li>{@link Domain.Import#getImportID <em>Import ID</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link Domain.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #setLanguage(Language)
	 * @see Domain.DomainPackage#getImport_Language()
	 * @model required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link Domain.Import#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see Domain.DomainPackage#getImport_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Import ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import ID</em>' attribute.
	 * @see #setImportID(String)
	 * @see Domain.DomainPackage#getImport_ImportID()
	 * @model required="true"
	 * @generated
	 */
	String getImportID();

	/**
	 * Sets the value of the '{@link Domain.Import#getImportID <em>Import ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import ID</em>' attribute.
	 * @see #getImportID()
	 * @generated
	 */
	void setImportID(String value);

} // Import
