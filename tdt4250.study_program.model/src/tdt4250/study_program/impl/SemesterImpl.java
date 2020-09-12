/**
 */
package tdt4250.study_program.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.study_program.Course;
import tdt4250.study_program.ElectiveGroup;
import tdt4250.study_program.SeasonKind;
import tdt4250.study_program.Semester;
import tdt4250.study_program.Study_programPackage;
import tdt4250.study_program.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.impl.SemesterImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.SemesterImpl#getElectiveGroups <em>Elective Groups</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatory;

	/**
	 * The cached value of the '{@link #getElectiveGroups() <em>Elective Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectiveGroup> electiveGroups;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final SeasonKind SEASON_EDEFAULT = SeasonKind.SPRING;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected SeasonKind season = SEASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectResolvingEList<Course>(Course.class, this, Study_programPackage.SEMESTER__MANDATORY);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElectiveGroup> getElectiveGroups() {
		if (electiveGroups == null) {
			electiveGroups = new EObjectContainmentEList<ElectiveGroup>(ElectiveGroup.class, this, Study_programPackage.SEMESTER__ELECTIVE_GROUPS);
		}
		return electiveGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year getYear() {
		if (eContainerFeatureID() != Study_programPackage.SEMESTER__YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYear, Study_programPackage.SEMESTER__YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(Year newYear) {
		if (newYear != eInternalContainer() || (eContainerFeatureID() != Study_programPackage.SEMESTER__YEAR && newYear != null)) {
			if (EcoreUtil.isAncestor(this, newYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, Study_programPackage.YEAR__SEMESTERS, Year.class, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.SEMESTER__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeasonKind getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(SeasonKind newSeason) {
		SeasonKind oldSeason = season;
		season = newSeason == null ? SEASON_EDEFAULT : newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Study_programPackage.SEMESTER__YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYear((Year)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Study_programPackage.SEMESTER__ELECTIVE_GROUPS:
				return ((InternalEList<?>)getElectiveGroups()).basicRemove(otherEnd, msgs);
			case Study_programPackage.SEMESTER__YEAR:
				return basicSetYear(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Study_programPackage.SEMESTER__YEAR:
				return eInternalContainer().eInverseRemove(this, Study_programPackage.YEAR__SEMESTERS, Year.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Study_programPackage.SEMESTER__MANDATORY:
				return getMandatory();
			case Study_programPackage.SEMESTER__ELECTIVE_GROUPS:
				return getElectiveGroups();
			case Study_programPackage.SEMESTER__YEAR:
				return getYear();
			case Study_programPackage.SEMESTER__SEASON:
				return getSeason();
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
			case Study_programPackage.SEMESTER__MANDATORY:
				getMandatory().clear();
				getMandatory().addAll((Collection<? extends Course>)newValue);
				return;
			case Study_programPackage.SEMESTER__ELECTIVE_GROUPS:
				getElectiveGroups().clear();
				getElectiveGroups().addAll((Collection<? extends ElectiveGroup>)newValue);
				return;
			case Study_programPackage.SEMESTER__YEAR:
				setYear((Year)newValue);
				return;
			case Study_programPackage.SEMESTER__SEASON:
				setSeason((SeasonKind)newValue);
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
			case Study_programPackage.SEMESTER__MANDATORY:
				getMandatory().clear();
				return;
			case Study_programPackage.SEMESTER__ELECTIVE_GROUPS:
				getElectiveGroups().clear();
				return;
			case Study_programPackage.SEMESTER__YEAR:
				setYear((Year)null);
				return;
			case Study_programPackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
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
			case Study_programPackage.SEMESTER__MANDATORY:
				return mandatory != null && !mandatory.isEmpty();
			case Study_programPackage.SEMESTER__ELECTIVE_GROUPS:
				return electiveGroups != null && !electiveGroups.isEmpty();
			case Study_programPackage.SEMESTER__YEAR:
				return getYear() != null;
			case Study_programPackage.SEMESTER__SEASON:
				return season != SEASON_EDEFAULT;
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
		result.append(" (season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
