/**
 */
package iDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iDSL.IDSLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface IDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDSLPackage eINSTANCE = iDSL.impl.IDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link iDSL.impl.IotFrameworkImpl <em>Iot Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.IotFrameworkImpl
	 * @see iDSL.impl.IDSLPackageImpl#getIotFramework()
	 * @generated
	 */
	int IOT_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Interfacers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__INTERFACERS = 0;

	/**
	 * The feature id for the '<em><b>Dataflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__DATAFLOWS = 1;

	/**
	 * The feature id for the '<em><b>Dataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__DATAFLOWDESCRIPTORS = 2;

	/**
	 * The feature id for the '<em><b>Interfacerdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__INTERFACERDESCRIPTORS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Iot Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Iot Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataFlowDescriptorImpl <em>Data Flow Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataFlowDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataFlowDescriptor()
	 * @generated
	 */
	int DATA_FLOW_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR__PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Data Flow Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Flow Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.StreamDescriptorImpl <em>Stream Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.StreamDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getStreamDescriptor()
	 * @generated
	 */
	int STREAM_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR__SAMPLING_RATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR__PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>Stream Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stream Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.ParameterImpl
	 * @see iDSL.impl.IDSLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 19;

	/**
	 * The meta object id for the '{@link iDSL.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.ThingImpl
	 * @see iDSL.impl.IDSLPackageImpl#getThing()
	 * @generated
	 */
	int THING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = DATA_FLOW_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__STREAMDESCRIPTORS = DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = DATA_FLOW_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PARAMETERS = DATA_FLOW_DESCRIPTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Connexions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CONNEXIONS = DATA_FLOW_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = DATA_FLOW_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = DATA_FLOW_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataCenterImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NAME = DATA_FLOW_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__STREAMDESCRIPTORS = DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__DESCRIPTION = DATA_FLOW_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__PARAMETERS = DATA_FLOW_DESCRIPTOR__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = DATA_FLOW_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = DATA_FLOW_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.ConnexionImpl <em>Connexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.ConnexionImpl
	 * @see iDSL.impl.IDSLPackageImpl#getConnexion()
	 * @generated
	 */
	int CONNEXION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.OutputImpl
	 * @see iDSL.impl.IDSLPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = DATA_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__STREAMDESCRIPTORS = DATA_CENTER__STREAMDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = DATA_CENTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PARAMETERS = DATA_CENTER__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = DATA_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = DATA_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataHolderImpl <em>Data Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataHolderImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataHolder()
	 * @generated
	 */
	int DATA_HOLDER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER__NAME = DATA_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER__STREAMDESCRIPTORS = DATA_CENTER__STREAMDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER__DESCRIPTION = DATA_CENTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER__PARAMETERS = DATA_CENTER__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Data Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER_FEATURE_COUNT = DATA_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HOLDER_OPERATION_COUNT = DATA_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataFlowImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__STREAMS = 0;

	/**
	 * The feature id for the '<em><b>Dataflowdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DATAFLOWDESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = 2;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.StreamImpl
	 * @see iDSL.impl.IDSLPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 9;

	/**
	 * The feature id for the '<em><b>Streamdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__STREAMDESCRIPTORS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.InterfacerDescriptorImpl <em>Interfacer Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.InterfacerDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getInterfacerDescriptor()
	 * @generated
	 */
	int INTERFACER_DESCRIPTOR = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Inputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS = 3;

	/**
	 * The feature id for the '<em><b>Outputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS = 4;

	/**
	 * The feature id for the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS = 5;

	/**
	 * The feature id for the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS = 6;

	/**
	 * The number of structural features of the '<em>Interfacer Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Interfacer Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.SynchronizerDescriptorImpl <em>Synchronizer Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.SynchronizerDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getSynchronizerDescriptor()
	 * @generated
	 */
	int SYNCHRONIZER_DESCRIPTOR = 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__PARAMETERS = INTERFACER_DESCRIPTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__NAME = INTERFACER_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__DESCRIPTION = INTERFACER_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Outputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The number of structural features of the '<em>Synchronizer Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR_FEATURE_COUNT = INTERFACER_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronizer Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_DESCRIPTOR_OPERATION_COUNT = INTERFACER_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.PreProcessorDescriptorImpl <em>Pre Processor Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.PreProcessorDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getPreProcessorDescriptor()
	 * @generated
	 */
	int PRE_PROCESSOR_DESCRIPTOR = 12;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__PARAMETERS = INTERFACER_DESCRIPTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__NAME = INTERFACER_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__DESCRIPTION = INTERFACER_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Outputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The number of structural features of the '<em>Pre Processor Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR_FEATURE_COUNT = INTERFACER_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Processor Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_DESCRIPTOR_OPERATION_COUNT = INTERFACER_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataProcessorDescriptorImpl <em>Data Processor Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataProcessorDescriptorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataProcessorDescriptor()
	 * @generated
	 */
	int DATA_PROCESSOR_DESCRIPTOR = 13;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__PARAMETERS = INTERFACER_DESCRIPTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__NAME = INTERFACER_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__DESCRIPTION = INTERFACER_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Outputdataflowdescriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS = INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS;

	/**
	 * The number of structural features of the '<em>Data Processor Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR_FEATURE_COUNT = INTERFACER_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Processor Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_DESCRIPTOR_OPERATION_COUNT = INTERFACER_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.InterfacerImpl <em>Interfacer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.InterfacerImpl
	 * @see iDSL.impl.IDSLPackageImpl#getInterfacer()
	 * @generated
	 */
	int INTERFACER = 14;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Interfacerdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER__INTERFACERDESCRIPTOR = 2;

	/**
	 * The number of structural features of the '<em>Interfacer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interfacer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.PreProcessorImpl <em>Pre Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.PreProcessorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getPreProcessor()
	 * @generated
	 */
	int PRE_PROCESSOR = 15;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR__INPUTS = INTERFACER__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR__OUTPUTS = INTERFACER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Interfacerdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR__INTERFACERDESCRIPTOR = INTERFACER__INTERFACERDESCRIPTOR;

	/**
	 * The number of structural features of the '<em>Pre Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_FEATURE_COUNT = INTERFACER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PROCESSOR_OPERATION_COUNT = INTERFACER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DataProcessorImpl <em>Data Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DataProcessorImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDataProcessor()
	 * @generated
	 */
	int DATA_PROCESSOR = 16;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR__INPUTS = INTERFACER__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR__OUTPUTS = INTERFACER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Interfacerdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR__INTERFACERDESCRIPTOR = INTERFACER__INTERFACERDESCRIPTOR;

	/**
	 * The number of structural features of the '<em>Data Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_FEATURE_COUNT = INTERFACER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSOR_OPERATION_COUNT = INTERFACER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.SynchronizerImpl <em>Synchronizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.SynchronizerImpl
	 * @see iDSL.impl.IDSLPackageImpl#getSynchronizer()
	 * @generated
	 */
	int SYNCHRONIZER = 17;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER__INPUTS = INTERFACER__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER__OUTPUTS = INTERFACER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Interfacerdescriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER__INTERFACERDESCRIPTOR = INTERFACER__INTERFACERDESCRIPTOR;

	/**
	 * The number of structural features of the '<em>Synchronizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_FEATURE_COUNT = INTERFACER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_OPERATION_COUNT = INTERFACER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.DomainParameterImpl <em>Domain Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.DomainParameterImpl
	 * @see iDSL.impl.IDSLPackageImpl#getDomainParameter()
	 * @generated
	 */
	int DOMAIN_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PARAMETER__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Domain Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.impl.ReferenceImpl
	 * @see iDSL.impl.IDSLPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDSL.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDSL.Type
	 * @see iDSL.impl.IDSLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 21;


	/**
	 * Returns the meta object for class '{@link iDSL.IotFramework <em>Iot Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Framework</em>'.
	 * @see iDSL.IotFramework
	 * @generated
	 */
	EClass getIotFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.IotFramework#getInterfacers <em>Interfacers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacers</em>'.
	 * @see iDSL.IotFramework#getInterfacers()
	 * @see #getIotFramework()
	 * @generated
	 */
	EReference getIotFramework_Interfacers();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.IotFramework#getDataflows <em>Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflows</em>'.
	 * @see iDSL.IotFramework#getDataflows()
	 * @see #getIotFramework()
	 * @generated
	 */
	EReference getIotFramework_Dataflows();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.IotFramework#getDataflowdescriptors <em>Dataflowdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflowdescriptors</em>'.
	 * @see iDSL.IotFramework#getDataflowdescriptors()
	 * @see #getIotFramework()
	 * @generated
	 */
	EReference getIotFramework_Dataflowdescriptors();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.IotFramework#getInterfacerdescriptors <em>Interfacerdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacerdescriptors</em>'.
	 * @see iDSL.IotFramework#getInterfacerdescriptors()
	 * @see #getIotFramework()
	 * @generated
	 */
	EReference getIotFramework_Interfacerdescriptors();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.IotFramework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.IotFramework#getName()
	 * @see #getIotFramework()
	 * @generated
	 */
	EAttribute getIotFramework_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.IotFramework#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iDSL.IotFramework#getDescription()
	 * @see #getIotFramework()
	 * @generated
	 */
	EAttribute getIotFramework_Description();

	/**
	 * Returns the meta object for class '{@link iDSL.DataFlowDescriptor <em>Data Flow Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Descriptor</em>'.
	 * @see iDSL.DataFlowDescriptor
	 * @generated
	 */
	EClass getDataFlowDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.DataFlowDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.DataFlowDescriptor#getName()
	 * @see #getDataFlowDescriptor()
	 * @generated
	 */
	EAttribute getDataFlowDescriptor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.DataFlowDescriptor#getStreamdescriptors <em>Streamdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streamdescriptors</em>'.
	 * @see iDSL.DataFlowDescriptor#getStreamdescriptors()
	 * @see #getDataFlowDescriptor()
	 * @generated
	 */
	EReference getDataFlowDescriptor_Streamdescriptors();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.DataFlowDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iDSL.DataFlowDescriptor#getDescription()
	 * @see #getDataFlowDescriptor()
	 * @generated
	 */
	EAttribute getDataFlowDescriptor_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.DataFlowDescriptor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see iDSL.DataFlowDescriptor#getParameters()
	 * @see #getDataFlowDescriptor()
	 * @generated
	 */
	EReference getDataFlowDescriptor_Parameters();

	/**
	 * Returns the meta object for class '{@link iDSL.StreamDescriptor <em>Stream Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Descriptor</em>'.
	 * @see iDSL.StreamDescriptor
	 * @generated
	 */
	EClass getStreamDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.StreamDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.StreamDescriptor#getName()
	 * @see #getStreamDescriptor()
	 * @generated
	 */
	EAttribute getStreamDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.StreamDescriptor#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see iDSL.StreamDescriptor#getSamplingRate()
	 * @see #getStreamDescriptor()
	 * @generated
	 */
	EAttribute getStreamDescriptor_SamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.StreamDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iDSL.StreamDescriptor#getType()
	 * @see #getStreamDescriptor()
	 * @generated
	 */
	EAttribute getStreamDescriptor_Type();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.StreamDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iDSL.StreamDescriptor#getDescription()
	 * @see #getStreamDescriptor()
	 * @generated
	 */
	EAttribute getStreamDescriptor_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.StreamDescriptor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see iDSL.StreamDescriptor#getParameters()
	 * @see #getStreamDescriptor()
	 * @generated
	 */
	EReference getStreamDescriptor_Parameters();

	/**
	 * Returns the meta object for class '{@link iDSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see iDSL.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Parameter#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see iDSL.Parameter#getContent()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Content();

	/**
	 * Returns the meta object for class '{@link iDSL.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see iDSL.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.Thing#getConnexions <em>Connexions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connexions</em>'.
	 * @see iDSL.Thing#getConnexions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Connexions();

	/**
	 * Returns the meta object for class '{@link iDSL.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see iDSL.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for class '{@link iDSL.Connexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connexion</em>'.
	 * @see iDSL.Connexion
	 * @generated
	 */
	EClass getConnexion();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Connexion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.Connexion#getName()
	 * @see #getConnexion()
	 * @generated
	 */
	EAttribute getConnexion_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Connexion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iDSL.Connexion#getDescription()
	 * @see #getConnexion()
	 * @generated
	 */
	EAttribute getConnexion_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.Connexion#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see iDSL.Connexion#getParameters()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_Parameters();

	/**
	 * Returns the meta object for class '{@link iDSL.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see iDSL.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link iDSL.DataHolder <em>Data Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Holder</em>'.
	 * @see iDSL.DataHolder
	 * @generated
	 */
	EClass getDataHolder();

	/**
	 * Returns the meta object for class '{@link iDSL.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see iDSL.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.DataFlow#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streams</em>'.
	 * @see iDSL.DataFlow#getStreams()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Streams();

	/**
	 * Returns the meta object for the reference '{@link iDSL.DataFlow#getDataflowdescriptor <em>Dataflowdescriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataflowdescriptor</em>'.
	 * @see iDSL.DataFlow#getDataflowdescriptor()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Dataflowdescriptor();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.DataFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.DataFlow#getName()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Name();

	/**
	 * Returns the meta object for class '{@link iDSL.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see iDSL.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.Stream#getStreamdescriptors <em>Streamdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streamdescriptors</em>'.
	 * @see iDSL.Stream#getStreamdescriptors()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_Streamdescriptors();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Stream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.Stream#getName()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_Name();

	/**
	 * Returns the meta object for class '{@link iDSL.InterfacerDescriptor <em>Interfacer Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfacer Descriptor</em>'.
	 * @see iDSL.InterfacerDescriptor
	 * @generated
	 */
	EClass getInterfacerDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.InterfacerDescriptor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see iDSL.InterfacerDescriptor#getParameters()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EReference getInterfacerDescriptor_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.InterfacerDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.InterfacerDescriptor#getName()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EAttribute getInterfacerDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.InterfacerDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iDSL.InterfacerDescriptor#getDescription()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EAttribute getInterfacerDescriptor_Description();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.InterfacerDescriptor#getInputdataflowdescriptors <em>Inputdataflowdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputdataflowdescriptors</em>'.
	 * @see iDSL.InterfacerDescriptor#getInputdataflowdescriptors()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EReference getInterfacerDescriptor_Inputdataflowdescriptors();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.InterfacerDescriptor#getOutputdataflowdescriptors <em>Outputdataflowdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputdataflowdescriptors</em>'.
	 * @see iDSL.InterfacerDescriptor#getOutputdataflowdescriptors()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EReference getInterfacerDescriptor_Outputdataflowdescriptors();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.InterfacerDescriptor#getAnomynousinputdataflowdescriptors <em>Anomynousinputdataflowdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anomynousinputdataflowdescriptors</em>'.
	 * @see iDSL.InterfacerDescriptor#getAnomynousinputdataflowdescriptors()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EReference getInterfacerDescriptor_Anomynousinputdataflowdescriptors();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.InterfacerDescriptor#getAnomynousoutputdataflowdescriptors <em>Anomynousoutputdataflowdescriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anomynousoutputdataflowdescriptors</em>'.
	 * @see iDSL.InterfacerDescriptor#getAnomynousoutputdataflowdescriptors()
	 * @see #getInterfacerDescriptor()
	 * @generated
	 */
	EReference getInterfacerDescriptor_Anomynousoutputdataflowdescriptors();

	/**
	 * Returns the meta object for class '{@link iDSL.SynchronizerDescriptor <em>Synchronizer Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizer Descriptor</em>'.
	 * @see iDSL.SynchronizerDescriptor
	 * @generated
	 */
	EClass getSynchronizerDescriptor();

	/**
	 * Returns the meta object for class '{@link iDSL.PreProcessorDescriptor <em>Pre Processor Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Processor Descriptor</em>'.
	 * @see iDSL.PreProcessorDescriptor
	 * @generated
	 */
	EClass getPreProcessorDescriptor();

	/**
	 * Returns the meta object for class '{@link iDSL.DataProcessorDescriptor <em>Data Processor Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processor Descriptor</em>'.
	 * @see iDSL.DataProcessorDescriptor
	 * @generated
	 */
	EClass getDataProcessorDescriptor();

	/**
	 * Returns the meta object for class '{@link iDSL.Interfacer <em>Interfacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfacer</em>'.
	 * @see iDSL.Interfacer
	 * @generated
	 */
	EClass getInterfacer();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.Interfacer#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see iDSL.Interfacer#getInputs()
	 * @see #getInterfacer()
	 * @generated
	 */
	EReference getInterfacer_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link iDSL.Interfacer#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see iDSL.Interfacer#getOutputs()
	 * @see #getInterfacer()
	 * @generated
	 */
	EReference getInterfacer_Outputs();

	/**
	 * Returns the meta object for the reference '{@link iDSL.Interfacer#getInterfacerdescriptor <em>Interfacerdescriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfacerdescriptor</em>'.
	 * @see iDSL.Interfacer#getInterfacerdescriptor()
	 * @see #getInterfacer()
	 * @generated
	 */
	EReference getInterfacer_Interfacerdescriptor();

	/**
	 * Returns the meta object for class '{@link iDSL.PreProcessor <em>Pre Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Processor</em>'.
	 * @see iDSL.PreProcessor
	 * @generated
	 */
	EClass getPreProcessor();

	/**
	 * Returns the meta object for class '{@link iDSL.DataProcessor <em>Data Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processor</em>'.
	 * @see iDSL.DataProcessor
	 * @generated
	 */
	EClass getDataProcessor();

	/**
	 * Returns the meta object for class '{@link iDSL.Synchronizer <em>Synchronizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizer</em>'.
	 * @see iDSL.Synchronizer
	 * @generated
	 */
	EClass getSynchronizer();

	/**
	 * Returns the meta object for class '{@link iDSL.DomainParameter <em>Domain Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Parameter</em>'.
	 * @see iDSL.DomainParameter
	 * @generated
	 */
	EClass getDomainParameter();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.DomainParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.DomainParameter#getName()
	 * @see #getDomainParameter()
	 * @generated
	 */
	EAttribute getDomainParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iDSL.DomainParameter#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see iDSL.DomainParameter#getParameters()
	 * @see #getDomainParameter()
	 * @generated
	 */
	EReference getDomainParameter_Parameters();

	/**
	 * Returns the meta object for class '{@link iDSL.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see iDSL.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link iDSL.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDSL.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for enum '{@link iDSL.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see iDSL.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDSLFactory getIDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iDSL.impl.IotFrameworkImpl <em>Iot Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.IotFrameworkImpl
		 * @see iDSL.impl.IDSLPackageImpl#getIotFramework()
		 * @generated
		 */
		EClass IOT_FRAMEWORK = eINSTANCE.getIotFramework();

		/**
		 * The meta object literal for the '<em><b>Interfacers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_FRAMEWORK__INTERFACERS = eINSTANCE.getIotFramework_Interfacers();

		/**
		 * The meta object literal for the '<em><b>Dataflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_FRAMEWORK__DATAFLOWS = eINSTANCE.getIotFramework_Dataflows();

		/**
		 * The meta object literal for the '<em><b>Dataflowdescriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_FRAMEWORK__DATAFLOWDESCRIPTORS = eINSTANCE.getIotFramework_Dataflowdescriptors();

		/**
		 * The meta object literal for the '<em><b>Interfacerdescriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_FRAMEWORK__INTERFACERDESCRIPTORS = eINSTANCE.getIotFramework_Interfacerdescriptors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_FRAMEWORK__NAME = eINSTANCE.getIotFramework_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_FRAMEWORK__DESCRIPTION = eINSTANCE.getIotFramework_Description();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataFlowDescriptorImpl <em>Data Flow Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataFlowDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataFlowDescriptor()
		 * @generated
		 */
		EClass DATA_FLOW_DESCRIPTOR = eINSTANCE.getDataFlowDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_DESCRIPTOR__NAME = eINSTANCE.getDataFlowDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Streamdescriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS = eINSTANCE.getDataFlowDescriptor_Streamdescriptors();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_DESCRIPTOR__DESCRIPTION = eINSTANCE.getDataFlowDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DESCRIPTOR__PARAMETERS = eINSTANCE.getDataFlowDescriptor_Parameters();

		/**
		 * The meta object literal for the '{@link iDSL.impl.StreamDescriptorImpl <em>Stream Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.StreamDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getStreamDescriptor()
		 * @generated
		 */
		EClass STREAM_DESCRIPTOR = eINSTANCE.getStreamDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTOR__NAME = eINSTANCE.getStreamDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTOR__SAMPLING_RATE = eINSTANCE.getStreamDescriptor_SamplingRate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTOR__TYPE = eINSTANCE.getStreamDescriptor_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DESCRIPTOR__DESCRIPTION = eINSTANCE.getStreamDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DESCRIPTOR__PARAMETERS = eINSTANCE.getStreamDescriptor_Parameters();

		/**
		 * The meta object literal for the '{@link iDSL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.ParameterImpl
		 * @see iDSL.impl.IDSLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONTENT = eINSTANCE.getParameter_Content();

		/**
		 * The meta object literal for the '{@link iDSL.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.ThingImpl
		 * @see iDSL.impl.IDSLPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Connexions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__CONNEXIONS = eINSTANCE.getThing_Connexions();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataCenterImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '{@link iDSL.impl.ConnexionImpl <em>Connexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.ConnexionImpl
		 * @see iDSL.impl.IDSLPackageImpl#getConnexion()
		 * @generated
		 */
		EClass CONNEXION = eINSTANCE.getConnexion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNEXION__NAME = eINSTANCE.getConnexion_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNEXION__DESCRIPTION = eINSTANCE.getConnexion_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__PARAMETERS = eINSTANCE.getConnexion_Parameters();

		/**
		 * The meta object literal for the '{@link iDSL.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.OutputImpl
		 * @see iDSL.impl.IDSLPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataHolderImpl <em>Data Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataHolderImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataHolder()
		 * @generated
		 */
		EClass DATA_HOLDER = eINSTANCE.getDataHolder();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataFlowImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Streams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__STREAMS = eINSTANCE.getDataFlow_Streams();

		/**
		 * The meta object literal for the '<em><b>Dataflowdescriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__DATAFLOWDESCRIPTOR = eINSTANCE.getDataFlow_Dataflowdescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__NAME = eINSTANCE.getDataFlow_Name();

		/**
		 * The meta object literal for the '{@link iDSL.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.StreamImpl
		 * @see iDSL.impl.IDSLPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Streamdescriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM__STREAMDESCRIPTORS = eINSTANCE.getStream_Streamdescriptors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__NAME = eINSTANCE.getStream_Name();

		/**
		 * The meta object literal for the '{@link iDSL.impl.InterfacerDescriptorImpl <em>Interfacer Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.InterfacerDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getInterfacerDescriptor()
		 * @generated
		 */
		EClass INTERFACER_DESCRIPTOR = eINSTANCE.getInterfacerDescriptor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER_DESCRIPTOR__PARAMETERS = eINSTANCE.getInterfacerDescriptor_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACER_DESCRIPTOR__NAME = eINSTANCE.getInterfacerDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACER_DESCRIPTOR__DESCRIPTION = eINSTANCE.getInterfacerDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Inputdataflowdescriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS = eINSTANCE.getInterfacerDescriptor_Inputdataflowdescriptors();

		/**
		 * The meta object literal for the '<em><b>Outputdataflowdescriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS = eINSTANCE.getInterfacerDescriptor_Outputdataflowdescriptors();

		/**
		 * The meta object literal for the '<em><b>Anomynousinputdataflowdescriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS = eINSTANCE.getInterfacerDescriptor_Anomynousinputdataflowdescriptors();

		/**
		 * The meta object literal for the '<em><b>Anomynousoutputdataflowdescriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS = eINSTANCE.getInterfacerDescriptor_Anomynousoutputdataflowdescriptors();

		/**
		 * The meta object literal for the '{@link iDSL.impl.SynchronizerDescriptorImpl <em>Synchronizer Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.SynchronizerDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getSynchronizerDescriptor()
		 * @generated
		 */
		EClass SYNCHRONIZER_DESCRIPTOR = eINSTANCE.getSynchronizerDescriptor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.PreProcessorDescriptorImpl <em>Pre Processor Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.PreProcessorDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getPreProcessorDescriptor()
		 * @generated
		 */
		EClass PRE_PROCESSOR_DESCRIPTOR = eINSTANCE.getPreProcessorDescriptor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataProcessorDescriptorImpl <em>Data Processor Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataProcessorDescriptorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataProcessorDescriptor()
		 * @generated
		 */
		EClass DATA_PROCESSOR_DESCRIPTOR = eINSTANCE.getDataProcessorDescriptor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.InterfacerImpl <em>Interfacer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.InterfacerImpl
		 * @see iDSL.impl.IDSLPackageImpl#getInterfacer()
		 * @generated
		 */
		EClass INTERFACER = eINSTANCE.getInterfacer();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER__INPUTS = eINSTANCE.getInterfacer_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER__OUTPUTS = eINSTANCE.getInterfacer_Outputs();

		/**
		 * The meta object literal for the '<em><b>Interfacerdescriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACER__INTERFACERDESCRIPTOR = eINSTANCE.getInterfacer_Interfacerdescriptor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.PreProcessorImpl <em>Pre Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.PreProcessorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getPreProcessor()
		 * @generated
		 */
		EClass PRE_PROCESSOR = eINSTANCE.getPreProcessor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DataProcessorImpl <em>Data Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DataProcessorImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDataProcessor()
		 * @generated
		 */
		EClass DATA_PROCESSOR = eINSTANCE.getDataProcessor();

		/**
		 * The meta object literal for the '{@link iDSL.impl.SynchronizerImpl <em>Synchronizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.SynchronizerImpl
		 * @see iDSL.impl.IDSLPackageImpl#getSynchronizer()
		 * @generated
		 */
		EClass SYNCHRONIZER = eINSTANCE.getSynchronizer();

		/**
		 * The meta object literal for the '{@link iDSL.impl.DomainParameterImpl <em>Domain Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.DomainParameterImpl
		 * @see iDSL.impl.IDSLPackageImpl#getDomainParameter()
		 * @generated
		 */
		EClass DOMAIN_PARAMETER = eINSTANCE.getDomainParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_PARAMETER__NAME = eINSTANCE.getDomainParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PARAMETER__PARAMETERS = eINSTANCE.getDomainParameter_Parameters();

		/**
		 * The meta object literal for the '{@link iDSL.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.impl.ReferenceImpl
		 * @see iDSL.impl.IDSLPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '{@link iDSL.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDSL.Type
		 * @see iDSL.impl.IDSLPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //IDSLPackage
