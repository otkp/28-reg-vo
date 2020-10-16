package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.images.vo.ImageInput;
import org.epragati.util.payment.ServiceEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CommonFieldsVO {

	private String applicationNo;
	private String prNo;
	private String name;
	private String mobile;
	private String officeName;
	private String inspectionOfficeName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate testSlotDate;
	private ServiceEnum serviceType;
	private String chassisNumber;
	private String engineNumber;
	private String seatingCapacity;
	private String makersModel;
	private Integer gvw;
	private Integer ulw;
	private String bodyTypeDesc;
	private String classOfVehicle;
	private List<ImageInput> imageInput;
	
	
	private Integer stoppageCount;
	private Integer stoppageRevocationCount;
	private Integer fcCount;
	
	
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public LocalDate getTestSlotDate() {
		return testSlotDate;
	}
	public void setTestSlotDate(LocalDate testSlotDate) {
		this.testSlotDate = testSlotDate;
	}
	public ServiceEnum getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceEnum serviceType) {
		this.serviceType = serviceType;
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
	public String getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getMakersModel() {
		return makersModel;
	}
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}
	public Integer getGvw() {
		return gvw;
	}
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}
	public Integer getUlw() {
		return ulw;
	}
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}
	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}
	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getInspectionOfficeName() {
		return inspectionOfficeName;
	}
	public void setInspectionOfficeName(String inspectionOfficeName) {
		this.inspectionOfficeName = inspectionOfficeName;
	}
	public Integer getStoppageCount() {
		return stoppageCount;
	}
	public void setStoppageCount(Integer stoppageCount) {
		this.stoppageCount = stoppageCount;
	}
	public Integer getStoppageRevocationCount() {
		return stoppageRevocationCount;
	}
	public void setStoppageRevocationCount(Integer stoppageRevocationCount) {
		this.stoppageRevocationCount = stoppageRevocationCount;
	}
	public Integer getFcCount() {
		return fcCount;
	}
	public void setFcCount(Integer fcCount) {
		this.fcCount = fcCount;
	}
	public List<ImageInput> getImageInput() {
		return imageInput;
	}
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}
	
	
 	
	
	
	
	
}
