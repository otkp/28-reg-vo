package org.epragati.vcr.vo;

import java.io.Serializable;

public class SeizedAndDocumentImpoundedVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VehicleIeSeizedVO vehicleSeizedVO;
	private DocumentImpoundedVO documentImpoundedVO;
	public VehicleIeSeizedVO getVehicleSeizedVO() {
		return vehicleSeizedVO;
	}
	public void setVehicleSeizedVO(VehicleIeSeizedVO vehicleSeizedVO) {
		this.vehicleSeizedVO = vehicleSeizedVO;
	}
	public DocumentImpoundedVO getDocumentImpoundedVO() {
		return documentImpoundedVO;
	}
	public void setDocumentImpoundedVO(DocumentImpoundedVO documentImpoundedVO) {
		this.documentImpoundedVO = documentImpoundedVO;
	}
	

}
