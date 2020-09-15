/**
 */
package bowling.impl;

import bowling.BowlingFactory;
import bowling.BowlingPackage;
import bowling.Juego;
import bowling.Jugador;
import bowling.Liga;

import bowling.MatchUp;
import bowling.TipoTorneo;
import bowling.Torneo;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BowlingPackageImpl extends EPackageImpl implements BowlingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jugadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ligaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass torneoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchUpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juegoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoTorneoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bowling.BowlingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BowlingPackageImpl() {
		super(eNS_URI, BowlingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BowlingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BowlingPackage init() {
		if (isInited) return (BowlingPackage)EPackage.Registry.INSTANCE.getEPackage(BowlingPackage.eNS_URI);

		// Obtain or create and register package
		BowlingPackageImpl theBowlingPackage = (BowlingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BowlingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BowlingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBowlingPackage.createPackageContents();

		// Initialize created meta-data
		theBowlingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBowlingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BowlingPackage.eNS_URI, theBowlingPackage);
		return theBowlingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJugador() {
		return jugadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJugador_Nombre() {
		return (EAttribute)jugadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJugador_FechaNacimiento() {
		return (EAttribute)jugadorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJugador_Altura() {
		return (EAttribute)jugadorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJugador_EsProfesional() {
		return (EAttribute)jugadorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiga() {
		return ligaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiga_Nombre() {
		return (EAttribute)ligaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiga_Jugadores() {
		return (EReference)ligaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTorneo() {
		return torneoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTorneo_Matchups() {
		return (EReference)torneoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTorneo_Tipo() {
		return (EAttribute)torneoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchUp() {
		return matchUpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchUp_Juegos() {
		return (EReference)matchUpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuego() {
		return juegoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuego_Matchup() {
		return (EReference)juegoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuego_Jugador() {
		return (EReference)juegoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoTorneo() {
		return tipoTorneoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BowlingFactory getBowlingFactory() {
		return (BowlingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jugadorEClass = createEClass(JUGADOR);
		createEAttribute(jugadorEClass, JUGADOR__NOMBRE);
		createEAttribute(jugadorEClass, JUGADOR__FECHA_NACIMIENTO);
		createEAttribute(jugadorEClass, JUGADOR__ALTURA);
		createEAttribute(jugadorEClass, JUGADOR__ES_PROFESIONAL);

		ligaEClass = createEClass(LIGA);
		createEAttribute(ligaEClass, LIGA__NOMBRE);
		createEReference(ligaEClass, LIGA__JUGADORES);

		torneoEClass = createEClass(TORNEO);
		createEReference(torneoEClass, TORNEO__MATCHUPS);
		createEAttribute(torneoEClass, TORNEO__TIPO);

		matchUpEClass = createEClass(MATCH_UP);
		createEReference(matchUpEClass, MATCH_UP__JUEGOS);

		juegoEClass = createEClass(JUEGO);
		createEReference(juegoEClass, JUEGO__MATCHUP);
		createEReference(juegoEClass, JUEGO__JUGADOR);

		// Create enums
		tipoTorneoEEnum = createEEnum(TIPO_TORNEO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(jugadorEClass, Jugador.class, "Jugador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJugador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Jugador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJugador_FechaNacimiento(), ecorePackage.getEDate(), "fechaNacimiento", null, 0, 1, Jugador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJugador_Altura(), ecorePackage.getEDouble(), "altura", null, 0, 1, Jugador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJugador_EsProfesional(), ecorePackage.getEBoolean(), "esProfesional", null, 0, 1, Jugador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ligaEClass, Liga.class, "Liga", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiga_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Liga.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiga_Jugadores(), this.getJugador(), null, "jugadores", null, 0, -1, Liga.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(torneoEClass, Torneo.class, "Torneo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTorneo_Matchups(), this.getMatchUp(), null, "matchups", null, 0, -1, Torneo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTorneo_Tipo(), this.getTipoTorneo(), "tipo", null, 0, 1, Torneo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchUpEClass, MatchUp.class, "MatchUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchUp_Juegos(), this.getJuego(), this.getJuego_Matchup(), "juegos", null, 0, -1, MatchUp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juegoEClass, Juego.class, "Juego", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJuego_Matchup(), this.getMatchUp(), this.getMatchUp_Juegos(), "matchup", null, 0, 1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuego_Jugador(), this.getJugador(), null, "jugador", null, 0, 1, Juego.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoTorneoEEnum, TipoTorneo.class, "TipoTorneo");
		addEEnumLiteral(tipoTorneoEEnum, TipoTorneo.PRO);
		addEEnumLiteral(tipoTorneoEEnum, TipoTorneo.AMATEUR);

		// Create resource
		createResource(eNS_URI);
	}

} //BowlingPackageImpl
