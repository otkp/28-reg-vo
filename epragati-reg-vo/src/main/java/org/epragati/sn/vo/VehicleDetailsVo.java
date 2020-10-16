package org.epragati.sn.vo;

import java.io.Serializable;

import org.epragati.constants.CovCategory;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.master.vo.OfficeVO;

public class VehicleDetailsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String applicationNumber;

	private String trNumber;

	private String prNumber;

	private MasterCovVO classOfVehicle;

	private CovCategory vehicleType;

	private OfficeVO rtaOffice;

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public MasterCovVO getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(MasterCovVO classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public CovCategory getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(CovCategory vehicleType) {
		this.vehicleType = vehicleType;
	}

	public OfficeVO getRtaOffice() {
		return rtaOffice;
	}

	public void setRtaOffice(OfficeVO rtaOffice) {
		this.rtaOffice = rtaOffice;
	}

}
