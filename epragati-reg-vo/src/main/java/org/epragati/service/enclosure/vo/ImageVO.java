package org.epragati.service.enclosure.vo;

import java.util.List;

import org.epragati.master.vo.ActionDetailsVO;

public class ImageVO {

	
	private String appImageDocId;
	private String serviceId;
	private String applicantId;
	private String imageType;
	private String imageDetails;
	private String imagCheckSum;
	private String imageStaus;
	private String imageUrl;
	private String imageComment;
	private String enclosureName;
	private List<ActionDetailsVO> actionLog;
	private boolean required;
	private List<String> basedOnRole;
	private boolean differentlyAbled;
	private boolean active;
    private String role;
    private Integer slNo;
    
    private List<ImageActionsVO> imageActions;
	private String Vehicletype;
	private String Vehicletypecategory;
	private String pdfUrl;
	
	private Integer fileOrder;
	
	public String getVehicletype() {
		return Vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		Vehicletype = vehicletype;
	}

	public String getVehicletypecategory() {
		return Vehicletypecategory;
	}

	public void setVehicletypecategory(String vehicletypecategory) {
		Vehicletypecategory = vehicletypecategory;
	}

	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}

	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}

	/**
	 * @return the appImageDocId
	 */
	public String getAppImageDocId() {
		return appImageDocId;
	}

	/**
	 * @param appImageDocId the appImageDocId to set
	 */
	public void setAppImageDocId(String appImageDocId) {
		this.appImageDocId = appImageDocId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the applicantId
	 */
	public String getApplicantId() {
		return applicantId;
	}

	/**
	 * @param applicantId the applicantId to set
	 */
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	/**
	 * @return the imageType
	 */
	public String getImageType() {
		return imageType;
	}

	/**
	 * @param imageType the imageType to set
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	/**
	 * @return the imageDetails
	 */
	public String getImageDetails() {
		return imageDetails;
	}

	/**
	 * @param imageDetails the imageDetails to set
	 */
	public void setImageDetails(String imageDetails) {
		this.imageDetails = imageDetails;
	}

	/**
	 * @return the imagCheckSum
	 */
	public String getImagCheckSum() {
		return imagCheckSum;
	}

	/**
	 * @param imagCheckSum the imagCheckSum to set
	 */
	public void setImagCheckSum(String imagCheckSum) {
		this.imagCheckSum = imagCheckSum;
	}

	/**
	 * @return the imageStaus
	 */
	public String getImageStaus() {
		return imageStaus;
	}

	/**
	 * @param imageStaus the imageStaus to set
	 */
	public void setImageStaus(String imageStaus) {
		this.imageStaus = imageStaus;
	}

	/**
	 * @return the isRequired
	 */
	

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
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageComment() {
		return imageComment;
	}

	public void setImageComment(String imageComment) {
		this.imageComment = imageComment;
	}

	/**
	 * @return the enclosureName
	 */
	public String getEnclosureName() {
		return enclosureName;
	}

	/**
	 * @param enclosureName
	 *            the enclosureName to set
	 */
	public void setEnclosureName(String enclosureName) {
		this.enclosureName = enclosureName;
	}

	public List<ActionDetailsVO> getActionLog() {
		return actionLog;
	}

	public void setActionLog(List<ActionDetailsVO> actionLog) {
		this.actionLog = actionLog;
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


	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the differentlyAbled
	 */
	public boolean isDifferentlyAbled() {
		return differentlyAbled;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the image
	 */
	

	/**
	 * @param differentlyAbled the differentlyAbled to set
	 */
	public void setDifferentlyAbled(boolean differentlyAbled) {
		this.differentlyAbled = differentlyAbled;
	}

	/**
	 * @return the imageActions
	 */
	public List<ImageActionsVO> getImageActions() {
		return imageActions;
	}

	/**
	 * @param imageActions the imageActions to set
	 */
	public void setImageActions(List<ImageActionsVO> imageActions) {
		this.imageActions = imageActions;
	}

	/**
	 * @return the pdfUrl
	 */
	public String getPdfUrl() {
		return pdfUrl;
	}

	/**
	 * @param pdfUrl the pdfUrl to set
	 */
	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public Integer getFileOrder() {
		return fileOrder;
	}

	public void setFileOrder(Integer fileOrder) {
		this.fileOrder = fileOrder;
	}
	
	

}
