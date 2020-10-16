package org.epragati.rta.vo;

import java.util.List;

import org.epragati.service.enclosure.vo.ImageVO;

public class EnclosuresVO {
private String type;
private String description;
private List<ImageVO> images;
private boolean required;
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
public boolean isRequired() {
	return required;
}
/**
 * @param required the required to set
 */
public void setRequired(boolean required) {
	this.required = required;
}
	
	
}
