/**
 */
package iDSL.provider;


import iDSL.IDSLFactory;
import iDSL.IDSLPackage;
import iDSL.InterfacerDescriptor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iDSL.InterfacerDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacerDescriptorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacerDescriptorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addInputdataflowdescriptorsPropertyDescriptor(object);
			addOutputdataflowdescriptorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfacerDescriptor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfacerDescriptor_name_feature", "_UI_InterfacerDescriptor_type"),
				 IDSLPackage.Literals.INTERFACER_DESCRIPTOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfacerDescriptor_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfacerDescriptor_description_feature", "_UI_InterfacerDescriptor_type"),
				 IDSLPackage.Literals.INTERFACER_DESCRIPTOR__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inputdataflowdescriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputdataflowdescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfacerDescriptor_inputdataflowdescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfacerDescriptor_inputdataflowdescriptors_feature", "_UI_InterfacerDescriptor_type"),
				 IDSLPackage.Literals.INTERFACER_DESCRIPTOR__INPUTDATAFLOWDESCRIPTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outputdataflowdescriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputdataflowdescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfacerDescriptor_outputdataflowdescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfacerDescriptor_outputdataflowdescriptors_feature", "_UI_InterfacerDescriptor_type"),
				 IDSLPackage.Literals.INTERFACER_DESCRIPTOR__OUTPUTDATAFLOWDESCRIPTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__PARAMETERS);
			childrenFeatures.add(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS);
			childrenFeatures.add(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InterfacerDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfacerDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InterfacerDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InterfacerDescriptor_type") :
			getString("_UI_InterfacerDescriptor_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(InterfacerDescriptor.class)) {
			case IDSLPackage.INTERFACER_DESCRIPTOR__NAME:
			case IDSLPackage.INTERFACER_DESCRIPTOR__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IDSLPackage.INTERFACER_DESCRIPTOR__PARAMETERS:
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS:
			case IDSLPackage.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__PARAMETERS,
				 IDSLFactory.eINSTANCE.createDomainParameter()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataHolder()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataHolder()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSINPUTDATAFLOWDESCRIPTORS ||
			childFeature == IDSLPackage.Literals.INTERFACER_DESCRIPTOR__ANOMYNOUSOUTPUTDATAFLOWDESCRIPTORS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IDSLEditPlugin.INSTANCE;
	}

}
