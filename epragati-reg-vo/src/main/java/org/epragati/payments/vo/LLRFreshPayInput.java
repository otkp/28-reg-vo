package org.epragati.payments.vo;

import org.epragati.service.enclosure.vo.EnclousersImagesVO;

public class LLRFreshPayInput {
	private ApplicantDetailsVO aadharDetailsVO;
	private PaymentGatewayTypeVO paymentGatewayTypeVO;
	private EnclousersImagesVO enclousersImagesVO;
	private Double totalFees;

	public ApplicantDetailsVO getAadharDetailsVO() {
		return aadharDetailsVO;
	}

	public void setAadharDetailsVO(ApplicantDetailsVO aadharDetailsVO) {
		this.aadharDetailsVO = aadharDetailsVO;
	}

	public PaymentGatewayTypeVO getPaymentGatewayTypeVO() {
		return paymentGatewayTypeVO;
	}

	public void setPaymentGatewayTypeVO(PaymentGatewayTypeVO paymentGatewayTypeVO) {
		this.paymentGatewayTypeVO = paymentGatewayTypeVO;
	}

	public EnclousersImagesVO getEnclousersImagesVO() {
		return enclousersImagesVO;
	}

	public void setEnclousersImagesVO(EnclousersImagesVO enclousersImagesVO) {
		this.enclousersImagesVO = enclousersImagesVO;
	}

	public Double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}

}
