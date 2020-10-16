package org.epragati.regservice.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.MakersVO;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.master.vo.MasterVariantVO;
import org.epragati.master.vo.RegistrationDetailsVO;

public class OtherStateVahanVO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1021839283514991494L;
	
	
	
	private OtherStateCovVO otherStateCovVO;
	
	private OtherStateRegVO otherStateRegVO;
	
	/**
	 * @return the otherStateRegVO
	 */
	public OtherStateRegVO getOtherStateRegVO() {
		return otherStateRegVO;
	}

	/**
	 * @param otherStateRegVO the otherStateRegVO to set
	 */
	public void setOtherStateRegVO(OtherStateRegVO otherStateRegVO) {
		this.otherStateRegVO = otherStateRegVO;
	}

	/**
	 * @return the otherStateCovVO
	 */
	public OtherStateCovVO getOtherStateCovVO() {
		return otherStateCovVO;
	}

	/**
	 * @param otherStateCovVO the otherStateCovVO to set
	 */
	public void setOtherStateCovVO(OtherStateCovVO otherStateCovVO) {
		this.otherStateCovVO = otherStateCovVO;
	}

}
