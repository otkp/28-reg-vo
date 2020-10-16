package org.epragati.master.vo;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.epragati.aadhaarseeding.vo.AadhaarSeedDetailsVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.regservice.vo.RegServiceVO;

public class RegServiceAadharSeedingInputVO {

	@NotNull(message = "Images are required.")
	private List<ImageInput> images;

	@NotNull(message = "LLR Details are required.")
	private RegServiceVO llrDetails;

	private AadhaarSeedDetailsVO aadhaarSeedDetailsVO;
	
	private String prNo;
	private boolean uploadedByBrowser;

	public boolean isUploadedByBrowser() {
		return uploadedByBrowser;
	}

	public void setUploadedByBrowser(boolean uploadedByBrowser) {
		this.uploadedByBrowser = uploadedByBrowser;
	}

	/**
	 * @return the images
	 */
	public List<ImageInput> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<ImageInput> images) {
		this.images = images;
	}

	/**
	 * @return the llrDetails
	 */
	public RegServiceVO getLlrDetails() {
		return llrDetails;
	}

	/**
	 * @param llrDetails
	 *            the llrDetails to set
	 */
	public void setLlrDetails(RegServiceVO llrDetails) {
		this.llrDetails = llrDetails;
	}

	/**
	 * @return the aadhaarSeedDetailsVO
	 */
	public AadhaarSeedDetailsVO getAadhaarSeedDetailsVO() {
		return aadhaarSeedDetailsVO;
	}

	/**
	 * @param aadhaarSeedDetailsVO
	 *            the aadhaarSeedDetailsVO to set
	 */
	public void setAadhaarSeedDetailsVO(AadhaarSeedDetailsVO aadhaarSeedDetailsVO) {
		this.aadhaarSeedDetailsVO = aadhaarSeedDetailsVO;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	

}
