/**
 */
package iDSL.impl;

import iDSL.DataFlow;
import iDSL.DataFlowDescriptor;
import iDSL.IDSLPackage;
import iDSL.Interfacer;
import iDSL.InterfacerDescriptor;
import iDSL.IotFramework;

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
 * An implementation of the model object '<em><b>Iot Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getInterfacers <em>Interfacers</em>}</li>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getDataflows <em>Dataflows</em>}</li>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getDataflowdescriptors <em>Dataflowdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getInterfacerdescriptors <em>Interfacerdescriptors</em>}</li>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link iDSL.impl.IotFrameworkImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IotFrameworkImpl extends MinimalEObjectImpl.Container implements IotFramework {
	/**
	 * The cached value of the '{@link #getInterfacers() <em>Interfacers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacers()
	 * @generated
	 * @ordered
	 */
	protected EList<Interfacer> interfacers;

	/**
	 * The cached value of the '{@link #getDataflows() <em>Dataflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> dataflows;

	/**
	 * The cached value of the '{@link #getDataflowdescriptors() <em>Dataflowdescriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflowdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDescriptor> dataflowdescriptors;

	/**
	 * The cached value of the '{@link #getInterfacerdescriptors() <em>Interfacerdescriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacerdescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacerDescriptor> interfacerdescriptors;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDSLPackage.Literals.IOT_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interfacer> getInterfacers() {
		if (interfacers == null) {
			interfacers = new EObjectContainmentEList<Interfacer>(Interfacer.class, this, IDSLPackage.IOT_FRAMEWORK__INTERFACERS);
		}
		return interfacers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getDataflows() {
		if (dataflows == null) {
			dataflows = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, IDSLPackage.IOT_FRAMEWORK__DATAFLOWS);
		}
		return dataflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowDescriptor> getDataflowdescriptors() {
		if (dataflowdescriptors == null) {
			dataflowdescriptors = new EObjectContainmentEList<DataFlowDescriptor>(DataFlowDescriptor.class, this, IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS);
		}
		return dataflowdescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacerDescriptor> getInterfacerdescriptors() {
		if (interfacerdescriptors == null) {
			interfacerdescriptors = new EObjectContainmentEList<InterfacerDescriptor>(InterfacerDescriptor.class, this, IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS);
		}
		return interfacerdescriptors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.IOT_FRAMEWORK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.IOT_FRAMEWORK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
				return ((InternalEList<?>)getInterfacers()).basicRemove(otherEnd, msgs);
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
				return ((InternalEList<?>)getDataflows()).basicRemove(otherEnd, msgs);
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
				return ((InternalEList<?>)getDataflowdescriptors()).basicRemove(otherEnd, msgs);
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
				return ((InternalEList<?>)getInterfacerdescriptors()).basicRemove(otherEnd, msgs);
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
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
				return getInterfacers();
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
				return getDataflows();
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
				return getDataflowdescriptors();
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
				return getInterfacerdescriptors();
			case IDSLPackage.IOT_FRAMEWORK__NAME:
				return getName();
			case IDSLPackage.IOT_FRAMEWORK__DESCRIPTION:
				return getDescription();
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
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
				getInterfacers().clear();
				getInterfacers().addAll((Collection<? extends Interfacer>)newValue);
				return;
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
				getDataflows().clear();
				getDataflows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
				getDataflowdescriptors().clear();
				getDataflowdescriptors().addAll((Collection<? extends DataFlowDescriptor>)newValue);
				return;
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
				getInterfacerdescriptors().clear();
				getInterfacerdescriptors().addAll((Collection<? extends InterfacerDescriptor>)newValue);
				return;
			case IDSLPackage.IOT_FRAMEWORK__NAME:
				setName((String)newValue);
				return;
			case IDSLPackage.IOT_FRAMEWORK__DESCRIPTION:
				setDescription((String)newValue);
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
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
				getInterfacers().clear();
				return;
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
				getDataflows().clear();
				return;
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
				getDataflowdescriptors().clear();
				return;
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
				getInterfacerdescriptors().clear();
				return;
			case IDSLPackage.IOT_FRAMEWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IDSLPackage.IOT_FRAMEWORK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
				return interfacers != null && !interfacers.isEmpty();
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
				return dataflows != null && !dataflows.isEmpty();
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
				return dataflowdescriptors != null && !dataflowdescriptors.isEmpty();
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
				return interfacerdescriptors != null && !interfacerdescriptors.isEmpty();
			case IDSLPackage.IOT_FRAMEWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IDSLPackage.IOT_FRAMEWORK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

} //IotFrameworkImpl
