/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getNextYear <em>Next Year</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getPreviousYear <em>Previous Year</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getYearNumber <em>Year Number</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getProgramme <em>Programme</em>}</li>
 *   <li>{@link tdt4250.study_program.Year#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requireFallAndSpringSemesters multipleNextYearsAreSpecialisations bachelorBeforeMaster'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 bachelorBeforeMaster='let bachelor = self.eClass().ePackage.getEClassifier(\'LevelKind\').getEEnumLiteral(\'Bachelor\') if self.level = bachelor and not self.previousYear-&gt;isEmpty() then self.previousYear.level = bachelor else true endif'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.Semester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getYear_Semesters()
	 * @see tdt4250.study_program.Semester#getYear
	 * @model opposite="year" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Next Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.Year}.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Year#getPreviousYear <em>Previous Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Year</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getYear_NextYear()
	 * @see tdt4250.study_program.Year#getPreviousYear
	 * @model opposite="previousYear" containment="true"
	 * @generated
	 */
	EList<Year> getNextYear();

	/**
	 * Returns the value of the '<em><b>Previous Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Year#getNextYear <em>Next Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Year</em>' container reference.
	 * @see #setPreviousYear(Year)
	 * @see tdt4250.study_program.Study_programPackage#getYear_PreviousYear()
	 * @see tdt4250.study_program.Year#getNextYear
	 * @model opposite="nextYear" transient="false"
	 * @generated
	 */
	Year getPreviousYear();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Year#getPreviousYear <em>Previous Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Year</em>' container reference.
	 * @see #getPreviousYear()
	 * @generated
	 */
	void setPreviousYear(Year value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' attribute.
	 * @see #setSpecialisation(String)
	 * @see tdt4250.study_program.Study_programPackage#getYear_Specialisation()
	 * @model default=""
	 * @generated
	 */
	String getSpecialisation();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Year#getSpecialisation <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' attribute.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(String value);

	/**
	 * Returns the value of the '<em><b>Year Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Number</em>' attribute.
	 * @see tdt4250.study_program.Study_programPackage#getYear_YearNumber()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getYearNumber();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Programme#getFirstYear <em>First Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see tdt4250.study_program.Study_programPackage#getYear_Programme()
	 * @see tdt4250.study_program.Programme#getFirstYear
	 * @model opposite="firstYear" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Year#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_program.LevelKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.study_program.LevelKind
	 * @see #setLevel(LevelKind)
	 * @see tdt4250.study_program.Study_programPackage#getYear_Level()
	 * @model
	 * @generated
	 */
	LevelKind getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Year#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.study_program.LevelKind
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LevelKind value);

} // Year
