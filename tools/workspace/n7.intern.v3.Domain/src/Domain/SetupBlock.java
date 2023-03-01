/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.SetupBlock#getLanguage <em>Language</em>}</li>
 *   <li>{@link Domain.SetupBlock#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getSetupBlock()
 * @model
 * @generated
 */
public interface SetupBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link Domain.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #setLanguage(Language)
	 * @see Domain.DomainPackage#getSetupBlock_Language()
	 * @model required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link Domain.SetupBlock#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see Domain.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.StringInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see Domain.DomainPackage#getSetupBlock_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringInstruction> getInstructions();

} // SetupBlock
