package org.epragati.rta.reports.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.vcr.vo.OffenceVcrVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ReportVO {

	private Double fee = 0.0;

	private String feeType;

	private String cov;

	private long covCount;

	private long count;

	private String prNo;

	private String actionStatus;

	private String permitType;

	private List<ReportVO> ccpPermit;

	private String covDesc;

	private String taxType;

	private double taxAmount;

	private long offenceCount;

	private String officeCode;

	private String officeName;

	private double amount;
	
	private String districtName;
	
	private Integer districtId;	
	
	private String vehicleType;
	
	private String groupCategory;
	
	private Long transportCount;
	
	private Long nonTransportCount;
	
	private Long totalCount;
	
	private String covdescription;
	
	private String weightType;
	private Long penalty;
	private Double taxArrears;
	private Long penaltyArrears;
	private double totalCf;
	private String mviName;
	private List<VcrFinalServiceVO> vcrList;
	
	private String mandalName;
	private double totalPiadCf;
	private double totalUnPiadCf;
	private double mviTotalAmount;
	

	
	private String vcrNo;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dateOfCheck;
	private List<ReportVO> report;
	List<String> roadSafetyOffencesList;
	private String offenceType;
	private List<ReportVO> totaloffenceCount;
	private long grandTotal;
	
	private double paidTaxAmount=0d;
	private Long paidpenalty=0l;
	private Double paidTaxArrears=0d;
	private Long paidPenaltyArrears=0l;
	private double paidMviCount=0d;
	private int paidRecordsCount;
	

	public int getPaidRecordsCount() {
		return paidRecordsCount;
	}

	public void setPaidRecordsCount(int paidRecordsCount) {
		this.paidRecordsCount = paidRecordsCount;
	}

	public double getPaidTaxAmount() {
		return paidTaxAmount;
	}

	public void setPaidTaxAmount(double paidTaxAmount) {
		this.paidTaxAmount = paidTaxAmount;
	}

	public Long getPaidpenalty() {
		return paidpenalty;
	}

	public void setPaidpenalty(Long paidpenalty) {
		this.paidpenalty = paidpenalty;
	}

	public Double getPaidTaxArrears() {
		return paidTaxArrears;
	}

	public void setPaidTaxArrears(Double paidTaxArrears) {
		this.paidTaxArrears = paidTaxArrears;
	}

	public Long getPaidPenaltyArrears() {
		return paidPenaltyArrears;
	}

	public void setPaidPenaltyArrears(Long paidPenaltyArrears) {
		this.paidPenaltyArrears = paidPenaltyArrears;
	}

	public double getPaidMviCount() {
		return paidMviCount;
	}

	public void setPaidMviCount(double paidMviCount) {
		this.paidMviCount = paidMviCount;
	}

	
	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private String offenceDesc;

	public String getOffenceDesc() {
		return offenceDesc;
	}

	public void setOffenceDesc(String offenceDesc) {
		this.offenceDesc = offenceDesc;
	}

	private OffenceVcrVO offence;

	public OffenceVcrVO getOffence() {
		return offence;
	}

	public void setOffence(OffenceVcrVO offence) {
		this.offence = offence;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public long getOffenceCount() {
		return offenceCount;
	}

	public void setOffenceCount(long offenceCount) {
		this.offenceCount = offenceCount;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
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
	 * @return the covCount
	 */
	public long getCovCount() {
		return covCount;
	}

	/**
	 * @param covCount the covCount to set
	 */
	public void setCovCount(long covCount) {
		this.covCount = covCount;
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
	 * @return the count
	 */
	public long getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
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
	 * @return the ccpPermit
	 */
	public List<ReportVO> getCcpPermit() {
		return ccpPermit;
	}

	/**
	 * @param ccpPermit the ccpPermit to set
	 */
	public void setCcpPermit(List<ReportVO> ccpPermit) {
		this.ccpPermit = ccpPermit;
	}

	/**
	 * @return the actionStatus
	 */
	public String getActionStatus() {
		return actionStatus;
	}

	/**
	 * @param actionStatus the actionStatus to set
	 */
	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public String getCovDesc() {
		return covDesc;
	}

	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getGroupCategory() {
		return groupCategory;
	}

	public void setGroupCategory(String groupCategory) {
		this.groupCategory = groupCategory;
	}

	public Long getTransportCount() {
		return transportCount;
	}

	public void setTransportCount(Long transportCount) {
		this.transportCount = transportCount;
	}

	public Long getNonTransportCount() {
		return nonTransportCount;
	}

	public void setNonTransportCount(Long nonTransportCount) {
		this.nonTransportCount = nonTransportCount;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getCovdescription() {
		return covdescription;
	}

	public void setCovdescription(String covdescription) {
		this.covdescription = covdescription;
	}

	public Long getPenalty() {
		return penalty;
	}

	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	public Double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public double getTotalCf() {
		return totalCf;
	}

	public void setTotalCf(double totalCf) {
		this.totalCf = totalCf;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public List<VcrFinalServiceVO> getVcrList() {
		return vcrList;
	}

	public void setVcrList(List<VcrFinalServiceVO> vcrList) {
		this.vcrList = vcrList;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public double getTotalPiadCf() {
		return totalPiadCf;
	}

	public void setTotalPiadCf(double totalPiadCf) {
		this.totalPiadCf = totalPiadCf;
	}

	public double getTotalUnPiadCf() {
		return totalUnPiadCf;
	}

	public void setTotalUnPiadCf(double totalUnPiadCf) {
		this.totalUnPiadCf = totalUnPiadCf;
	}

	public double getMviTotalAmount() {
		return mviTotalAmount;
	}

	public void setMviTotalAmount(double mviTotalAmount) {
		this.mviTotalAmount = mviTotalAmount;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public LocalDateTime getDateOfCheck() {
		return dateOfCheck;
	}

	public void setDateOfCheck(LocalDateTime dateOfCheck) {
		this.dateOfCheck = dateOfCheck;
	}

	public List<ReportVO> getReport() {
		return report;
	}

	public void setReport(List<ReportVO> report) {
		this.report = report;
	}

	public List<String> getRoadSafetyOffencesList() {
		return roadSafetyOffencesList;
	}

	public void setRoadSafetyOffencesList(List<String> roadSafetyOffencesList) {
		this.roadSafetyOffencesList = roadSafetyOffencesList;
	}

	public String getOffenceType() {
		return offenceType;
	}

	public void setOffenceType(String offenceType) {
		this.offenceType = offenceType;
	}

	public List<ReportVO> getTotaloffenceCount() {
		return totaloffenceCount;
	}

	public void setTotaloffenceCount(List<ReportVO> totaloffenceCount) {
		this.totaloffenceCount = totaloffenceCount;
	}

	public long getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(long grandTotal) {
		this.grandTotal = grandTotal;
	}
	

	
}
