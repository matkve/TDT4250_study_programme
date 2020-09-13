/**
 */
package tdt4250.study_program.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.study_program.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.study_program.Study_programPackage
 * @generated
 */
public class Study_programValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Study_programValidator INSTANCE = new Study_programValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.study_program";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Study_programValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Study_programPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Study_programPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case Study_programPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case Study_programPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case Study_programPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case Study_programPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case Study_programPackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case Study_programPackage.SEASON_KIND:
				return validateSeasonKind((SeasonKind)value, diagnostics, context);
			case Study_programPackage.LEVEL_KIND:
				return validateLevelKind((LevelKind)value, diagnostics, context);
			case Study_programPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_courseSeasonsMatch(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_totalCreditsAtLeast30(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_masterYearSemesterNeedsAtLeastOneMasterCourse(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the courseSeasonsMatch constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__COURSE_SEASONS_MATCH__EEXPRESSION = "self.courseGroups.mandatory->union(self.courseGroups.electives)->forAll(course | course.season = self.season or course.season = self.eClass().ePackage.getEClassifier('SeasonKind').getEEnumLiteral('Both'))";

	/**
	 * Validates the courseSeasonsMatch constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_courseSeasonsMatch(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "courseSeasonsMatch",
				 SEMESTER__COURSE_SEASONS_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the totalCreditsAtLeast30 constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__TOTAL_CREDITS_AT_LEAST30__EEXPRESSION = "self.courseGroups.mandatory->union(self.courseGroups.electives).credits->sum() >= 30.0";

	/**
	 * Validates the totalCreditsAtLeast30 constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_totalCreditsAtLeast30(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "totalCreditsAtLeast30",
				 SEMESTER__TOTAL_CREDITS_AT_LEAST30__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the masterYearSemesterNeedsAtLeastOneMasterCourse constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__MASTER_YEAR_SEMESTER_NEEDS_AT_LEAST_ONE_MASTER_COURSE__EEXPRESSION = "let masterLevel = self.eClass().ePackage.getEClassifier('LevelKind').getEEnumLiteral('Master') let masterCredits = self.courseGroups.mandatory->union(self.courseGroups.electives)->select(course | course.level = masterLevel).credits if self.year.level = masterLevel then if masterCredits->isEmpty() then false else masterCredits->sum() >= 7.5 endif else true endif";

	/**
	 * Validates the masterYearSemesterNeedsAtLeastOneMasterCourse constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_masterYearSemesterNeedsAtLeastOneMasterCourse(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "masterYearSemesterNeedsAtLeastOneMasterCourse",
				 SEMESTER__MASTER_YEAR_SEMESTER_NEEDS_AT_LEAST_ONE_MASTER_COURSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_requireFallAndSpringSemesters(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_multipleNextYearsAreSpecialisations(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_bachelorBeforeMaster(year, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requireFallAndSpringSemesters constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateYear_requireFallAndSpringSemesters(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean hasFall = false, hasSpring = false;
		for (Semester semester : year.getSemesters()) {
			SeasonKind season = semester.getSeason();
			if (season == SeasonKind.FALL) {
				hasFall = true;
			}
			else if (season == SeasonKind.SPRING) {
				hasSpring = true;
			}
		}
		if (!(hasFall && hasSpring)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "requireFallAndSpringSemesters", getObjectLabel(year, context) },
						 new Object[] { year },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the multipleNextYearsAreSpecialisations constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateYear_multipleNextYearsAreSpecialisations(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<Year> nextYears = year.getNextYear();
		boolean valid = true;
		if (nextYears.size() == 1) {
			// When there is only 1 possible next year it is not a specialization year, so specialization must be empty
			valid = nextYears.get(0).getSpecialisation().isEmpty();
		}
		else if (nextYears.size() > 1) {
			// When there are several possible next years they are specialization years, so specialization must be filled
			for (Year nextYear : nextYears) {
				if (nextYear.getSpecialisation().isEmpty()) {
					valid = false;
					break;
				}
			}
		}
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "multipleNextYearsAreSpecialisations", getObjectLabel(year, context) },
						 new Object[] { year },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the bachelorBeforeMaster constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__BACHELOR_BEFORE_MASTER__EEXPRESSION = "let bachelor = self.eClass().ePackage.getEClassifier('LevelKind').getEEnumLiteral('Bachelor') if self.level = bachelor and not self.previousYear->isEmpty() then self.previousYear.level = bachelor else true endif";

	/**
	 * Validates the bachelorBeforeMaster constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_bachelorBeforeMaster(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programPackage.Literals.YEAR,
				 year,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "bachelorBeforeMaster",
				 YEAR__BACHELOR_BEFORE_MASTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(university, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversity_nameMustBeFilled(university, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameMustBeFilled constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIVERSITY__NAME_MUST_BE_FILLED__EEXPRESSION = "not self.name.equals('')";

	/**
	 * Validates the nameMustBeFilled constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity_nameMustBeFilled(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programPackage.Literals.UNIVERSITY,
				 university,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "nameMustBeFilled",
				 UNIVERSITY__NAME_MUST_BE_FILLED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeasonKind(SeasonKind seasonKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelKind(LevelKind levelKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Study_programValidator
