/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.DomainFramework#getName <em>Name</em>}</li>
 *   <li>{@link Domain.DomainFramework#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.DomainFramework#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Domain.DomainFramework#getFunction_definitions <em>Function definitions</em>}</li>
 *   <li>{@link Domain.DomainFramework#getSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getDomainFramework()
 * @model
 * @generated
 */
public interface DomainFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Domain.DomainPackage#getDomainFramework_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Domain.DomainFramework#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Domain.DomainPackage#getDomainFramework_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Domain.DomainFramework#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Domain.DomainPackage#getDomainFramework_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Function definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.FunctionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function definitions</em>' containment reference list.
	 * @see Domain.DomainPackage#getDomainFramework_Function_definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionDefinition> getFunction_definitions();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(Setup)
	 * @see Domain.DomainPackage#getDomainFramework_Setup()
	 * @model containment="true"
	 * @generated
	 */
	Setup getSetup();

	/**
	 * Sets the value of the '{@link Domain.DomainFramework#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(Setup value);

} // DomainFramework
