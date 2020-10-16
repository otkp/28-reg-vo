package org.epragati.service.enclosure.vo;

import java.util.List;

import org.epragati.aadhaarseeding.vo.AadhaarSeedVO;


public class EnclosureRejectedVO {

	private String type;
	private String description;
	private List<ImageVO> images;
	private Boolean required;
	private Integer slNo;

	private String qrCode;

	private AadhaarSeedVO imgUrls;
	private boolean mobileUploaded;
	
	public EnclosureRejectedVO() {
		super();
	}

	public EnclosureRejectedVO(String string, List<ImageVO> images) {
		super();
		this.type = string;
		this.description = images.get(0).getEnclosureName();
		this.required = images.get(0).isRequired();
		this.images = images;
		this.slNo = images.stream().findFirst().get().getSlNo();
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
	 * @return the images
	 */
	public List<ImageVO> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<ImageVO> images) {
		this.images = images;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public AadhaarSeedVO getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(AadhaarSeedVO imgUrls) {
		this.imgUrls = imgUrls;
	}

	public boolean isMobileUploaded() {
		return mobileUploaded;
	}

	public void setMobileUploaded(boolean mobileUploaded) {
		this.mobileUploaded = mobileUploaded;
	}

}
