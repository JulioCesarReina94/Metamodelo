/**
 */
package bowling.tests;

import bowling.BowlingFactory;
import bowling.Torneo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Torneo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TorneoTest extends TestCase {

	/**
	 * The fixture for this Torneo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Torneo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TorneoTest.class);
	}

	/**
	 * Constructs a new Torneo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TorneoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Torneo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Torneo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Torneo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Torneo getFixture() {
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
		setFixture(BowlingFactory.eINSTANCE.createTorneo());
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

} //TorneoTest
