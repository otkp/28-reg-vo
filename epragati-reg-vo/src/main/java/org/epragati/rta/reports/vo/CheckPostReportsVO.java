package org.epragati.rta.reports.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class CheckPostReportsVO {

	private long vcrCount;

	private double compoundFee;

	private String officeCode;

	private String officeName;

	private String mviName;
	
	private double voluntaryTax;

	private long voluntaryCount;

	private double permitFee = 0.0;

	private double permitTax = 0.0;

	private long permitCount;

	private double total;

	private List<CheckPostReportsVO> vcr;
	private List<CheckPostReportsVO> permit;
	private List<CheckPostReportsVO> voluntary;
	private List<CheckPostReportsVO> totalSum;
	private String appNo;
	private String prNo;
	private String cov;
	private String type;
	private Integer vcrTotalPage;
	private Integer permitTotalPage;
	private Integer voluntaryTotalPage;
	private Integer currentPage;
	private Integer pageSize;

	private double paidCf;
	private double unPaidCf;
	private String userId;
	private long vcrTax;
	private long serviceFee = 0l;
	private String covDescription;

	private String offenceName;

	public String getOffenceName() {
		return offenceName;
	}

	public void setOffenceName(String offenceName) {
		this.offenceName = offenceName;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public double getPermitFee() {
		return permitFee;
	}

	public void setPermitFee(double permitFee) {
		this.permitFee = permitFee;
	}

	public double getPermitTax() {
		return permitTax;
	}

	public void setPermitTax(double permitTax) {
		this.permitTax = permitTax;
	}

	public long getPermitCount() {
		return permitCount;
	}

	public void setPermitCount(long permitCount) {
		this.permitCount = permitCount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getVoluntaryTax() {
		return voluntaryTax;
	}

	public void setVoluntaryTax(double voluntaryTax) {
		this.voluntaryTax = voluntaryTax;
	}

	public long getVoluntaryCount() {
		return voluntaryCount;
	}

	public void setVoluntaryCount(long voluntaryCount) {
		this.voluntaryCount = voluntaryCount;
	}

	public long getVcrCount() {
		return vcrCount;
	}

	public void setVcrCount(long vcrCount) {
		this.vcrCount = vcrCount;
	}

	public double getCompoundFee() {
		return compoundFee;
	}

	public void setCompoundFee(double compoundFee) {
		this.compoundFee = compoundFee;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public List<CheckPostReportsVO> getVcr() {
		return vcr;
	}

	public void setVcr(List<CheckPostReportsVO> vcr) {
		this.vcr = vcr;
	}

	public List<CheckPostReportsVO> getPermit() {
		return permit;
	}

	public void setPermit(List<CheckPostReportsVO> permit) {
		this.permit = permit;
	}

	public List<CheckPostReportsVO> getVoluntary() {
		return voluntary;
	}

	public void setVoluntary(List<CheckPostReportsVO> voluntary) {
		this.voluntary = voluntary;
	}

	public List<CheckPostReportsVO> getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(List<CheckPostReportsVO> totalSum) {
		this.totalSum = totalSum;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getVcrTotalPage() {
		return vcrTotalPage;
	}

	public void setVcrTotalPage(Integer vcrTotalPage) {
		this.vcrTotalPage = vcrTotalPage;
	}

	public Integer getPermitTotalPage() {
		return permitTotalPage;
	}

	public void setPermitTotalPage(Integer permitTotalPage) {
		this.permitTotalPage = permitTotalPage;
	}

	public Integer getVoluntaryTotalPage() {
		return voluntaryTotalPage;
	}

	public void setVoluntaryTotalPage(Integer voluntaryTotalPage) {
		this.voluntaryTotalPage = voluntaryTotalPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public double getPaidCf() {
		return paidCf;
	}

	public void setPaidCf(double paidCf) {
		this.paidCf = paidCf;
	}

	public double getUnPaidCf() {
		return unPaidCf;
	}

	public void setUnPaidCf(double unPaidCf) {
		this.unPaidCf = unPaidCf;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getVcrTax() {
		return vcrTax;
	}

	public void setVcrTax(long vcrTax) {
		this.vcrTax = vcrTax;
	}

	public long getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getCovDescription() {
		return covDescription;
	}

	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}

}
