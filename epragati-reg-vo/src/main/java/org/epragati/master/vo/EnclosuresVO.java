package org.epragati.master.vo;


import java.util.List;

import org.epragati.common.vo.BaseVO;


/**
 * 
 * @author saroj.sahoo
 *
 */
public class EnclosuresVO extends BaseVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String details;
	
	private Integer enclosureId;
	
	private Integer noOfAttachments;
	
	private String proof;
	
	private Integer serviceID;
	
	private String status;
	
	private boolean isRequired;
	
	private List<String> basedOnRole;
	
	

	/**
	 * @return the basedOnRole
	 */
	public List<String> getBasedOnRole() {
		return basedOnRole;
	}

	/**
	 * @param basedOnRole the basedOnRole to set
	 */
	public void setBasedOnRole(List<String> basedOnRole) {
		this.basedOnRole = basedOnRole;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the enclosureId
	 */
	public Integer getEnclosureId() {
		return enclosureId;
	}

	/**
	 * @param enclosureId the enclosureId to set
	 */
	public void setEnclosureId(Integer enclosureId) {
		this.enclosureId = enclosureId;
	}

	/**
	 * @return the noOfAttachments
	 */
	public Integer getNoOfAttachments() {
		return noOfAttachments;
	}

	/**
	 * @param noOfAttachments the noOfAttachments to set
	 */
	public void setNoOfAttachments(Integer noOfAttachments) {
		this.noOfAttachments = noOfAttachments;
	}

	/**
	 * @return the proof
	 */
	public String getProof() {
		return proof;
	}

	/**
	 * @param proof the proof to set
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}

	/**
	 * @return the serviceID
	 */
	public Integer getServiceID() {
		return serviceID;
	}

	/**
	 * @param serviceID the serviceID to set
	 */
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
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

	/**
	 * @return the isRequired
	 */
	public boolean isRequired() {
		return isRequired;
	}

	/**
	 * @param isRequired the isRequired to set
	 */
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

     
	
}
