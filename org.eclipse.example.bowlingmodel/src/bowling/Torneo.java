/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Torneo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Torneo#getMatchups <em>Matchups</em>}</li>
 *   <li>{@link bowling.Torneo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getTorneo()
 * @model
 * @generated
 */
public interface Torneo extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.MatchUp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' containment reference list.
	 * @see bowling.BowlingPackage#getTorneo_Matchups()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchUp> getMatchups();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link bowling.TipoTorneo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see bowling.TipoTorneo
	 * @see #setTipo(TipoTorneo)
	 * @see bowling.BowlingPackage#getTorneo_Tipo()
	 * @model
	 * @generated
	 */
	TipoTorneo getTipo();

	/**
	 * Sets the value of the '{@link bowling.Torneo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see bowling.TipoTorneo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoTorneo value);

} // Torneo
