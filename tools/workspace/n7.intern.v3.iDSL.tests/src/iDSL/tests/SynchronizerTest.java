/**
 */
package iDSL.tests;

import iDSL.IDSLFactory;
import iDSL.Synchronizer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronizer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizerTest extends InterfacerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronizerTest.class);
	}

	/**
	 * Constructs a new Synchronizer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Synchronizer getFixture() {
		return (Synchronizer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IDSLFactory.eINSTANCE.createSynchronizer());
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

} //SynchronizerTest
