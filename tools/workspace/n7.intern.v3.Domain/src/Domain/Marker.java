/**
 */
package Domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.Marker#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getMarker()
 * @model
 * @generated
 */
public interface Marker extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link Domain.MarkerID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Domain.MarkerID
	 * @see #setName(MarkerID)
	 * @see Domain.DomainPackage#getMarker_Name()
	 * @model required="true"
	 * @generated
	 */
	MarkerID getName();

	/**
	 * Sets the value of the '{@link Domain.Marker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see Domain.MarkerID
	 * @see #getName()
	 * @generated
	 */
	void setName(MarkerID value);

} // Marker
