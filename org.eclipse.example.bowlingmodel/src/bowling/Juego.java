/**
 */
package bowling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Juego</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Juego#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link bowling.Juego#getJugador <em>Jugador</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getJuego()
 * @model
 * @generated
 */
public interface Juego extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link bowling.MatchUp#getJuegos <em>Juegos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchup</em>' container reference.
	 * @see #setMatchup(MatchUp)
	 * @see bowling.BowlingPackage#getJuego_Matchup()
	 * @see bowling.MatchUp#getJuegos
	 * @model opposite="juegos" transient="false"
	 * @generated
	 */
	MatchUp getMatchup();

	/**
	 * Sets the value of the '{@link bowling.Juego#getMatchup <em>Matchup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchup</em>' container reference.
	 * @see #getMatchup()
	 * @generated
	 */
	void setMatchup(MatchUp value);

	/**
	 * Returns the value of the '<em><b>Jugador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jugador</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jugador</em>' reference.
	 * @see #setJugador(Jugador)
	 * @see bowling.BowlingPackage#getJuego_Jugador()
	 * @model
	 * @generated
	 */
	Jugador getJugador();

	/**
	 * Sets the value of the '{@link bowling.Juego#getJugador <em>Jugador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jugador</em>' reference.
	 * @see #getJugador()
	 * @generated
	 */
	void setJugador(Jugador value);

} // Juego
