package org.epragati.cfstSync.vo;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@XmlRootElement(name = "PaymentDetail")
@JsonInclude(Include.NON_NULL)
public class PaymentDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String officeCode= StringUtils.EMPTY;
	
	private String referanceNo= StringUtils.EMPTY;
	
	private String transactionDate=StringUtils.EMPTY;
	
	private String transactionNo=StringUtils.EMPTY;
	
	private String serviceId=StringUtils.EMPTY;
	
	private Double trServiceFee=0.0;
	
	private Double trApplicationFee=0.0;
	
	private Double prServiceFee=0.0;
	
	private Double prApplicationFee=0.0;
	
	private Double prPostalFee=0.0;
	
	private Double prCardFee=0.0;
	
	private Double hpaApplicationFee=0.0;
	
	private String taxType=StringUtils.EMPTY;
	
	private Double taxAmount=0.0;
	
	private Double cessFee=0.0;

	private Double bidAmount=0.0;
	
	private Double fcServiceFee=0.0;
	
	private Double fcApplicationFee=0.0;
	
	private Double hsrpFee;
	
	private Set<Integer> serviceNames;
	
	private Double authorizationFee=0.0;
	
	public Set<Integer> getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(Set<Integer> serviceNames) {
		this.serviceNames = serviceNames;
	}

	public Double getFcServiceFee() {
		return fcServiceFee;
	}

	public void setFcServiceFee(Double fcServiceFee) {
		this.fcServiceFee = fcServiceFee;
	}

	public Double getFcApplicationFee() {
		return fcApplicationFee;
	}

	public void setFcApplicationFee(Double fcApplicationFee) {
		this.fcApplicationFee = fcApplicationFee;
	}

	public Double getHsrpFee() {
		return hsrpFee;
	}

	public void setHsrpFee(Double hsrpFee) {
		this.hsrpFee = hsrpFee;
	}

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Double getCessFee() {
		return cessFee;
	}

	public void setCessFee(Double cessFee) {
		this.cessFee = cessFee;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getReferanceNo() {
		return referanceNo;
	}

	public void setReferanceNo(String referanceNo) {
		this.referanceNo = referanceNo;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Double getTrServiceFee() {
		return trServiceFee;
	}

	public void setTrServiceFee(Double trServiceFee) {
		this.trServiceFee = trServiceFee;
	}

	public Double getTrApplicationFee() {
		return trApplicationFee;
	}

	public void setTrApplicationFee(Double trApplicationFee) {
		this.trApplicationFee = trApplicationFee;
	}

	public Double getPrServiceFee() {
		return prServiceFee;
	}

	public void setPrServiceFee(Double prServiceFee) {
		this.prServiceFee = prServiceFee;
	}

	public Double getPrApplicationFee() {
		return prApplicationFee;
	}

	public void setPrApplicationFee(Double prApplicationFee) {
		this.prApplicationFee = prApplicationFee;
	}

	public Double getPrPostalFee() {
		return prPostalFee;
	}

	public void setPrPostalFee(Double prPostalFee) {
		this.prPostalFee = prPostalFee;
	}

	public Double getPrCardFee() {
		return prCardFee;
	}

	public Double getHpaApplicationFee() {
		return hpaApplicationFee;
	}

	public void setHpaApplicationFee(Double hpaApplicationFee) {
		this.hpaApplicationFee = hpaApplicationFee;
	}

	public void setPrCardFee(Double prCardFee) {
		this.prCardFee = prCardFee;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getAuthorizationFee() {
		return authorizationFee;
	}

	public void setAuthorizationFee(Double authorizationFee) {
		this.authorizationFee = authorizationFee;
	}

}
