/**
 */
package n7.intern.v2.iDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link n7.intern.v2.iDSL.DataProvider#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see n7.intern.v2.iDSL.IDSLPackage#getDataProvider()
 * @model
 * @generated
 */
public interface DataProvider extends Component {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getDataProvider_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // DataProvider
