/**
 */
package Domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Domain.DomainFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = Domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link Domain.impl.DomainFrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.DomainFrameworkImpl
	 * @see Domain.impl.DomainPackageImpl#getDomainFramework()
	 * @generated
	 */
	int DOMAIN_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Setups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK__SETUPS = 3;

	/**
	 * The feature id for the '<em><b>Function definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS = 4;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.ParameterImpl
	 * @see Domain.impl.DomainPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Function type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FUNCTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = 4;

	/**
	 * The feature id for the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Default function value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_FUNCTION_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.SetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.SetupImpl
	 * @see Domain.impl.DomainPackageImpl#getSetup()
	 * @generated
	 */
	int SETUP = 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.FunctionDefinitionImpl
	 * @see Domain.impl.DomainPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__OUTPUTS = 4;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.FunctionValueImpl <em>Function Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.FunctionValueImpl
	 * @see Domain.impl.DomainPackageImpl#getFunctionValue()
	 * @generated
	 */
	int FUNCTION_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VALUE__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Function Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.MarkerImpl
	 * @see Domain.impl.DomainPackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.FunctionMarkerImpl <em>Function Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.FunctionMarkerImpl
	 * @see Domain.impl.DomainPackageImpl#getFunctionMarker()
	 * @generated
	 */
	int FUNCTION_MARKER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MARKER__NAME = MARKER__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MARKER__BLOCK = MARKER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MARKER_FEATURE_COUNT = MARKER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MARKER_OPERATION_COUNT = MARKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Domain.impl.AssignationMarkerImpl <em>Assignation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.AssignationMarkerImpl
	 * @see Domain.impl.DomainPackageImpl#getAssignationMarker()
	 * @generated
	 */
	int ASSIGNATION_MARKER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_MARKER__NAME = MARKER__NAME;

	/**
	 * The number of structural features of the '<em>Assignation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_MARKER_FEATURE_COUNT = MARKER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNATION_MARKER_OPERATION_COUNT = MARKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Domain.impl.SetupBlockImpl <em>Setup Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.SetupBlockImpl
	 * @see Domain.impl.DomainPackageImpl#getSetupBlock()
	 * @generated
	 */
	int SETUP_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_BLOCK__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_BLOCK__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Setup Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Setup Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.StringInstructionImpl <em>String Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.StringInstructionImpl
	 * @see Domain.impl.DomainPackageImpl#getStringInstruction()
	 * @generated
	 */
	int STRING_INSTRUCTION = 9;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTRUCTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>String Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.impl.FunctionBlockImpl
	 * @see Domain.impl.DomainPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Domain.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.Type
	 * @see Domain.impl.DomainPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The meta object id for the '{@link Domain.MarkerID <em>Marker ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.MarkerID
	 * @see Domain.impl.DomainPackageImpl#getMarkerID()
	 * @generated
	 */
	int MARKER_ID = 12;

	/**
	 * The meta object id for the '{@link Domain.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Domain.Language
	 * @see Domain.impl.DomainPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 13;


	/**
	 * Returns the meta object for class '{@link Domain.DomainFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see Domain.DomainFramework
	 * @generated
	 */
	EClass getDomainFramework();

	/**
	 * Returns the meta object for the attribute '{@link Domain.DomainFramework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Domain.DomainFramework#getName()
	 * @see #getDomainFramework()
	 * @generated
	 */
	EAttribute getDomainFramework_Name();

	/**
	 * Returns the meta object for the attribute '{@link Domain.DomainFramework#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Domain.DomainFramework#getDescription()
	 * @see #getDomainFramework()
	 * @generated
	 */
	EAttribute getDomainFramework_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.DomainFramework#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Domain.DomainFramework#getParameters()
	 * @see #getDomainFramework()
	 * @generated
	 */
	EReference getDomainFramework_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.DomainFramework#getSetups <em>Setups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setups</em>'.
	 * @see Domain.DomainFramework#getSetups()
	 * @see #getDomainFramework()
	 * @generated
	 */
	EReference getDomainFramework_Setups();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.DomainFramework#getFunction_definitions <em>Function definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function definitions</em>'.
	 * @see Domain.DomainFramework#getFunction_definitions()
	 * @see #getDomainFramework()
	 * @generated
	 */
	EReference getDomainFramework_Function_definitions();

	/**
	 * Returns the meta object for class '{@link Domain.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see Domain.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Domain.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Domain.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Domain.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link Domain.Parameter#getFunction_type <em>Function type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function type</em>'.
	 * @see Domain.Parameter#getFunction_type()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Function_type();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.Parameter#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see Domain.Parameter#getMarkers()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Markers();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Parameter#getDefault_value <em>Default value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value</em>'.
	 * @see Domain.Parameter#getDefault_value()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default_value();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Parameter#getDefault_function_value <em>Default function value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default function value</em>'.
	 * @see Domain.Parameter#getDefault_function_value()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default_function_value();

	/**
	 * Returns the meta object for class '{@link Domain.Setup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup</em>'.
	 * @see Domain.Setup
	 * @generated
	 */
	EClass getSetup();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.Setup#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see Domain.Setup#getInstructions()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_Instructions();

	/**
	 * Returns the meta object for class '{@link Domain.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see Domain.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Domain.FunctionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Domain.FunctionDefinition#getName()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Domain.FunctionDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Domain.FunctionDefinition#getDescription()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.FunctionDefinition#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see Domain.FunctionDefinition#getValues()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Values();

	/**
	 * Returns the meta object for the attribute list '{@link Domain.FunctionDefinition#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inputs</em>'.
	 * @see Domain.FunctionDefinition#getInputs()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Inputs();

	/**
	 * Returns the meta object for the attribute list '{@link Domain.FunctionDefinition#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outputs</em>'.
	 * @see Domain.FunctionDefinition#getOutputs()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Outputs();

	/**
	 * Returns the meta object for class '{@link Domain.FunctionValue <em>Function Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Value</em>'.
	 * @see Domain.FunctionValue
	 * @generated
	 */
	EClass getFunctionValue();

	/**
	 * Returns the meta object for the attribute '{@link Domain.FunctionValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Domain.FunctionValue#getName()
	 * @see #getFunctionValue()
	 * @generated
	 */
	EAttribute getFunctionValue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.FunctionValue#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see Domain.FunctionValue#getInstructions()
	 * @see #getFunctionValue()
	 * @generated
	 */
	EReference getFunctionValue_Instructions();

	/**
	 * Returns the meta object for class '{@link Domain.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see Domain.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link Domain.Marker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Domain.Marker#getName()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Name();

	/**
	 * Returns the meta object for class '{@link Domain.FunctionMarker <em>Function Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Marker</em>'.
	 * @see Domain.FunctionMarker
	 * @generated
	 */
	EClass getFunctionMarker();

	/**
	 * Returns the meta object for the containment reference '{@link Domain.FunctionMarker#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see Domain.FunctionMarker#getBlock()
	 * @see #getFunctionMarker()
	 * @generated
	 */
	EReference getFunctionMarker_Block();

	/**
	 * Returns the meta object for class '{@link Domain.AssignationMarker <em>Assignation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignation Marker</em>'.
	 * @see Domain.AssignationMarker
	 * @generated
	 */
	EClass getAssignationMarker();

	/**
	 * Returns the meta object for class '{@link Domain.SetupBlock <em>Setup Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup Block</em>'.
	 * @see Domain.SetupBlock
	 * @generated
	 */
	EClass getSetupBlock();

	/**
	 * Returns the meta object for the attribute '{@link Domain.SetupBlock#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see Domain.SetupBlock#getLanguage()
	 * @see #getSetupBlock()
	 * @generated
	 */
	EAttribute getSetupBlock_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link Domain.SetupBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see Domain.SetupBlock#getInstructions()
	 * @see #getSetupBlock()
	 * @generated
	 */
	EReference getSetupBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link Domain.StringInstruction <em>String Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Instruction</em>'.
	 * @see Domain.StringInstruction
	 * @generated
	 */
	EClass getStringInstruction();

	/**
	 * Returns the meta object for the attribute '{@link Domain.StringInstruction#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Domain.StringInstruction#getContent()
	 * @see #getStringInstruction()
	 * @generated
	 */
	EAttribute getStringInstruction_Content();

	/**
	 * Returns the meta object for class '{@link Domain.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see Domain.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the attribute list '{@link Domain.FunctionBlock#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see Domain.FunctionBlock#getParameters()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_Parameters();

	/**
	 * Returns the meta object for enum '{@link Domain.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see Domain.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link Domain.MarkerID <em>Marker ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marker ID</em>'.
	 * @see Domain.MarkerID
	 * @generated
	 */
	EEnum getMarkerID();

	/**
	 * Returns the meta object for enum '{@link Domain.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see Domain.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Domain.impl.DomainFrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.DomainFrameworkImpl
		 * @see Domain.impl.DomainPackageImpl#getDomainFramework()
		 * @generated
		 */
		EClass DOMAIN_FRAMEWORK = eINSTANCE.getDomainFramework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FRAMEWORK__NAME = eINSTANCE.getDomainFramework_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FRAMEWORK__DESCRIPTION = eINSTANCE.getDomainFramework_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_FRAMEWORK__PARAMETERS = eINSTANCE.getDomainFramework_Parameters();

		/**
		 * The meta object literal for the '<em><b>Setups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_FRAMEWORK__SETUPS = eINSTANCE.getDomainFramework_Setups();

		/**
		 * The meta object literal for the '<em><b>Function definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_FRAMEWORK__FUNCTION_DEFINITIONS = eINSTANCE.getDomainFramework_Function_definitions();

		/**
		 * The meta object literal for the '{@link Domain.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.ParameterImpl
		 * @see Domain.impl.DomainPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Function type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__FUNCTION_TYPE = eINSTANCE.getParameter_Function_type();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__MARKERS = eINSTANCE.getParameter_Markers();

		/**
		 * The meta object literal for the '<em><b>Default value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_Default_value();

		/**
		 * The meta object literal for the '<em><b>Default function value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_FUNCTION_VALUE = eINSTANCE.getParameter_Default_function_value();

		/**
		 * The meta object literal for the '{@link Domain.impl.SetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.SetupImpl
		 * @see Domain.impl.DomainPackageImpl#getSetup()
		 * @generated
		 */
		EClass SETUP = eINSTANCE.getSetup();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__INSTRUCTIONS = eINSTANCE.getSetup_Instructions();

		/**
		 * The meta object literal for the '{@link Domain.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.FunctionDefinitionImpl
		 * @see Domain.impl.DomainPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__DESCRIPTION = eINSTANCE.getFunctionDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__VALUES = eINSTANCE.getFunctionDefinition_Values();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__INPUTS = eINSTANCE.getFunctionDefinition_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__OUTPUTS = eINSTANCE.getFunctionDefinition_Outputs();

		/**
		 * The meta object literal for the '{@link Domain.impl.FunctionValueImpl <em>Function Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.FunctionValueImpl
		 * @see Domain.impl.DomainPackageImpl#getFunctionValue()
		 * @generated
		 */
		EClass FUNCTION_VALUE = eINSTANCE.getFunctionValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_VALUE__NAME = eINSTANCE.getFunctionValue_Name();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_VALUE__INSTRUCTIONS = eINSTANCE.getFunctionValue_Instructions();

		/**
		 * The meta object literal for the '{@link Domain.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.MarkerImpl
		 * @see Domain.impl.DomainPackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__NAME = eINSTANCE.getMarker_Name();

		/**
		 * The meta object literal for the '{@link Domain.impl.FunctionMarkerImpl <em>Function Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.FunctionMarkerImpl
		 * @see Domain.impl.DomainPackageImpl#getFunctionMarker()
		 * @generated
		 */
		EClass FUNCTION_MARKER = eINSTANCE.getFunctionMarker();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_MARKER__BLOCK = eINSTANCE.getFunctionMarker_Block();

		/**
		 * The meta object literal for the '{@link Domain.impl.AssignationMarkerImpl <em>Assignation Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.AssignationMarkerImpl
		 * @see Domain.impl.DomainPackageImpl#getAssignationMarker()
		 * @generated
		 */
		EClass ASSIGNATION_MARKER = eINSTANCE.getAssignationMarker();

		/**
		 * The meta object literal for the '{@link Domain.impl.SetupBlockImpl <em>Setup Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.SetupBlockImpl
		 * @see Domain.impl.DomainPackageImpl#getSetupBlock()
		 * @generated
		 */
		EClass SETUP_BLOCK = eINSTANCE.getSetupBlock();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_BLOCK__LANGUAGE = eINSTANCE.getSetupBlock_Language();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP_BLOCK__INSTRUCTIONS = eINSTANCE.getSetupBlock_Instructions();

		/**
		 * The meta object literal for the '{@link Domain.impl.StringInstructionImpl <em>String Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.StringInstructionImpl
		 * @see Domain.impl.DomainPackageImpl#getStringInstruction()
		 * @generated
		 */
		EClass STRING_INSTRUCTION = eINSTANCE.getStringInstruction();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_INSTRUCTION__CONTENT = eINSTANCE.getStringInstruction_Content();

		/**
		 * The meta object literal for the '{@link Domain.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.impl.FunctionBlockImpl
		 * @see Domain.impl.DomainPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BLOCK__PARAMETERS = eINSTANCE.getFunctionBlock_Parameters();

		/**
		 * The meta object literal for the '{@link Domain.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.Type
		 * @see Domain.impl.DomainPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link Domain.MarkerID <em>Marker ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.MarkerID
		 * @see Domain.impl.DomainPackageImpl#getMarkerID()
		 * @generated
		 */
		EEnum MARKER_ID = eINSTANCE.getMarkerID();

		/**
		 * The meta object literal for the '{@link Domain.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Domain.Language
		 * @see Domain.impl.DomainPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //DomainPackage
