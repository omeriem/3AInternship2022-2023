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
 *   <li>{@link Domain.Setup#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getSetup()
 * @model
 * @generated
 */
public interface Setup extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.SetupBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see Domain.DomainPackage#getSetup_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetupBlock> getInstructions();

} // Setup
