package org.epragati.vcr.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.master.vo.VahanDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ValidityDetailsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String permitNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate permitFrom;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate permitTO;
	private String typeOfPermit;
	private String permitRouteOrGoods;
	private String secondPermitNumber;
	private String secondPermitIssuedBy;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate secondPermitValidUpto;
	private String fcNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fcFrom;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fcTo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxPaymentDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxValidUpto;
	private Integer paidAmmount;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate icValidUpto;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate pucValidUpto;
	private VahanDetailsVO vahan;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime fcIssuedDate;

	public LocalDateTime getFcIssuedDate() {
		return fcIssuedDate;
	}

	public void setFcIssuedDate(LocalDateTime fcIssuedDate) {
		this.fcIssuedDate = fcIssuedDate;
	}

	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public LocalDate getPermitFrom() {
		return permitFrom;
	}

	public void setPermitFrom(LocalDate permitFrom) {
		this.permitFrom = permitFrom;
	}

	public LocalDate getPermitTO() {
		return permitTO;
	}

	public void setPermitTO(LocalDate permitTO) {
		this.permitTO = permitTO;
	}

	public String getTypeOfPermit() {
		return typeOfPermit;
	}

	public void setTypeOfPermit(String typeOfPermit) {
		this.typeOfPermit = typeOfPermit;
	}

	public String getPermitRouteOrGoods() {
		return permitRouteOrGoods;
	}

	public void setPermitRouteOrGoods(String permitRouteOrGoods) {
		this.permitRouteOrGoods = permitRouteOrGoods;
	}

	public String getSecondpermitNumber() {
		return secondPermitNumber;
	}

	public void setSecondpermitNumber(String secondpermitNumber) {
		this.secondPermitNumber = secondpermitNumber;
	}

	public String getSecondPermitIssuedBy() {
		return secondPermitIssuedBy;
	}

	public void setSecondPermitIssuedBy(String secondPermitIssuedBy) {
		this.secondPermitIssuedBy = secondPermitIssuedBy;
	}

	public LocalDate getSecondPermitValidUpto() {
		return secondPermitValidUpto;
	}

	public void setSecondPermitValidUpto(LocalDate secondPermitValidUpto) {
		this.secondPermitValidUpto = secondPermitValidUpto;
	}

	public String getFcNumber() {
		return fcNumber;
	}

	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	public LocalDate getFcFrom() {
		return fcFrom;
	}

	public void setFcFrom(LocalDate fcFrom) {
		this.fcFrom = fcFrom;
	}

	public LocalDate getFcTo() {
		return fcTo;
	}

	public void setFcTo(LocalDate fcTo) {
		this.fcTo = fcTo;
	}

	public LocalDate getTaxPaymentDate() {
		return taxPaymentDate;
	}

	public void setTaxPaymentDate(LocalDate taxPaymentDate) {
		this.taxPaymentDate = taxPaymentDate;
	}

	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}

	public Integer getPaidAmmount() {
		return paidAmmount;
	}

	public void setPaidAmmount(Integer paidAmmount) {
		this.paidAmmount = paidAmmount;
	}

	public LocalDate getIcValidUpto() {
		return icValidUpto;
	}

	public void setIcValidUpto(LocalDate icValidUpto) {
		this.icValidUpto = icValidUpto;
	}

	public LocalDate getPucValidUpto() {
		return pucValidUpto;
	}

	public void setPucValidUpto(LocalDate pucValidUpto) {
		this.pucValidUpto = pucValidUpto;
	}

	public String getSecondPermitNumber() {
		return secondPermitNumber;
	}

	public void setSecondPermitNumber(String secondPermitNumber) {
		this.secondPermitNumber = secondPermitNumber;
	}

	public VahanDetailsVO getVahan() {
		return vahan;
	}

	public void setVahan(VahanDetailsVO vahan) {
		this.vahan = vahan;
	}

}
