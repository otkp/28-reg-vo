package org.epragati.permits.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.FcDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.master.vo.VehicleDetailsVO;
import org.epragati.regservice.vo.CfstTaxDetailsVO;
import org.epragati.regservice.vo.PUCDetailsVO;
import org.epragati.util.StatusRegistration;

public class OtherStateTemporaryPermitDetailsVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3988313366762522550L;

	private String id;

	private ApplicantDetailsVO applicantDetails;

	private VehicleDetailsVO vehicleDetails;

	private InsuranceDetailsVO insuranceDetails;

	private PUCDetailsVO pucDetails;

	private String prNo;

	private String classOfVehicle;

	private String vehicleType;

	private PermitDetailsVO primaryPermitDetails;

	private PermitDetailsVO temporaryPermitDetails;

	private StatusRegistration applicationStatus;

	private FcDetailsVO fcDetails;

	private CfstTaxDetailsVO taxDetails;
	
	private List<MasterCovVO> classOfVehicleVO;
	
	private String classOfVehicleDesc;
	
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the applicantDetails
	 */
	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	/**
	 * @return the vehicleDetails
	 */
	public VehicleDetailsVO getVehicleDetails() {
		return vehicleDetails;
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(VehicleDetailsVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the insuranceDetails
	 */
	public InsuranceDetailsVO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param insuranceDetails the insuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsVO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	/**
	 * @return the pucDetails
	 */
	public PUCDetailsVO getPucDetails() {
		return pucDetails;
	}

	/**
	 * @param pucDetails the pucDetails to set
	 */
	public void setPucDetails(PUCDetailsVO pucDetails) {
		this.pucDetails = pucDetails;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the primaryPermitDetails
	 */
	public PermitDetailsVO getPrimaryPermitDetails() {
		return primaryPermitDetails;
	}

	/**
	 * @param primaryPermitDetails the primaryPermitDetails to set
	 */
	public void setPrimaryPermitDetails(PermitDetailsVO primaryPermitDetails) {
		this.primaryPermitDetails = primaryPermitDetails;
	}

	/**
	 * @return the temporaryPermitDetails
	 */
	public PermitDetailsVO getTemporaryPermitDetails() {
		return temporaryPermitDetails;
	}

	/**
	 * @param temporaryPermitDetails the temporaryPermitDetails to set
	 */
	public void setTemporaryPermitDetails(PermitDetailsVO temporaryPermitDetails) {
		this.temporaryPermitDetails = temporaryPermitDetails;
	}

	/**
	 * @return the applicationStatus
	 */
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the fcDetails
	 */
	public FcDetailsVO getFcDetails() {
		return fcDetails;
	}

	/**
	 * @param fcDetails the fcDetails to set
	 */
	public void setFcDetails(FcDetailsVO fcDetails) {
		this.fcDetails = fcDetails;
	}

	/**
	 * @return the taxDetails
	 */
	public CfstTaxDetailsVO getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails the taxDetails to set
	 */
	public void setTaxDetails(CfstTaxDetailsVO taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the classOfVehicleVO
	 */
	public List<MasterCovVO> getClassOfVehicleVO() {
		return classOfVehicleVO;
	}

	/**
	 * @param classOfVehicleVO the classOfVehicleVO to set
	 */
	public void setClassOfVehicleVO(List<MasterCovVO> classOfVehicleVO) {
		this.classOfVehicleVO = classOfVehicleVO;
	}

	/**
	 * @return the classOfVehicleDesc
	 */
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	/**
	 * @param classOfVehicleDesc the classOfVehicleDesc to set
	 */
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}
	
	
}
