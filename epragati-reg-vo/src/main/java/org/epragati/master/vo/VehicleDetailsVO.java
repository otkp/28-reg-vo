package org.epragati.master.vo;

public class VehicleDetailsVO {

	private String chassisNumber;
	private String engineNumber;
	private String modfiedChassisNumber;
	private String modfiedEngineNumber;
	private String makersModel;
	private String makersDesc;
	// Ex M1 OR N1
	private String vehicleClass;
	private String manufacturedMonthYear;
	 private String color;
	private String bodyTypeDesc;
	private String seatingCapacity;
	// Gvw
	private Integer rlw;
	// UnladenWeight
	private Integer ulw;
	private String fuelDesc;
	private String gasKitNo;
	private String agencyDetails;
	private String classOfVehicle;
	private String classOfVehicleDesc;
	private String vehicleStatus;
	
	private Integer oldGvw;
	
	private Integer gvw;
	
	
	
	public String getModfiedChassisNumber() {
		return modfiedChassisNumber;
	}
	public void setModfiedChassisNumber(String modfiedChassisNumber) {
		this.modfiedChassisNumber = modfiedChassisNumber;
	}
	public String getModfiedEngineNumber() {
		return modfiedEngineNumber;
	}
	public void setModfiedEngineNumber(String modfiedEngineNumber) {
		this.modfiedEngineNumber = modfiedEngineNumber;
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
	 * @return the vehicleStatus
	 */
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	/**
	 * @param vehicleStatus the vehicleStatus to set
	 */
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}
	/**
	 * @param chassisNumber the chassisNumber to set
	 */
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	/**
	 * @return the engineNumber
	 */
	public String getEngineNumber() {
		return engineNumber;
	}
	/**
	 * @param engineNumber the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
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
	 * @return the makersDesc
	 */
	public String getMakersDesc() {
		return makersDesc;
	}
	/**
	 * @param makersDesc the makersDesc to set
	 */
	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}
	/**
	 * @return the vehicleClass
	 */
	public String getVehicleClass() {
		return vehicleClass;
	}
	/**
	 * @param vehicleClass the vehicleClass to set
	 */
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	/**
	 * @return the manufacturedMonthYear
	 */
	public String getManufacturedMonthYear() {
		return manufacturedMonthYear;
	}
	/**
	 * @param manufacturedMonthYear the manufacturedMonthYear to set
	 */
	public void setManufacturedMonthYear(String manufacturedMonthYear) {
		this.manufacturedMonthYear = manufacturedMonthYear;
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
	 * @return the bodyTypeDesc
	 */
	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}
	/**
	 * @param bodyTypeDesc the bodyTypeDesc to set
	 */
	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}
	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}
	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	/**
	 * @return the rlw
	 */
	public Integer getRlw() {
		return rlw;
	}
	/**
	 * @param rlw the rlw to set
	 */
	public void setRlw(Integer rlw) {
		this.rlw = rlw;
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
	 * @return the fuelDesc
	 */
	public String getFuelDesc() {
		return fuelDesc;
	}
	/**
	 * @param fuelDesc the fuelDesc to set
	 */
	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
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
	public Integer getOldGvw() {
		return oldGvw;
	}
	public void setOldGvw(Integer oldGvw) {
		this.oldGvw = oldGvw;
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
	
	
}
