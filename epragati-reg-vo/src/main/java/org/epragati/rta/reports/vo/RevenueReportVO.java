package org.epragati.rta.reports.vo;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class RevenueReportVO {
	
	private List<DistrictWiseReportVO> districtWiseVOList;
	
	private List<OfficePaymentVO> officeVOList;
	
	private List<DistrictReportVO> DistrictReportVO;
	
	private ReportTotalsVo reportTotalsVo;

	

	public List<DistrictWiseReportVO> getDistrictWiseVOList() {
		return districtWiseVOList;
	}

	public void setDistrictWiseVOList(List<DistrictWiseReportVO> districtWiseVOList) {
		this.districtWiseVOList = districtWiseVOList;
	}

	public List<DistrictReportVO> getDistrictReportVO() {
		return DistrictReportVO;
	}

	public void setDistrictReportVO(List<DistrictReportVO> districtReportVO) {
		DistrictReportVO = districtReportVO;
	}

	public List<OfficePaymentVO> getOfficeVOList() {
		return officeVOList;
	}

	public void setOfficeVOList(List<OfficePaymentVO> officeVOList) {
		this.officeVOList = officeVOList;
	}

	public ReportTotalsVo getReportTotalsVo() {
		return reportTotalsVo;
	}

	public void setReportTotalsVo(ReportTotalsVo reportTotalsVo) {
		this.reportTotalsVo = reportTotalsVo;
	}

}
