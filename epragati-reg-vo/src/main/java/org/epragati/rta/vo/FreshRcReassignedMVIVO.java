package org.epragati.rta.vo;

import java.util.List;
import java.util.Set;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.OfficeVO;
import org.epragati.regservice.vo.LockedDetailsVO;
import org.epragati.util.StatusRegistration;

public class FreshRcReassignedMVIVO {
	private String applicationNo;
	private String prNo;
	private String representativeName;

	private String entityName;
	private String displayName;

	private String firstName;

	private String lastName;

	private String middleName;

	private String fatherName;
	private OwnerTypeEnum ownerType;
	private String chassisNumber;
	private String engineNumber;
	private String classOfVehicle;
	private String vehicleType;
	private String classOfVehicleDesc;
	private StatusRegistration applicationStatus;
	private OfficeVO officeDetails;
	private OfficeVO mviOfficeDetails;
	private boolean mviDone = Boolean.FALSE;
	private List<LockedDetailsVO> lockedDetails;
	private Set<Integer> serviceIds;
	private String financerUserId;
	private String yardName;
	private String yardLocation;
	private String financerName;
	private Double sanctionedAmount;
	private ApplicantAddressVO yardAddress;
	private String newMVIname;
	private String remarks;
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
	public String getRepresentativeName() {
		return representativeName;
	}
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
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
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}
	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}
	public OfficeVO getMviOfficeDetails() {
		return mviOfficeDetails;
	}
	public void setMviOfficeDetails(OfficeVO mviOfficeDetails) {
		this.mviOfficeDetails = mviOfficeDetails;
	}
	public boolean isMviDone() {
		return mviDone;
	}
	public void setMviDone(boolean mviDone) {
		this.mviDone = mviDone;
	}
	public List<LockedDetailsVO> getLockedDetails() {
		return lockedDetails;
	}
	public void setLockedDetails(List<LockedDetailsVO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	public String getFinancerUserId() {
		return financerUserId;
	}
	public void setFinancerUserId(String financerUserId) {
		this.financerUserId = financerUserId;
	}
	public String getYardName() {
		return yardName;
	}
	public void setYardName(String yardName) {
		this.yardName = yardName;
	}
	public String getYardLocation() {
		return yardLocation;
	}
	public void setYardLocation(String yardLocation) {
		this.yardLocation = yardLocation;
	}
	public String getFinancerName() {
		return financerName;
	}
	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}
	public Double getSanctionedAmount() {
		return sanctionedAmount;
	}
	public void setSanctionedAmount(Double sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}
	public ApplicantAddressVO getYardAddress() {
		return yardAddress;
	}
	public void setYardAddress(ApplicantAddressVO yardAddress) {
		this.yardAddress = yardAddress;
	}
	public String getNewMVIname() {
		return newMVIname;
	}
	public void setNewMVIname(String newMVIname) {
		this.newMVIname = newMVIname;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
