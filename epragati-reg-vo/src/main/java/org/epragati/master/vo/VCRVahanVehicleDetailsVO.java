package org.epragati.master.vo;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.regservice.vo.TaxDetailsVahanVcrVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VCRVahanVehicleDetailsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3156801590500001337L;

	private RegistrationDetailsVO regDetailsVO;
	
	private TaxDetailsVahanVcrVO taxDetails;
	
	private PermitDetailsVO permitDetailsVO;
	
	private FcDetailsVO fcDetails;
	
	private boolean allowNextQuarterTax;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate taxvalidUpto;
	
	
	
	
	/**
	 * @return the fcDetails
	 */
	public FcDetailsVO getFcDetails() {
		return fcDetails;
	}

	/**
	 * @param fcDetails the fcDetails to set
	 */
	public void setFcDetails(FcDetailsVO fcDetails) {
		this.fcDetails = fcDetails;
	}

	/**
	 * @return the regDetailsVO
	 */
	public RegistrationDetailsVO getRegDetailsVO() {
		return regDetailsVO;
	}

	/**
	 * @param regDetailsVO the regDetailsVO to set
	 */
	public void setRegDetailsVO(RegistrationDetailsVO regDetailsVO) {
		this.regDetailsVO = regDetailsVO;
	}

	/**
	 * @return the taxDetails
	 */
	public TaxDetailsVahanVcrVO getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails the taxDetails to set
	 */
	public void setTaxDetails(TaxDetailsVahanVcrVO taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the permitDetailsVO
	 */
	public PermitDetailsVO getPermitDetailsVO() {
		return permitDetailsVO;
	}

	/**
	 * @param permitDetailsVO the permitDetailsVO to set
	 */
	public void setPermitDetailsVO(PermitDetailsVO permitDetailsVO) {
		this.permitDetailsVO = permitDetailsVO;
	}

	public boolean isAllowNextQuarterTax() {
		return allowNextQuarterTax;
	}

	public void setAllowNextQuarterTax(boolean allowNextQuarterTax) {
		this.allowNextQuarterTax = allowNextQuarterTax;
	}

	public LocalDate getTaxvalidUpto() {
		return taxvalidUpto;
	}

	public void setTaxvalidUpto(LocalDate taxvalidUpto) {
		this.taxvalidUpto = taxvalidUpto;
	}
	
	
}
