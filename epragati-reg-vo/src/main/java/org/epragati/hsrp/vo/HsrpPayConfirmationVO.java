package org.epragati.hsrp.vo;

import java.time.LocalDate;

public class HsrpPayConfirmationVO {

	private LocalDate paymentReceivedDate;

	private String orderNumber;

	private LocalDate orderDate;

	public LocalDate getPaymentReceivedDate() {
		return paymentReceivedDate;
	}

	public void setPaymentReceivedDate(LocalDate paymentReceivedDate) {
		this.paymentReceivedDate = paymentReceivedDate;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

}
