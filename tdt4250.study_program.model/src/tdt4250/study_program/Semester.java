/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.Semester#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link tdt4250.study_program.Semester#getElectiveGroups <em>Elective Groups</em>}</li>
 *   <li>{@link tdt4250.study_program.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.study_program.Semester#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseSeasonsMatch totalCreditsMustBe30'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseSeasonsMatch='self.mandatory-&gt;union(self.electiveGroups.electives)-&gt;forAll(course | course.season = self.season)'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_program.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see tdt4250.study_program.Study_programPackage#getSemester_Mandatory()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatory();

	/**
	 * Returns the value of the '<em><b>Elective Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.ElectiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Groups</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getSemester_ElectiveGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElectiveGroup> getElectiveGroups();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' container reference.
	 * @see #setYear(Year)
	 * @see tdt4250.study_program.Study_programPackage#getSemester_Year()
	 * @see tdt4250.study_program.Year#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Semester#getYear <em>Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' container reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_program.SeasonKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_program.SeasonKind
	 * @see #setSeason(SeasonKind)
	 * @see tdt4250.study_program.Study_programPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	SeasonKind getSeason();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_program.SeasonKind
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonKind value);

} // Semester
