/**
 */
package iDSL.tests;

import iDSL.IDSLFactory;
import iDSL.IotFramework;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iot Framework</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotFrameworkTest extends TestCase {

	/**
	 * The fixture for this Iot Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotFramework fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IotFrameworkTest.class);
	}

	/**
	 * Constructs a new Iot Framework test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotFrameworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Iot Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IotFramework fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Iot Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotFramework getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IDSLFactory.eINSTANCE.createIotFramework());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IotFrameworkTest