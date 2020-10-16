
package org.epragati.master.vo;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class TaxTypeVO extends BaseVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String taxId;
	
	private String taxDescription;
	
	private String taxCode;
	
	private String status;
	private Integer months;
	/**
	 * @return the taxId
	 */
	public String getTaxId() {
		return taxId;
	}

	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	/**
	 * @return the taxDescription
	 */
	public String getTaxDescription() {
		return taxDescription;
	}

	/**
	 * @param taxDescription the taxDescription to set
	 */
	public void setTaxDescription(String taxDescription) {
		this.taxDescription = taxDescription;
	}

	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaxTypeVO [taxId=" + taxId + ", taxDescription=" + taxDescription + ", taxCode=" + taxCode + ", status="
				+ status + "]";
	}
	
}
