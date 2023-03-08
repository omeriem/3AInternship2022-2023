/**
 */
package Domain.impl;

import Domain.DomainPackage;
import Domain.FunctionDefinition;
import Domain.Marker;
import Domain.Parameter;
import Domain.Type;

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
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Domain.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getFunction_type <em>Function type</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getDefault_value <em>Default value</em>}</li>
 *   <li>{@link Domain.impl.ParameterImpl#getDefault_function_value <em>Default function value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The cached value of the '{@link #getFunction_type() <em>Function type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction_type()
	 * @generated
	 * @ordered
	 */
	protected FunctionDefinition function_type;

	/**
	 * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkers()
	 * @generated
	 * @ordered
	 */
	protected EList<Marker> markers;

	/**
	 * The default value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected Object default_value = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault_function_value() <em>Default function value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_function_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FUNCTION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_function_value() <em>Default function value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_function_value()
	 * @generated
	 * @ordered
	 */
	protected String default_function_value = DEFAULT_FUNCTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition getFunction_type() {
		if (function_type != null && function_type.eIsProxy()) {
			InternalEObject oldFunction_type = (InternalEObject)function_type;
			function_type = (FunctionDefinition)eResolveProxy(oldFunction_type);
			if (function_type != oldFunction_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PARAMETER__FUNCTION_TYPE, oldFunction_type, function_type));
			}
		}
		return function_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition basicGetFunction_type() {
		return function_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction_type(FunctionDefinition newFunction_type) {
		FunctionDefinition oldFunction_type = function_type;
		function_type = newFunction_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__FUNCTION_TYPE, oldFunction_type, function_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marker> getMarkers() {
		if (markers == null) {
			markers = new EObjectContainmentEList<Marker>(Marker.class, this, DomainPackage.PARAMETER__MARKERS);
		}
		return markers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefault_value() {
		return default_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value(Object newDefault_value) {
		Object oldDefault_value = default_value;
		default_value = newDefault_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__DEFAULT_VALUE, oldDefault_value, default_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault_function_value() {
		return default_function_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_function_value(String newDefault_function_value) {
		String oldDefault_function_value = default_function_value;
		default_function_value = newDefault_function_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PARAMETER__DEFAULT_FUNCTION_VALUE, oldDefault_function_value, default_function_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PARAMETER__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.PARAMETER__NAME:
				return getName();
			case DomainPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case DomainPackage.PARAMETER__TYPE:
				return getType();
			case DomainPackage.PARAMETER__FUNCTION_TYPE:
				if (resolve) return getFunction_type();
				return basicGetFunction_type();
			case DomainPackage.PARAMETER__MARKERS:
				return getMarkers();
			case DomainPackage.PARAMETER__DEFAULT_VALUE:
				return getDefault_value();
			case DomainPackage.PARAMETER__DEFAULT_FUNCTION_VALUE:
				return getDefault_function_value();
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
			case DomainPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DomainPackage.PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case DomainPackage.PARAMETER__FUNCTION_TYPE:
				setFunction_type((FunctionDefinition)newValue);
				return;
			case DomainPackage.PARAMETER__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case DomainPackage.PARAMETER__DEFAULT_VALUE:
				setDefault_value(newValue);
				return;
			case DomainPackage.PARAMETER__DEFAULT_FUNCTION_VALUE:
				setDefault_function_value((String)newValue);
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
			case DomainPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DomainPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DomainPackage.PARAMETER__FUNCTION_TYPE:
				setFunction_type((FunctionDefinition)null);
				return;
			case DomainPackage.PARAMETER__MARKERS:
				getMarkers().clear();
				return;
			case DomainPackage.PARAMETER__DEFAULT_VALUE:
				setDefault_value(DEFAULT_VALUE_EDEFAULT);
				return;
			case DomainPackage.PARAMETER__DEFAULT_FUNCTION_VALUE:
				setDefault_function_value(DEFAULT_FUNCTION_VALUE_EDEFAULT);
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
			case DomainPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DomainPackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case DomainPackage.PARAMETER__FUNCTION_TYPE:
				return function_type != null;
			case DomainPackage.PARAMETER__MARKERS:
				return markers != null && !markers.isEmpty();
			case DomainPackage.PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? default_value != null : !DEFAULT_VALUE_EDEFAULT.equals(default_value);
			case DomainPackage.PARAMETER__DEFAULT_FUNCTION_VALUE:
				return DEFAULT_FUNCTION_VALUE_EDEFAULT == null ? default_function_value != null : !DEFAULT_FUNCTION_VALUE_EDEFAULT.equals(default_function_value);
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
		result.append(", type: ");
		result.append(type);
		result.append(", default_value: ");
		result.append(default_value);
		result.append(", default_function_value: ");
		result.append(default_function_value);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
