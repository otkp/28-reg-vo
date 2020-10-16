package org.epragati.fa.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.civilsupplies.vo.RationCardDetailsVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.BankDetailsVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FinancialAssistanceVO {
	
	private String applicationNumber;
	
	private String prNo;
	
	private String aadharNo;
	
	private List<String> caste;
	
	private PersonalDetailsVO personalDetails;
	
	private DrivingLicenseDetailsVO drivingLicenseDetails;
	
	private VehicleDetailsVO vehicleDetails;
	
	private List<PersonalDetailsVO> applicantNamedCovs;
	
	private List<PersonalDetailsVO> familyMembersCovs;
	
	private BankDetailsVO bankDetails;
	
	private AadhaarDetailsRequestVO aadhaarDetailsRequest;
	
	private AadharDetailsResponseVO aadharDetailsResponse;
	
	private List<ImageInput> images;
	
	private String comment;
	
	private List<ImageVO> updateImageList;
	
	private String status;
	
	
   private List<KeyValue<String, List<ImageVO>>> enclosures;
   
   private RationCardDetailsVO familyMembersDetails;
	
	private List<FinancialAssistanceVO> Date;
	private List<FinancialAssistanceVO> MandalData;
	private List<FinancialAssistanceVO> districtData;
	private String mandalName;
	private String villageName;
	private String districtName;
	
	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	
	public List<String> getCaste() {
		return caste;
	}

	public void setCaste(List<String> caste) {
		this.caste = caste;
	}

	
	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public List<PersonalDetailsVO> getApplicantNamedCovs() {
		return applicantNamedCovs;
	}

	public void setApplicantNamedCovs(List<PersonalDetailsVO> applicantNamedCovs) {
		this.applicantNamedCovs = applicantNamedCovs;
	}

	public List<PersonalDetailsVO> getFamilyMembersCovs() {
		return familyMembersCovs;
	}

	public void setFamilyMembersCovs(List<PersonalDetailsVO> familyMembersCovs) {
		this.familyMembersCovs = familyMembersCovs;
	}

	public BankDetailsVO getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetailsVO bankDetails) {
		this.bankDetails = bankDetails;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequest() {
		return aadhaarDetailsRequest;
	}

	public void setAadhaarDetailsRequest(AadhaarDetailsRequestVO aadhaarDetailsRequest) {
		this.aadhaarDetailsRequest = aadhaarDetailsRequest;
	}

	public List<ImageInput> getImages() {
		return images;
	}

	public void setImages(List<ImageInput> images) {
		this.images = images;
	}

	public VehicleDetailsVO getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetailsVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public DrivingLicenseDetailsVO getDrivingLicenseDetails() {
		return drivingLicenseDetails;
	}

	public void setDrivingLicenseDetails(DrivingLicenseDetailsVO drivingLicenseDetails) {
		this.drivingLicenseDetails = drivingLicenseDetails;
	}

	public PersonalDetailsVO getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetailsVO personalDetails) {
		this.personalDetails = personalDetails;
	}

	public AadharDetailsResponseVO getAadharDetailsResponse() {
		return aadharDetailsResponse;
	}

	public void setAadharDetailsResponse(AadharDetailsResponseVO aadharDetailsResponse) {
		this.aadharDetailsResponse = aadharDetailsResponse;
	}

	public List<KeyValue<String, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	public void setEnclosures(List<KeyValue<String, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<ImageVO> getUpdateImageList() {
		return updateImageList;
	}

	public void setUpdateImageList(List<ImageVO> updateImageList) {
		this.updateImageList = updateImageList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RationCardDetailsVO getFamilyMembersDetails() {
		return familyMembersDetails;
	}

	public void setFamilyMembersDetails(RationCardDetailsVO familyMembersDetails) {
		this.familyMembersDetails = familyMembersDetails;
	}

	

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public List<FinancialAssistanceVO> getDate() {
		return Date;
	}

	public void setDate(List<FinancialAssistanceVO> date) {
		Date = date;
	}

	public List<FinancialAssistanceVO> getMandalData() {
		return MandalData;
	}

	public void setMandalData(List<FinancialAssistanceVO> mandalData) {
		MandalData = mandalData;
	}

	public List<FinancialAssistanceVO> getDistrictData() {
		return districtData;
	}

	public void setDistrictData(List<FinancialAssistanceVO> districtData) {
		this.districtData = districtData;
	}

	 

	

	
	
	
	
	
}
