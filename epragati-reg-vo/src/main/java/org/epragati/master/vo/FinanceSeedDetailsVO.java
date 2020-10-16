package org.epragati.master.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.vo.BaseVO;

public class FinanceSeedDetailsVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	
	private String userName;
	
	private String fatherName;
	
	private String prNo;
	
	private String classOfVehicle;
	
	private String classOfVehicleDesc;
	
	private String vehicleType;
	
	private String chassisNo;
	
	private ApplicantAddressVO applicantAddressVO;
	
	private String makersModel;
	
	private String comments;
	
	private String status;
	
	private FinanceDetailsVO offlineFinanceDetails;
	
	private String createdBy;
	
	private String officeCode;
	
	private UserVO onlineFinanceDetails;
	
	private List<ActionDetailsVO> actionDetails;



	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
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
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the applicantAddressVO
	 */
	public ApplicantAddressVO getApplicantAddressVO() {
		return applicantAddressVO;
	}

	/**
	 * @param applicantAddressVO the applicantAddressVO to set
	 */
	public void setApplicantAddressVO(ApplicantAddressVO applicantAddressVO) {
		this.applicantAddressVO = applicantAddressVO;
	}

	/**
	 * @return the makersModel
	 */
	public String getMakersModel() {
		return makersModel;
	}

	/**
	 * @param makersModel the makersModel to set
	 */
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the offlineFinanceDetails
	 */
	public FinanceDetailsVO getOfflineFinanceDetails() {
		return offlineFinanceDetails;
	}

	/**
	 * @param offlineFinanceDetails the offlineFinanceDetails to set
	 */
	public void setOfflineFinanceDetails(FinanceDetailsVO offlineFinanceDetails) {
		this.offlineFinanceDetails = offlineFinanceDetails;
	}

	/**
	 * @return the onlineFinanceDetails
	 */
	public UserVO getOnlineFinanceDetails() {
		return onlineFinanceDetails;
	}

	/**
	 * @param onlineFinanceDetails the onlineFinanceDetails to set
	 */
	public void setOnlineFinanceDetails(UserVO onlineFinanceDetails) {
		this.onlineFinanceDetails = onlineFinanceDetails;
	}

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
	 * @return the actionDetails
	 */
	public List<ActionDetailsVO> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(List<ActionDetailsVO> actionDetails) {
		this.actionDetails = actionDetails;
	}

}
