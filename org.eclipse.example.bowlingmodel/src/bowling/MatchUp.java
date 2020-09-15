/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Up</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.MatchUp#getJuegos <em>Juegos</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getMatchUp()
 * @model
 * @generated
 */
public interface MatchUp extends EObject {
	/**
	 * Returns the value of the '<em><b>Juegos</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Juego}.
	 * It is bidirectional and its opposite is '{@link bowling.Juego#getMatchup <em>Matchup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juegos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juegos</em>' containment reference list.
	 * @see bowling.BowlingPackage#getMatchUp_Juegos()
	 * @see bowling.Juego#getMatchup
	 * @model opposite="matchup" containment="true"
	 * @generated
	 */
	EList<Juego> getJuegos();

} // MatchUp
