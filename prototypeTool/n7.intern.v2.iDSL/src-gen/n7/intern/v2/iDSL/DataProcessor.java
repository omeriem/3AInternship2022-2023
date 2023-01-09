/**
 */
package n7.intern.v2.iDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link n7.intern.v2.iDSL.DataProcessor#getDataProviders <em>Data Providers</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.DataProcessor#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see n7.intern.v2.iDSL.IDSLPackage#getDataProcessor()
 * @model
 * @generated
 */
public interface DataProcessor extends Component {
	/**
	 * Returns the value of the '<em><b>Data Providers</b></em>' reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.DataProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Providers</em>' reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getDataProcessor_DataProviders()
	 * @model
	 * @generated
	 */
	EList<DataProvider> getDataProviders();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link n7.intern.v2.iDSL.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see n7.intern.v2.iDSL.IDSLPackage#getDataProcessor_Outputs()
	 * @model
	 * @generated
	 */
	EList<Output> getOutputs();

} // DataProcessor
