/**
 */
package iDSL.impl;

import iDSL.DataFlowDescriptor;
import iDSL.DomainParameter;
import iDSL.IDSLPackage;
import iDSL.StreamDescriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.DataFlowDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.impl.DataFlowDescriptorImpl#getStreamdescriptors <em>Streamdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.DataFlowDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.impl.DataFlowDescriptorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowDescriptorImpl extends MinimalEObjectImpl.Container implements DataFlowDescriptor {
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
	 * The cached value of the '{@link #getStreamdescriptors() <em>Streamdescriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamDescriptor> streamdescriptors;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.DATA_FLOW_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.DATA_FLOW_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamDescriptor> getStreamdescriptors() {
		if (streamdescriptors == null) {
			streamdescriptors = new EObjectContainmentEList<StreamDescriptor>(StreamDescriptor.class, this, IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS);
		}
		return streamdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.DATA_FLOW_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DomainParameter>(DomainParameter.class, this, IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS:
				return ((InternalEList<?>)getStreamdescriptors()).basicRemove(otherEnd, msgs);
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__NAME:
				return getName();
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS:
				return getStreamdescriptors();
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS:
				return getParameters();
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
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS:
				getStreamdescriptors().clear();
				getStreamdescriptors().addAll((Collection<? extends StreamDescriptor>)newValue);
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DomainParameter>)newValue);
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
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS:
				getStreamdescriptors().clear();
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS:
				getParameters().clear();
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
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__STREAMDESCRIPTORS:
				return streamdescriptors != null && !streamdescriptors.isEmpty();
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IDSLPackage.DATA_FLOW_DESCRIPTOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DataFlowDescriptorImpl
