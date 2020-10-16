package org.epragati.vcr.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.master.vo.MisusedAsVO;
import org.epragati.master.vo.OffenceVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OffenceVcrVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private List<OffenceVO> offence;
	private boolean illicitOperation;
	private String pilledAs;
	private String registeredAs;
	private MisusedAsVO misusedAs;
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<OffenceVO> getOffence() {
		return offence;
	}

	public void setOffence(List<OffenceVO> offence) {
		this.offence = offence;
	}

	public boolean isIllicitOperation() {
		return illicitOperation;
	}

	public void setIllicitOperation(boolean illicitOperation) {
		this.illicitOperation = illicitOperation;
	}

	public String getPilledAs() {
		return pilledAs;
	}

	public void setPilledAs(String pilledAs) {
		this.pilledAs = pilledAs;
	}

	public MisusedAsVO getMisusedAs() {
		return misusedAs;
	}

	public void setMisusedAs(MisusedAsVO misusedAs) {
		this.misusedAs = misusedAs;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRegisteredAs() {
		return registeredAs;
	}

	public void setRegisteredAs(String registeredAs) {
		this.registeredAs = registeredAs;
	}
	
	

}
