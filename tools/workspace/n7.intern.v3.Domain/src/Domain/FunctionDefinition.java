/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link Domain.FunctionDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.FunctionDefinition#getValues <em>Values</em>}</li>
 *   <li>{@link Domain.FunctionDefinition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link Domain.FunctionDefinition#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Domain.DomainPackage#getFunctionDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Domain.FunctionDefinition#getName <em>Name</em>}' attribute.
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
	 * @see Domain.DomainPackage#getFunctionDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Domain.FunctionDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.FunctionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see Domain.DomainPackage#getFunctionDefinition_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionValue> getValues();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' attribute list.
	 * The list contents are of type {@link Domain.Type}.
	 * The literals are from the enumeration {@link Domain.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' attribute list.
	 * @see Domain.Type
	 * @see Domain.DomainPackage#getFunctionDefinition_Inputs()
	 * @model
	 * @generated
	 */
	EList<Type> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute list.
	 * The list contents are of type {@link Domain.Type}.
	 * The literals are from the enumeration {@link Domain.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute list.
	 * @see Domain.Type
	 * @see Domain.DomainPackage#getFunctionDefinition_Outputs()
	 * @model
	 * @generated
	 */
	EList<Type> getOutputs();

} // FunctionDefinition
