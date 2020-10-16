package org.epragati.master.vo;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InsuranceDetailsVO {

	private String id;
	
	private String company;

	private String policyType;

	@Conditional(selected = "policyNumber",message = ValidatorConstants.INVALID_POLICY_NO,values = {})
	private String policyNumber;

	@Size(max=1,message=ValidatorConstants.INVALID_TENURE)
	@Conditional(selected = "tenure",message=ValidatorConstants.INVALID_TENURE,values = {})
	private Integer tenure;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Conditional(selected = "date",message=ValidatorConstants.INVALID_DATE_FORMAT,values = {})
	private LocalDate validTill;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Conditional(selected = "date",message=ValidatorConstants.INVALID_DATE_FORMAT,values = {})
	private LocalDate validFrom;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTillForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFromForOther;

	public LocalDate getValidTillForOther() {
		return validTillForOther;
	}

	public void setValidTillForOther(LocalDate validTillForOther) {
		this.validTillForOther = validTillForOther;
	}

	public LocalDate getValidFromForOther() {
		return validFromForOther;
	}

	public void setValidFromForOther(LocalDate validFromForOther) {
		this.validFromForOther = validFromForOther;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

}
