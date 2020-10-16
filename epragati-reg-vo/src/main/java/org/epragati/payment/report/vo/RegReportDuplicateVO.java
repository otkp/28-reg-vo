package org.epragati.payment.report.vo;



	

	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.util.List;
	import java.util.Map;

	import org.epragati.master.vo.UserVO;
	import org.epragati.rcactions.RCActionsVO;
	import org.epragati.rta.reports.vo.ReportVO;
	import org.epragati.rta.reports.vo.VehicleStrengthVO;
	import org.epragati.vcr.vo.VcrFinalServiceVO;

	import com.fasterxml.jackson.annotation.JsonFormat;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonInclude.Include;

	@JsonInclude(Include.NON_NULL)
	public class RegReportDuplicateVO {

//		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
		@JsonFormat(pattern = "yyyy-MM-dd")
		private LocalDate fromDate;

		/*@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")*/
		@JsonFormat(pattern = "yyyy-MM-dd")
		private LocalDate toDate;

		private Integer gateWayType;

		private String status;

		private String districtName;

		private Integer districtId;

		private String transactionNo;

		private Double total;

		private String officeCode;

		private String gateWay;

		private String mandalName;

		public Map<String, Double> breakup;

		public String feeType;

		private String role;
		private String actionUserName;
		public boolean fitnessCertIssueExcelCount;
		
		
		public void setActionUserName(String actionUserName) {
			this.actionUserName = actionUserName;
		}
		
		public String getActionUserName() {
			return actionUserName;
		}

		private String fee;
		private List<Integer> serviceId;

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

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
		private LocalDate validFrom;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
		private LocalDate validTo;

		private String officeName;

		private String permitType;

		private String cov;

		private String prNo;

		private String permitNo;

		private List<String> mvi;

		private List<UserVO> mviUsers;

		public List<UserVO> getMviUsers() {
			return mviUsers;
		}

		public void setMviUsers(List<UserVO> mviUsers) {
			this.mviUsers = mviUsers;
		}

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		private LocalDate quarterEndDate;

		private Integer pendingQuarter;

		private List<RCCancellationVO> nonPaymentReport;

		private String classOfVehicle;

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

		public boolean isFitnessCertIssueExcelCount() {
			return fitnessCertIssueExcelCount;
		}

		public void setFitnessCertIssueExcelCount(boolean fitnessCertIssueExcelCount) {
			this.fitnessCertIssueExcelCount = fitnessCertIssueExcelCount;
		}

	}


