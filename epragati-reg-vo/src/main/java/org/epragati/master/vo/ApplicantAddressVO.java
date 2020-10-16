package org.epragati.master.vo;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.epragati.util.custom.validation.Conditional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ApplicantAddressVO {

	@Conditional(selected = "doorNo",message = "invalid door no", values = { "" })
	private String doorNo;
	
	@Conditional(selected = "streetName",message = "invalid Street Name", values = { "" })
	private String streetName;

	@Size(min=4,message = "town Or City Required")
	private String townOrCity;

	private MandalVO mandal;

	private DistrictVO district;

	private StateVO state;

	private PostOfficeVO postOffice;

	@Valid
	private VillageVO village;

	private CountryVO country;

	private Boolean isMigrated;

	private String otherMandal;

	private String otherDistrict;

	private String otherState;

	private String otherPinCode;

	private String otherVillage;

	private String otherCountry;
	
	//For Dl Details
	private PostOfficeVO postOfficeVO;
	private VillageVO villageVO;
	private CountryVO countryVO;
	
	private String presentAddressFrom;
	

	public String getPresentAddressFrom() {
		return presentAddressFrom;
	}

	public void setPresentAddressFrom(String presentAddressFrom) {
		this.presentAddressFrom = presentAddressFrom;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTownOrCity() {
		return townOrCity;
	}

	public void setTownOrCity(String townOrCity) {
		this.townOrCity = townOrCity;
	}

	public MandalVO getMandal() {
		return mandal;
	}

	public void setMandal(MandalVO mandal) {
		this.mandal = mandal;
	}

	public DistrictVO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictVO district) {
		this.district = district;
	}

	public StateVO getState() {
		return state;
	}

	public void setState(StateVO state) {
		this.state = state;
	}

	public PostOfficeVO getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(PostOfficeVO postOffice) {
		this.postOffice = postOffice;
	}

	public VillageVO getVillage() {
		return village;
	}

	public void setVillage(VillageVO village) {
		this.village = village;
	}

	public CountryVO getCountry() {
		return country;
	}

	public void setCountry(CountryVO country) {
		this.country = country;
	}

	public Boolean getIsMigrated() {
		return isMigrated;
	}

	public void setIsMigrated(Boolean isMigrated) {
		this.isMigrated = isMigrated;
	}

	public String getOtherMandal() {
		return otherMandal;
	}

	public void setOtherMandal(String otherMandal) {
		this.otherMandal = otherMandal;
	}

	public String getOtherDistrict() {
		return otherDistrict;
	}

	public void setOtherDistrict(String otherDistrict) {
		this.otherDistrict = otherDistrict;
	}

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public String getOtherPinCode() {
		return otherPinCode;
	}

	public void setOtherPinCode(String otherPinCode) {
		this.otherPinCode = otherPinCode;
	}

	public String getOtherVillage() {
		return otherVillage;
	}

	public void setOtherVillage(String otherVillage) {
		this.otherVillage = otherVillage;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	/**
	 * @return the postOfficeVO
	 */
	public PostOfficeVO getPostOfficeVO() {
		return postOfficeVO;
	}

	/**
	 * @param postOfficeVO the postOfficeVO to set
	 */
	public void setPostOfficeVO(PostOfficeVO postOfficeVO) {
		this.postOfficeVO = postOfficeVO;
	}

	/**
	 * @return the villageVO
	 */
	public VillageVO getVillageVO() {
		return villageVO;
	}

	/**
	 * @param villageVO the villageVO to set
	 */
	public void setVillageVO(VillageVO villageVO) {
		this.villageVO = villageVO;
	}

	/**
	 * @return the countryVO
	 */
	public CountryVO getCountryVO() {
		return countryVO;
	}

	/**
	 * @param countryVO the countryVO to set
	 */
	public void setCountryVO(CountryVO countryVO) {
		this.countryVO = countryVO;
	}

	
}
