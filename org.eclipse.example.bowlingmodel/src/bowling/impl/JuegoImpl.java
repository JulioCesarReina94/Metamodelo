/**
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.Juego;
import bowling.Jugador;
import bowling.MatchUp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juego</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bowling.impl.JuegoImpl#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link bowling.impl.JuegoImpl#getJugador <em>Jugador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JuegoImpl extends MinimalEObjectImpl.Container implements Juego {
	/**
	 * The cached value of the '{@link #getJugador() <em>Jugador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugador()
	 * @generated
	 * @ordered
	 */
	protected Jugador jugador;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuegoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.JUEGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchUp getMatchup() {
		if (eContainerFeatureID() != BowlingPackage.JUEGO__MATCHUP) return null;
		return (MatchUp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchup(MatchUp newMatchup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatchup, BowlingPackage.JUEGO__MATCHUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchup(MatchUp newMatchup) {
		if (newMatchup != eInternalContainer() || (eContainerFeatureID() != BowlingPackage.JUEGO__MATCHUP && newMatchup != null)) {
			if (EcoreUtil.isAncestor(this, newMatchup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatchup != null)
				msgs = ((InternalEObject)newMatchup).eInverseAdd(this, BowlingPackage.MATCH_UP__JUEGOS, MatchUp.class, msgs);
			msgs = basicSetMatchup(newMatchup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUEGO__MATCHUP, newMatchup, newMatchup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jugador getJugador() {
		if (jugador != null && jugador.eIsProxy()) {
			InternalEObject oldJugador = (InternalEObject)jugador;
			jugador = (Jugador)eResolveProxy(oldJugador);
			if (jugador != oldJugador) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BowlingPackage.JUEGO__JUGADOR, oldJugador, jugador));
			}
		}
		return jugador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jugador basicGetJugador() {
		return jugador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJugador(Jugador newJugador) {
		Jugador oldJugador = jugador;
		jugador = newJugador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.JUEGO__JUGADOR, oldJugador, jugador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BowlingPackage.JUEGO__MATCHUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatchup((MatchUp)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BowlingPackage.JUEGO__MATCHUP:
				return basicSetMatchup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BowlingPackage.JUEGO__MATCHUP:
				return eInternalContainer().eInverseRemove(this, BowlingPackage.MATCH_UP__JUEGOS, MatchUp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.JUEGO__MATCHUP:
				return getMatchup();
			case BowlingPackage.JUEGO__JUGADOR:
				if (resolve) return getJugador();
				return basicGetJugador();
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
			case BowlingPackage.JUEGO__MATCHUP:
				setMatchup((MatchUp)newValue);
				return;
			case BowlingPackage.JUEGO__JUGADOR:
				setJugador((Jugador)newValue);
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
			case BowlingPackage.JUEGO__MATCHUP:
				setMatchup((MatchUp)null);
				return;
			case BowlingPackage.JUEGO__JUGADOR:
				setJugador((Jugador)null);
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
			case BowlingPackage.JUEGO__MATCHUP:
				return getMatchup() != null;
			case BowlingPackage.JUEGO__JUGADOR:
				return jugador != null;
		}
		return super.eIsSet(featureID);
	}

} //JuegoImpl
