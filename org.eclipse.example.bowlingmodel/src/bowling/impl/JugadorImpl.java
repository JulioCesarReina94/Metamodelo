/**
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.Jugador;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jugador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bowling.impl.JugadorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link bowling.impl.JugadorImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link bowling.impl.JugadorImpl#getAltura <em>Altura</em>}</li>
 *   <li>{@link bowling.impl.JugadorImpl#isEsProfesional <em>Es Profesional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JugadorImpl extends MinimalEObjectImpl.Container implements Jugador {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_NACIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected Date fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTURA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected double altura = ALTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsProfesional() <em>Es Profesional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsProfesional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_PROFESIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsProfesional() <em>Es Profesional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsProfesional()
	 * @generated
	 * @ordered
	 */
	protected boolean esProfesional = ES_PROFESIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JugadorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.JUGADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUGADOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaNacimiento(Date newFechaNacimiento) {
		Date oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUGADOR__FECHA_NACIMIENTO, oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltura(double newAltura) {
		double oldAltura = altura;
		altura = newAltura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUGADOR__ALTURA, oldAltura, altura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsProfesional() {
		return esProfesional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsProfesional(boolean newEsProfesional) {
		boolean oldEsProfesional = esProfesional;
		esProfesional = newEsProfesional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUGADOR__ES_PROFESIONAL, oldEsProfesional, esProfesional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.JUGADOR__NOMBRE:
				return getNombre();
			case BowlingPackage.JUGADOR__FECHA_NACIMIENTO:
				return getFechaNacimiento();
			case BowlingPackage.JUGADOR__ALTURA:
				return getAltura();
			case BowlingPackage.JUGADOR__ES_PROFESIONAL:
				return isEsProfesional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BowlingPackage.JUGADOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case BowlingPackage.JUGADOR__FECHA_NACIMIENTO:
				setFechaNacimiento((Date)newValue);
				return;
			case BowlingPackage.JUGADOR__ALTURA:
				setAltura((Double)newValue);
				return;
			case BowlingPackage.JUGADOR__ES_PROFESIONAL:
				setEsProfesional((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BowlingPackage.JUGADOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case BowlingPackage.JUGADOR__FECHA_NACIMIENTO:
				setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
				return;
			case BowlingPackage.JUGADOR__ALTURA:
				setAltura(ALTURA_EDEFAULT);
				return;
			case BowlingPackage.JUGADOR__ES_PROFESIONAL:
				setEsProfesional(ES_PROFESIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BowlingPackage.JUGADOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case BowlingPackage.JUGADOR__FECHA_NACIMIENTO:
				return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null : !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
			case BowlingPackage.JUGADOR__ALTURA:
				return altura != ALTURA_EDEFAULT;
			case BowlingPackage.JUGADOR__ES_PROFESIONAL:
				return esProfesional != ES_PROFESIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", altura: ");
		result.append(altura);
		result.append(", esProfesional: ");
		result.append(esProfesional);
		result.append(')');
		return result.toString();
	}

} //JugadorImpl
