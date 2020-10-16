package org.epragati.civilsupplies.vo;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RationCardDetailsVO {

	private String doorNo;
	
	private String mandal;
	
	private Integer mandalCode;
	
	private String district;
	
	private Integer districtId;
	
	private String street;
	
	private String pincode;
	
	private String city;
	
	private String village;
	
	 private String houseHoldCardNo;
	
	private List<CardMemberDetailsVO> familyMembers;

	public Integer getMandalCode() {
		return mandalCode;
	}

	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public List<CardMemberDetailsVO> getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(List<CardMemberDetailsVO> familyMembers) {
		this.familyMembers = familyMembers;
	}

	public String getHouseHoldCardNo() {
		return houseHoldCardNo;
	}

	public void setHouseHoldCardNo(String houseHoldCardNo) {
		this.houseHoldCardNo = houseHoldCardNo;
	}
	
	
}
