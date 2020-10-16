package org.epragati.payment.report.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.master.vo.UserVO;
import org.epragati.rcactions.RCActionsVO;
import org.epragati.regservice.vo.NOCDetailsVO;
import org.epragati.rta.reports.vo.ReportVO;
import org.epragati.rta.reports.vo.RevenueFeeVO;
import org.epragati.rta.reports.vo.VehicleStrengthVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RegReportVO {


	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate fromDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate approvedDate;
	private Integer gateWayType;

	private String status;

	private String districtName;

	private Integer districtId;
	
	private String allDistrics;

	public String getAllDistrics() {
		return allDistrics;
	}

	public void setAllDistrics(String allDistrics) {
		this.allDistrics = allDistrics;
	}

	private String transactionNo;

	private Double total;

	private String officeCode;

	private String gateWay;

	private String mandalName;

	public Map<String, Double> breakup;

	public String feeType;

	private String role;

	private String fee;
	private List<Integer> serviceId;
	private String mviName;

	private String userId;

	private String series;

	private Integer mandalId;

	private List<ReportVO> covReport;

	private String reportLevel;

	private List<VehicleStrengthVO> vehicleStrength;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime transactionDate;

	private List<ReportVO> feeReport;

	private String module;

	private String vehicleType;

	private Integer totalTransactionCount;

	private List<VcrFinalServiceVO> vcrReport;

	private List<RCActionsVO> rcReport;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate validFrom;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate validTo;

	private String officeName;

	private String permitType;

	private String cov;

	private String prNo;

	private String permitNo;

	private List<String> mvi;

	private List<UserVO> mviUsers;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate quarterEndDate;

	private Integer pendingQuarter;

	private List<RCCancellationVO> nonPaymentReport;

	private String classOfVehicle;

	private String quarter;
	
	private NOCDetailsVO nocDetails;
	
	private List<NOCDetailsVO> nocDetailsVO;
	
	private String ownerName;
	
	private List<ActionDetailsVO> userAction;
	
	private String primaryRoleName;

	private Integer cfCollected ;
	
	private Double taxCollected ;
	
	private Long penaltyCollected ;
	
	private Long penaltyArrearsCollected ;
	
	private Integer toatalBookedvcrCount;
	
	private Integer toatalPaidVcrCount;
	
	private Long grandTotalAmount;
	private Long totalvcrscount;
	
	private List<MviPerformanceVO> MviPerformance;
	private Integer grandTotalofPaidevcrCount;
	private Boolean isViewData=Boolean.FALSE;
	
	public Boolean getIsViewData() {
		return isViewData;
	}

	public void setIsViewData(Boolean isViewData) {
		this.isViewData = isViewData;
	}

	public Integer getGrandTotalofPaidevcrCount() {
		return grandTotalofPaidevcrCount;
	}

	public void setGrandTotalofPaidevcrCount(Integer grandTotalofPaidevcrCount) {
		this.grandTotalofPaidevcrCount = grandTotalofPaidevcrCount;
	}

	public Integer getGrandTotalofBookedvcrCount() {
		return grandTotalofBookedvcrCount;
	}

	public void setGrandTotalofBookedvcrCount(Integer grandTotalofBookedvcrCount) {
		this.grandTotalofBookedvcrCount = grandTotalofBookedvcrCount;
	}

	private Integer grandTotalofBookedvcrCount;
	public List<MviPerformanceVO> getMviPerformance() {
		return MviPerformance;
	}

	public void setMviPerformance(List<MviPerformanceVO> mviPerformance) {
		MviPerformance = mviPerformance;
	}

	public Long getTotalvcrscount() {
		return totalvcrscount;
	}

	public void setTotalvcrscount(Long totalvcrscount) {
		this.totalvcrscount = totalvcrscount;
	}

	public Long getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(Long grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

	public Integer getToatalBookedvcrCount() {
		return toatalBookedvcrCount;
	}

	public void setToatalBookedvcrCount(Integer toatalBookedvcrCount) {
		this.toatalBookedvcrCount = toatalBookedvcrCount;
	}

	public Integer getToatalPaidVcrCount() {
		return toatalPaidVcrCount;
	}

	public void setToatalPaidVcrCount(Integer toatalPaidVcrCount) {
		this.toatalPaidVcrCount = toatalPaidVcrCount;
	}

	public Integer getCfCollected() {
		return cfCollected;
	}

	public void setCfCollected(Integer cfCollected) {
		this.cfCollected = cfCollected;
	}

	public Double getTaxCollected() {
		return taxCollected;
	}

	public void setTaxCollected(Double taxCollected) {
		this.taxCollected = taxCollected;
	}

	public Long getPenaltyCollected() {
		return penaltyCollected;
	}

	public void setPenaltyCollected(Long penaltyCollected2) {
		this.penaltyCollected = penaltyCollected2;
	}

	public Long getPenaltyArrearsCollected() {
		return penaltyArrearsCollected;
	}

	public void setPenaltyArrearsCollected(Long penaltyArrearsCollected) {
		this.penaltyArrearsCollected = penaltyArrearsCollected;
	}

	private List<UserVO> resultList;
	private Map<String, Integer> totalVcrCount;
	
	private List<TotalVcrCountInDist> totalVcrCountInDist;
	private List<String> MviNames;
	private List<MviVcrCount> mvisVcrCount;
	public List<MviVcrCount> getMvisVcrCount() {
		return mvisVcrCount;
	}

	public void setMvisVcrCount(List<MviVcrCount> mvisVcrCount) {
		this.mvisVcrCount = mvisVcrCount;
	}

	public Map<String, Integer> getTotalVcrCount() {
		return totalVcrCount;
	}

	public void setTotalVcrCount(Map<String, Integer> totalVcrCount) {
		this.totalVcrCount = totalVcrCount;
	}

	public List<String> getMviNames() {
		return MviNames;
	}

	public void setMviNames(List<String> mviNames) {
		MviNames = mviNames;
	}
	
	public List<TotalVcrCountInDist> getTotalVcrCountInDist() {
		return totalVcrCountInDist;
	}

	public void setTotalVcrCountInDist(List<TotalVcrCountInDist> totalVcrCountInDist) {
		this.totalVcrCountInDist = totalVcrCountInDist;
	}

	private Integer year;
	private long totalPage;
	private long pageNo;
	private boolean nonPaymentDistrictwiseExcel;
	private boolean nonPaymentOfficewiseExcel;
	private boolean execlRequired;
	private boolean nonPaymentVehicleWiseExcel;
	private boolean nonPaymentDetailsWiseExcel;
	private boolean nonPaymentCovMandalWiseWiseExcel;
	private boolean rcSuspensionReportsExcel;
	private boolean rcSuspensionReportsOfficeDataExcel;
	private boolean rcSuspensionReportsUserDataExcel;
	private boolean permitReportsExcel;
	private boolean permitReportsDataExcel;
	private boolean paymentCheckPostReportOfficeCountExcel;
	private boolean paymentCheckPostReportMviCountExcel;
	private boolean covWiseVcrReportExcelCovCount;
	private boolean covWiseVcrReportExcelMviCount;
	private boolean offenceWiseVcrExcelCount;
	private boolean offenceWiseVcrExcelMviCount;
	private boolean evcrReportExcelCount;
	private boolean evcrReportDetailDataExcelCount;
    private boolean contractCarriageExcelCount;
    private boolean contractCarriageExcelList;
	private List<Map<String, Object>> eVcrMap;
    private Long evcrDetailCount;
	private String offenceName;
	
	
	
	private List<String> routeCodes;
	
	private Integer cfTotal;
	private Double taxTotal;
	private Double taxArrears;
	private Long penalityTotal;
	private Long penalityArrearsTotal;
	private Long serviceFeeTotal;
	private Double grandTotal;
	private String frcReport;
	private String weightType;
	public String getFrcReport() {
		return frcReport;
	}

	public void setFrcReport(String frcReport) {
		this.frcReport = frcReport;
	}


	public Integer getCfTotal() {
		return cfTotal;
	}

	public void setCfTotal(Integer cfTotal) {
		this.cfTotal = cfTotal;
	}

	public Double getTaxTotal() {
		return taxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		this.taxTotal = taxTotal;
	}

	public Double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Long getPenalityTotal() {
		return penalityTotal;
	}

	public void setPenalityTotal(Long penalityTotal) {
		this.penalityTotal = penalityTotal;
	}

	public Long getPenalityArrearsTotal() {
		return penalityArrearsTotal;
	}

	public void setPenalityArrearsTotal(Long penalityArrearsTotal) {
		this.penalityArrearsTotal = penalityArrearsTotal;
	}

	public Long getServiceFeeTotal() {
		return serviceFeeTotal;
	}

	public void setServiceFeeTotal(Long serviceFeeTotal) {
		this.serviceFeeTotal = serviceFeeTotal;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}

	/**
	 * @return the routeCodes
	 */
	public List<String> getRouteCodes() {
		return routeCodes;
	}

	/**
	 * @param routeCodes the routeCodes to set
	 */
	public void setRouteCodes(List<String> routeCodes) {
		this.routeCodes = routeCodes;
	}

	/**
	 * @return the offenceName
	 */
	public String getOffenceName() {
		return offenceName;
	}

	/**
	 * @param offenceName the offenceName to set
	 */
	public void setOffenceName(String offenceName) {
		this.offenceName = offenceName;
	}

	public List<UserVO> getMviUsers() {
		return mviUsers;
	}

	public void setMviUsers(List<UserVO> mviUsers) {
		this.mviUsers = mviUsers;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	private Map<String, List<RevenueFeeVO>> feeDetails;

	public Map<String, List<RevenueFeeVO>> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(Map<String, List<RevenueFeeVO>> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public List<Integer> getServiceId() {
		return serviceId;
	}

	public void setServiceId(List<Integer> serviceId) {
		this.serviceId = serviceId;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	public double feeAmount;

	public double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public Map<String, Double> getBreakup() {
		return breakup;
	}

	public void setBreakup(Map<String, Double> breakup) {
		this.breakup = breakup;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the gateWayType
	 */
	public Integer getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(Integer gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the transactionNo
	 */
	public String getTransactionNo() {
		return transactionNo;
	}

	/**
	 * @param transactionNo the transactionNo to set
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

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

	/**
	 * @return the gateWay
	 */
	public String getGateWay() {
		return gateWay;
	}

	/**
	 * @param gateWay the gateWay to set
	 */
	public void setGateWay(String gateWay) {
		this.gateWay = gateWay;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the mandalId
	 */
	public Integer getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId the mandalId to set
	 */
	public void setMandalId(Integer mandalId) {
		this.mandalId = mandalId;
	}

	/**
	 * @return the covReport
	 */
	public List<ReportVO> getCovReport() {
		return covReport;
	}

	/**
	 * @param covReport the covReport to set
	 */
	public void setCovReport(List<ReportVO> covReport) {
		this.covReport = covReport;
	}

	/**
	 * @return the reportLevel
	 */
	public String getReportLevel() {
		return reportLevel;
	}

	/**
	 * @param reportLevel the reportLevel to set
	 */
	public void setReportLevel(String reportLevel) {
		this.reportLevel = reportLevel;
	}

	/**
	 * @return the vehicleStrength
	 */
	public List<VehicleStrengthVO> getVehicleStrength() {
		return vehicleStrength;
	}

	/**
	 * @param vehicleStrength the vehicleStrength to set
	 */
	public void setVehicleStrength(List<VehicleStrengthVO> vehicleStrength) {
		this.vehicleStrength = vehicleStrength;
	}

	/**
	 * @return the transactionDate
	 */
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the feeReport
	 */
	public List<ReportVO> getFeeReport() {
		return feeReport;
	}

	/**
	 * @param feeReport the feeReport to set
	 */
	public void setFeeReport(List<ReportVO> feeReport) {
		this.feeReport = feeReport;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the totalTransactionCount
	 */
	public Integer getTotalTransactionCount() {
		return totalTransactionCount;
	}

	/**
	 * @param totalTransactionCount the totalTransactionCount to set
	 */
	public void setTotalTransactionCount(Integer totalTransactionCount) {
		this.totalTransactionCount = totalTransactionCount;
	}

	/**
	 * @return the vcrReport
	 */
	public List<VcrFinalServiceVO> getVcrReport() {
		return vcrReport;
	}

	/**
	 * @param vcrReport the vcrReport to set
	 */
	public void setVcrReport(List<VcrFinalServiceVO> vcrReport) {
		this.vcrReport = vcrReport;
	}

	/**
	 * @return the rcReport
	 */
	public List<RCActionsVO> getRcReport() {
		return rcReport;
	}

	/**
	 * @param rcReport the rcReport to set
	 */
	public void setRcReport(List<RCActionsVO> rcReport) {
		this.rcReport = rcReport;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}

	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the mvi
	 */
	public List<String> getMvi() {
		return mvi;
	}

	/**
	 * @param mvi the mvi to set
	 */
	public void setMvi(List<String> mvi) {
		this.mvi = mvi;
	}

	/**
	 * @return the quarterEndDate
	 */
	public LocalDate getQuarterEndDate() {
		return quarterEndDate;
	}

	/**
	 * @param quarterEndDate the quarterEndDate to set
	 */
	public void setQuarterEndDate(LocalDate quarterEndDate) {
		this.quarterEndDate = quarterEndDate;
	}

	/**
	 * @return the pendingQuarter
	 */
	public Integer getPendingQuarter() {
		return pendingQuarter;
	}

	/**
	 * @param pendingQuarter the pendingQuarter to set
	 */
	public void setPendingQuarter(Integer pendingQuarter) {
		this.pendingQuarter = pendingQuarter;
	}

	/**
	 * @return the nonPaymentReport
	 */
	public List<RCCancellationVO> getNonPaymentReport() {
		return nonPaymentReport;
	}

	/**
	 * @param nonPaymentReport the nonPaymentReport to set
	 */
	public void setNonPaymentReport(List<RCCancellationVO> nonPaymentReport) {
		this.nonPaymentReport = nonPaymentReport;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	/**
	 * @return the approvedDate
	 */
	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public boolean isNonPaymentDistrictwiseExcel() {
		return nonPaymentDistrictwiseExcel;
	}

	public void setNonPaymentDistrictwiseExcel(boolean nonPaymentDistrictwiseExcel) {
		this.nonPaymentDistrictwiseExcel = nonPaymentDistrictwiseExcel;
	}

	public boolean isNonPaymentOfficewiseExcel() {
		return nonPaymentOfficewiseExcel;
	}

	public void setNonPaymentOfficewiseExcel(boolean nonPaymentOfficewiseExcel) {
		this.nonPaymentOfficewiseExcel = nonPaymentOfficewiseExcel;
	}

	public boolean isExeclRequired() {
		return execlRequired;
	}

	public void setExeclRequired(boolean execlRequired) {
		this.execlRequired = execlRequired;
	}

	public boolean isNonPaymentVehicleWiseExcel() {
		return nonPaymentVehicleWiseExcel;
	}

	public void setNonPaymentVehicleWiseExcel(boolean nonPaymentVehicleWiseExcel) {
		this.nonPaymentVehicleWiseExcel = nonPaymentVehicleWiseExcel;
	}

	public boolean isNonPaymentDetailsWiseExcel() {
		return nonPaymentDetailsWiseExcel;
	}

	public void setNonPaymentDetailsWiseExcel(boolean nonPaymentDetailsWiseExcel) {
		this.nonPaymentDetailsWiseExcel = nonPaymentDetailsWiseExcel;
	}

	private List<String> officeCodes;

	public List<String> getOfficeCodes() {
		return officeCodes;
	}

	public void setOfficeCodes(List<String> officeCodes) {
		this.officeCodes = officeCodes;
	}

	public boolean isRcSuspensionReportsExcel() {
		return rcSuspensionReportsExcel;
	}

	public void setRcSuspensionReportsExcel(boolean rcSuspensionReportsExcel) {
		this.rcSuspensionReportsExcel = rcSuspensionReportsExcel;
	}

	public boolean isRcSuspensionReportsOfficeDataExcel() {
		return rcSuspensionReportsOfficeDataExcel;
	}

	public void setRcSuspensionReportsOfficeDataExcel(boolean rcSuspensionReportsOfficeDataExcel) {
		this.rcSuspensionReportsOfficeDataExcel = rcSuspensionReportsOfficeDataExcel;
	}

	public boolean isRcSuspensionReportsUserDataExcel() {
		return rcSuspensionReportsUserDataExcel;
	}

	public void setRcSuspensionReportsUserDataExcel(boolean rcSuspensionReportsUserDataExcel) {
		this.rcSuspensionReportsUserDataExcel = rcSuspensionReportsUserDataExcel;
	}

	public boolean isPermitReportsExcel() {
		return permitReportsExcel;
	}

	public void setPermitReportsExcel(boolean permitReportsExcel) {
		this.permitReportsExcel = permitReportsExcel;
	}

	public boolean isPermitReportsDataExcel() {
		return permitReportsDataExcel;
	}

	public void setPermitReportsDataExcel(boolean permitReportsDataExcel) {
		this.permitReportsDataExcel = permitReportsDataExcel;
	}

	public boolean isPaymentCheckPostReportOfficeCountExcel() {
		return paymentCheckPostReportOfficeCountExcel;
	}

	public void setPaymentCheckPostReportOfficeCountExcel(boolean paymentCheckPostReportOfficeCountExcel) {
		this.paymentCheckPostReportOfficeCountExcel = paymentCheckPostReportOfficeCountExcel;
	}

	public boolean isPaymentCheckPostReportMviCountExcel() {
		return paymentCheckPostReportMviCountExcel;
	}

	public void setPaymentCheckPostReportMviCountExcel(boolean paymentCheckPostReportMviCountExcel) {
		this.paymentCheckPostReportMviCountExcel = paymentCheckPostReportMviCountExcel;
	}

	public boolean isCovWiseVcrReportExcelCovCount() {
		return covWiseVcrReportExcelCovCount;
	}

	public void setCovWiseVcrReportExcelCovCount(boolean covWiseVcrReportExcelCovCount) {
		this.covWiseVcrReportExcelCovCount = covWiseVcrReportExcelCovCount;
	}

	public boolean isCovWiseVcrReportExcelMviCount() {
		return covWiseVcrReportExcelMviCount;
	}

	public void setCovWiseVcrReportExcelMviCount(boolean covWiseVcrReportExcelMviCount) {
		this.covWiseVcrReportExcelMviCount = covWiseVcrReportExcelMviCount;
	}

	public boolean isOffenceWiseVcrExcelCount() {
		return offenceWiseVcrExcelCount;
	}

	public void setOffenceWiseVcrExcelCount(boolean offenceWiseVcrExcelCount) {
		this.offenceWiseVcrExcelCount = offenceWiseVcrExcelCount;
	}

	public boolean isOffenceWiseVcrExcelMviCount() {
		return offenceWiseVcrExcelMviCount;
	}

	public void setOffenceWiseVcrExcelMviCount(boolean offenceWiseVcrExcelMviCount) {
		this.offenceWiseVcrExcelMviCount = offenceWiseVcrExcelMviCount;
	}

	public boolean isEvcrReportExcelCount() {
		return evcrReportExcelCount;
	}

	public void setEvcrReportExcelCount(boolean evcrReportExcelCount) {
		this.evcrReportExcelCount = evcrReportExcelCount;
	}

	public boolean isNonPaymentCovMandalWiseWiseExcel() {
		return nonPaymentCovMandalWiseWiseExcel;
	}

	public void setNonPaymentCovMandalWiseWiseExcel(boolean nonPaymentCovMandalWiseWiseExcel) {
		this.nonPaymentCovMandalWiseWiseExcel = nonPaymentCovMandalWiseWiseExcel;
	}

	public List<Map<String, Object>> geteVcrMap() {
		return eVcrMap;
	}

	public void seteVcrMap(List<Map<String, Object>> eVcrMap) {
		this.eVcrMap = eVcrMap;
	}

	public Long getEvcrDetailCount() {
		return evcrDetailCount;
	}

	public void setEvcrDetailCount(Long evcrDetailCount) {
		this.evcrDetailCount = evcrDetailCount;
	}
	
	public boolean isContractCarriageExcelCount() {
		return contractCarriageExcelCount;
	}

	public void setContractCarriageExcelCount(boolean contractCarriageExcelCount) {
		this.contractCarriageExcelCount = contractCarriageExcelCount;
	}
	
	public boolean isContractCarriageExcelList() {
		return contractCarriageExcelList;
	}

	public void setContractCarriageExcelList(boolean contractCarriageExcelList) {
		this.contractCarriageExcelList = contractCarriageExcelList;
	}
	
	public NOCDetailsVO getNocDetails() {
		return nocDetails;
	}

	public void setNocDetails(NOCDetailsVO nocDetails) {
		this.nocDetails = nocDetails;
	}


	public List<NOCDetailsVO> getNocDetailsVO() {
		return nocDetailsVO;
	}

	public void setNocDetailsVO(List<NOCDetailsVO> nocDetailsVO) {
		this.nocDetailsVO = nocDetailsVO;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<ActionDetailsVO> getUserAction() {
		return userAction;
	}

	public void setUserAction(List<ActionDetailsVO> userAction) {
		this.userAction = userAction;
	}
	
	public String getPrimaryRoleName() {
		return primaryRoleName;
	}

	public void setPrimaryRoleName(String primaryRoleName) {
		this.primaryRoleName = primaryRoleName;
	}

	public List<UserVO> getResultList() {
		return resultList;
	}

	public void setResultList(List<UserVO> resultList) {
		this.resultList = resultList;
	}

	public boolean isEvcrReportDetailDataExcelCount() {
		return evcrReportDetailDataExcelCount;
	}

	public void setEvcrReportDetailDataExcelCount(boolean evcrReportDetailDataExcelCount) {
		this.evcrReportDetailDataExcelCount = evcrReportDetailDataExcelCount;
	}

	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	
}
