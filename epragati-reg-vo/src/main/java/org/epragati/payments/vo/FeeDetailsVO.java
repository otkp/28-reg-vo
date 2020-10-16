package org.epragati.payments.vo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.regservice.vo.SlotDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class FeeDetailsVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<FeesVO> feeDetails;
	private Double totalFees;
	private PaymentGatewayTypeVO paymentGatewayTypeVO;
	private String payStatus;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date transactionDate;
	private Set<Integer> serviceIds;
	private Integer mandalCode;
	private String vehicleType;
	private OwnerTypeEnum ownerType;
	private Boolean isSkipSlot=false;
	private boolean isToPayLateFeeForFC = Boolean.TRUE;
	private SlotDetailsVO slotDetailsVO;
	private boolean isToPayLateFeeForRenewal = Boolean.TRUE;
	private String role;
	
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * @return the paymentGatewayTypeVO
	 */
	public PaymentGatewayTypeVO getPaymentGatewayTypeVO() {
		return paymentGatewayTypeVO;
	}
	/**
	 * @param paymentGatewayTypeVO the paymentGatewayTypeVO to set
	 */
	public void setPaymentGatewayTypeVO(PaymentGatewayTypeVO paymentGatewayTypeVO) {
		this.paymentGatewayTypeVO = paymentGatewayTypeVO;
	}
	/**
	 * @return the feeDetails
	 */
	public List<FeesVO> getFeeDetails() {
		return feeDetails;
	}
	/**
	 * @param feeDetails the feeDetails to set
	 */
	public void setFeeDetails(List<FeesVO> feeDetails) {
		this.feeDetails = feeDetails;
	}
	/**
	 * @return the totalFees
	 */
	public Double getTotalFees() {
		return totalFees;
	}
	/**
	 * @param totalFees the totalFees to set
	 */
	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}
	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	/**
	 * @return the mandalCode
	 */
	public Integer getMandalCode() {
		return mandalCode;
	}
	/**
	 * @param mandalCode the mandalCode to set
	 */
	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
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
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}
	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}
	/**
	 * @return the isSkipSlot
	 */
	public Boolean getIsSkipSlot() {
		return isSkipSlot;
	}
	/**
	 * @param isSkipSlot the isSkipSlot to set
	 */
	public void setIsSkipSlot(Boolean isSkipSlot) {
		this.isSkipSlot = isSkipSlot;
	}
	/**
	 * @return the isToPayLateFeeForFC
	 */
	public boolean isToPayLateFeeForFC() {
		return isToPayLateFeeForFC;
	}
	/**
	 * @param isToPayLateFeeForFC the isToPayLateFeeForFC to set
	 */
	public void setToPayLateFeeForFC(boolean isToPayLateFeeForFC) {
		this.isToPayLateFeeForFC = isToPayLateFeeForFC;
	}
	/**
	 * @return the slotDetailsVO
	 */
	public SlotDetailsVO getSlotDetailsVO() {
		return slotDetailsVO;
	}
	/**
	 * @param slotDetailsVO the slotDetailsVO to set
	 */
	public void setSlotDetailsVO(SlotDetailsVO slotDetailsVO) {
		this.slotDetailsVO = slotDetailsVO;
	}
	public boolean isToPayLateFeeForRenewal() {
		return isToPayLateFeeForRenewal;
	}
	public void setToPayLateFeeForRenewal(boolean isToPayLateFeeForRenewal) {
		this.isToPayLateFeeForRenewal = isToPayLateFeeForRenewal;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
