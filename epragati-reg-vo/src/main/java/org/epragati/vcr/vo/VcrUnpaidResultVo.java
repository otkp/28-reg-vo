package org.epragati.vcr.vo;

import java.util.List;

public class VcrUnpaidResultVo {
	private List<VcrUnpaidCountOfficewiseVo> ListVcrUnpaidCountOfficewiseVo;
	private List<UnpaidVcrListVO> unpaidVcrListVO;
	public List<VcrUnpaidCountOfficewiseVo> getListVcrUnpaidCountOfficewiseVo() {
		return ListVcrUnpaidCountOfficewiseVo;
	}
	public void setListVcrUnpaidCountOfficewiseVo(List<VcrUnpaidCountOfficewiseVo> listVcrUnpaidCountOfficewiseVo) {
		ListVcrUnpaidCountOfficewiseVo = listVcrUnpaidCountOfficewiseVo;
	}
	public List<UnpaidVcrListVO> getUnpaidVcrListVO() {
		return unpaidVcrListVO;
	}
	public void setUnpaidVcrListVO(List<UnpaidVcrListVO> unpaidVcrListVO) {
		this.unpaidVcrListVO = unpaidVcrListVO;
	}
	
}
