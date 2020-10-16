package org.epragati.vcr.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OverLoadVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private WeighmentVO weighmentVO;
	private InvoiceVO invoiceVO;
	private PassengersVO passengersVO;

	public WeighmentVO getWeighmentVO() {
		return weighmentVO;
	}

	public void setWeighmentVO(WeighmentVO weighmentVO) {
		this.weighmentVO = weighmentVO;
	}

	public InvoiceVO getInvoiceVO() {
		return invoiceVO;
	}

	public void setInvoiceVO(InvoiceVO invoiceVO) {
		this.invoiceVO = invoiceVO;
	}

	public PassengersVO getPassengersVO() {
		return passengersVO;
	}

	public void setPassengersVO(PassengersVO passengersVO) {
		this.passengersVO = passengersVO;
	}

	@Override
	public String toString() {
		return "OverLoadVO [weighmentVO=" + weighmentVO + ", invoiceVO=" + invoiceVO + ", passengersVO=" + passengersVO
				+ "]";
	}

	
	
}
