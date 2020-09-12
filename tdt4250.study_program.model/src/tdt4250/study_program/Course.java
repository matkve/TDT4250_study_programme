/**
 */
package tdt4250.study_program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.study_program.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_program.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.study_program.Course#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.study_program.Study_programPackage#getCourse_Code()
	 * @model dataType="tdt4250.study_program.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.study_program.Study_programPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.study_program.Study_programPackage#getCourse_Credits()
	 * @model default="7.5"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_program.SeasonKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_program.SeasonKind
	 * @see #setSeason(SeasonKind)
	 * @see tdt4250.study_program.Study_programPackage#getCourse_Season()
	 * @model
	 * @generated
	 */
	SeasonKind getSeason();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.Course#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_program.SeasonKind
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonKind value);

} // Course
