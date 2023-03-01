/**
 */
package iDSL.impl;

import iDSL.DataFlowDescriptor;
import iDSL.DataHolder;
import iDSL.DomainParameter;
import iDSL.IDSLPackage;
import iDSL.InterfacerDescriptor;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfacer Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getInputdataflowdescriptors <em>Inputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getOutputdataflowdescriptors <em>Outputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getAnomynousinputdataflowdescriptors <em>Anomynousinputdataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.InterfacerDescriptorImpl#getAnomynousoutputdataflowdescriptors <em>Anomynousoutputdataflowdescriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfacerDescriptorImpl extends MinimalEObjectImpl.Container implements InterfacerDescriptor {
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
	 * The cached value of the '{@link #getInputdataflowdescriptors() <em>Inputdataflowdescriptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputdataflowdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDescriptor> inputdataflowdescriptors;

	/**
	 * The cached value of the '{@link #getOutputdataflowdescriptors() <em>Outputdataflowdescriptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputdataflowdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDescriptor> outputdataflowdescriptors;

	/**
	 * The cached value of the '{@link #getAnomynousinputdataflowdescriptors() <em>Anomynousinputdataflowdescriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnomynousinputdataflowdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataHolder> anomynousinputdataflowdescriptors;

	/**
	 * The cached value of the '{@link #getAnomynousoutputdataflowdescriptors() <em>Anomynousoutputdataflowdescriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnomynousoutputdataflowdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataHolder> anomynousoutputdataflowdescriptors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacerDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.INTERFACER_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DomainParameter>(DomainParameter.class, this, IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.INTERFACER_DESCRIPTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowDescriptor> getInputdataflowdescriptors() {
		if (inputdataflowdescriptors == null) {
			inputdataflowdescriptors = new EObjectResolvingEList<DataFlowDescriptor>(DataFlowDescriptor.class, this, IDSLPackage.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS);
		}
		return inputdataflowdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowDescriptor> getOutputdataflowdescriptors() {
		if (outputdataflowdescriptors == null) {
			outputdataflowdescriptors = new EObjectResolvingEList<DataFlowDescriptor>(DataFlowDescriptor.class, this, IDSLPackage.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS);
		}
		return outputdataflowdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataHolder> getAnomynousinputdataflowdescriptors() {
		if (anomynousinputdataflowdescriptors == null) {
			anomynousinputdataflowdescriptors = new EObjectContainmentEList<DataHolder>(DataHolder.class, this, IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS);
		}
		return anomynousinputdataflowdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataHolder> getAnomynousoutputdataflowdescriptors() {
		if (anomynousoutputdataflowdescriptors == null) {
			anomynousoutputdataflowdescriptors = new EObjectContainmentEList<DataHolder>(DataHolder.class, this, IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS);
		}
		return anomynousoutputdataflowdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
				return ((InternalEList<?>)getAnomynousinputdataflowdescriptors()).basicRemove(otherEnd, msgs);
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				return ((InternalEList<?>)getAnomynousoutputdataflowdescriptors()).basicRemove(otherEnd, msgs);
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
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
				return getParameters();
			case IDSLPackage.INTERFACER_DESCRIPTOR__NAME:
				return getName();
			case IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case IDSLPackage.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS:
				return getInputdataflowdescriptors();
			case IDSLPackage.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS:
				return getOutputdataflowdescriptors();
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
				return getAnomynousinputdataflowdescriptors();
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				return getAnomynousoutputdataflowdescriptors();
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
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DomainParameter>)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS:
				getInputdataflowdescriptors().clear();
				getInputdataflowdescriptors().addAll((Collection<? extends DataFlowDescriptor>)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS:
				getOutputdataflowdescriptors().clear();
				getOutputdataflowdescriptors().addAll((Collection<? extends DataFlowDescriptor>)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
				getAnomynousinputdataflowdescriptors().clear();
				getAnomynousinputdataflowdescriptors().addAll((Collection<? extends DataHolder>)newValue);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				getAnomynousoutputdataflowdescriptors().clear();
				getAnomynousoutputdataflowdescriptors().addAll((Collection<? extends DataHolder>)newValue);
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
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
				getParameters().clear();
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS:
				getInputdataflowdescriptors().clear();
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS:
				getOutputdataflowdescriptors().clear();
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
				getAnomynousinputdataflowdescriptors().clear();
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				getAnomynousoutputdataflowdescriptors().clear();
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
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case IDSLPackage.INTERFACER_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IDSLPackage.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS:
				return inputdataflowdescriptors != null && !inputdataflowdescriptors.isEmpty();
			case IDSLPackage.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS:
				return outputdataflowdescriptors != null && !outputdataflowdescriptors.isEmpty();
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
				return anomynousinputdataflowdescriptors != null && !anomynousinputdataflowdescriptors.isEmpty();
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				return anomynousoutputdataflowdescriptors != null && !anomynousoutputdataflowdescriptors.isEmpty();
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

} //InterfacerDescriptorImpl
