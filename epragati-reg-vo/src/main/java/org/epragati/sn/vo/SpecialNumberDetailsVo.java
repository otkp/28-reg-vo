package org.epragati.sn.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.util.BidStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SpecialNumberDetailsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String specialNumberAppId;

	private VehicleDetailsVo vehicleDetails;

	private CustomerDetailsVo customerDetails;

	private Integer bidIteration;

	private Integer bidConfigMasterId;

	private BidVehicleDetailsVo bidVehicleDetails;

	private BidStatus bidStatus;
	
	private String bidDescription;

	private List<ActionsDetailsVo> actionsDetailsLog;

	private List<BidHistoryVo> bidHistory;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS")
	private LocalDateTime createdDate;

	private BidFinalDetailsVo bidFinalDetails;

	private Long bidDuration;

	private String selectedPrSeries;

	private Integer participantsCount;

	private SpecialNumberFeeDetailsVo specialNumberFeeDetails;

	public String getSpecialNumberAppId() {
		return specialNumberAppId;
	}

	public void setSpecialNumberAppId(String specialNumberAppId) {
		this.specialNumberAppId = specialNumberAppId;
	}

	public VehicleDetailsVo getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetailsVo vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public CustomerDetailsVo getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetailsVo customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Integer getBidIteration() {
		return bidIteration;
	}

	public void setBidIteration(Integer bidIteration) {
		this.bidIteration = bidIteration;
	}

	public Integer getBidConfigMasterId() {
		return bidConfigMasterId;
	}

	public void setBidConfigMasterId(Integer bidConfigMasterId) {
		this.bidConfigMasterId = bidConfigMasterId;
	}

	public BidVehicleDetailsVo getBidVehicleDetails() {
		return bidVehicleDetails;
	}

	public void setBidVehicleDetails(BidVehicleDetailsVo bidVehicleDetails) {
		this.bidVehicleDetails = bidVehicleDetails;
	}

	public BidStatus getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(BidStatus bidStatus) {
		this.bidStatus = bidStatus;
	}

	public List<ActionsDetailsVo> getActionsDetailsLog() {
		return actionsDetailsLog;
	}

	public void setActionsDetailsLog(List<ActionsDetailsVo> actionsDetailsLog) {
		this.actionsDetailsLog = actionsDetailsLog;
	}

	public List<BidHistoryVo> getBidHistory() {
		return bidHistory;
	}

	public void setBidHistory(List<BidHistoryVo> bidHistory) {
		this.bidHistory = bidHistory;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public BidFinalDetailsVo getBidFinalDetails() {
		return bidFinalDetails;
	}

	public void setBidFinalDetails(BidFinalDetailsVo bidFinalDetails) {
		this.bidFinalDetails = bidFinalDetails;
	}

	public Long getBidDuration() {
		return bidDuration;
	}

	public void setBidDuration(Long bidDuration) {
		this.bidDuration = bidDuration;
	}

	public String getSelectedPrSeries() {
		return selectedPrSeries;
	}

	public void setSelectedPrSeries(String selectedPrSeries) {
		this.selectedPrSeries = selectedPrSeries;
	}

	public Integer getParticipantsCount() {
		return participantsCount;
	}

	public void setParticipantsCount(Integer participantsCount) {
		this.participantsCount = participantsCount;
	}

	public SpecialNumberFeeDetailsVo getSpecialNumberFeeDetails() {
		return specialNumberFeeDetails;
	}

	public void setSpecialNumberFeeDetails(SpecialNumberFeeDetailsVo specialNumberFeeDetails) {
		this.specialNumberFeeDetails = specialNumberFeeDetails;
	}

	public String getBidDescription() {
		return bidDescription;
	}

	public void setBidDescription(String bidDescription) {
		this.bidDescription = bidDescription;
	}
	

}
