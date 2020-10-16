package org.epragati.regservice.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.master.vo.InsuranceCompanyVO;
import org.epragati.master.vo.InsuranceTypeVO;
import org.epragati.master.vo.MakersVO;
import org.epragati.master.vo.MasterVariantVO;
import org.epragati.master.vo.OwnershipVO;
import org.epragati.master.vo.StateVO;
import org.epragati.payments.vo.ClassOfVehiclesVO;

public class OtherStateCovVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6740928730345489944L;

	private List<ClassOfVehiclesVO> classOfVehicle;
	
	private MakersVO operator;
	
	private MasterVariantVO makerClass;

	private InsuranceTypeVO policyType;
	
	private StateVO nocState;
	
	private InsuranceCompanyVO company;
	
	private OwnershipVO ownerType;
	
	
	/**
	 * @return the ownerType
	 */
	public OwnershipVO getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnershipVO ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the company
	 */
	public InsuranceCompanyVO getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(InsuranceCompanyVO company) {
		this.company = company;
	}

	/**
	 * @return the nocState
	 */
	public StateVO getNocState() {
		return nocState;
	}

	/**
	 * @param nocState the nocState to set
	 */
	public void setNocState(StateVO nocState) {
		this.nocState = nocState;
	}

	

	/**
	 * @return the policyType
	 */
	public InsuranceTypeVO getPolicyType() {
		return policyType;
	}

	/**
	 * @param policyType the policyType to set
	 */
	public void setPolicyType(InsuranceTypeVO policyType) {
		this.policyType = policyType;
	}

	/**
	 * @return the classOfVehicle
	 */
	public List<ClassOfVehiclesVO> getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(List<ClassOfVehiclesVO> classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the operator
	 */
	public MakersVO getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(MakersVO operator) {
		this.operator = operator;
	}

	/**
	 * @return the makerClass
	 */
	public MasterVariantVO getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass the makerClass to set
	 */
	public void setMakerClass(MasterVariantVO makerClass) {
		this.makerClass = makerClass;
	}
	
	
}

