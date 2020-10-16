package org.epragati.master.vo;

import java.util.List;

import org.epragati.service.enclosure.vo.EnclosureRejectedVO;

public class ReuploadImageVO {

	private List<EnclosureRejectedVO> imageInput;

	/**
	 * @return the imageInput
	 */
	public List<EnclosureRejectedVO> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<EnclosureRejectedVO> imageInput) {
		this.imageInput = imageInput;
	}

	

}
