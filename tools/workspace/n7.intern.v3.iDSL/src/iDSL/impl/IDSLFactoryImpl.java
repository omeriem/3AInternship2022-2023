/**
 */
package iDSL.impl;

import iDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDSLFactoryImpl extends EFactoryImpl implements IDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDSLFactory init() {
		try {
			IDSLFactory theIDSLFactory = (IDSLFactory)EPackage.Registry.INSTANCE.getEFactory(IDSLPackage.eNS_URI);
			if (theIDSLFactory != null) {
				return theIDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IDSLPackage.IOT_FRAMEWORK: return createIotFramework();
			case IDSLPackage.DATA_FLOW_DESCRIPTOR: return createDataFlowDescriptor();
			case IDSLPackage.STREAM_DESCRIPTOR: return createStreamDescriptor();
			case IDSLPackage.THING: return createThing();
			case IDSLPackage.DATA_CENTER: return createDataCenter();
			case IDSLPackage.CONNEXION: return createConnexion();
			case IDSLPackage.OUTPUT: return createOutput();
			case IDSLPackage.DATA_HOLDER: return createDataHolder();
			case IDSLPackage.DATA_FLOW: return createDataFlow();
			case IDSLPackage.STREAM: return createStream();
			case IDSLPackage.INTERFACER_DESCRIPTOR: return createInterfacerDescriptor();
			case IDSLPackage.SYNCHRONIZER_DESCRIPTOR: return createSynchronizerDescriptor();
			case IDSLPackage.PRE_PROCESSOR_DESCRIPTOR: return createPreProcessorDescriptor();
			case IDSLPackage.DATA_PROCESSOR_DESCRIPTOR: return createDataProcessorDescriptor();
			case IDSLPackage.INTERFACER: return createInterfacer();
			case IDSLPackage.PRE_PROCESSOR: return createPreProcessor();
			case IDSLPackage.DATA_PROCESSOR: return createDataProcessor();
			case IDSLPackage.SYNCHRONIZER: return createSynchronizer();
			case IDSLPackage.DOMAIN_PARAMETER: return createDomainParameter();
			case IDSLPackage.PARAMETER: return createParameter();
			case IDSLPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IDSLPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IDSLPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotFramework createIotFramework() {
		IotFrameworkImpl iotFramework = new IotFrameworkImpl();
		return iotFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDescriptor createDataFlowDescriptor() {
		DataFlowDescriptorImpl dataFlowDescriptor = new DataFlowDescriptorImpl();
		return dataFlowDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamDescriptor createStreamDescriptor() {
		StreamDescriptorImpl streamDescriptor = new StreamDescriptorImpl();
		return streamDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connexion createConnexion() {
		ConnexionImpl connexion = new ConnexionImpl();
		return connexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHolder createDataHolder() {
		DataHolderImpl dataHolder = new DataHolderImpl();
		return dataHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacerDescriptor createInterfacerDescriptor() {
		InterfacerDescriptorImpl interfacerDescriptor = new InterfacerDescriptorImpl();
		return interfacerDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizerDescriptor createSynchronizerDescriptor() {
		SynchronizerDescriptorImpl synchronizerDescriptor = new SynchronizerDescriptorImpl();
		return synchronizerDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreProcessorDescriptor createPreProcessorDescriptor() {
		PreProcessorDescriptorImpl preProcessorDescriptor = new PreProcessorDescriptorImpl();
		return preProcessorDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessorDescriptor createDataProcessorDescriptor() {
		DataProcessorDescriptorImpl dataProcessorDescriptor = new DataProcessorDescriptorImpl();
		return dataProcessorDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfacer createInterfacer() {
		InterfacerImpl interfacer = new InterfacerImpl();
		return interfacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreProcessor createPreProcessor() {
		PreProcessorImpl preProcessor = new PreProcessorImpl();
		return preProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessor createDataProcessor() {
		DataProcessorImpl dataProcessor = new DataProcessorImpl();
		return dataProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronizer createSynchronizer() {
		SynchronizerImpl synchronizer = new SynchronizerImpl();
		return synchronizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainParameter createDomainParameter() {
		DomainParameterImpl domainParameter = new DomainParameterImpl();
		return domainParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDSLPackage getIDSLPackage() {
		return (IDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDSLPackage getPackage() {
		return IDSLPackage.eINSTANCE;
	}

} //IDSLFactoryImpl
