/**
 */
package bowling.util;

import bowling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bowling.BowlingPackage
 * @generated
 */
public class BowlingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BowlingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BowlingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BowlingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BowlingSwitch<Adapter> modelSwitch =
		new BowlingSwitch<Adapter>() {
			@Override
			public Adapter caseJugador(Jugador object) {
				return createJugadorAdapter();
			}
			@Override
			public Adapter caseLiga(Liga object) {
				return createLigaAdapter();
			}
			@Override
			public Adapter caseTorneo(Torneo object) {
				return createTorneoAdapter();
			}
			@Override
			public Adapter caseMatchUp(MatchUp object) {
				return createMatchUpAdapter();
			}
			@Override
			public Adapter caseJuego(Juego object) {
				return createJuegoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bowling.Jugador <em>Jugador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bowling.Jugador
	 * @generated
	 */
	public Adapter createJugadorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bowling.Liga <em>Liga</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bowling.Liga
	 * @generated
	 */
	public Adapter createLigaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bowling.Torneo <em>Torneo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bowling.Torneo
	 * @generated
	 */
	public Adapter createTorneoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bowling.MatchUp <em>Match Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bowling.MatchUp
	 * @generated
	 */
	public Adapter createMatchUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bowling.Juego <em>Juego</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bowling.Juego
	 * @generated
	 */
	public Adapter createJuegoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BowlingAdapterFactory
