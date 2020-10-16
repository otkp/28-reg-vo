package org.epragati.sn.vo;

import java.time.LocalTime;
import java.util.List;

import org.epragati.util.NumberPoolStatus.NumberAssignType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BidConfigMasterVO {

	@JsonFormat(pattern = "HH:mm:ss.SSS")
	private LocalTime bidStartTime;

	@JsonFormat(pattern = "HH:mm:ss.SSS")
	private LocalTime bidEndTime;

	@JsonFormat(pattern = "HH:mm:ss.SSS")
	private LocalTime specialNumberRegStartTime;

	@JsonFormat(pattern = "HH:mm:ss.SSS")
	private LocalTime specialNumberRegEndTime;

	private String configStatus;

	@JsonFormat(pattern = "HH:mm:ss.SSS")
	private LocalTime bidCloseNotifyTime;

	private String remarks;

	private Long bidMaxIteration;
	
	private String bidConfigId;

	
	private Long bidMaxAllowDays;
	
	private Long passCodeResentMinTimeInterVal;
	
	private Integer passCodeResentMaxCount;
	
	private int dateValueToHoliday;
	
	private String schedulerAuthToken;
	
	private boolean isRunningBidClosingProcess;
	
	private List<String> ipNoToAccesSchedulers;
	
	//private List<OldVersionDataConfig> oldVersionDataConfigDetails;
	
	private String numberGenerationType;
	
	private Integer maxNumbersForDay;
	
	private Integer totalNumberForWindow;
	
	private  NumberAssignType numberAssignType;
	
	/**
	 * @return the bidStartTime
	 */
	public LocalTime getBidStartTime() {
		return bidStartTime;
	}

	/**
	 * @param bidStartTime
	 *            the bidStartTime to set
	 */
	public void setBidStartTime(LocalTime bidStartTime) {
		this.bidStartTime = bidStartTime;
	}

	/**
	 * @return the bidEndTime
	 */
	public LocalTime getBidEndTime() {
		return bidEndTime;
	}

	/**
	 * @param bidEndTime
	 *            the bidEndTime to set
	 */
	public void setBidEndTime(LocalTime bidEndTime) {
		this.bidEndTime = bidEndTime;
	}

	/**
	 * @return the specialNumberRegStartTime
	 */
	public LocalTime getSpecialNumberRegStartTime() {
		return specialNumberRegStartTime;
	}

	/**
	 * @param specialNumberRegStartTime
	 *            the specialNumberRegStartTime to set
	 */
	public void setSpecialNumberRegStartTime(LocalTime specialNumberRegStartTime) {
		this.specialNumberRegStartTime = specialNumberRegStartTime;
	}

	/**
	 * @return the specialNumberRegEndTime
	 */
	public LocalTime getSpecialNumberRegEndTime() {
		return specialNumberRegEndTime;
	}

	/**
	 * @param specialNumberRegEndTime
	 *            the specialNumberRegEndTime to set
	 */
	public void setSpecialNumberRegEndTime(LocalTime specialNumberRegEndTime) {
		this.specialNumberRegEndTime = specialNumberRegEndTime;
	}

	/**
	 * @return the configStatus
	 */
	public String getConfigStatus() {
		return configStatus;
	}

	/**
	 * @param configStatus
	 *            the configStatus to set
	 */
	public void setConfigStatus(String configStatus) {
		this.configStatus = configStatus;
	}

	/**
	 * @return the bidCloseNotifyTime
	 */
	public LocalTime getBidCloseNotifyTime() {
		return bidCloseNotifyTime;
	}

	/**
	 * @param bidCloseNotifyTime
	 *            the bidCloseNotifyTime to set
	 */
	public void setBidCloseNotifyTime(LocalTime bidCloseNotifyTime) {
		this.bidCloseNotifyTime = bidCloseNotifyTime;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the bidMaxIteration
	 */
	public Long getBidMaxIteration() {
		return bidMaxIteration;
	}

	/**
	 * @param bidMaxIteration
	 *            the bidMaxIteration to set
	 */
	public void setBidMaxIteration(Long bidMaxIteration) {
		this.bidMaxIteration = bidMaxIteration;
	}

	/**
	 * @return the bidConfigId
	 */
	public String getBidConfigId() {
		return bidConfigId;
	}

	/**
	 * @param bidConfigId the bidConfigId to set
	 */
	public void setBidConfigId(String bidConfigId) {
		this.bidConfigId = bidConfigId;
	}

	/**
	 * @return the bidMaxAllowDays
	 */
	public Long getBidMaxAllowDays() {
		return bidMaxAllowDays;
	}

	/**
	 * @param bidMaxAllowDays the bidMaxAllowDays to set
	 */
	public void setBidMaxAllowDays(Long bidMaxAllowDays) {
		this.bidMaxAllowDays = bidMaxAllowDays;
	}

	/**
	 * @return the passCodeResentMinTimeInterVal
	 */
	public Long getPassCodeResentMinTimeInterVal() {
		return passCodeResentMinTimeInterVal;
	}

	/**
	 * @param passCodeResentMinTimeInterVal the passCodeResentMinTimeInterVal to set
	 */
	public void setPassCodeResentMinTimeInterVal(Long passCodeResentMinTimeInterVal) {
		this.passCodeResentMinTimeInterVal = passCodeResentMinTimeInterVal;
	}

	/**
	 * @return the passCodeResentMaxCount
	 */
	public Integer getPassCodeResentMaxCount() {
		return passCodeResentMaxCount;
	}

	/**
	 * @param passCodeResentMaxCount the passCodeResentMaxCount to set
	 */
	public void setPassCodeResentMaxCount(Integer passCodeResentMaxCount) {
		this.passCodeResentMaxCount = passCodeResentMaxCount;
	}

	/**
	 * @return the dateValueToHoliday
	 */
	public int getDateValueToHoliday() {
		return dateValueToHoliday;
	}

	/**
	 * @param dateValueToHoliday the dateValueToHoliday to set
	 */
	public void setDateValueToHoliday(int dateValueToHoliday) {
		this.dateValueToHoliday = dateValueToHoliday;
	}

	/**
	 * @return the schedulerAuthToken
	 */
	public String getSchedulerAuthToken() {
		return schedulerAuthToken;
	}

	/**
	 * @param schedulerAuthToken the schedulerAuthToken to set
	 */
	public void setSchedulerAuthToken(String schedulerAuthToken) {
		this.schedulerAuthToken = schedulerAuthToken;
	}

	/**
	 * @return the isRunningBidClosingProcess
	 */
	public boolean isRunningBidClosingProcess() {
		return isRunningBidClosingProcess;
	}

	/**
	 * @param isRunningBidClosingProcess the isRunningBidClosingProcess to set
	 */
	public void setRunningBidClosingProcess(boolean isRunningBidClosingProcess) {
		this.isRunningBidClosingProcess = isRunningBidClosingProcess;
	}

	/**
	 * @return the ipNoToAccesSchedulers
	 */
	public List<String> getIpNoToAccesSchedulers() {
		return ipNoToAccesSchedulers;
	}

	/**
	 * @param ipNoToAccesSchedulers the ipNoToAccesSchedulers to set
	 */
	public void setIpNoToAccesSchedulers(List<String> ipNoToAccesSchedulers) {
		this.ipNoToAccesSchedulers = ipNoToAccesSchedulers;
	}

	/**
	 * @return the numberGenerationType
	 */
	public String getNumberGenerationType() {
		return numberGenerationType;
	}

	/**
	 * @param numberGenerationType the numberGenerationType to set
	 */
	public void setNumberGenerationType(String numberGenerationType) {
		this.numberGenerationType = numberGenerationType;
	}

	/**
	 * @return the maxNumbersForDay
	 * It will retun Max numbers for Day to generate into number pool
	 */
	public Integer getMaxNumbersForDay() {
		return maxNumbersForDay;
	}

	/**
	 * @param maxNumbersForDay the maxNumbersForDay to set
	 */
	public void setMaxNumbersForDay(Integer maxNumbersForDay) {
		this.maxNumbersForDay = maxNumbersForDay;
	}

	public Integer getTotalNumberForWindow() {
		return totalNumberForWindow;
	}

	public void setTotalNumberForWindow(Integer totalNumberForWindow) {
		this.totalNumberForWindow = totalNumberForWindow;
	}

	public NumberAssignType getNumberAssignType() {
		return numberAssignType;
	}

	public void setNumberAssignType(NumberAssignType numberAssignType) {
		this.numberAssignType = numberAssignType;
	}


}
