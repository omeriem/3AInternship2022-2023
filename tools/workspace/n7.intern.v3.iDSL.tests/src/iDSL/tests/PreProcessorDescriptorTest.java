/**
 */
package iDSL.tests;

import iDSL.IDSLFactory;
import iDSL.PreProcessorDescriptor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pre Processor Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreProcessorDescriptorTest extends InterfacerDescriptorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreProcessorDescriptorTest.class);
	}

	/**
	 * Constructs a new Pre Processor Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreProcessorDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pre Processor Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PreProcessorDescriptor getFixture() {
		return (PreProcessorDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IDSLFactory.eINSTANCE.createPreProcessorDescriptor());
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

} //PreProcessorDescriptorTest
