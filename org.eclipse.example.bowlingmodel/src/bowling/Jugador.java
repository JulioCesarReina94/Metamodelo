/**
 */
package bowling;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jugador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Jugador#getNombre <em>Nombre</em>}</li>
 *   <li>{@link bowling.Jugador#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link bowling.Jugador#getAltura <em>Altura</em>}</li>
 *   <li>{@link bowling.Jugador#isEsProfesional <em>Es Profesional</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getJugador()
 * @model
 * @generated
 */
public interface Jugador extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see bowling.BowlingPackage#getJugador_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link bowling.Jugador#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(Date)
	 * @see bowling.BowlingPackage#getJugador_FechaNacimiento()
	 * @model
	 * @generated
	 */
	Date getFechaNacimiento();

	/**
	 * Sets the value of the '{@link bowling.Jugador#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(Date value);

	/**
	 * Returns the value of the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altura</em>' attribute.
	 * @see #setAltura(double)
	 * @see bowling.BowlingPackage#getJugador_Altura()
	 * @model
	 * @generated
	 */
	double getAltura();

	/**
	 * Sets the value of the '{@link bowling.Jugador#getAltura <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altura</em>' attribute.
	 * @see #getAltura()
	 * @generated
	 */
	void setAltura(double value);

	/**
	 * Returns the value of the '<em><b>Es Profesional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Profesional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Profesional</em>' attribute.
	 * @see #setEsProfesional(boolean)
	 * @see bowling.BowlingPackage#getJugador_EsProfesional()
	 * @model
	 * @generated
	 */
	boolean isEsProfesional();

	/**
	 * Sets the value of the '{@link bowling.Jugador#isEsProfesional <em>Es Profesional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Profesional</em>' attribute.
	 * @see #isEsProfesional()
	 * @generated
	 */
	void setEsProfesional(boolean value);

} // Jugador
