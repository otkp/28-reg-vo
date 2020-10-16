package org.epragati.master.vo;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class VillagePostalOfficeVO {

	private List<VillageVO> villageVO;

	private List<PostOfficeVO> postOfficeVO;

	public List<VillageVO> getVillageVO() {
		return villageVO;
	}

	public void setVillageVO(List<VillageVO> villageVO) {
		this.villageVO = villageVO;
	}

	public List<PostOfficeVO> getPostOfficeVO() {
		return postOfficeVO;
	}

	public void setPostOfficeVO(List<PostOfficeVO> postOfficeVO) {
		this.postOfficeVO = postOfficeVO;
	}

}
