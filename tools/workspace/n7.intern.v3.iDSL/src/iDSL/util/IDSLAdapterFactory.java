/**
 */
package iDSL.util;

import iDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iDSL.IDSLPackage
 * @generated
 */
public class IDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDSLSwitch<Adapter> modelSwitch =
		new IDSLSwitch<Adapter>() {
			@Override
			public Adapter caseIotFramework(IotFramework object) {
				return createIotFrameworkAdapter();
			}
			@Override
			public Adapter caseDataFlowDescriptor(DataFlowDescriptor object) {
				return createDataFlowDescriptorAdapter();
			}
			@Override
			public Adapter caseStreamDescriptor(StreamDescriptor object) {
				return createStreamDescriptorAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseDataCenter(DataCenter object) {
				return createDataCenterAdapter();
			}
			@Override
			public Adapter caseConnexion(Connexion object) {
				return createConnexionAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseDataHolder(DataHolder object) {
				return createDataHolderAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseStream(Stream object) {
				return createStreamAdapter();
			}
			@Override
			public Adapter caseInterfacerDescriptor(InterfacerDescriptor object) {
				return createInterfacerDescriptorAdapter();
			}
			@Override
			public Adapter caseSynchronizerDescriptor(SynchronizerDescriptor object) {
				return createSynchronizerDescriptorAdapter();
			}
			@Override
			public Adapter casePreProcessorDescriptor(PreProcessorDescriptor object) {
				return createPreProcessorDescriptorAdapter();
			}
			@Override
			public Adapter caseDataProcessorDescriptor(DataProcessorDescriptor object) {
				return createDataProcessorDescriptorAdapter();
			}
			@Override
			public Adapter caseInterfacer(Interfacer object) {
				return createInterfacerAdapter();
			}
			@Override
			public Adapter casePreProcessor(PreProcessor object) {
				return createPreProcessorAdapter();
			}
			@Override
			public Adapter caseDataProcessor(DataProcessor object) {
				return createDataProcessorAdapter();
			}
			@Override
			public Adapter caseSynchronizer(Synchronizer object) {
				return createSynchronizerAdapter();
			}
			@Override
			public Adapter caseDomainParameter(DomainParameter object) {
				return createDomainParameterAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iDSL.IotFramework <em>Iot Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.IotFramework
	 * @generated
	 */
	public Adapter createIotFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataFlowDescriptor <em>Data Flow Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataFlowDescriptor
	 * @generated
	 */
	public Adapter createDataFlowDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.StreamDescriptor <em>Stream Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.StreamDescriptor
	 * @generated
	 */
	public Adapter createStreamDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Connexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Connexion
	 * @generated
	 */
	public Adapter createConnexionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataHolder <em>Data Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataHolder
	 * @generated
	 */
	public Adapter createDataHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.InterfacerDescriptor <em>Interfacer Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.InterfacerDescriptor
	 * @generated
	 */
	public Adapter createInterfacerDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.SynchronizerDescriptor <em>Synchronizer Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.SynchronizerDescriptor
	 * @generated
	 */
	public Adapter createSynchronizerDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.PreProcessorDescriptor <em>Pre Processor Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.PreProcessorDescriptor
	 * @generated
	 */
	public Adapter createPreProcessorDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataProcessorDescriptor <em>Data Processor Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataProcessorDescriptor
	 * @generated
	 */
	public Adapter createDataProcessorDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Interfacer <em>Interfacer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Interfacer
	 * @generated
	 */
	public Adapter createInterfacerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.PreProcessor <em>Pre Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.PreProcessor
	 * @generated
	 */
	public Adapter createPreProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DataProcessor <em>Data Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DataProcessor
	 * @generated
	 */
	public Adapter createDataProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Synchronizer <em>Synchronizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Synchronizer
	 * @generated
	 */
	public Adapter createSynchronizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.DomainParameter <em>Domain Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.DomainParameter
	 * @generated
	 */
	public Adapter createDomainParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDSL.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDSL.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IDSLAdapterFactory
