/**
 */
package tdt4250.study_program;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see tdt4250.study_program.Study_programFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface Study_programPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "study_program";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///study_program.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "study_program";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Study_programPackage eINSTANCE = tdt4250.study_program.impl.Study_programPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.ProgrammeImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Year</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__FIRST_YEAR = 1;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.CourseImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEASON = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.SemesterImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Elective Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVE_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEASON = 3;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.YearImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 3;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Next Year</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NEXT_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Previous Year</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__PREVIOUS_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SPECIALISATION = 3;

	/**
	 * The feature id for the '<em><b>Year Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEAR_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__PROGRAMME = 5;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.UniversityImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 4;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.impl.ElectiveGroupImpl <em>Elective Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.impl.ElectiveGroupImpl
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getElectiveGroup()
	 * @generated
	 */
	int ELECTIVE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Credits Per Elective In Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Min To Choose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP__MIN_TO_CHOOSE = 2;

	/**
	 * The feature id for the '<em><b>Electives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP__ELECTIVES = 3;

	/**
	 * The number of structural features of the '<em>Elective Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Elective Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.study_program.SeasonKind <em>Season Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.study_program.SeasonKind
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getSeasonKind()
	 * @generated
	 */
	int SEASON_KIND = 6;


	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tdt4250.study_program.impl.Study_programPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 7;


	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see tdt4250.study_program.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.study_program.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.Programme#getFirstYear <em>First Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>First Year</em>'.
	 * @see tdt4250.study_program.Programme#getFirstYear()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_FirstYear();

	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.study_program.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.study_program.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.study_program.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250.study_program.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Course#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see tdt4250.study_program.Course#getSeason()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Season();

	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see tdt4250.study_program.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.study_program.Semester#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory</em>'.
	 * @see tdt4250.study_program.Semester#getMandatory()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.Semester#getElectiveGroups <em>Elective Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elective Groups</em>'.
	 * @see tdt4250.study_program.Semester#getElectiveGroups()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_ElectiveGroups();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.study_program.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Year</em>'.
	 * @see tdt4250.study_program.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Semester#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see tdt4250.study_program.Semester#getSeason()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Season();

	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see tdt4250.study_program.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see tdt4250.study_program.Year#getSemesters()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Semesters();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.Year#getNextYear <em>Next Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Year</em>'.
	 * @see tdt4250.study_program.Year#getNextYear()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_NextYear();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.study_program.Year#getPreviousYear <em>Previous Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous Year</em>'.
	 * @see tdt4250.study_program.Year#getPreviousYear()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_PreviousYear();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Year#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialisation</em>'.
	 * @see tdt4250.study_program.Year#getSpecialisation()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Specialisation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.Year#getYearNumber <em>Year Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Number</em>'.
	 * @see tdt4250.study_program.Year#getYearNumber()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_YearNumber();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.study_program.Year#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see tdt4250.study_program.Year#getProgramme()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Programme();

	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see tdt4250.study_program.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.University#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see tdt4250.study_program.University#getProgrammes()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.study_program.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see tdt4250.study_program.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.study_program.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.study_program.ElectiveGroup <em>Elective Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Group</em>'.
	 * @see tdt4250.study_program.ElectiveGroup
	 * @generated
	 */
	EClass getElectiveGroup();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.ElectiveGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tdt4250.study_program.ElectiveGroup#getDescription()
	 * @see #getElectiveGroup()
	 * @generated
	 */
	EAttribute getElectiveGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.ElectiveGroup#getCreditsPerElectiveInGroup <em>Credits Per Elective In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits Per Elective In Group</em>'.
	 * @see tdt4250.study_program.ElectiveGroup#getCreditsPerElectiveInGroup()
	 * @see #getElectiveGroup()
	 * @generated
	 */
	EAttribute getElectiveGroup_CreditsPerElectiveInGroup();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.study_program.ElectiveGroup#getMinToChoose <em>Min To Choose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min To Choose</em>'.
	 * @see tdt4250.study_program.ElectiveGroup#getMinToChoose()
	 * @see #getElectiveGroup()
	 * @generated
	 */
	EAttribute getElectiveGroup_MinToChoose();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.study_program.ElectiveGroup#getElectives <em>Electives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electives</em>'.
	 * @see tdt4250.study_program.ElectiveGroup#getElectives()
	 * @see #getElectiveGroup()
	 * @generated
	 */
	EReference getElectiveGroup_Electives();

	/**
	 * Returns the meta object for enum '{@link tdt4250.study_program.SeasonKind <em>Season Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season Kind</em>'.
	 * @see tdt4250.study_program.SeasonKind
	 * @generated
	 */
	EEnum getSeasonKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Study_programFactory getStudy_programFactory();

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
		 * The meta object literal for the '{@link tdt4250.study_program.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.ProgrammeImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>First Year</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__FIRST_YEAR = eINSTANCE.getProgramme_FirstYear();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.CourseImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SEASON = eINSTANCE.getCourse_Season();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.SemesterImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY = eINSTANCE.getSemester_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Elective Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVE_GROUPS = eINSTANCE.getSemester_ElectiveGroups();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEASON = eINSTANCE.getSemester_Season();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.YearImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SEMESTERS = eINSTANCE.getYear_Semesters();

		/**
		 * The meta object literal for the '<em><b>Next Year</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__NEXT_YEAR = eINSTANCE.getYear_NextYear();

		/**
		 * The meta object literal for the '<em><b>Previous Year</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__PREVIOUS_YEAR = eINSTANCE.getYear_PreviousYear();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__SPECIALISATION = eINSTANCE.getYear_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Year Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__YEAR_NUMBER = eINSTANCE.getYear_YearNumber();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__PROGRAMME = eINSTANCE.getYear_Programme();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.UniversityImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PROGRAMMES = eINSTANCE.getUniversity_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.impl.ElectiveGroupImpl <em>Elective Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.impl.ElectiveGroupImpl
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getElectiveGroup()
		 * @generated
		 */
		EClass ELECTIVE_GROUP = eINSTANCE.getElectiveGroup();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTIVE_GROUP__DESCRIPTION = eINSTANCE.getElectiveGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Credits Per Elective In Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP = eINSTANCE.getElectiveGroup_CreditsPerElectiveInGroup();

		/**
		 * The meta object literal for the '<em><b>Min To Choose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTIVE_GROUP__MIN_TO_CHOOSE = eINSTANCE.getElectiveGroup_MinToChoose();

		/**
		 * The meta object literal for the '<em><b>Electives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_GROUP__ELECTIVES = eINSTANCE.getElectiveGroup_Electives();

		/**
		 * The meta object literal for the '{@link tdt4250.study_program.SeasonKind <em>Season Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.study_program.SeasonKind
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getSeasonKind()
		 * @generated
		 */
		EEnum SEASON_KIND = eINSTANCE.getSeasonKind();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tdt4250.study_program.impl.Study_programPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //Study_programPackage
