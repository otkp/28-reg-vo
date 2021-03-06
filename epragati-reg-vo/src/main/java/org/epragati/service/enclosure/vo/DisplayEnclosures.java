package org.epragati.service.enclosure.vo;

import java.util.List;

public class DisplayEnclosures {

	private String type;
	private String description;
	private List<ImageVO> images;
	private Boolean required;
	
	public DisplayEnclosures() {
		super();
	}

	public DisplayEnclosures( List<ImageVO> images) {
		super();
		this.type = images.get(0).getImageType();
		this.description = images.get(0).getEnclosureName();
		this.required = images.get(0).isRequired();
		this.images = images;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
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
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the images
	 */
	public List<ImageVO> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<ImageVO> images) {
		this.images = images;
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
	
	
}
