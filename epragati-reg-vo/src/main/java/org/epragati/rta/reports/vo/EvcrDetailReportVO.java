package org.epragati.rta.reports.vo;

import java.util.List;

import org.epragati.vcr.vo.VcrFinalServiceVO;

public class EvcrDetailReportVO {
	
	private String officeName;
	private List<VcrFinalServiceVO> listOfEvcrVos;
	
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public List<VcrFinalServiceVO> getListOfEvcrVos() {
		return listOfEvcrVos;
	}
	public void setListOfEvcrVos(List<VcrFinalServiceVO> listOfEvcrVos) {
		this.listOfEvcrVos = listOfEvcrVos;
	}
	
	

}
