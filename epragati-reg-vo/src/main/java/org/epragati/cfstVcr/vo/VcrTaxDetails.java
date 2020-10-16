package org.epragati.cfstVcr.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class VcrTaxDetails {
	
	@XmlElement(name="SLNO")
	private Integer slNo;
	
	@XmlElement(name="VCRNO")
	private String vcrNo;
	
	@XmlElement(name="REGNNO")
	private String regnNo;
	
	@XmlElement(name="VEHICLECLS")
	private String vehicles;
	
	@XmlElement(name="CHALLANNO")
	private String challanNo;
	
	@XmlElement(name="PAYMNTDT")
	private String paymtDate;
	
	@XmlElement(name="CFAMNT")
	private Double cfAmnt;
	
	@XmlElement(name="TAXAMNT")
	private Double taxAmt;
	
	@XmlElement(name="BOOKEDDATE")
	private String bookDate;
	
	@XmlElement(name="MVICODE")
	private String mviCode;
	
	@XmlElement(name="MVINAME")
	private String mviName;
	
	@XmlElement(name="OFFICECODE")
	private String officeCode;
	
	@XmlElement(name="MANVCRNO")
	private String manVcrNo;

	
	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}

	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}

	/**
	 * @return the vcrNo
	 */
	public String getVcrNo() {
		return vcrNo;
	}

	/**
	 * @param vcrNo the vcrNo to set
	 */
	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	/**
	 * @return the regnNo
	 */
	public String getRegnNo() {
		return regnNo;
	}

	/**
	 * @param regnNo the regnNo to set
	 */
	public void setRegnNo(String regnNo) {
		this.regnNo = regnNo;
	}

	/**
	 * @return the vehicles
	 */
	public String getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}

	/**
	 * @return the challanNo
	 */
	public String getChallanNo() {
		return challanNo;
	}

	/**
	 * @param challanNo the challanNo to set
	 */
	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	/**
	 * @return the paymtDate
	 */
	public String getPaymtDate() {
		return paymtDate;
	}

	/**
	 * @param paymtDate the paymtDate to set
	 */
	public void setPaymtDate(String paymtDate) {
		this.paymtDate = paymtDate;
	}

	/**
	 * @return the cfAmnt
	 */
	public Double getCfAmnt() {
		return cfAmnt;
	}

	/**
	 * @param cfAmnt the cfAmnt to set
	 */
	public void setCfAmnt(Double cfAmnt) {
		this.cfAmnt = cfAmnt;
	}

	/**
	 * @return the taxAmt
	 */
	public Double getTaxAmt() {
		return taxAmt;
	}

	/**
	 * @param taxAmt the taxAmt to set
	 */
	public void setTaxAmt(Double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String getMviCode() {
		return mviCode;
	}

	public void setMviCode(String mviCode) {
		this.mviCode = mviCode;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getManVcrNo() {
		return manVcrNo;
	}

	public void setManVcrNo(String manVcrNo) {
		this.manVcrNo = manVcrNo;
	}

}
