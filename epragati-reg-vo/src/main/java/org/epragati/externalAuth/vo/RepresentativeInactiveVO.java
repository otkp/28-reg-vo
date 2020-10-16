package org.epragati.externalAuth.vo;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RepresentativeInactiveVO {
	
    private String parentUidToken;
    
	private String childAadharNo;
	
	private String childUidToken; 
	
	private AadhaarDetailsRequestVO requestModel;

	public String getParentUidToken() {
		return parentUidToken;
	}

	public void setParentUidToken(String parentUidToken) {
		this.parentUidToken = parentUidToken;
	}

	public String getChildAadharNo() {
		return childAadharNo;
	}

	public void setChildAadharNo(String childAadharNo) {
		this.childAadharNo = childAadharNo;
	}

	public String getChildUidToken() {
		return childUidToken;
	}

	public void setChildUidToken(String childUidToken) {
		this.childUidToken = childUidToken;
	}

	public AadhaarDetailsRequestVO getRequestModel() {
		return requestModel;
	}

	public void setRequestModel(AadhaarDetailsRequestVO requestModel) {
		this.requestModel = requestModel;
	}

}
