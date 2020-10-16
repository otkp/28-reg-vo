package org.epragati.rta.reports.vo;

import java.util.List;

/**
 * 
 * @author manikanta guptha
 *
 */

public class PermitHistoryVO {

	
	private List<PermitHistoryDeatilsVO> primaryPermitVO;
	
	private List<PermitHistoryDeatilsVO> tempararyPermitVO;
	

	public List<PermitHistoryDeatilsVO> getPrimaryPermitVO() {
		return primaryPermitVO;
	}

	public void setPrimaryPermitVO(List<PermitHistoryDeatilsVO> primaryPermitVO) {
		this.primaryPermitVO = primaryPermitVO;
	}

	public List<PermitHistoryDeatilsVO> getTempararyPermitVO() {
		return tempararyPermitVO;
	}

	public void setTempararyPermitVO(List<PermitHistoryDeatilsVO> tempararyPermitVO) {
		this.tempararyPermitVO = tempararyPermitVO;
	}
	
	
}
