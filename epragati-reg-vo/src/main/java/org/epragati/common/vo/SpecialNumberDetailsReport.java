package org.epragati.common.vo;

import java.util.List;

import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.VahanDetailsVO;
import org.epragati.sn.vo.SpecialNumberDetailsByTRVO;

public class SpecialNumberDetailsReport {

	private ApplicantDetailsVO applicantDetails;

	private VahanDetailsVO vahanDetails;

	private List<SpecialNumberDetailsByTRVO> reportResponseVO;

	/**
	 * @return the applicantDetails
	 */
	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	/**
	 * @return the vahanDetails
	 */
	public VahanDetailsVO getVahanDetails() {
		return vahanDetails;
	}

	/**
	 * @param vahanDetails the vahanDetails to set
	 */
	public void setVahanDetails(VahanDetailsVO vahanDetails) {
		this.vahanDetails = vahanDetails;
	}

	/**
	 * @return the reportResponseVO
	 */
	public List<SpecialNumberDetailsByTRVO> getReportResponseVO() {
		return reportResponseVO;
	}

	/**
	 * @param reportResponseVO the reportResponseVO to set
	 */
	public void setReportResponseVO(List<SpecialNumberDetailsByTRVO> reportResponseVO) {
		this.reportResponseVO = reportResponseVO;
	}


}
