package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.regservice.vo.SlotDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OwnerAndVahanInfoVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1363029773916646309L;

	private String applicationNo;
	private String ownerName;
	private String aadhaarNo;
	private String ownerType;
	private String mobileNo;

	private String vehicleType;
	private String chassisNumber;
	private String engineNumber;
	private String classOfVehicle;
	private String covCode;
	private boolean trailer;
	private String makersName;
	private Boolean mviDone;

	private Integer gvw;
	private Integer ulw;
	private String seating;
	
	/*
	 * private Integer height ; private Integer length ; private Integer width ;
	 * private Integer ulw; private String color; private String seatingCapacity;
	 */
	private List<MasterCovVO> covList;
	private List<BodyTypeVO> BodyTypeList;

	private SlotDetailsVO slotsDetails;

	private String vehicleName;
	private String trNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfCompletion;
	private MasterCovVO borderSelectedCov;
	private Integer borderEnteredulw;
	private String borderEnteredseats;
	
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<MasterCovVO> getCovList() {
		return covList;
	}

	public void setCovList(List<MasterCovVO> covList) {
		this.covList = covList;
	}

	public List<BodyTypeVO> getBodyTypeList() {
		return BodyTypeList;
	}

	public void setBodyTypeList(List<BodyTypeVO> bodyTypeList) {
		BodyTypeList = bodyTypeList;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getMakersName() {
		return makersName;
	}

	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the applicationNO
	 */
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the slotsDetails
	 */
	public SlotDetailsVO getSlotsDetails() {
		return slotsDetails;
	}

	/**
	 * @param slotsDetails
	 *            the slotsDetails to set
	 */
	public void setSlotsDetails(SlotDetailsVO slotsDetails) {
		this.slotsDetails = slotsDetails;
	}

	/**
	 * @return the mviDone
	 */
	public Boolean getMviDone() {
		return mviDone;
	}

	/**
	 * @param mviDone
	 *            the mviDone to set
	 */
	public void setMviDone(Boolean mviDone) {
		this.mviDone = mviDone;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the seating
	 */
	public String getSeating() {
		return seating;
	}

	/**
	 * @param seating the seating to set
	 */
	public void setSeating(String seating) {
		this.seating = seating;
	}

	public String getCovCode() {
		return covCode;
	}

	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public boolean isTrailer() {
		return trailer;
	}

	public void setTrailer(boolean trailer) {
		this.trailer = trailer;
	}

	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	public MasterCovVO getBorderSelectedCov() {
		return borderSelectedCov;
	}

	public void setBorderSelectedCov(MasterCovVO borderSelectedCov) {
		this.borderSelectedCov = borderSelectedCov;
	}

	public Integer getBorderEnteredulw() {
		return borderEnteredulw;
	}

	public void setBorderEnteredulw(Integer borderEnteredulw) {
		this.borderEnteredulw = borderEnteredulw;
	}

	public String getBorderEnteredseats() {
		return borderEnteredseats;
	}

	public void setBorderEnteredseats(String borderEnteredseats) {
		this.borderEnteredseats = borderEnteredseats;
	}


	

}
