/**
 */
package iDSL.impl;

import iDSL.DataFlow;
import iDSL.DataFlowDescriptor;
import iDSL.IDSLPackage;
import iDSL.Stream;

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
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.DataFlowImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link iDSL.impl.DataFlowImpl#getDataflowdescriptor <em>Dataflowdescriptor</em>}</li>
 *   <li>{@link iDSL.impl.DataFlowImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends MinimalEObjectImpl.Container implements DataFlow {
	/**
	 * The cached value of the '{@link #getStreams() <em>Streams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<Stream> streams;

	/**
	 * The cached value of the '{@link #getDataflowdescriptor() <em>Dataflowdescriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflowdescriptor()
	 * @generated
	 * @ordered
	 */
	protected DataFlowDescriptor dataflowdescriptor;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stream> getStreams() {
		if (streams == null) {
			streams = new EObjectResolvingEList<Stream>(Stream.class, this, IDSLPackage.DATA_FLOW__STREAMS);
		}
		return streams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDescriptor getDataflowdescriptor() {
		if (dataflowdescriptor != null && dataflowdescriptor.eIsProxy()) {
			InternalEObject oldDataflowdescriptor = (InternalEObject)dataflowdescriptor;
			dataflowdescriptor = (DataFlowDescriptor)eResolveProxy(oldDataflowdescriptor);
			if (dataflowdescriptor != oldDataflowdescriptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR, oldDataflowdescriptor, dataflowdescriptor));
			}
		}
		return dataflowdescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDescriptor basicGetDataflowdescriptor() {
		return dataflowdescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataflowdescriptor(DataFlowDescriptor newDataflowdescriptor) {
		DataFlowDescriptor oldDataflowdescriptor = dataflowdescriptor;
		dataflowdescriptor = newDataflowdescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR, oldDataflowdescriptor, dataflowdescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.DATA_FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDSLPackage.DATA_FLOW__STREAMS:
				return getStreams();
			case IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR:
				if (resolve) return getDataflowdescriptor();
				return basicGetDataflowdescriptor();
			case IDSLPackage.DATA_FLOW__NAME:
				return getName();
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
			case IDSLPackage.DATA_FLOW__STREAMS:
				getStreams().clear();
				getStreams().addAll((Collection<? extends Stream>)newValue);
				return;
			case IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR:
				setDataflowdescriptor((DataFlowDescriptor)newValue);
				return;
			case IDSLPackage.DATA_FLOW__NAME:
				setName((String)newValue);
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
			case IDSLPackage.DATA_FLOW__STREAMS:
				getStreams().clear();
				return;
			case IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR:
				setDataflowdescriptor((DataFlowDescriptor)null);
				return;
			case IDSLPackage.DATA_FLOW__NAME:
				setName(NAME_EDEFAULT);
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
			case IDSLPackage.DATA_FLOW__STREAMS:
				return streams != null && !streams.isEmpty();
			case IDSLPackage.DATA_FLOW__DATAFLOWDESCRIPTOR:
				return dataflowdescriptor != null;
			case IDSLPackage.DATA_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			default:
				return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataFlowImpl
