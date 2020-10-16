package org.epragati.images.vo;

import java.time.LocalDateTime;
import java.util.List;

public class ImageInput implements Cloneable{

	private String type;
	private Integer fileOrder;
	private Integer pageNo;
	private String enclosureName;
	private List<String> basedOnRole;
	private Integer quarterNumber;
	private String latitude;
	private String longitude;
	private LocalDateTime timestamp;
	private String url;
	private String uri;
	private ImageUri imageUri;
	private String remarks;
	private String status;
	

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return the imageUri
	 */
	public ImageUri getImageUri() {
		return imageUri;
	}

	/**
	 * @param imageUri the imageUri to set
	 */
	public void setImageUri(ImageUri imageUri) {
		this.imageUri = imageUri;
	}

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
	 * @return the fileOrder
	 */
	public Integer getFileOrder() {
		return fileOrder;
	}

	/**
	 * @param fileOrder
	 *            the fileOrder to set
	 */
	public void setFileOrder(Integer fileOrder) {
		this.fileOrder = fileOrder;
	}

	/**
	 * @return the pageNo
	 */
	public Integer getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo
	 *            the pageNo to set
	 */
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
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

	public Integer getQuarterNumber() {
		return quarterNumber;
	}

	public void setQuarterNumber(Integer quarterNumber) {
		this.quarterNumber = quarterNumber;
	}
	

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImageInput [" + (type != null ? "type=" + type + ", " : "")
				+ (fileOrder != null ? "fileOrder=" + fileOrder + ", " : "")
				+ (pageNo != null ? "pageNo=" + pageNo + ", " : "")
				+ (enclosureName != null ? "enclosureName=" + enclosureName : "") + "]";
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	
	@Override
	public Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}
