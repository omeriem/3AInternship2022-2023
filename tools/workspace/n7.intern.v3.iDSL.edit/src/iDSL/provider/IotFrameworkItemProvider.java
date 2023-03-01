/**
 */
package iDSL.provider;


import iDSL.IDSLFactory;
import iDSL.IDSLPackage;
import iDSL.IotFramework;

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
 * This is the item provider adapter for a {@link iDSL.IotFramework} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IotFrameworkItemProvider 
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
	public IotFrameworkItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_IotFramework_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IotFramework_name_feature", "_UI_IotFramework_type"),
				 IDSLPackage.Literals.IOT_FRAMEWORK__NAME,
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
				 getString("_UI_IotFramework_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IotFramework_description_feature", "_UI_IotFramework_type"),
				 IDSLPackage.Literals.IOT_FRAMEWORK__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERS);
			childrenFeatures.add(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWS);
			childrenFeatures.add(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS);
			childrenFeatures.add(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERDESCRIPTORS);
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
	 * This returns IotFramework.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IotFramework"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IotFramework)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IotFramework_type") :
			getString("_UI_IotFramework_type") + " " + label;
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

		switch (notification.getFeatureID(IotFramework.class)) {
			case IDSLPackage.IOT_FRAMEWORK__NAME:
			case IDSLPackage.IOT_FRAMEWORK__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERS:
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWS:
			case IDSLPackage.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS:
			case IDSLPackage.IOT_FRAMEWORK__INTERFACERDESCRIPTORS:
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
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERS,
				 IDSLFactory.eINSTANCE.createInterfacer()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERS,
				 IDSLFactory.eINSTANCE.createPreProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERS,
				 IDSLFactory.eINSTANCE.createDataProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERS,
				 IDSLFactory.eINSTANCE.createSynchronizer()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWS,
				 IDSLFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataFlowDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createThing()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataCenter()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__DATAFLOWDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataHolder()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createInterfacerDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createSynchronizerDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createPreProcessorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(IDSLPackage.Literals.IOT_FRAMEWORK__INTERFACERDESCRIPTORS,
				 IDSLFactory.eINSTANCE.createDataProcessorDescriptor()));
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
