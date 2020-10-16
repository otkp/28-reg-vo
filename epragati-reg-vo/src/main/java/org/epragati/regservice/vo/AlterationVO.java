package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.AlterationTypeEnum;
import org.epragati.constants.FcValidityTypesEnum;
import org.epragati.rta.vo.TrailerChassisDetailsVO;
import org.epragati.util.StatusRegistration;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AlterationVO {


	List<AlterationTypeEnum> alterationService;

	// Vehicle Type
	private String fromCov;
	private String cov;
	private String vehicleTypeFrom;
	private String vehicleTypeTo;
	private String prNo;
	private String oldPrNo;
	private LocalDate prGeneratedDate;
	private LocalDateTime registrationValidity;
	private boolean isSpecialNoRequired;
	private boolean isNumberRequired;
	
	private Double height;
	private Double width;
	private Double length;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfCompletion;
	private Integer ulw;
	private String applicationNo;
	private String color;
	private String trNo;

	private Integer gvw;
	private String trailerChasisNo;
	private List<TrailerChassisDetailsVO> trailers;
	private String covDescription;
	private String axleType;
	// Fuel Type

	
	
	private String fromFuel;
	private String fuel;
	private String gasKitNo;
	private String agencyDetails;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate gasKitValidity;

	// bodyType
	private String frombodyType;
	private String bodyType;

	// seating
	private String fromSeatingCapacity;
	private String seating;
	
	private boolean isMVIDone = false;
	
	private FcValidityTypesEnum fcType;
	private StatusRegistration action;
	private String remarks;
	private String mviEnterdColor;
	

	/**
	 * @return the axleType
	 */
	public String getAxleType() {
		return axleType;
	}
	/**
	 * @param axleType the axleType to set
	 */
	public void setAxleType(String axleType) {
		this.axleType = axleType;
	}
	/**
	 * @return the alterationService
	 */
	public List<AlterationTypeEnum> getAlterationService() {
		return alterationService;
	}
	/**
	 * @param alterationService the alterationService to set
	 */
	public void setAlterationService(List<AlterationTypeEnum> alterationService) {
		this.alterationService = alterationService;
	}
	/**
	 * @return the fromCov
	 */
	public String getFromCov() {
		return fromCov;
	}
	/**
	 * @param fromCov the fromCov to set
	 */
	public void setFromCov(String fromCov) {
		this.fromCov = fromCov;
	}
	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}
	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}
	/**
	 * @return the vehicleTypeFrom
	 */
	public String getVehicleTypeFrom() {
		return vehicleTypeFrom;
	}
	/**
	 * @param vehicleTypeFrom the vehicleTypeFrom to set
	 */
	public void setVehicleTypeFrom(String vehicleTypeFrom) {
		this.vehicleTypeFrom = vehicleTypeFrom;
	}
	/**
	 * @return the vehicleTypeTo
	 */
	public String getVehicleTypeTo() {
		return vehicleTypeTo;
	}
	/**
	 * @param vehicleTypeTo the vehicleTypeTo to set
	 */
	public void setVehicleTypeTo(String vehicleTypeTo) {
		this.vehicleTypeTo = vehicleTypeTo;
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
	 * @return the prGeneratedDate
	 */
	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}
	/**
	 * @param prGeneratedDate the prGeneratedDate to set
	 */
	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}
	/**
	 * @return the registrationValidity
	 */
	public LocalDateTime getRegistrationValidity() {
		return registrationValidity;
	}
	/**
	 * @param registrationValidity the registrationValidity to set
	 */
	public void setRegistrationValidity(LocalDateTime registrationValidity) {
		this.registrationValidity = registrationValidity;
	}
	/**
	 * @return the isSpecialNoRequired
	 */
	public boolean isSpecialNoRequired() {
		return isSpecialNoRequired;
	}
	/**
	 * @param isSpecialNoRequired the isSpecialNoRequired to set
	 */
	public void setSpecialNoRequired(boolean isSpecialNoRequired) {
		this.isSpecialNoRequired = isSpecialNoRequired;
	}
	
	public void setIsSpecialNoRequired(boolean isSpecialNoRequired) {
		this.isSpecialNoRequired = isSpecialNoRequired;
	}
	/**
	 * @return the isNumberRequired
	 */
	public boolean isNumberRequired() {
		return isNumberRequired;
	}
	/**
	 * @param isNumberRequired the isNumberRequired to set
	 */
	public void setNumberRequired(boolean isNumberRequired) {
		this.isNumberRequired = isNumberRequired;
	}
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}
	/**
	 * @return the dateOfCompletion
	 */
	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}
	/**
	 * @param dateOfCompletion the dateOfCompletion to set
	 */
	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}
	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}
	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
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
	 * @return the trailerChasisNo
	 */
	public String getTrailerChasisNo() {
		return trailerChasisNo;
	}
	/**
	 * @param trailerChasisNo the trailerChasisNo to set
	 */
	public void setTrailerChasisNo(String trailerChasisNo) {
		this.trailerChasisNo = trailerChasisNo;
	}
	/**
	 * @return the trailers
	 */
	public List<TrailerChassisDetailsVO> getTrailers() {
		return trailers;
	}
	/**
	 * @param trailers the trailers to set
	 */
	public void setTrailers(List<TrailerChassisDetailsVO> trailers) {
		this.trailers = trailers;
	}
	/**
	 * @return the covDescription
	 */
	public String getCovDescription() {
		return covDescription;
	}
	/**
	 * @param covDescription the covDescription to set
	 */
	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}
	/**
	 * @return the fromFuel
	 */
	public String getFromFuel() {
		return fromFuel;
	}
	/**
	 * @param fromFuel the fromFuel to set
	 */
	public void setFromFuel(String fromFuel) {
		this.fromFuel = fromFuel;
	}
	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}
	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	/**
	 * @return the gasKitNo
	 */
	public String getGasKitNo() {
		return gasKitNo;
	}
	/**
	 * @param gasKitNo the gasKitNo to set
	 */
	public void setGasKitNo(String gasKitNo) {
		this.gasKitNo = gasKitNo;
	}
	/**
	 * @return the agencyDetails
	 */
	public String getAgencyDetails() {
		return agencyDetails;
	}
	/**
	 * @param agencyDetails the agencyDetails to set
	 */
	public void setAgencyDetails(String agencyDetails) {
		this.agencyDetails = agencyDetails;
	}
	/**
	 * @return the frombodyType
	 */
	public String getFrombodyType() {
		return frombodyType;
	}
	/**
	 * @param frombodyType the frombodyType to set
	 */
	public void setFrombodyType(String frombodyType) {
		this.frombodyType = frombodyType;
	}
	/**
	 * @return the bodyType
	 */
	public String getBodyType() {
		return bodyType;
	}
	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	/**
	 * @return the fromSeatingCapacity
	 */
	public String getFromSeatingCapacity() {
		return fromSeatingCapacity;
	}
	/**
	 * @param fromSeatingCapacity the fromSeatingCapacity to set
	 */
	public void setFromSeatingCapacity(String fromSeatingCapacity) {
		this.fromSeatingCapacity = fromSeatingCapacity;
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
	/**
	 * @return the isMVIDone
	 */
	public boolean isMVIDone() {
		return isMVIDone;
	}
	/**
	 * @param isMVIDone the isMVIDone to set
	 */
	public void setMVIDone(boolean isMVIDone) {
		this.isMVIDone = isMVIDone;
	}
	/**
	 * @return the gasKitValidity
	 */
	public LocalDate getGasKitValidity() {
		return gasKitValidity;
	}
	/**
	 * @param gasKitValidity the gasKitValidity to set
	 */
	public void setGasKitValidity(LocalDate gasKitValidity) {
		this.gasKitValidity = gasKitValidity;
	}
	/**
	 * @return the oldPrNo
	 */
	public String getOldPrNo() {
		return oldPrNo;
	}
	/**
	 * @param oldPrNo the oldPrNo to set
	 */
	public void setOldPrNo(String oldPrNo) {
		this.oldPrNo = oldPrNo;
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
	public StatusRegistration getAction() {
		return action;
	}
	public void setAction(StatusRegistration action) {
		this.action = action;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the mviEnterdColor
	 */
	public String getMviEnterdColor() {
		return mviEnterdColor;
	}
	/**
	 * @param mviEnterdColor the mviEnterdColor to set
	 */
	public void setMviEnterdColor(String mviEnterdColor) {
		this.mviEnterdColor = mviEnterdColor;
	}	
}
