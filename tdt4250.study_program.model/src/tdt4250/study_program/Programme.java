/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.Programme#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_program.Programme#getFirstYear <em>First Year</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.study_program.Study_programPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_program.Year}.
	 * It is bidirectional and its opposite is '{@link tdt4250.study_program.Year#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Year</em>' containment reference list.
	 * @see tdt4250.study_program.Study_programPackage#getProgramme_FirstYear()
	 * @see tdt4250.study_program.Year#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Year> getFirstYear();

} // Programme
