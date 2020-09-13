/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.CourseGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link tdt4250.study_program.CourseGroup#getElectives <em>Electives</em>}</li>
 *   <li>{@link tdt4250.study_program.CourseGroup#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link tdt4250.study_program.CourseGroup#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tdt4250.study_program.Study_programPackage#getCourseGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.CourseGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Electives</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_program.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electives</em>' reference list.
	 * @see tdt4250.study_program.Study_programPackage#getCourseGroup_Electives()
	 * @model
	 * @generated
	 */
	EList<Course> getElectives();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_program.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see tdt4250.study_program.Study_programPackage#getCourseGroup_Mandatory()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatory();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Semester#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see tdt4250.study_program.Study_programPackage#getCourseGroup_Semester()
	 * @see tdt4250.study_program.Semester#getCourseGroups
	 * @model opposite="courseGroups" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.CourseGroup#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // CourseGroup
