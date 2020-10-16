package org.epragati.service.enclosure.vo;

import org.epragati.constants.EnclosureType;

public class EnclouserVO {

	private Integer id;
	private EnclosureType type;
	private String details;
	private Integer noOfAttachments;
	private Boolean isRequired;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public EnclosureType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(EnclosureType type) {
		this.type = type;
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
	 * @return the isRequired
	 */
	public Boolean getIsRequired() {
		return isRequired;
	}
	/**
	 * @param isRequired the isRequired to set
	 */
	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnclouserVO [" + (id != null ? "id=" + id + ", " : "") + (type != null ? "type=" + type + ", " : "")
				+ (details != null ? "details=" + details + ", " : "")
				+ (noOfAttachments != null ? "noOfAttachments=" + noOfAttachments + ", " : "")
				+ (isRequired != null ? "isRequired=" + isRequired : "") + "]";
	}
	
	
}