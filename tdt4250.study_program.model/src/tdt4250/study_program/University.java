/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.University#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link tdt4250.study_program.University#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.study_program.University#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getUniversity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameMustBeFilled'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 nameMustBeFilled='not self.name.equals(\'\')'"
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getUniversity_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.study_program.Study_programPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // University
