package org.epragati.financier.vo;

import java.util.List;

import org.epragati.images.vo.ImageInput;
import org.epragati.master.vo.UserVO;

public class FinancierCreateRequestVO extends UserVO {

	List<ImageInput> imageInput;

	/**
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}
}
