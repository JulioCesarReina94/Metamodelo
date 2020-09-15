/**
 */
package bowling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bowling.BowlingPackage
 * @generated
 */
public interface BowlingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BowlingFactory eINSTANCE = bowling.impl.BowlingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jugador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jugador</em>'.
	 * @generated
	 */
	Jugador createJugador();

	/**
	 * Returns a new object of class '<em>Liga</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liga</em>'.
	 * @generated
	 */
	Liga createLiga();

	/**
	 * Returns a new object of class '<em>Torneo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Torneo</em>'.
	 * @generated
	 */
	Torneo createTorneo();

	/**
	 * Returns a new object of class '<em>Match Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Up</em>'.
	 * @generated
	 */
	MatchUp createMatchUp();

	/**
	 * Returns a new object of class '<em>Juego</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Juego</em>'.
	 * @generated
	 */
	Juego createJuego();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BowlingPackage getBowlingPackage();

} //BowlingFactory
