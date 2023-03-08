/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.Setup#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getSetup()
 * @model
 * @generated
 */
public interface Setup extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see Domain.DomainPackage#getSetup_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Setup
