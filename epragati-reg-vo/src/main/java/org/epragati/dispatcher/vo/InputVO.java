package org.epragati.dispatcher.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.hsrp.vo.HsrpDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InputVO {

	private String prNo;
	private String trNo;
	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	private String reqType;
	private String pageNo;
	private String size;
	private String officeCode;
	private String hsrpFailedStatusType;
	private Integer totalCount;
	private Integer intialSuccessCount;
	private Integer intialFailCount;
	private Integer trSuccessCount;
	private Integer prSuccessCount;
	private Integer trFailCount;
	private Integer prFailCount;
	private Integer trGeneratedCount;
	private Integer prGeneratedCount;
	private List<HsrpDetailsVO> hsrpPrFailedList;
	private HsrpDetailsVO serchList;
	
	public HsrpDetailsVO getSerchList() {
		return serchList;
	}

	public void setSerchList(HsrpDetailsVO serchList) {
		this.serchList = serchList;
	}

	public List<HsrpDetailsVO> getHsrpPrFailedList() {
		return hsrpPrFailedList;
	}

	public void setHsrpPrFailedList(List<HsrpDetailsVO> hsrpPrFailedList) {
		this.hsrpPrFailedList = hsrpPrFailedList;
	}

	public List<HsrpDetailsVO> getHsrpTrFailedList() {
		return hsrpTrFailedList;
	}

	public void setHsrpTrFailedList(List<HsrpDetailsVO> hsrpTrFailedList) {
		this.hsrpTrFailedList = hsrpTrFailedList;
	}

	private List<HsrpDetailsVO> hsrpTrFailedList;

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime todate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime fromdate;
	
	public LocalDateTime getTodate() {
		return todate;
	}

	public void setTodate(LocalDateTime todate) {
		this.todate = todate;
	}

	public LocalDateTime getFromdate() {
		return fromdate;
	}

	public void setFromdate(LocalDateTime fromdate) {
		this.fromdate = fromdate;
	}

	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fromDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private String toDate;

	
	public String getPageNo() {
		return pageNo;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	/*
	 * @JsonFormat(pattern = "dd-MM-yyyy") private String fromDate;
	 * 
	 * @JsonFormat(pattern = "dd-MM-yyyy") private String toDate;
	 */
	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	

	public String getHsrpFailedStatusType() {
		return hsrpFailedStatusType;
	}

	public void setHsrpFailedStatusType(String hsrpFailedStatusType) {
		this.hsrpFailedStatusType = hsrpFailedStatusType;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	
	public Integer getTrSuccessCount() {
		return trSuccessCount;
	}

	public void setTrSuccessCount(Integer trSuccessCount) {
		this.trSuccessCount = trSuccessCount;
	}

	public Integer getPrSuccessCount() {
		return prSuccessCount;
	}

	public void setPrSuccessCount(Integer prSuccessCount) {
		this.prSuccessCount = prSuccessCount;
	}

	public Integer getTrFailCount() {
		return trFailCount;
	}

	public void setTrFailCount(Integer trFailCount) {
		this.trFailCount = trFailCount;
	}
	

	public Integer getIntialSuccessCount() {
		return intialSuccessCount;
	}

	public void setIntialSuccessCount(Integer intialSuccessCount) {
		this.intialSuccessCount = intialSuccessCount;
	}

	public Integer getIntialFailCount() {
		return intialFailCount;
	}

	public void setIntialFailCount(Integer intialFailCount) {
		this.intialFailCount = intialFailCount;
	}

	public Integer getPrFailCount() {
		return prFailCount;
	}

	public void setPrFailCount(Integer prFailCount) {
		this.prFailCount = prFailCount;
	}

	public Integer getTrGeneratedCount() {
		return trGeneratedCount;
	}

	public void setTrGeneratedCount(Integer trGeneratedCount) {
		this.trGeneratedCount = trGeneratedCount;
	}

	public Integer getPrGeneratedCount() {
		return prGeneratedCount;
	}

	public void setPrGeneratedCount(Integer prGeneratedCount) {
		this.prGeneratedCount = prGeneratedCount;
	}
	
	
	
}
