package org.epragati.dealer.tradecert;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * this DTO class is used for creating new Trade Certificate
 * 
 * @author Jyoti Bhushan
 *
 */

public class TradeCertificateDealerVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dealerName;
	private Integer numberOfTradeCertificate = 0;
	private String cov;
	private String covCode;
	private String ammount;
	private String status;
	private String tradeCertificateID;
	private String paymentStatus;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;
	private String commonNumber;
	private String paymentTransactionNo;
	private String tradeValidityStatus;
	private Long totalDaysRemains;
	private String userId;
	private String gatewayType;
	private Double initialAmmount;
	private boolean downloadStatus;
	private Double serviceFeeIntial;
	private Double serviceFeeTotal;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public Long getTotalDaysRemains() {
		return totalDaysRemains;
	}

	public void setTotalDaysRemains(Long totalDaysRemains) {
		this.totalDaysRemains = totalDaysRemains;
	}

	public String getTradeValidityStatus() {
		return tradeValidityStatus;
	}

	public void setTradeValidityStatus(String tradeValidityStatus) {
		this.tradeValidityStatus = tradeValidityStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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

	public String getCommonNumber() {
		return commonNumber;
	}

	public void setCommonNumber(String commonNumber) {
		this.commonNumber = commonNumber;
	}

	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public String getTradeCertificateID() {
		return tradeCertificateID;
	}

	public void setTradeCertificateID(String tradeCertificateID) {
		this.tradeCertificateID = tradeCertificateID;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public Integer getNumberOfTradeCertificate() {
		return numberOfTradeCertificate;
	}

	public void setNumberOfTradeCertificate(Integer numberOfTradeCertificate) {
		this.numberOfTradeCertificate = numberOfTradeCertificate;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCovCode() {
		return covCode;
	}

	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public Double getInitialAmmount() {
		return initialAmmount;
	}

	public void setInitialAmmount(Double initialAmmount) {
		this.initialAmmount = initialAmmount;
	}

	public boolean isDownloadStatus() {
		return downloadStatus;
	}

	public void setDownloadStatus(boolean downloadStatus) {
		this.downloadStatus = downloadStatus;
	}

	public Double getServiceFeeIntial() {
		return serviceFeeIntial;
	}

	public void setServiceFeeIntial(Double double1) {
		this.serviceFeeIntial = double1;
	}

	public Double getServiceFeeTotal() {
		return serviceFeeTotal;
	}

	public void setServiceFeeTotal(Double serviceFeeTotal) {
		this.serviceFeeTotal = serviceFeeTotal;
	}

}
