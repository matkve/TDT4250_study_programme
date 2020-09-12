/**
 */
package tdt4250.study_program.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.study_program.Course;
import tdt4250.study_program.ElectiveGroup;
import tdt4250.study_program.Study_programPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.impl.ElectiveGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.ElectiveGroupImpl#getCreditsPerElectiveInGroup <em>Credits Per Elective In Group</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.ElectiveGroupImpl#getMinToChoose <em>Min To Choose</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.ElectiveGroupImpl#getElectives <em>Electives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveGroupImpl extends MinimalEObjectImpl.Container implements ElectiveGroup {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditsPerElectiveInGroup() <em>Credits Per Elective In Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditsPerElectiveInGroup()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_PER_ELECTIVE_IN_GROUP_EDEFAULT = 7.5F;

	/**
	 * The cached value of the '{@link #getCreditsPerElectiveInGroup() <em>Credits Per Elective In Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditsPerElectiveInGroup()
	 * @generated
	 * @ordered
	 */
	protected float creditsPerElectiveInGroup = CREDITS_PER_ELECTIVE_IN_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinToChoose() <em>Min To Choose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinToChoose()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TO_CHOOSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinToChoose() <em>Min To Choose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinToChoose()
	 * @generated
	 * @ordered
	 */
	protected int minToChoose = MIN_TO_CHOOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectives() <em>Electives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programPackage.Literals.ELECTIVE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.ELECTIVE_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCreditsPerElectiveInGroup() {
		return creditsPerElectiveInGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditsPerElectiveInGroup(float newCreditsPerElectiveInGroup) {
		float oldCreditsPerElectiveInGroup = creditsPerElectiveInGroup;
		creditsPerElectiveInGroup = newCreditsPerElectiveInGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP, oldCreditsPerElectiveInGroup, creditsPerElectiveInGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinToChoose() {
		return minToChoose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinToChoose(int newMinToChoose) {
		int oldMinToChoose = minToChoose;
		minToChoose = newMinToChoose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.ELECTIVE_GROUP__MIN_TO_CHOOSE, oldMinToChoose, minToChoose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectives() {
		if (electives == null) {
			electives = new EObjectResolvingEList<Course>(Course.class, this, Study_programPackage.ELECTIVE_GROUP__ELECTIVES);
		}
		return electives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Study_programPackage.ELECTIVE_GROUP__DESCRIPTION:
				return getDescription();
			case Study_programPackage.ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP:
				return getCreditsPerElectiveInGroup();
			case Study_programPackage.ELECTIVE_GROUP__MIN_TO_CHOOSE:
				return getMinToChoose();
			case Study_programPackage.ELECTIVE_GROUP__ELECTIVES:
				return getElectives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Study_programPackage.ELECTIVE_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Study_programPackage.ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP:
				setCreditsPerElectiveInGroup((Float)newValue);
				return;
			case Study_programPackage.ELECTIVE_GROUP__MIN_TO_CHOOSE:
				setMinToChoose((Integer)newValue);
				return;
			case Study_programPackage.ELECTIVE_GROUP__ELECTIVES:
				getElectives().clear();
				getElectives().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Study_programPackage.ELECTIVE_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Study_programPackage.ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP:
				setCreditsPerElectiveInGroup(CREDITS_PER_ELECTIVE_IN_GROUP_EDEFAULT);
				return;
			case Study_programPackage.ELECTIVE_GROUP__MIN_TO_CHOOSE:
				setMinToChoose(MIN_TO_CHOOSE_EDEFAULT);
				return;
			case Study_programPackage.ELECTIVE_GROUP__ELECTIVES:
				getElectives().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Study_programPackage.ELECTIVE_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Study_programPackage.ELECTIVE_GROUP__CREDITS_PER_ELECTIVE_IN_GROUP:
				return creditsPerElectiveInGroup != CREDITS_PER_ELECTIVE_IN_GROUP_EDEFAULT;
			case Study_programPackage.ELECTIVE_GROUP__MIN_TO_CHOOSE:
				return minToChoose != MIN_TO_CHOOSE_EDEFAULT;
			case Study_programPackage.ELECTIVE_GROUP__ELECTIVES:
				return electives != null && !electives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", creditsPerElectiveInGroup: ");
		result.append(creditsPerElectiveInGroup);
		result.append(", minToChoose: ");
		result.append(minToChoose);
		result.append(')');
		return result.toString();
	}

} //ElectiveGroupImpl
