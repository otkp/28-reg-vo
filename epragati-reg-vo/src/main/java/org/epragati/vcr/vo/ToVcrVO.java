package org.epragati.vcr.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.epragati.master.vo.DistrictVO;
import org.epragati.master.vo.StateVO;

public class ToVcrVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StateVO state;
	private DistrictVO district;
	//@NotNull(message = "place are required.")
	private String place;

	public StateVO getState() {
		return state;
	}

	public void setState(StateVO state) {
		this.state = state;
	}

	public DistrictVO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictVO district) {
		this.district = district;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
