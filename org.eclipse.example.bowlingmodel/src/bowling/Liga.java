/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liga</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Liga#getNombre <em>Nombre</em>}</li>
 *   <li>{@link bowling.Liga#getJugadores <em>Jugadores</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getLiga()
 * @model
 * @generated
 */
public interface Liga extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see bowling.BowlingPackage#getLiga_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link bowling.Liga#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Jugadores</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Jugador}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jugadores</em>' containment reference list.
	 * @see bowling.BowlingPackage#getLiga_Jugadores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Jugador> getJugadores();

} // Liga
