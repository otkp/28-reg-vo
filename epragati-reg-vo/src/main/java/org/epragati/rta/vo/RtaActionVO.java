package org.epragati.rta.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.constants.FcValidityTypesEnum;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.MasterFcQuestionVO;
import org.epragati.master.vo.MasterRcCancellationQuestionsVO;
import org.epragati.master.vo.MasterStoppageQuationsVO;
import org.epragati.master.vo.MasterStoppageRevocationQuationsVO;
import org.epragati.master.vo.RejectionHistoryVO;
import org.epragati.regservice.vo.AlterationVO;
import org.epragati.regservice.vo.VehicleStoppageMVIReportVO;
import org.epragati.util.StatusRegistration;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author mukesh.kusuma
 *
 */
public class RtaActionVO {

	private String applicationNo;
	private RejectionHistoryVO secondVehicleList;
	private List<EnclosuresVO> enclosures;
	// private List<ImageVO> enclosures;
	private StatusRegistration status;
	private String action;
	private DisabledDataVO disabledData;
	private String selectedRole;
	private String trNumber;
	private List<TrailerChassisDetailsVO> trailerChassisDetailsVO;
	private List<TrailerTaxDetailsVO> trailerTaxDetailsVO;
	List<ImageInput> images;
	private AlterationVO alterationVO;
	private OtherStateEditVO otherStateVO;
	private boolean isAllowForOtherServiceByDataEntry;
	private String remarks;
	private List<MasterFcQuestionVO> fcQstList;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate reInspectionDate;
	private Integer fcValidityValue= 0;
	private FcValidityTypesEnum fcType;
	private String reasonForRejection;
	private String dlNumber;
	private String vcrNumber;
	private String placeOfChecking;
	private String destination;
	private String maxSpeed;
	private String driverName;
	private FcValidityTypesEnum.CfxType cfxType;
	private String defectComment;
	private String authToken;
	private List<ImageInput> imageInput;
	private List<MasterStoppageQuationsVO> stoppageQuations;
	private List<MasterStoppageRevocationQuationsVO> stoppageRevokationQuations;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageDate; 
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageRevocationDate; 
	private boolean isAllowFcForOtherStation;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate revocationDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate issueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfEntry;
    private Double invoiceValue;
	private String prNo;
	private String fitnessforMVI;
	private AadharDetailsResponseVO aadharResponseMVI;
	public AadhaarDetailsRequestVO aadhaarDetailsRequestVO;
	private FreshRCActionVO freshRCAction;
	private List<VehicleStoppageMVIReportVO> report;
	private String applicationComment;
	private RCCancellationActionVO rcCancellationAction;
	private List<MasterRcCancellationQuestionsVO> rcQuesList;
	
	
	
 
	/**
	 * @return the rcCancellationAction
	 */
	public RCCancellationActionVO getRcCancellationAction() {
		return rcCancellationAction;
	}

	/**
	 * @param rcCancellationAction the rcCancellationAction to set
	 */
	public void setRcCancellationAction(RCCancellationActionVO rcCancellationAction) {
		this.rcCancellationAction = rcCancellationAction;
	}

	public FreshRCActionVO getFreshRCAction() {
		return freshRCAction;
	}

	public void setFreshRCAction(FreshRCActionVO freshRCAction) {
		this.freshRCAction = freshRCAction;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	/**
	 * @return the selectedRole
	 */
	public String getSelectedRole() {
		return selectedRole;
	}

	/**
	 * @param selectedRole the selectedRole to set
	 */
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	/**
	 * @return the status
	 */
	public StatusRegistration getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(StatusRegistration status) {
		this.status = status;
	}

	/**
	 * @return the imageVo
	 */

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the rejectionHistory
	 */

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	public RejectionHistoryVO getSecondVehicleList() {
		return secondVehicleList;
	}

	public void setSecondVehicleList(RejectionHistoryVO secondVehicleList) {
		this.secondVehicleList = secondVehicleList;
	}

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the enclosures
	 */
	public List<EnclosuresVO> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<EnclosuresVO> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the disabledData
	 */
	public DisabledDataVO getDisabledData() {
		return disabledData;
	}

	/**
	 * @param disabledData the disabledData to set
	 */
	public void setDisabledData(DisabledDataVO disabledData) {
		this.disabledData = disabledData;
	}

	/**
	 * @return the trailerChassisDetailsVO
	 */
	public List<TrailerChassisDetailsVO> getTrailerChassisDetailsVO() {
		return trailerChassisDetailsVO;
	}

	/**
	 * @param trailerChassisDetailsVO the trailerChassisDetailsVO to set
	 */
	public void setTrailerChassisDetailsVO(List<TrailerChassisDetailsVO> trailerChassisDetailsVO) {
		this.trailerChassisDetailsVO = trailerChassisDetailsVO;
	}

	/**
	 * @return the trailerTaxDetailsVO
	 */
	public List<TrailerTaxDetailsVO> getTrailerTaxDetailsVO() {
		return trailerTaxDetailsVO;
	}

	/**
	 * @param trailerTaxDetailsVO the trailerTaxDetailsVO to set
	 */
	public void setTrailerTaxDetailsVO(List<TrailerTaxDetailsVO> trailerTaxDetailsVO) {
		this.trailerTaxDetailsVO = trailerTaxDetailsVO;
	}

	/**
	 * @return the images
	 */
	public List<ImageInput> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<ImageInput> images) {
		this.images = images;
	}

	/**
	 * @return the alterationVO
	 */
	public AlterationVO getAlterationVO() {
		return alterationVO;
	}

	/**
	 * @param alterationVO the alterationVO to set
	 */
	public void setAlterationVO(AlterationVO alterationVO) {
		this.alterationVO = alterationVO;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	/**
	 * @return the isAllowForOtherServiceByDataEntry
	 */
	public boolean isAllowForOtherServiceByDataEntry() {
		return isAllowForOtherServiceByDataEntry;
	}

	/**
	 * @param isAllowForOtherServiceByDataEntry the isAllowForOtherServiceByDataEntry to set
	 */
	public void setAllowForOtherServiceByDataEntry(boolean isAllowForOtherServiceByDataEntry) {
		this.isAllowForOtherServiceByDataEntry = isAllowForOtherServiceByDataEntry;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the isAllowFcForOtherStation
	 */
	public boolean isAllowFcForOtherStation() {
		return isAllowFcForOtherStation;
	}

	/**
	 * @param isAllowFcForOtherStation the isAllowFcForOtherStation to set
	 */
	public void setAllowFcForOtherStation(boolean isAllowFcForOtherStation) {
		this.isAllowFcForOtherStation = isAllowFcForOtherStation;
	}

	/**
	 * @return the fcQstList
	 */
	public List<MasterFcQuestionVO> getFcQstList() {
		return fcQstList;
	}

	/**
	 * @param fcQstList the fcQstList to set
	 */
	public void setFcQstList(List<MasterFcQuestionVO> fcQstList) {
		this.fcQstList = fcQstList;
	}

	/**
	 * @return the reInspectionDate
	 */
	public LocalDate getReInspectionDate() {
		return reInspectionDate;
	}

	/**
	 * @param reInspectionDate the reInspectionDate to set
	 */
	public void setReInspectionDate(LocalDate reInspectionDate) {
		this.reInspectionDate = reInspectionDate;
	}

	/**
	 * @return the fcValidityValue
	 */
	public Integer getFcValidityValue() {
		return fcValidityValue;
	}

	/**
	 * @param fcValidityValue the fcValidityValue to set
	 */
	public void setFcValidityValue(Integer fcValidityValue) {
		this.fcValidityValue = fcValidityValue;
	}

	/**
	 * @return the fcType
	 */
	public FcValidityTypesEnum getFcType() {
		return fcType;
	}

	/**
	 * @param fcType the fcType to set
	 */
	public void setFcType(FcValidityTypesEnum fcType) {
		this.fcType = fcType;
	}

	/**
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection() {
		return reasonForRejection;
	}

	/**
	 * @param reasonForRejection the reasonForRejection to set
	 */
	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	/**
	 * @return the dlNumber
	 */
	public String getDlNumber() {
		return dlNumber;
	}

	/**
	 * @param dlNumber the dlNumber to set
	 */
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	/**
	 * @return the vcrNumber
	 */
	public String getVcrNumber() {
		return vcrNumber;
	}

	/**
	 * @param vcrNumber the vcrNumber to set
	 */
	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	/**
	 * @return the placeOfChecking
	 */
	public String getPlaceOfChecking() {
		return placeOfChecking;
	}

	/**
	 * @param placeOfChecking the placeOfChecking to set
	 */
	public void setPlaceOfChecking(String placeOfChecking) {
		this.placeOfChecking = placeOfChecking;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the maxSpeed
	 */
	public String getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}



	/**
	 * @return the cfxType
	 */
	public FcValidityTypesEnum.CfxType getCfxType() {
		return cfxType;
	}

	/**
	 * @param cfxType the cfxType to set
	 */
	public void setCfxType(FcValidityTypesEnum.CfxType cfxType) {
		this.cfxType = cfxType;
	}

	/**
	 * @return the defectComment
	 */
	public String getDefectComment() {
		return defectComment;
	}

	/**
	 * @param defectComment the defectComment to set
	 */
	public void setDefectComment(String defectComment) {
		this.defectComment = defectComment;
	}

	/**
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	/**
	 * @return the stoppageQuations
	 */
	public List<MasterStoppageQuationsVO> getStoppageQuations() {
		return stoppageQuations;
	}

	/**
	 * @param stoppageQuations the stoppageQuations to set
	 */
	public void setStoppageQuations(List<MasterStoppageQuationsVO> stoppageQuations) {
		this.stoppageQuations = stoppageQuations;
	}

	/**
	 * @return the stoppageRevokationQuations
	 */
	public List<MasterStoppageRevocationQuationsVO> getStoppageRevokationQuations() {
		return stoppageRevokationQuations;
	}

	/**
	 * @param stoppageRevokationQuations the stoppageRevokationQuations to set
	 */
	public void setStoppageRevokationQuations(List<MasterStoppageRevocationQuationsVO> stoppageRevokationQuations) {
		this.stoppageRevokationQuations = stoppageRevokationQuations;
	}

	/**
	 * @return the stoppageDate
	 */
	public LocalDate getStoppageDate() {
		return stoppageDate;
	}

	/**
	 * @param stoppageDate the stoppageDate to set
	 */
	public void setStoppageDate(LocalDate stoppageDate) {
		this.stoppageDate = stoppageDate;
	}

	/**
	 * @return the stoppageRevocationDate
	 */
	public LocalDate getStoppageRevocationDate() {
		return stoppageRevocationDate;
	}

	/**
	 * @param stoppageRevocationDate the stoppageRevocationDate to set
	 */
	public void setStoppageRevocationDate(LocalDate stoppageRevocationDate) {
		this.stoppageRevocationDate = stoppageRevocationDate;
	}

	/**
	 * @return the revocationDate
	 */
	public LocalDate getRevocationDate() {
		return revocationDate;
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

	public OtherStateEditVO getOtherStateVO() {
		return otherStateVO;
	}

	public void setOtherStateVO(OtherStateEditVO otherStateVO) {
		this.otherStateVO = otherStateVO;
	}

	/**
	 * @param revocationDate the revocationDate to set
	 */
	public void setRevocationDate(LocalDate revocationDate) {
		this.revocationDate = revocationDate;
	}

	/**
	 * @return the issueDate
	 */
	public LocalDate getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the dateOfEntry
	 */
	public LocalDate getDateOfEntry() {
		return dateOfEntry;
	}

	/**
	 * @param dateOfEntry the dateOfEntry to set
	 */
	public void setDateOfEntry(LocalDate dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	/**
	 * @return the invoiceValue
	 */
	public Double getInvoiceValue() {
		return invoiceValue;
	}

	/**
	 * @param invoiceValue the invoiceValue to set
	 */
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	/**
	 * @return the aadharResponseMVI
	 */
	public AadharDetailsResponseVO getAadharResponseMVI() {
		return aadharResponseMVI;
	}

	/**
	 * @param aadharResponseMVI the aadharResponseMVI to set
	 */
	public void setAadharResponseMVI(AadharDetailsResponseVO aadharResponseMVI) {
		this.aadharResponseMVI = aadharResponseMVI;
	}

	/**
	 * @return the fitnessforMVI
	 */
	public String getFitnessforMVI() {
		return fitnessforMVI;
	}

	/**
	 * @param fitnessforMVI the fitnessforMVI to set
	 */
	public void setFitnessforMVI(String fitnessforMVI) {
		this.fitnessforMVI = fitnessforMVI;
	}

	public List<VehicleStoppageMVIReportVO> getReport() {
		return report;
	}

	public void setReport(List<VehicleStoppageMVIReportVO> report) {
		this.report = report;
	}

	public String getApplicationComment() {
		return applicationComment;
	}

	public void setApplicationComment(String applicationComment) {
		this.applicationComment = applicationComment;
	}

	public List<MasterRcCancellationQuestionsVO> getRcQuesList() {
		return rcQuesList;
	}

	public void setRcQuesList(List<MasterRcCancellationQuestionsVO> rcQuesList) {
		this.rcQuesList = rcQuesList;
	}
	
	

	


	
}
