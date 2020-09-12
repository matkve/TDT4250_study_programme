/**
 */
package tdt4250.study_program.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.study_program.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Study_programFactoryImpl extends EFactoryImpl implements Study_programFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Study_programFactory init() {
		try {
			Study_programFactory theStudy_programFactory = (Study_programFactory)EPackage.Registry.INSTANCE.getEFactory(Study_programPackage.eNS_URI);
			if (theStudy_programFactory != null) {
				return theStudy_programFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Study_programFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Study_programFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Study_programPackage.PROGRAMME: return createProgramme();
			case Study_programPackage.COURSE: return createCourse();
			case Study_programPackage.SEMESTER: return createSemester();
			case Study_programPackage.YEAR: return createYear();
			case Study_programPackage.UNIVERSITY: return createUniversity();
			case Study_programPackage.ELECTIVE_GROUP: return createElectiveGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Study_programPackage.SEASON_KIND:
				return createSeasonKindFromString(eDataType, initialValue);
			case Study_programPackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Study_programPackage.SEASON_KIND:
				return convertSeasonKindToString(eDataType, instanceValue);
			case Study_programPackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveGroup createElectiveGroup() {
		ElectiveGroupImpl electiveGroup = new ElectiveGroupImpl();
		return electiveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonKind createSeasonKindFromString(EDataType eDataType, String initialValue) {
		SeasonKind result = SeasonKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		if (!initialValue.matches("[A-Z]+[0-9]+")) {
			throw new IllegalArgumentException("Course code must have the format '[A-Z]+[0-9]+'");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Study_programPackage getStudy_programPackage() {
		return (Study_programPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Study_programPackage getPackage() {
		return Study_programPackage.eINSTANCE;
	}

} //Study_programFactoryImpl
