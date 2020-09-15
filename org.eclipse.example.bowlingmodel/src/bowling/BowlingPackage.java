/**
 */
package bowling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bowling.BowlingFactory
 * @model kind="package"
 * @generated
 */
public interface BowlingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bowling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/example/bowling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.bowling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BowlingPackage eINSTANCE = bowling.impl.BowlingPackageImpl.init();

	/**
	 * The meta object id for the '{@link bowling.impl.JugadorImpl <em>Jugador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.impl.JugadorImpl
	 * @see bowling.impl.BowlingPackageImpl#getJugador()
	 * @generated
	 */
	int JUGADOR = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR__FECHA_NACIMIENTO = 1;

	/**
	 * The feature id for the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR__ALTURA = 2;

	/**
	 * The feature id for the '<em><b>Es Profesional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR__ES_PROFESIONAL = 3;

	/**
	 * The number of structural features of the '<em>Jugador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Jugador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUGADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bowling.impl.LigaImpl <em>Liga</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.impl.LigaImpl
	 * @see bowling.impl.BowlingPackageImpl#getLiga()
	 * @generated
	 */
	int LIGA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Jugadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGA__JUGADORES = 1;

	/**
	 * The number of structural features of the '<em>Liga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Liga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGA_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link bowling.impl.TorneoImpl <em>Torneo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.impl.TorneoImpl
	 * @see bowling.impl.BowlingPackageImpl#getTorneo()
	 * @generated
	 */
	int TORNEO = 2;

	/**
	 * The feature id for the '<em><b>Matchups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNEO__MATCHUPS = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNEO__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Torneo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNEO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Torneo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bowling.impl.MatchUpImpl <em>Match Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.impl.MatchUpImpl
	 * @see bowling.impl.BowlingPackageImpl#getMatchUp()
	 * @generated
	 */
	int MATCH_UP = 3;

	/**
	 * The feature id for the '<em><b>Juegos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_UP__JUEGOS = 0;

	/**
	 * The number of structural features of the '<em>Match Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_UP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Match Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_UP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bowling.impl.JuegoImpl <em>Juego</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.impl.JuegoImpl
	 * @see bowling.impl.BowlingPackageImpl#getJuego()
	 * @generated
	 */
	int JUEGO = 4;

	/**
	 * The feature id for the '<em><b>Matchup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUEGO__MATCHUP = 0;

	/**
	 * The feature id for the '<em><b>Jugador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUEGO__JUGADOR = 1;

	/**
	 * The number of structural features of the '<em>Juego</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUEGO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Juego</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUEGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bowling.TipoTorneo <em>Tipo Torneo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bowling.TipoTorneo
	 * @see bowling.impl.BowlingPackageImpl#getTipoTorneo()
	 * @generated
	 */
	int TIPO_TORNEO = 5;


	/**
	 * Returns the meta object for class '{@link bowling.Jugador <em>Jugador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jugador</em>'.
	 * @see bowling.Jugador
	 * @generated
	 */
	EClass getJugador();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Jugador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see bowling.Jugador#getNombre()
	 * @see #getJugador()
	 * @generated
	 */
	EAttribute getJugador_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Jugador#getFechaNacimiento <em>Fecha Nacimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Nacimiento</em>'.
	 * @see bowling.Jugador#getFechaNacimiento()
	 * @see #getJugador()
	 * @generated
	 */
	EAttribute getJugador_FechaNacimiento();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Jugador#getAltura <em>Altura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altura</em>'.
	 * @see bowling.Jugador#getAltura()
	 * @see #getJugador()
	 * @generated
	 */
	EAttribute getJugador_Altura();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Jugador#isEsProfesional <em>Es Profesional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Profesional</em>'.
	 * @see bowling.Jugador#isEsProfesional()
	 * @see #getJugador()
	 * @generated
	 */
	EAttribute getJugador_EsProfesional();

	/**
	 * Returns the meta object for class '{@link bowling.Liga <em>Liga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liga</em>'.
	 * @see bowling.Liga
	 * @generated
	 */
	EClass getLiga();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Liga#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see bowling.Liga#getNombre()
	 * @see #getLiga()
	 * @generated
	 */
	EAttribute getLiga_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link bowling.Liga#getJugadores <em>Jugadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jugadores</em>'.
	 * @see bowling.Liga#getJugadores()
	 * @see #getLiga()
	 * @generated
	 */
	EReference getLiga_Jugadores();

	/**
	 * Returns the meta object for class '{@link bowling.Torneo <em>Torneo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Torneo</em>'.
	 * @see bowling.Torneo
	 * @generated
	 */
	EClass getTorneo();

	/**
	 * Returns the meta object for the containment reference list '{@link bowling.Torneo#getMatchups <em>Matchups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchups</em>'.
	 * @see bowling.Torneo#getMatchups()
	 * @see #getTorneo()
	 * @generated
	 */
	EReference getTorneo_Matchups();

	/**
	 * Returns the meta object for the attribute '{@link bowling.Torneo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see bowling.Torneo#getTipo()
	 * @see #getTorneo()
	 * @generated
	 */
	EAttribute getTorneo_Tipo();

	/**
	 * Returns the meta object for class '{@link bowling.MatchUp <em>Match Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Up</em>'.
	 * @see bowling.MatchUp
	 * @generated
	 */
	EClass getMatchUp();

	/**
	 * Returns the meta object for the containment reference list '{@link bowling.MatchUp#getJuegos <em>Juegos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Juegos</em>'.
	 * @see bowling.MatchUp#getJuegos()
	 * @see #getMatchUp()
	 * @generated
	 */
	EReference getMatchUp_Juegos();

	/**
	 * Returns the meta object for class '{@link bowling.Juego <em>Juego</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juego</em>'.
	 * @see bowling.Juego
	 * @generated
	 */
	EClass getJuego();

	/**
	 * Returns the meta object for the container reference '{@link bowling.Juego#getMatchup <em>Matchup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Matchup</em>'.
	 * @see bowling.Juego#getMatchup()
	 * @see #getJuego()
	 * @generated
	 */
	EReference getJuego_Matchup();

	/**
	 * Returns the meta object for the reference '{@link bowling.Juego#getJugador <em>Jugador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jugador</em>'.
	 * @see bowling.Juego#getJugador()
	 * @see #getJuego()
	 * @generated
	 */
	EReference getJuego_Jugador();

	/**
	 * Returns the meta object for enum '{@link bowling.TipoTorneo <em>Tipo Torneo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Torneo</em>'.
	 * @see bowling.TipoTorneo
	 * @generated
	 */
	EEnum getTipoTorneo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BowlingFactory getBowlingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bowling.impl.JugadorImpl <em>Jugador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.impl.JugadorImpl
		 * @see bowling.impl.BowlingPackageImpl#getJugador()
		 * @generated
		 */
		EClass JUGADOR = eINSTANCE.getJugador();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUGADOR__NOMBRE = eINSTANCE.getJugador_Nombre();

		/**
		 * The meta object literal for the '<em><b>Fecha Nacimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUGADOR__FECHA_NACIMIENTO = eINSTANCE.getJugador_FechaNacimiento();

		/**
		 * The meta object literal for the '<em><b>Altura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUGADOR__ALTURA = eINSTANCE.getJugador_Altura();

		/**
		 * The meta object literal for the '<em><b>Es Profesional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUGADOR__ES_PROFESIONAL = eINSTANCE.getJugador_EsProfesional();

		/**
		 * The meta object literal for the '{@link bowling.impl.LigaImpl <em>Liga</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.impl.LigaImpl
		 * @see bowling.impl.BowlingPackageImpl#getLiga()
		 * @generated
		 */
		EClass LIGA = eINSTANCE.getLiga();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGA__NOMBRE = eINSTANCE.getLiga_Nombre();

		/**
		 * The meta object literal for the '<em><b>Jugadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGA__JUGADORES = eINSTANCE.getLiga_Jugadores();

		/**
		 * The meta object literal for the '{@link bowling.impl.TorneoImpl <em>Torneo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.impl.TorneoImpl
		 * @see bowling.impl.BowlingPackageImpl#getTorneo()
		 * @generated
		 */
		EClass TORNEO = eINSTANCE.getTorneo();

		/**
		 * The meta object literal for the '<em><b>Matchups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNEO__MATCHUPS = eINSTANCE.getTorneo_Matchups();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TORNEO__TIPO = eINSTANCE.getTorneo_Tipo();

		/**
		 * The meta object literal for the '{@link bowling.impl.MatchUpImpl <em>Match Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.impl.MatchUpImpl
		 * @see bowling.impl.BowlingPackageImpl#getMatchUp()
		 * @generated
		 */
		EClass MATCH_UP = eINSTANCE.getMatchUp();

		/**
		 * The meta object literal for the '<em><b>Juegos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_UP__JUEGOS = eINSTANCE.getMatchUp_Juegos();

		/**
		 * The meta object literal for the '{@link bowling.impl.JuegoImpl <em>Juego</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.impl.JuegoImpl
		 * @see bowling.impl.BowlingPackageImpl#getJuego()
		 * @generated
		 */
		EClass JUEGO = eINSTANCE.getJuego();

		/**
		 * The meta object literal for the '<em><b>Matchup</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUEGO__MATCHUP = eINSTANCE.getJuego_Matchup();

		/**
		 * The meta object literal for the '<em><b>Jugador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUEGO__JUGADOR = eINSTANCE.getJuego_Jugador();

		/**
		 * The meta object literal for the '{@link bowling.TipoTorneo <em>Tipo Torneo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bowling.TipoTorneo
		 * @see bowling.impl.BowlingPackageImpl#getTipoTorneo()
		 * @generated
		 */
		EEnum TIPO_TORNEO = eINSTANCE.getTipoTorneo();

	}

} //BowlingPackage
