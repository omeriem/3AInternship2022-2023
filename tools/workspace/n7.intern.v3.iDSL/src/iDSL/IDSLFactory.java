/**
 */
package iDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iDSL.IDSLPackage
 * @generated
 */
public interface IDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDSLFactory eINSTANCE = iDSL.impl.IDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iot Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot Framework</em>'.
	 * @generated
	 */
	IotFramework createIotFramework();

	/**
	 * Returns a new object of class '<em>Data Flow Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Descriptor</em>'.
	 * @generated
	 */
	DataFlowDescriptor createDataFlowDescriptor();

	/**
	 * Returns a new object of class '<em>Stream Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Descriptor</em>'.
	 * @generated
	 */
	StreamDescriptor createStreamDescriptor();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center</em>'.
	 * @generated
	 */
	DataCenter createDataCenter();

	/**
	 * Returns a new object of class '<em>Connexion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connexion</em>'.
	 * @generated
	 */
	Connexion createConnexion();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Data Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Holder</em>'.
	 * @generated
	 */
	DataHolder createDataHolder();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream</em>'.
	 * @generated
	 */
	Stream createStream();

	/**
	 * Returns a new object of class '<em>Interfacer Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfacer Descriptor</em>'.
	 * @generated
	 */
	InterfacerDescriptor createInterfacerDescriptor();

	/**
	 * Returns a new object of class '<em>Synchronizer Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronizer Descriptor</em>'.
	 * @generated
	 */
	SynchronizerDescriptor createSynchronizerDescriptor();

	/**
	 * Returns a new object of class '<em>Pre Processor Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Processor Descriptor</em>'.
	 * @generated
	 */
	PreProcessorDescriptor createPreProcessorDescriptor();

	/**
	 * Returns a new object of class '<em>Data Processor Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processor Descriptor</em>'.
	 * @generated
	 */
	DataProcessorDescriptor createDataProcessorDescriptor();

	/**
	 * Returns a new object of class '<em>Interfacer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfacer</em>'.
	 * @generated
	 */
	Interfacer createInterfacer();

	/**
	 * Returns a new object of class '<em>Pre Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Processor</em>'.
	 * @generated
	 */
	PreProcessor createPreProcessor();

	/**
	 * Returns a new object of class '<em>Data Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processor</em>'.
	 * @generated
	 */
	DataProcessor createDataProcessor();

	/**
	 * Returns a new object of class '<em>Synchronizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronizer</em>'.
	 * @generated
	 */
	Synchronizer createSynchronizer();

	/**
	 * Returns a new object of class '<em>Domain Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Parameter</em>'.
	 * @generated
	 */
	DomainParameter createDomainParameter();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IDSLPackage getIDSLPackage();

} //IDSLFactory
