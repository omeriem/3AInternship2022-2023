/**
 */
package Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Domain.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link Domain.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link Domain.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link Domain.Parameter#getFunction_type <em>Function type</em>}</li>
 *   <li>{@link Domain.Parameter#getMarkers <em>Markers</em>}</li>
 *   <li>{@link Domain.Parameter#getDefault_value <em>Default value</em>}</li>
 *   <li>{@link Domain.Parameter#getDefault_function_value <em>Default function value</em>}</li>
 * </ul>
 *
 * @see Domain.DomainPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Domain.DomainPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getName <em>Name</em>}' attribute.
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
	 * @see Domain.DomainPackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Domain.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Domain.Type
	 * @see #setType(Type)
	 * @see Domain.DomainPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Domain.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Function type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function type</em>' reference.
	 * @see #setFunction_type(FunctionDefinition)
	 * @see Domain.DomainPackage#getParameter_Function_type()
	 * @model
	 * @generated
	 */
	FunctionDefinition getFunction_type();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getFunction_type <em>Function type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function type</em>' reference.
	 * @see #getFunction_type()
	 * @generated
	 */
	void setFunction_type(FunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link Domain.Marker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see Domain.DomainPackage#getParameter_Markers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marker> getMarkers();

	/**
	 * Returns the value of the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value</em>' attribute.
	 * @see #setDefault_value(Object)
	 * @see Domain.DomainPackage#getParameter_Default_value()
	 * @model
	 * @generated
	 */
	Object getDefault_value();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getDefault_value <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value</em>' attribute.
	 * @see #getDefault_value()
	 * @generated
	 */
	void setDefault_value(Object value);

	/**
	 * Returns the value of the '<em><b>Default function value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default function value</em>' attribute.
	 * @see #setDefault_function_value(String)
	 * @see Domain.DomainPackage#getParameter_Default_function_value()
	 * @model
	 * @generated
	 */
	String getDefault_function_value();

	/**
	 * Sets the value of the '{@link Domain.Parameter#getDefault_function_value <em>Default function value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default function value</em>' attribute.
	 * @see #getDefault_function_value()
	 * @generated
	 */
	void setDefault_function_value(String value);

} // Parameter
