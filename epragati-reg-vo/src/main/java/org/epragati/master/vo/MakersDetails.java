package org.epragati.master.vo;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class MakersDetails {

	private MasterVariantVO masterVariantVO;
	
	private AadhaarDetailsRequestVO aadhaarDetailsRequestVO;

	public MasterVariantVO getMasterVariantVO() {
		return masterVariantVO;
	}

	public void setMasterVariantVO(MasterVariantVO masterVariantVO) {
		this.masterVariantVO = masterVariantVO;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
	}
	
	
	
}
