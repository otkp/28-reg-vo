package org.epragati.dealer.tradecert;

import java.io.Serializable;
import java.util.List;

import org.epragati.util.payment.ServiceEnum;

/**
 * this DTO class is used for creating new Trade Certificate
 * 
 * @author Jyoti Bhushan
 *
 */
public class DealerTradeCertificateNewVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dealerName;
	private String addrss;
	private String gateWayType;
	private List<TradeCertificateDealerVO> tradeCertificate;
	private String tcGenId;
	private String paymentTxId;
	private List<ServiceEnum> serviceType;
	private String totalAmmount;
	private Integer numberOfTradeCertificate = 0;
	private Integer serviceId;

	/**
	 * property used for validating
	 */

	public String getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(String totalAmmount) {
		this.totalAmmount = totalAmmount;
	}

	public String getPaymentTxId() {
		return paymentTxId;
	}

	public void setPaymentTxId(String paymentTxId) {
		this.paymentTxId = paymentTxId;
	}

	public String getTcGenId() {
		return tcGenId;
	}

	public void setTcGenId(String tcGenId) {
		this.tcGenId = tcGenId;
	}

	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	public String getGateWayType() {
		return gateWayType;
	}

	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getAddrss() {
		return addrss;
	}

	public void setAddrss(String addrss) {
		this.addrss = addrss;
	}

	public List<TradeCertificateDealerVO> getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(List<TradeCertificateDealerVO> tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}

	public Integer getNumberOfTradeCertificate() {
		return numberOfTradeCertificate;
	}

	public void setNumberOfTradeCertificate(Integer numberOfTradeCertificate) {
		this.numberOfTradeCertificate = numberOfTradeCertificate;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

}
