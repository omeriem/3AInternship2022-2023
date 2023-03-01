/**
 */
package iDSL.tests;

import iDSL.DataProcessorDescriptor;
import iDSL.IDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Processor Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataProcessorDescriptorTest extends InterfacerDescriptorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataProcessorDescriptorTest.class);
	}

	/**
	 * Constructs a new Data Processor Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessorDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Processor Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataProcessorDescriptor getFixture() {
		return (DataProcessorDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IDSLFactory.eINSTANCE.createDataProcessorDescriptor());
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

} //DataProcessorDescriptorTest
