/**
 */
package bowling.tests;

import bowling.BowlingFactory;
import bowling.MatchUp;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Match Up</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchUpTest extends TestCase {

	/**
	 * The fixture for this Match Up test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchUp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatchUpTest.class);
	}

	/**
	 * Constructs a new Match Up test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchUpTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Match Up test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MatchUp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Match Up test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchUp getFixture() {
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
		setFixture(BowlingFactory.eINSTANCE.createMatchUp());
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

} //MatchUpTest
