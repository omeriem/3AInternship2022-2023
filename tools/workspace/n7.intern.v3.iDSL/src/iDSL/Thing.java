/**
 */
package iDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDSL.Thing#getConnexions <em>Connexions</em>}</li>
 * </ul>
 *
 * @see iDSL.IDSLPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends DataFlowDescriptor {
	/**
	 * Returns the value of the '<em><b>Connexions</b></em>' containment reference list.
	 * The list contents are of type {@link iDSL.Connexion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connexions</em>' containment reference list.
	 * @see iDSL.IDSLPackage#getThing_Connexions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connexion> getConnexions();

} // Thing
