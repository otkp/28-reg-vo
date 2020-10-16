package org.epragati.aadhaarseeding.vo;

import java.util.List;
import java.util.Map;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.util.Status;

/***
 * 
 * @author venkateswarlu.udiga
 *
 */
public class AadhaarSeedDetailsVO {
	
	private RegistrationDetailsVO registrationDetailsVO;
	
	private AadharDetailsResponseVO adharUserDetailsResponseVO;
	
	private Map<String, List<AahaarSeedMatchVO>> matchedDetails;
	
	private String aadhaarSeedId;
	
	private Status.AadhaarSeedStatus status;
	
	private String mobileNo;
	
	private String email;
	
	private ApplicantAddressVO presentAddress;
	
	private boolean isCompanyVehicle;

	private boolean isMobileUploaded;



	public boolean isMobileUploaded() {
		return isMobileUploaded;
	}

	public void setMobileUploaded(boolean isMobileUploaded) {
		this.isMobileUploaded = isMobileUploaded;
	}


	/**
	 * @return the presentAddress
	 */
	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}

	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	public RegistrationDetailsVO getRegistrationDetailsVO() {
		return registrationDetailsVO;
	}

	public void setRegistrationDetailsVO(RegistrationDetailsVO registrationDetailsVO) {
		this.registrationDetailsVO = registrationDetailsVO;
	}

	/**
	 * @return the adharUserDetailsResponseVO
	 */
	public AadharDetailsResponseVO getAdharUserDetailsResponseVO() {
		return adharUserDetailsResponseVO;
	}

	/**
	 * @param adharUserDetailsResponseVO the adharUserDetailsResponseVO to set
	 */
	public void setAdharUserDetailsResponseVO(AadharDetailsResponseVO adharUserDetailsResponseVO) {
		this.adharUserDetailsResponseVO = adharUserDetailsResponseVO;
	}

	/**
	 * @return the matchedDetails
	 */
	public Map<String, List<AahaarSeedMatchVO>> getMatchedDetails() {
		return matchedDetails;
	}

	/**
	 * @param matchedDetails the matchedDetails to set
	 */
	public void setMatchedDetails(Map<String, List<AahaarSeedMatchVO>> matchedDetails) {
		this.matchedDetails = matchedDetails;
	}

	/**
	 * @return the aadhaarSeedId
	 */
	public String getAadhaarSeedId() {
		return aadhaarSeedId;
	}

	/**
	 * @param aadhaarSeedId the aadhaarSeedId to set
	 */
	public void setAadhaarSeedId(String aadhaarSeedId) {
		this.aadhaarSeedId = aadhaarSeedId;
	}

	/**
	 * @return the status
	 */
	public Status.AadhaarSeedStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status.AadhaarSeedStatus status) {
		this.status = status;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the isCompanyVehicle
	 */
	public boolean isCompanyVehicle() {
		return isCompanyVehicle;
	}

	/**
	 * @param isCompanyVehicle the isCompanyVehicle to set
	 */
	public void setCompanyVehicle(boolean isCompanyVehicle) {
		this.isCompanyVehicle = isCompanyVehicle;
	}
	
	
	
}
