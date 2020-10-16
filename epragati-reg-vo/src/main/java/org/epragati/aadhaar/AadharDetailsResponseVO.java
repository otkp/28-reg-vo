package org.epragati.aadhaar;

import java.io.Serializable;
import java.util.UUID;

import org.epragati.master.vo.RepresentativeVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AadharDetailsResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String KSA_KUA_Txn;
	private String auth_err_code;
	private String auth_date;
	private String auth_status;
	private String auth_transaction_code;
	private String base64file;
	private String co;
	private String district;
	private String district_name;
	private String dob;
	private String gender;
	private String house;
	private String lc;
	private String mandal;
	private String mandal_name;
	private String name;
	private String pincode;
	private String po;
	private String statecode;
	private String street;
	private String subdist;
	private Long uid;
	private String village;
	private String village_name;
	private String vtc;
	private boolean isInsideAP;
	private boolean isStateMatched;
	private boolean isDistrictMatched;
	private boolean isMandalMatched;
	private String stateMatchedCode;
	private String districtMatchedCode;
	private String mandalMatchedCode;
	private Integer age;
	private String applicationNumber;
	private String firstName;
	private String lastName;
	private String nationality;
	private String doorNo;
	private String country;
	private String phone;
	private UUID uuId;
	private String email;

	private String oldTid;
	private String idType;
	private String uid_num;
	private String requestType;
	private String tid;
	private String uidToken; 
	
	private String source;
	
	private RepresentativeVO representativeVO;
	

	 protected String rrn;
	 protected String phoneNumber;
	
	 protected String UIDAIeKYCTxn;
	 protected String Pincode;
	 protected String Eid;
//	 protected String Uid;
	 protected String Careof;
	 protected String District;
	 protected String Mandal;
	 protected String Village;

	 protected String BuildingName;
	 protected String District_name;
	 protected String Mandal_name;
	 protected String Village_name;
	 protected String srdhwstxn;
	 protected String landmark;
	 private String orgnlAuth_Status;
	 private String orgnlAuth_ErrorCode;
	
	public String getAuth_err_code() {
		return this.auth_err_code;
	}

	public void setAuth_err_code(String auth_err_code) {
		this.auth_err_code = auth_err_code;
	}

	public String getKSA_KUA_Txn() {
		return this.KSA_KUA_Txn;
	}

	public void setKSA_KUA_Txn(String kSA_KUA_Txn) {
		this.KSA_KUA_Txn = kSA_KUA_Txn;
	}

	public String getAuth_date() {
		return this.auth_date;
	}

	public void setAuth_date(String auth_date) {
		this.auth_date = auth_date;
	}

	public String getAuth_status() {
		return this.auth_status;
	}

	public void setAuth_status(String auth_status) {
		this.auth_status = auth_status;
	}

	public String getAuth_transaction_code() {
		return this.auth_transaction_code;
	}

	public void setAuth_transaction_code(String auth_transaction_code) {
		this.auth_transaction_code = auth_transaction_code;
	}

	public String getBase64file() {
		return this.base64file;
	}

	public void setBase64file(String base64file) {
		this.base64file = base64file;
	}

	public String getCo() {
		return this.co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrict_name() {
		return this.district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouse() {
		return this.house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getLc() {
		return this.lc;
	}

	public void setLc(String lc) {
		this.lc = lc;
	}

	public String getMandal() {
		return this.mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getMandal_name() {
		return this.mandal_name;
	}

	public void setMandal_name(String mandal_name) {
		this.mandal_name = mandal_name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPo() {
		return this.po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getStatecode() {
		return this.statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSubdist() {
		return this.subdist;
	}

	public void setSubdist(String subdist) {
		this.subdist = subdist;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getVillage() {
		return this.village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getVillage_name() {
		return this.village_name;
	}

	public void setVillage_name(String village_name) {
		this.village_name = village_name;
	}

	public String getVtc() {
		return this.vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

	public boolean isInsideAP() {
		return this.isInsideAP;
	}

	public void setInsideAP(boolean isInsideAP) {
		this.isInsideAP = isInsideAP;
	}

	public boolean isStateMatched() {
		return this.isStateMatched;
	}

	public void setStateMatched(boolean isStateMatched) {
		this.isStateMatched = isStateMatched;
	}

	public boolean isDistrictMatched() {
		return this.isDistrictMatched;
	}

	public void setDistrictMatched(boolean isDistrictMatched) {
		this.isDistrictMatched = isDistrictMatched;
	}

	public boolean isMandalMatched() {
		return this.isMandalMatched;
	}

	public void setMandalMatched(boolean isMandalMatched) {
		this.isMandalMatched = isMandalMatched;
	}

	public String getStateMatchedCode() {
		return this.stateMatchedCode;
	}

	public void setStateMatchedCode(String stateMatchedCode) {
		this.stateMatchedCode = stateMatchedCode;
	}

	public String getDistrictMatchedCode() {
		return this.districtMatchedCode;
	}

	public void setDistrictMatchedCode(String districtMatchedCode) {
		this.districtMatchedCode = districtMatchedCode;
	}

	public String getMandalMatchedCode() {
		return this.mandalMatchedCode;
	}

	public void setMandalMatchedCode(String mandalMatchedCode) {
		this.mandalMatchedCode = mandalMatchedCode;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getApplicationNumber() {
		return this.applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDoorNo() {
		return this.doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the uuId
	 */
	public UUID getUuId() {
		return uuId;
	}

	/**
	 * @param uuId the uuId to set
	 */
	public void setUuId(UUID uuId) {
		this.uuId = uuId;
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
	 * @return the oldTid
	 */
	public String getOldTid() {
		return oldTid;
	}

	/**
	 * @param oldTid the oldTid to set
	 */
	public void setOldTid(String oldTid) {
		this.oldTid = oldTid;
	}

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the uid_num
	 */
	public String getUid_num() {
		return uid_num;
	}

	/**
	 * @param uid_num the uid_num to set
	 */
	public void setUid_num(String uid_num) {
		this.uid_num = uid_num;
	}

	/**
	 * @return the requesttype
	 */
	public String getRequesttype() {
		return requestType;
	}

	/**
	 * @param requesttype the requesttype to set
	 */
	public void setRequesttype(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the uidToken
	 */
	public String getUidToken() {
		return uidToken;
	}

	/**
	 * @param uidToken the uidToken to set
	 */
	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}
	
	

	public RepresentativeVO getRepresentativeVO() {
		return representativeVO;
	}

	public void setRepresentativeVO(RepresentativeVO representativeVO) {
		this.representativeVO = representativeVO;
	}

	
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUIDAIeKYCTxn() {
		return UIDAIeKYCTxn;
	}

	public void setUIDAIeKYCTxn(String uIDAIeKYCTxn) {
		UIDAIeKYCTxn = uIDAIeKYCTxn;
	}

	public String getEid() {
		return Eid;
	}

	public void setEid(String eid) {
		Eid = eid;
	}

	public String getCareof() {
		return Careof;
	}

	public void setCareof(String careof) {
		Careof = careof;
	}

	public String getBuildingName() {
		return BuildingName;
	}

	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}

	public String getSrdhwstxn() {
		return srdhwstxn;
	}

	public void setSrdhwstxn(String srdhwstxn) {
		this.srdhwstxn = srdhwstxn;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getOrgnlAuth_Status() {
		return orgnlAuth_Status;
	}

	public void setOrgnlAuth_Status(String orgnlAuth_Status) {
		this.orgnlAuth_Status = orgnlAuth_Status;
	}

	public String getOrgnlAuth_ErrorCode() {
		return orgnlAuth_ErrorCode;
	}

	public void setOrgnlAuth_ErrorCode(String orgnlAuth_ErrorCode) {
		this.orgnlAuth_ErrorCode = orgnlAuth_ErrorCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AadharDetailsResponseVO [KSA_KUA_Txn=" + KSA_KUA_Txn + ", auth_err_code=" + auth_err_code
				+ ", auth_date=" + auth_date + ", auth_status=" + auth_status + ", auth_transaction_code="
				+ auth_transaction_code + ", base64file=" + base64file + ", co=" + co + ", district=" + district
				+ ", district_name=" + district_name + ", dob=" + dob + ", gender=" + gender + ", house=" + house
				+ ", lc=" + lc + ", mandal=" + mandal + ", mandal_name=" + mandal_name + ", name=" + name + ", pincode="
				+ pincode + ", po=" + po + ", statecode=" + statecode + ", street=" + street + ", subdist=" + subdist
				+ ", uid=" + uid + ", village=" + village + ", village_name=" + village_name + ", vtc=" + vtc
				+ ", isInsideAP=" + isInsideAP + ", isStateMatched=" + isStateMatched + ", isDistrictMatched="
				+ isDistrictMatched + ", isMandalMatched=" + isMandalMatched + ", stateMatchedCode=" + stateMatchedCode
				+ ", districtMatchedCode=" + districtMatchedCode + ", mandalMatchedCode=" + mandalMatchedCode + ", age="
				+ age + ", applicationNumber=" + applicationNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", nationality=" + nationality + ", doorNo=" + doorNo + ", country=" + country + ", phone="
				+ phone + ", uuId=" + uuId + ", email=" + email + ", oldTid=" + oldTid + ", idType=" + idType
				+ ", uid_num=" + uid_num + ", requestType=" + requestType + "]";
	}

	

}
