package org.epragati.payments.vo;

import java.time.LocalDate;
import java.util.List;

public class GeneralCashBookVO {

	private LocalDate fromDate;

	private LocalDate toDate;

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}



	private List<CashBookVO> cashBookDetails;

	private CashBookVO total;

	public List<CashBookVO> getCashBookDetails() {
		return cashBookDetails;
	}

	public void setCashBookDetails(List<CashBookVO> cashBookDetails) {
		this.cashBookDetails = cashBookDetails;
	}

	public CashBookVO getTotal() {
		return total;
	}

	public void setTotal(CashBookVO total) {
		this.total = total;
	}
}
