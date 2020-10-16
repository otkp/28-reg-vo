package org.epragati.master.vo;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RepresentativeDetailsVO {
	
	private String aadhaarNo;
	
	private String mobileNo;
	
	private String representativeName;
	
	private String parentUidToken;
	
	private String childUidToken;
	
	private String childAadhaarNo;

	public String getChildAadhaarNo() {
		return childAadhaarNo;
	}

	public void setChildAadhaarNo(String childAadhaarNo) {
		this.childAadhaarNo = childAadhaarNo;
	}

	public String getChildUidToken() {
		return childUidToken;
	}

	public void setChildUidToken(String childUidToken) {
		this.childUidToken = childUidToken;
	}

	public String getParentUidToken() {
		return parentUidToken;
	}

	public void setParentUidToken(String parentUidToken) {
		this.parentUidToken = parentUidToken;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

}
