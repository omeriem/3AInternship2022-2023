/**
 */
package Domain.impl;

import Domain.DomainFramework;
import Domain.DomainPackage;
import Domain.FunctionDefinition;
import Domain.Parameter;
import Domain.Setup;

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
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getFunction_definitions <em>Function definitions</em>}</li>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainFrameworkImpl extends MinimalEObjectImpl.Container implements DomainFramework {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getFunction_definitions() <em>Function definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction_definitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDefinition> function_definitions;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected Setup setup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_FRAMEWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_FRAMEWORK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_FRAMEWORK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDefinition> getFunction_definitions() {
		if (function_definitions == null) {
			function_definitions = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS);
		}
		return function_definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(Setup newSetup, NotificationChain msgs) {
		Setup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_FRAMEWORK__SETUP, oldSetup, newSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetup(Setup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_FRAMEWORK__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_FRAMEWORK__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_FRAMEWORK__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return ((InternalEList<?>)getFunction_definitions()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_FRAMEWORK__SETUP:
				return basicSetSetup(null, msgs);
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
			case DomainPackage.DOMAIN_FRAMEWORK__NAME:
				return getName();
			case DomainPackage.DOMAIN_FRAMEWORK__DESCRIPTION:
				return getDescription();
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				return getParameters();
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return getFunction_definitions();
			case DomainPackage.DOMAIN_FRAMEWORK__SETUP:
				return getSetup();
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
			case DomainPackage.DOMAIN_FRAMEWORK__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				getFunction_definitions().clear();
				getFunction_definitions().addAll((Collection<? extends FunctionDefinition>)newValue);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__SETUP:
				setSetup((Setup)newValue);
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
			case DomainPackage.DOMAIN_FRAMEWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				getParameters().clear();
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				getFunction_definitions().clear();
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__SETUP:
				setSetup((Setup)null);
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
			case DomainPackage.DOMAIN_FRAMEWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_FRAMEWORK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return function_definitions != null && !function_definitions.isEmpty();
			case DomainPackage.DOMAIN_FRAMEWORK__SETUP:
				return setup != null;
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

} //DomainFrameworkImpl
