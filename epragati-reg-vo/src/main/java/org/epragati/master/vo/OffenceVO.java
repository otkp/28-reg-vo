package org.epragati.master.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.vcr.vo.OverLoadVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OffenceVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	/*private String offenseCode;
	private String offenseDesc;
	private String classOfVehicle;*/

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime effectiveDate;
	/*private String minAmt;
	private String maxAmt;*/
	private String crtdUsr;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime crtdDt;
	private String lstUpdUsr;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lstUpdDt;
	private String active;
	private String updateFlag;
	
	private String roadSafetyRelated;
	private OverLoadVO overLoadDesc;
	@JsonFormat(shape = Shape.STRING)
	private Integer NoOfPersons;
	
	private String slno;
	private String offendingSection;
	private String penalSections;
	private String section;
	private String classOfVehicles;
	private String covDescription;
	private String category;
	private String offenceDescription;
	private Integer amount1;
	private Integer amount2;
	
	private Integer fixedAmount;
	private boolean allowCorrection;
	private boolean correctionsDone;
	private String mappedOffence;
	private boolean basedOnPersons;
	private boolean basedOnHrs;
	private Integer noOfHrs;
	private boolean basedOnWeight;
	private String weight;
	private Integer mviEnteredweight;
	private boolean shouldNotClose;
	
	private String companyName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;
	private String fcNumber;
	private Double taxAmount;
	private String permitNumber;
	private String dlNumber;
	private String perkg;
	private String offenceCategory;
	private String analyserName;
	private String serialNumber;
	private String testReportNo;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime drunkDaeCheck;
	private String doctorReportNo;
	private Integer bac;
	private Integer priority;
	private Integer perPerson;
	private boolean basedOnCFX;
	private String dlNo;
	private String driverName;
	private String placeOfCheck;
	private String destination;
	private String maxSpeed;
	private boolean isAccident;
	private boolean isCfxEndores;
	private String defectsNoticed;
	private boolean basedOnAnimals;
	private Integer noOfAnimals;
	private String remarks;
	private String permitType;
	private Boolean intrastate;
	
	private Boolean isOffenceClosed = Boolean.FALSE;
	private Boolean otherOffence;
	private String otherOffenceName;
	private Boolean isRoadSafety = Boolean.FALSE;

	public Integer getNoOfPersons() {
		return NoOfPersons;
	}

	public void setNoOfPersons(Integer noOfPersons) {
		NoOfPersons = noOfPersons;
	}

	/*public String getOffenseCode() {
		return offenseCode;
	}

	public void setOffenseCode(String offenseCode) {
		this.offenseCode = offenseCode;
	}

	public String getOffenseDesc() {
		return offenseDesc;
	}

	public void setOffenseDesc(String offenseDesc) {
		this.offenseDesc = offenseDesc;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}*/

	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/*public String getMinAmt() {
		return minAmt;
	}

	public void setMinAmt(String minAmt) {
		this.minAmt = minAmt;
	}

	public String getMaxAmt() {
		return maxAmt;
	}

	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}*/

	public String getCrtdUsr() {
		return crtdUsr;
	}

	public void setCrtdUsr(String crtdUsr) {
		this.crtdUsr = crtdUsr;
	}

	public LocalDateTime getCrtdDt() {
		return crtdDt;
	}

	public void setCrtdDt(LocalDateTime crtdDt) {
		this.crtdDt = crtdDt;
	}

	public String getLstUpdUsr() {
		return lstUpdUsr;
	}

	public void setLstUpdUsr(String lstUpdUsr) {
		this.lstUpdUsr = lstUpdUsr;
	}

	public LocalDateTime getLstUpdDt() {
		return lstUpdDt;
	}

	public void setLstUpdDt(LocalDateTime lstUpdDt) {
		this.lstUpdDt = lstUpdDt;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}

	public Integer getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(Integer fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public String getRoadSafetyRelated() {
		return roadSafetyRelated;
	}

	public void setRoadSafetyRelated(String roadSafetyRelated) {
		this.roadSafetyRelated = roadSafetyRelated;
	}

	public OverLoadVO getOverLoadDesc() {
		return overLoadDesc;
	}

	public void setOverLoadDesc(OverLoadVO overLoadDesc) {
		this.overLoadDesc = overLoadDesc;
	}

	public String getOffenceDescription() {
		return offenceDescription;
	}

	public void setOffenceDescription(String offenceDescription) {
		this.offenceDescription = offenceDescription;
	}

	public String getSlno() {
		return slno;
	}

	public void setSlno(String slno) {
		this.slno = slno;
	}

	public String getOffendingSection() {
		return offendingSection;
	}

	public void setOffendingSection(String offendingSection) {
		this.offendingSection = offendingSection;
	}

	public String getPenalSections() {
		return penalSections;
	}

	public void setPenalSections(String penalSections) {
		this.penalSections = penalSections;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getClassOfVehicles() {
		return classOfVehicles;
	}

	public void setClassOfVehicles(String classOfVehicles) {
		this.classOfVehicles = classOfVehicles;
	}

	public String getCovDescription() {
		return covDescription;
	}

	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAmount1() {
		return amount1;
	}

	public void setAmount1(Integer amount1) {
		this.amount1 = amount1;
	}

	public Integer getAmount2() {
		return amount2;
	}

	public void setAmount2(Integer amount2) {
		this.amount2 = amount2;
	}

	public boolean isAllowCorrection() {
		return allowCorrection;
	}

	public void setAllowCorrection(boolean allowCorrection) {
		this.allowCorrection = allowCorrection;
	}

	public boolean isCorrectionsDone() {
		return correctionsDone;
	}

	public void setCorrectionsDone(boolean correctionsDone) {
		this.correctionsDone = correctionsDone;
	}

	public String getMappedOffence() {
		return mappedOffence;
	}

	public void setMappedOffence(String mappedOffence) {
		this.mappedOffence = mappedOffence;
	}

	public boolean isBasedOnPersons() {
		return basedOnPersons;
	}

	public void setBasedOnPersons(boolean basedOnPersons) {
		this.basedOnPersons = basedOnPersons;
	}

	public boolean isBasedOnHrs() {
		return basedOnHrs;
	}

	public void setBasedOnHrs(boolean basedOnHrs) {
		this.basedOnHrs = basedOnHrs;
	}

	public Integer getNoOfHrs() {
		return noOfHrs;
	}

	public void setNoOfHrs(Integer noOfHrs) {
		this.noOfHrs = noOfHrs;
	}

	public boolean isBasedOnWeight() {
		return basedOnWeight;
	}

	public void setBasedOnWeight(boolean basedOnWeight) {
		this.basedOnWeight = basedOnWeight;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isShouldNotClose() {
		return shouldNotClose;
	}

	public void setShouldNotClose(boolean shouldNotClose) {
		this.shouldNotClose = shouldNotClose;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public String getFcNumber() {
		return fcNumber;
	}

	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public String getDlNumber() {
		return dlNumber;
	}

	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	public String getPerkg() {
		return perkg;
	}

	public void setPerkg(String perkg) {
		this.perkg = perkg;
	}

	public Integer getMviEnteredweight() {
		return mviEnteredweight;
	}

	public void setMviEnteredweight(Integer mviEnteredweight) {
		this.mviEnteredweight = mviEnteredweight;
	}

	public String getOffenceCategory() {
		return offenceCategory;
	}

	public void setOffenceCategory(String offenceCategory) {
		this.offenceCategory = offenceCategory;
	}

	public String getAnalyserName() {
		return analyserName;
	}

	public void setAnalyserName(String analyserName) {
		this.analyserName = analyserName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTestReportNo() {
		return testReportNo;
	}

	public void setTestReportNo(String testReportNo) {
		this.testReportNo = testReportNo;
	}

	public LocalDateTime getDrunkDaeCheck() {
		return drunkDaeCheck;
	}

	public void setDrunkDaeCheck(LocalDateTime drunkDaeCheck) {
		this.drunkDaeCheck = drunkDaeCheck;
	}

	public String getDoctorReportNo() {
		return doctorReportNo;
	}

	public void setDoctorReportNo(String doctorReportNo) {
		this.doctorReportNo = doctorReportNo;
	}

	

	public Integer getBac() {
		return bac;
	}

	public void setBac(Integer bac) {
		this.bac = bac;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getPerPerson() {
		return perPerson;
	}

	public void setPerPerson(Integer perPerson) {
		this.perPerson = perPerson;
	}

	public boolean isBasedOnCFX() {
		return basedOnCFX;
	}

	public void setBasedOnCFX(boolean basedOnCFX) {
		this.basedOnCFX = basedOnCFX;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getPlaceOfCheck() {
		return placeOfCheck;
	}

	public void setPlaceOfCheck(String placeOfCheck) {
		this.placeOfCheck = placeOfCheck;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isAccident() {
		return isAccident;
	}

	public void setAccident(boolean isAccident) {
		this.isAccident = isAccident;
	}

	public boolean isCfxEndores() {
		return isCfxEndores;
	}

	public void setCfxEndores(boolean isCfxEndores) {
		this.isCfxEndores = isCfxEndores;
	}

	public String getDefectsNoticed() {
		return defectsNoticed;
	}

	public void setDefectsNoticed(String defectsNoticed) {
		this.defectsNoticed = defectsNoticed;
	}

	public boolean isBasedOnAnimals() {
		return basedOnAnimals;
	}

	public void setBasedOnAnimals(boolean basedOnAnimals) {
		this.basedOnAnimals = basedOnAnimals;
	}

	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(Integer noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the isOffenceClosed
	 */
	public Boolean getIsOffenceClosed() {
		return isOffenceClosed;
	}

	/**
	 * @param isOffenceClosed the isOffenceClosed to set
	 */
	public void setIsOffenceClosed(Boolean isOffenceClosed) {
		this.isOffenceClosed = isOffenceClosed;
	}

	public String getPermitType() {
		return permitType;
	}

	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	public Boolean getIntrastate() {
		return intrastate;
	}

	public void setIntrastate(Boolean intrastate) {
		this.intrastate = intrastate;
	}

	public Boolean getOtherOffence() {
		return otherOffence;
	}

	public void setOtherOffence(Boolean otherOffence) {
		this.otherOffence = otherOffence;
	}

	public String getOtherOffenceName() {
		return otherOffenceName;
	}

	public void setOtherOffenceName(String otherOffenceName) {
		this.otherOffenceName = otherOffenceName;
	}

	public Boolean getIsRoadSafety() {
		return isRoadSafety;
	}

	public void setIsRoadSafety(Boolean isRoadSafety) {
		this.isRoadSafety = isRoadSafety;
	}
	

	
}
