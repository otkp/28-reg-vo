package org.epragati.financier.vo;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.master.vo.UserVO;

public class FinancierUserUpdateVO extends UserVO {
	private AadhaarDetailsRequestVO parentAadharResponseVO;
	private AadhaarDetailsRequestVO childAadharResponseVO;
	public AadhaarDetailsRequestVO getParentAadharResponseVO() {
		return parentAadharResponseVO;
	}
	public void setParentAadharResponseVO(AadhaarDetailsRequestVO parentAadharResponseVO) {
		this.parentAadharResponseVO = parentAadharResponseVO;
	}
	public AadhaarDetailsRequestVO getChildAadharResponseVO() {
		return childAadharResponseVO;
	}
	public void setChildAadharResponseVO(AadhaarDetailsRequestVO childAadharResponseVO) {
		this.childAadharResponseVO = childAadharResponseVO;
	}
	
	
	
}
