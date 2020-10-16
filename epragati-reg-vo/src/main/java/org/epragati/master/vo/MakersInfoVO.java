package org.epragati.master.vo;

import java.util.List;

import org.epragati.common.vo.PropertiesVO;
import org.epragati.util.payment.AxleTypeEnum;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class MakersInfoVO {
	
	private  List<MakersVO> makerNames;

	private  List<BodyTypeVO> bodyTypes;
	
	private  List<MasterCovVO> covTypes;
	
	private  PropertiesVO fuelType;
	
	private List<AxleTypeEnum> axleType;

	public List<MakersVO> getMakerNames() {
		return makerNames;
	}

	public void setMakerNames(List<MakersVO> makerNames) {
		this.makerNames = makerNames;
	}

	public List<BodyTypeVO> getBodyTypes() {
		return bodyTypes;
	}

	public void setBodyTypes(List<BodyTypeVO> bodyTypes) {
		this.bodyTypes = bodyTypes;
	}

	public List<MasterCovVO> getCovTypes() {
		return covTypes;
	}

	public void setCovTypes(List<MasterCovVO> covTypes) {
		this.covTypes = covTypes;
	}

	public PropertiesVO getFuelType() {
		return fuelType;
	}

	public void setFuelType(PropertiesVO fuelType) {
		this.fuelType = fuelType;
	}

	public List<AxleTypeEnum> getAxleType() {
		return axleType;
	}

	public void setAxleType(List<AxleTypeEnum> axleType) {
		this.axleType = axleType;
	}
}
