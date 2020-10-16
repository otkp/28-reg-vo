package org.epragati.master.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TrailerCOVInfoVO {

	private List<MakersVO> DealerMakerVO;

	private List<MasterVariantVO> masterVariantVO;

	/**
	 * @return the dealerMakerVO
	 */
	public List<MakersVO> getDealerMakerVO() {
		return DealerMakerVO;
	}

	/**
	 * @param dealerMakerVO
	 *            the dealerMakerVO to set
	 */
	public void setDealerMakerVO(List<MakersVO> dealerMakerVO) {
		DealerMakerVO = dealerMakerVO;
	}

	/**
	 * @return the masterVariantVO
	 */
	public List<MasterVariantVO> getMasterVariantVO() {
		return masterVariantVO;
	}

	/**
	 * @param masterVariantVO
	 *            the masterVariantVO to set
	 */
	public void setMasterVariantVO(List<MasterVariantVO> masterVariantVO) {
		this.masterVariantVO = masterVariantVO;
	}

}
