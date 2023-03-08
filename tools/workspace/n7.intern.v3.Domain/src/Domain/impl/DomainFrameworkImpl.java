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
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getSetups <em>Setups</em>}</li>
 *   <li>{@link Domain.impl.DomainFrameworkImpl#getFunction_definitions <em>Function definitions</em>}</li>
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
	 * The cached value of the '{@link #getSetups() <em>Setups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetups()
	 * @generated
	 * @ordered
	 */
	protected EList<Setup> setups;

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
	public EList<Setup> getSetups() {
		if (setups == null) {
			setups = new EObjectContainmentEList<Setup>(Setup.class, this, DomainPackage.DOMAIN_FRAMEWORK__SETUPS);
		}
		return setups;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_FRAMEWORK__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_FRAMEWORK__SETUPS:
				return ((InternalEList<?>)getSetups()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return ((InternalEList<?>)getFunction_definitions()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_FRAMEWORK__SETUPS:
				return getSetups();
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return getFunction_definitions();
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
			case DomainPackage.DOMAIN_FRAMEWORK__SETUPS:
				getSetups().clear();
				getSetups().addAll((Collection<? extends Setup>)newValue);
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				getFunction_definitions().clear();
				getFunction_definitions().addAll((Collection<? extends FunctionDefinition>)newValue);
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
			case DomainPackage.DOMAIN_FRAMEWORK__SETUPS:
				getSetups().clear();
				return;
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				getFunction_definitions().clear();
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
			case DomainPackage.DOMAIN_FRAMEWORK__SETUPS:
				return setups != null && !setups.isEmpty();
			case DomainPackage.DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS:
				return function_definitions != null && !function_definitions.isEmpty();
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