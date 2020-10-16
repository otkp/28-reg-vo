package org.epragati.vcr_dl.vo;

import java.io.Serializable;

import org.epragati.master.vo.CountryVO;
import org.epragati.master.vo.DistrictVO;
import org.epragati.master.vo.MandalVO;
import org.epragati.master.vo.PostOfficeVO;
import org.epragati.master.vo.StateVO;

public class AddressVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String doorNo;
	private String streetName;
	private String townOrCity;
	private MandalVO mandal;
	private DistrictVO district;
	private StateVO state;
	private PostOfficeVO postOfficeVO;
	private VillagesVO villageVO;
	private CountryVO countryVO;
	private String otherMandal;
	private String otherDistrict;
	private String otherState;
	private String otherPinCode;
	private String otherVillage;
	private String otherCountry;
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
	public PostOfficeVO getPostOfficeVO() {
		return postOfficeVO;
	}
	public void setPostOfficeVO(PostOfficeVO postOfficeVO) {
		this.postOfficeVO = postOfficeVO;
	}
	public VillagesVO getVillageVO() {
		return villageVO;
	}
	public void setVillageVO(VillagesVO villageVO) {
		this.villageVO = villageVO;
	}
	public CountryVO getCountryVO() {
		return countryVO;
	}
	public void setCountryVO(CountryVO countryVO) {
		this.countryVO = countryVO;
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
	
	
}
