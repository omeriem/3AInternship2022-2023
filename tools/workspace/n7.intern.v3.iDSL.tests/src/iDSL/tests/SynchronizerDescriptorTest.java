/**
 */
package iDSL.tests;

import iDSL.IDSLFactory;
import iDSL.SynchronizerDescriptor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronizer Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizerDescriptorTest extends InterfacerDescriptorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronizerDescriptorTest.class);
	}

	/**
	 * Constructs a new Synchronizer Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizerDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronizer Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SynchronizerDescriptor getFixture() {
		return (SynchronizerDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IDSLFactory.eINSTANCE.createSynchronizerDescriptor());
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

} //SynchronizerDescriptorTest
