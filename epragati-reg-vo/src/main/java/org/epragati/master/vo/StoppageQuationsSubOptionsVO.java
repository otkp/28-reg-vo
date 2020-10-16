package org.epragati.master.vo;

import java.util.List;



/**
 * @author sai.naganaboyena
 *
 */
public class StoppageQuationsSubOptionsVO {

	private String label;
	private String name;
	private String value;
	private String type;
	private String content;
	private List<StoppageQuationsSubOptionsSupportVO> supports;
	
	
	private boolean booleanValue;
	private boolean commentsRequired;
	private String comments;
	private Boolean radioButton;
	
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
	 * @return the supports
	 */
	public List<StoppageQuationsSubOptionsSupportVO> getSupports() {
		return supports;
	}
	/**
	 * @param supports the supports to set
	 */
	public void setSupports(List<StoppageQuationsSubOptionsSupportVO> supports) {
		this.supports = supports;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isBooleanValue() {
		return booleanValue;
	}
	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}
	public boolean isCommentsRequired() {
		return commentsRequired;
	}
	public void setCommentsRequired(boolean commentsRequired) {
		this.commentsRequired = commentsRequired;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Boolean getRadioButton() {
		return radioButton;
	}
	public void setRadioButton(Boolean radioButton) {
		this.radioButton = radioButton;
	}
	
	
	
}
