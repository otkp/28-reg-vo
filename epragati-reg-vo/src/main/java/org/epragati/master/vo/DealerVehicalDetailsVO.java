package org.epragati.master.vo;

import java.util.List;

public class DealerVehicalDetailsVO {

	private List<MasterCovVO> classOfVehicals;
	private List<MakersVO> makerNames;

	public List<MasterCovVO> getClassOfVehicals() {
		return classOfVehicals;
	}

	public void setClassOfVehicals(List<MasterCovVO> classOfVehicals) {
		this.classOfVehicals = classOfVehicals;
	}

	public List<MakersVO> getMakerNames() {
		return makerNames;
	}

	public void setMakerNames(List<MakersVO> makerNames) {
		this.makerNames = makerNames;
	}

	@Override
	public String toString() {
		return "DealerVehicalDetailsVO [classOfVehicals=" + classOfVehicals + ", makerNames=" + makerNames + "]";
	}

}
