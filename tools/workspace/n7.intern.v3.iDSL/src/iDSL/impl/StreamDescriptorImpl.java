/**
 */
package iDSL.impl;

import iDSL.DomainParameter;
import iDSL.IDSLPackage;
import iDSL.StreamDescriptor;
import iDSL.Type;

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
 * An implementation of the model object '<em><b>Stream Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.StreamDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.impl.StreamDescriptorImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link iDSL.impl.StreamDescriptorImpl#getType <em>Type</em>}</li>
 *   <li>{@link iDSL.impl.StreamDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.impl.StreamDescriptorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamDescriptorImpl extends MinimalEObjectImpl.Container implements StreamDescriptor {
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
	 * The default value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLING_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected int samplingRate = SAMPLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

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
	protected StreamDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.STREAM_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.STREAM_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSamplingRate() {
		return samplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingRate(int newSamplingRate) {
		int oldSamplingRate = samplingRate;
		samplingRate = newSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.STREAM_DESCRIPTOR__SAMPLING_RATE, oldSamplingRate, samplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.STREAM_DESCRIPTOR__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.STREAM_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DomainParameter>(DomainParameter.class, this, IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS);
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
			case IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS:
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
			case IDSLPackage.STREAM_DESCRIPTOR__NAME:
				return getName();
			case IDSLPackage.STREAM_DESCRIPTOR__SAMPLING_RATE:
				return getSamplingRate();
			case IDSLPackage.STREAM_DESCRIPTOR__TYPE:
				return getType();
			case IDSLPackage.STREAM_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS:
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
			case IDSLPackage.STREAM_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__SAMPLING_RATE:
				setSamplingRate((Integer)newValue);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__TYPE:
				setType((Type)newValue);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS:
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
			case IDSLPackage.STREAM_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__SAMPLING_RATE:
				setSamplingRate(SAMPLING_RATE_EDEFAULT);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS:
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
			case IDSLPackage.STREAM_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IDSLPackage.STREAM_DESCRIPTOR__SAMPLING_RATE:
				return samplingRate != SAMPLING_RATE_EDEFAULT;
			case IDSLPackage.STREAM_DESCRIPTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case IDSLPackage.STREAM_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IDSLPackage.STREAM_DESCRIPTOR__PARAMETERS:
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
		result.append(", samplingRate: ");
		result.append(samplingRate);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //StreamDescriptorImpl
