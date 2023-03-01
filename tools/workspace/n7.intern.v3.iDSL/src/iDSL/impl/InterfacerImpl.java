/**
 */
package iDSL.impl;

import iDSL.DataFlow;
import iDSL.IDSLPackage;
import iDSL.Interfacer;

import iDSL.InterfacerDescriptor;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfacer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.InterfacerImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerImpl#getInterfacerdescriptor <em>Interfacerdescriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfacerImpl extends MinimalEObjectImpl.Container implements Interfacer {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> outputs;

	/**
	 * The cached value of the '{@link #getInterfacerdescriptor() <em>Interfacerdescriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacerdescriptor()
	 * @generated
	 * @ordered
	 */
	protected InterfacerDescriptor interfacerdescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.INTERFACER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<DataFlow>(DataFlow.class, this, IDSLPackage.INTERFACER__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<DataFlow>(DataFlow.class, this, IDSLPackage.INTERFACER__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacerDescriptor getInterfacerdescriptor() {
		if (interfacerdescriptor != null && interfacerdescriptor.eIsProxy()) {
			InternalEObject oldInterfacerdescriptor = (InternalEObject)interfacerdescriptor;
			interfacerdescriptor = (InterfacerDescriptor)eResolveProxy(oldInterfacerdescriptor);
			if (interfacerdescriptor != oldInterfacerdescriptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR, oldInterfacerdescriptor, interfacerdescriptor));
			}
		}
		return interfacerdescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacerDescriptor basicGetInterfacerdescriptor() {
		return interfacerdescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacerdescriptor(InterfacerDescriptor newInterfacerdescriptor) {
		InterfacerDescriptor oldInterfacerdescriptor = interfacerdescriptor;
		interfacerdescriptor = newInterfacerdescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR, oldInterfacerdescriptor, interfacerdescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDSLPackage.INTERFACER__INPUTS:
				return getInputs();
			case IDSLPackage.INTERFACER__OUTPUTS:
				return getOutputs();
			case IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR:
				if (resolve) return getInterfacerdescriptor();
				return basicGetInterfacerdescriptor();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case IDSLPackage.INTERFACER__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case IDSLPackage.INTERFACER__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR:
				setInterfacerdescriptor((InterfacerDescriptor)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDSLPackage.INTERFACER__INPUTS:
				getInputs().clear();
				return;
			case IDSLPackage.INTERFACER__OUTPUTS:
				getOutputs().clear();
				return;
			case IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR:
				setInterfacerdescriptor((InterfacerDescriptor)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDSLPackage.INTERFACER__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case IDSLPackage.INTERFACER__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case IDSLPackage.INTERFACER__INTERFACERDESCRIPTOR:
				return interfacerdescriptor != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //InterfacerImpl
