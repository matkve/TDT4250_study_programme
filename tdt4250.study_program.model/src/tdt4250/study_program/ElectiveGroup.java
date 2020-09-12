/**
 */
package tdt4250.study_program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.ElectiveGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link tdt4250.study_program.ElectiveGroup#getCreditsPerElectiveInGroup <em>Credits Per Elective In Group</em>}</li>
 *   <li>{@link tdt4250.study_program.ElectiveGroup#getMinToChoose <em>Min To Choose</em>}</li>
 *   <li>{@link tdt4250.study_program.ElectiveGroup#getElectives <em>Electives</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_program.Study_programPackage#getElectiveGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='electivesInGroupNeedsToHaveSpecifiedCreditScore'"
 * @generated
 */
public interface ElectiveGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tdt4250.study_program.Study_programPackage#getElectiveGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.ElectiveGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Credits Per Elective In Group</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits Per Elective In Group</em>' attribute.
	 * @see #setCreditsPerElectiveInGroup(float)
	 * @see tdt4250.study_program.Study_programPackage#getElectiveGroup_CreditsPerElectiveInGroup()
	 * @model default="7.5"
	 * @generated
	 */
	float getCreditsPerElectiveInGroup();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.ElectiveGroup#getCreditsPerElectiveInGroup <em>Credits Per Elective In Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits Per Elective In Group</em>' attribute.
	 * @see #getCreditsPerElectiveInGroup()
	 * @generated
	 */
	void setCreditsPerElectiveInGroup(float value);

	/**
	 * Returns the value of the '<em><b>Min To Choose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min To Choose</em>' attribute.
	 * @see #setMinToChoose(int)
	 * @see tdt4250.study_program.Study_programPackage#getElectiveGroup_MinToChoose()
	 * @model
	 * @generated
	 */
	int getMinToChoose();

	/**
	 * Sets the value of the '{@link tdt4250.study_program.ElectiveGroup#getMinToChoose <em>Min To Choose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min To Choose</em>' attribute.
	 * @see #getMinToChoose()
	 * @generated
	 */
	void setMinToChoose(int value);

	/**
	 * Returns the value of the '<em><b>Electives</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_program.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electives</em>' reference list.
	 * @see tdt4250.study_program.Study_programPackage#getElectiveGroup_Electives()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getElectives();

} // ElectiveGroup
