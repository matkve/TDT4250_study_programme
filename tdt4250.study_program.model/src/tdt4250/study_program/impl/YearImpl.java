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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.study_program.LevelKind;
import tdt4250.study_program.Programme;
import tdt4250.study_program.Semester;
import tdt4250.study_program.Study_programPackage;
import tdt4250.study_program.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getNextYear <em>Next Year</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getPreviousYear <em>Previous Year</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getYearNumber <em>Year Number</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link tdt4250.study_program.impl.YearImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getNextYear() <em>Next Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextYear()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> nextYear;

	/**
	 * The default value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALISATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected String specialisation = SPECIALISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearNumber() <em>Year Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LevelKind LEVEL_EDEFAULT = LevelKind.BACHELOR;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LevelKind level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, Study_programPackage.YEAR__SEMESTERS, Study_programPackage.SEMESTER__YEAR);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Year> getNextYear() {
		if (nextYear == null) {
			nextYear = new EObjectContainmentWithInverseEList<Year>(Year.class, this, Study_programPackage.YEAR__NEXT_YEAR, Study_programPackage.YEAR__PREVIOUS_YEAR);
		}
		return nextYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year getPreviousYear() {
		if (eContainerFeatureID() != Study_programPackage.YEAR__PREVIOUS_YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousYear(Year newPreviousYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreviousYear, Study_programPackage.YEAR__PREVIOUS_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousYear(Year newPreviousYear) {
		if (newPreviousYear != eInternalContainer() || (eContainerFeatureID() != Study_programPackage.YEAR__PREVIOUS_YEAR && newPreviousYear != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousYear != null)
				msgs = ((InternalEObject)newPreviousYear).eInverseAdd(this, Study_programPackage.YEAR__NEXT_YEAR, Year.class, msgs);
			msgs = basicSetPreviousYear(newPreviousYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.YEAR__PREVIOUS_YEAR, newPreviousYear, newPreviousYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisation(String newSpecialisation) {
		String oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.YEAR__SPECIALISATION, oldSpecialisation, specialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getYearNumber() {
		int yearNumber = 1;
		Year prevYear = this.getPreviousYear();
		while (prevYear != null) {
			yearNumber ++;
			prevYear = prevYear.getPreviousYear();
		}
		return yearNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != Study_programPackage.YEAR__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, Study_programPackage.YEAR__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != Study_programPackage.YEAR__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, Study_programPackage.PROGRAMME__FIRST_YEAR, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.YEAR__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LevelKind getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(LevelKind newLevel) {
		LevelKind oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programPackage.YEAR__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Study_programPackage.YEAR__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case Study_programPackage.YEAR__NEXT_YEAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextYear()).basicAdd(otherEnd, msgs);
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreviousYear((Year)otherEnd, msgs);
			case Study_programPackage.YEAR__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
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
			case Study_programPackage.YEAR__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case Study_programPackage.YEAR__NEXT_YEAR:
				return ((InternalEList<?>)getNextYear()).basicRemove(otherEnd, msgs);
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				return basicSetPreviousYear(null, msgs);
			case Study_programPackage.YEAR__PROGRAMME:
				return basicSetProgramme(null, msgs);
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
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				return eInternalContainer().eInverseRemove(this, Study_programPackage.YEAR__NEXT_YEAR, Year.class, msgs);
			case Study_programPackage.YEAR__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, Study_programPackage.PROGRAMME__FIRST_YEAR, Programme.class, msgs);
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
			case Study_programPackage.YEAR__SEMESTERS:
				return getSemesters();
			case Study_programPackage.YEAR__NEXT_YEAR:
				return getNextYear();
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				return getPreviousYear();
			case Study_programPackage.YEAR__SPECIALISATION:
				return getSpecialisation();
			case Study_programPackage.YEAR__YEAR_NUMBER:
				return getYearNumber();
			case Study_programPackage.YEAR__PROGRAMME:
				return getProgramme();
			case Study_programPackage.YEAR__LEVEL:
				return getLevel();
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
			case Study_programPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case Study_programPackage.YEAR__NEXT_YEAR:
				getNextYear().clear();
				getNextYear().addAll((Collection<? extends Year>)newValue);
				return;
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				setPreviousYear((Year)newValue);
				return;
			case Study_programPackage.YEAR__SPECIALISATION:
				setSpecialisation((String)newValue);
				return;
			case Study_programPackage.YEAR__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case Study_programPackage.YEAR__LEVEL:
				setLevel((LevelKind)newValue);
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
			case Study_programPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				return;
			case Study_programPackage.YEAR__NEXT_YEAR:
				getNextYear().clear();
				return;
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				setPreviousYear((Year)null);
				return;
			case Study_programPackage.YEAR__SPECIALISATION:
				setSpecialisation(SPECIALISATION_EDEFAULT);
				return;
			case Study_programPackage.YEAR__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case Study_programPackage.YEAR__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case Study_programPackage.YEAR__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case Study_programPackage.YEAR__NEXT_YEAR:
				return nextYear != null && !nextYear.isEmpty();
			case Study_programPackage.YEAR__PREVIOUS_YEAR:
				return getPreviousYear() != null;
			case Study_programPackage.YEAR__SPECIALISATION:
				return SPECIALISATION_EDEFAULT == null ? specialisation != null : !SPECIALISATION_EDEFAULT.equals(specialisation);
			case Study_programPackage.YEAR__YEAR_NUMBER:
				return getYearNumber() != YEAR_NUMBER_EDEFAULT;
			case Study_programPackage.YEAR__PROGRAMME:
				return getProgramme() != null;
			case Study_programPackage.YEAR__LEVEL:
				return level != LEVEL_EDEFAULT;
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
		result.append(" (specialisation: ");
		result.append(specialisation);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //YearImpl
