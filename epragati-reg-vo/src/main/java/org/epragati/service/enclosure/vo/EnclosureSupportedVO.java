package org.epragati.service.enclosure.vo;

import java.util.List;

import org.epragati.constants.EnclosureType;
import org.epragati.master.vo.EnclosuresVO;


public class EnclosureSupportedVO {

	private String type;
	private String description;
	private Boolean required;
	private EnclosuresVO enclousers;

	public EnclosureSupportedVO() {
		super();
	}

	public EnclosureSupportedVO(String type, EnclosuresVO enclousers) {
		super();
		this.type = type;
		this.description = enclousers.getDetails();
		this.required = enclousers.isRequired();
		this.enclousers = enclousers;
	}


	
	/**
	 * @return the required
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(Boolean required) {
		this.required = required;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the enclousers
	 */
	public EnclosuresVO getEnclousers() {
		return enclousers;
	}

	/**
	 * @param enclousers
	 *            the enclousers to set
	 */
	public void setEnclousers(EnclosuresVO enclousers) {
		this.enclousers = enclousers;
	}

}
