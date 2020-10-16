package org.epragati.rta.vo;

import java.util.List;

public class OtherStateEditVO {
	
	private String firstName ;
	private String vehicleType ;
	private String chassisNumber ;
	
	private String prGeneratedDate;
	//private LocalDateTime registrationValidity;
	private String	ownerType ;
	private String engineNumber ;
    private String manufacturedMonthYear ;
	private Integer	rlw;  
    private Integer ulw ; 
    private String  seating;
    private String fuelDesc ;
    private String bodyType;
    private String makersModel; 
    private String makersDesc ;
    private String color ;
    private String classOfVehicleDesc;
    private String cov ;
	private List<TrailerChassisDetailsVO> trailers;

	private String mobile; 
	private String width;
	private String heigth;
	private String length;
	private String dateOfCompletion;
	private String axleType;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(String prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

//	public LocalDateTime getRegistrationValidity() {
//		return registrationValidity;
//	}
//
//	public void setRegistrationValidity(LocalDateTime registrationValidity) {
//		this.registrationValidity = registrationValidity;
//	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getManufacturedMonthYear() {
		return manufacturedMonthYear;
	}

	public void setManufacturedMonthYear(String manufacturedMonthYear) {
		this.manufacturedMonthYear = manufacturedMonthYear;
	}

	public Integer getRlw() {
		return rlw;
	}

	public void setRlw(Integer rlw) {
		this.rlw = rlw;
	}

	public Integer getUlw() {
		return ulw;
	}

	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	public String getFuelDesc() {
		return fuelDesc;
	}

	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}

	public String getMakersModel() {
		return makersModel;
	}

	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	public String getMakersDesc() {
		return makersDesc;
	}

	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	
	/**
	 * @return the dateOfCompletion
	 */
	public String getDateOfCompletion() {
		return dateOfCompletion;
	}

	/**
	 * @param dateOfCompletion the dateOfCompletion to set
	 */
	public void setDateOfCompletion(String dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}

	/**
	 * @return the heigth
	 */
	public String getHeigth() {
		return heigth;
	}

	/**
	 * @param heigth the heigth to set
	 */
	public void setHeigth(String heigth) {
		this.heigth = heigth;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
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


}
