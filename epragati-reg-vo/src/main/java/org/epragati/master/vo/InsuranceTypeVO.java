package org.epragati.master.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author saroj.sahoo
 *
 */

@JsonInclude(Include.NON_NULL)
public class InsuranceTypeVO{

	private  String insId;
	
	private  String insDescription;
	
	private  String status;
	
	private List<Integer> tenure;

	/**
	 * @return the tenure
	 */
	public List<Integer> getTenure() {
		return tenure;
	}

	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(List<Integer> tenure) {
		this.tenure = tenure;
	}

	/**
	 * @return the insId
	 */
	public String getInsId() {
		return insId;
	}

	/**
	 * @param insId the insId to set
	 */
	public void setInsId(String insId) {
		this.insId = insId;
	}

	/**
	 * @return the insDescription
	 */
	public String getInsDescription() {
		return insDescription;
	}

	/**
	 * @param insDescription the insDescription to set
	 */
	public void setInsDescription(String insDescription) {
		this.insDescription = insDescription;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InsuranceTypeVO [insId=" + insId + ", insDescription=" + insDescription + ", status=" + status + "]";
	}
	
}
