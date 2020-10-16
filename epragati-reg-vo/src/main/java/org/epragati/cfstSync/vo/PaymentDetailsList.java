package org.epragati.cfstSync.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@XmlRootElement(name = "PaymentDetailsList")
public class PaymentDetailsList {
	
	private List<PaymentDetails> paymentDetails;
	
	public PaymentDetailsList() {
	}
	
	public PaymentDetailsList(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	@javax.xml.bind.annotation.XmlElement(name = "paymentdetail")
	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}

}
