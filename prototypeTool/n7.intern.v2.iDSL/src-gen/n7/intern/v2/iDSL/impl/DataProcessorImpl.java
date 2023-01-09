/**
 */
package n7.intern.v2.iDSL.impl;

import java.util.Collection;

import n7.intern.v2.iDSL.DataProcessor;
import n7.intern.v2.iDSL.DataProvider;
import n7.intern.v2.iDSL.IDSLPackage;
import n7.intern.v2.iDSL.Output;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link n7.intern.v2.iDSL.impl.DataProcessorImpl#getDataProviders <em>Data Providers</em>}</li>
 *   <li>{@link n7.intern.v2.iDSL.impl.DataProcessorImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProcessorImpl extends ComponentImpl implements DataProcessor {
	/**
	 * The cached value of the '{@link #getDataProviders() <em>Data Providers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProvider> dataProviders;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.DATA_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProvider> getDataProviders() {
		if (dataProviders == null) {
			dataProviders = new EObjectResolvingEList<DataProvider>(DataProvider.class, this,
					IDSLPackage.DATA_PROCESSOR__DATA_PROVIDERS);
		}
		return dataProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<Output>(Output.class, this, IDSLPackage.DATA_PROCESSOR__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDSLPackage.DATA_PROCESSOR__DATA_PROVIDERS:
			return getDataProviders();
		case IDSLPackage.DATA_PROCESSOR__OUTPUTS:
			return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IDSLPackage.DATA_PROCESSOR__DATA_PROVIDERS:
			getDataProviders().clear();
			getDataProviders().addAll((Collection<? extends DataProvider>) newValue);
			return;
		case IDSLPackage.DATA_PROCESSOR__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IDSLPackage.DATA_PROCESSOR__DATA_PROVIDERS:
			getDataProviders().clear();
			return;
		case IDSLPackage.DATA_PROCESSOR__OUTPUTS:
			getOutputs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IDSLPackage.DATA_PROCESSOR__DATA_PROVIDERS:
			return dataProviders != null && !dataProviders.isEmpty();
		case IDSLPackage.DATA_PROCESSOR__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataProcessorImpl
