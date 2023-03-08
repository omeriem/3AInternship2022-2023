/**
 */
package Domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.FunctionMarker#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getFunctionMarker()
 * @model
 * @generated
 */
public interface FunctionMarker extends Marker {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(FunctionBlock)
	 * @see Domain.DomainPackage#getFunctionMarker_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBlock getBlock();

	/**
	 * Sets the value of the '{@link Domain.FunctionMarker#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(FunctionBlock value);

} // FunctionMarker
