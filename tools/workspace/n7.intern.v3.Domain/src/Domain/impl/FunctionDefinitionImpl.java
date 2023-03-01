/**
 */
package Domain.impl;

import Domain.DomainPackage;
import Domain.FunctionDefinition;
import Domain.FunctionValue;
import Domain.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Domain.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Domain.impl.FunctionDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.impl.FunctionDefinitionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link Domain.impl.FunctionDefinitionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link Domain.impl.FunctionDefinitionImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MinimalEObjectImpl.Container implements FunctionDefinition {
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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionValue> values;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FUNCTION_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FUNCTION_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FUNCTION_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<FunctionValue>(FunctionValue.class, this, DomainPackage.FUNCTION_DEFINITION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getInputs() {
		if (inputs == null) {
			inputs = new EDataTypeUniqueEList<Type>(Type.class, this, DomainPackage.FUNCTION_DEFINITION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOutputs() {
		if (outputs == null) {
			outputs = new EDataTypeUniqueEList<Type>(Type.class, this, DomainPackage.FUNCTION_DEFINITION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.FUNCTION_DEFINITION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.FUNCTION_DEFINITION__NAME:
				return getName();
			case DomainPackage.FUNCTION_DEFINITION__DESCRIPTION:
				return getDescription();
			case DomainPackage.FUNCTION_DEFINITION__VALUES:
				return getValues();
			case DomainPackage.FUNCTION_DEFINITION__INPUTS:
				return getInputs();
			case DomainPackage.FUNCTION_DEFINITION__OUTPUTS:
				return getOutputs();
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
			case DomainPackage.FUNCTION_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.FUNCTION_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DomainPackage.FUNCTION_DEFINITION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends FunctionValue>)newValue);
				return;
			case DomainPackage.FUNCTION_DEFINITION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Type>)newValue);
				return;
			case DomainPackage.FUNCTION_DEFINITION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Type>)newValue);
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
			case DomainPackage.FUNCTION_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.FUNCTION_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DomainPackage.FUNCTION_DEFINITION__VALUES:
				getValues().clear();
				return;
			case DomainPackage.FUNCTION_DEFINITION__INPUTS:
				getInputs().clear();
				return;
			case DomainPackage.FUNCTION_DEFINITION__OUTPUTS:
				getOutputs().clear();
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
			case DomainPackage.FUNCTION_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.FUNCTION_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DomainPackage.FUNCTION_DEFINITION__VALUES:
				return values != null && !values.isEmpty();
			case DomainPackage.FUNCTION_DEFINITION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case DomainPackage.FUNCTION_DEFINITION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		result.append(", inputs: ");
		result.append(inputs);
		result.append(", outputs: ");
		result.append(outputs);
		result.append(')');
		return result.toString();
	}

} //FunctionDefinitionImpl
