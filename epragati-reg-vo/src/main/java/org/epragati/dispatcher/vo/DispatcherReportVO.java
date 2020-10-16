package org.epragati.dispatcher.vo;

import java.util.List;

public class DispatcherReportVO {
	
	private List<DispatcherSubmissionVO> dispatcherSubmissionVOList;
	
	private int pageNo;
	
	private int totalPages;

	/**
	 * @return the dispatcherSubmissionVOList
	 */
	public List<DispatcherSubmissionVO> getDispatcherSubmissionVOList() {
		return dispatcherSubmissionVOList;
	}

	/**
	 * @param dispatcherSubmissionVOList the dispatcherSubmissionVOList to set
	 */
	public void setDispatcherSubmissionVOList(List<DispatcherSubmissionVO> dispatcherSubmissionVOList) {
		this.dispatcherSubmissionVOList = dispatcherSubmissionVOList;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
