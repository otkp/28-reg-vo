package org.epragati.master.vo;

import java.io.Serializable;

public class VahanVehicleMasterVO implements Serializable{
	private static final long serialVersionUID = 4180400290259043105L;
	private VahanVehicleDetailsVO responseModel;
   
	public VahanVehicleDetailsVO getResponseModel() {
		return responseModel;
	}
	public void setResponseModel(VahanVehicleDetailsVO responseModel) {
		this.responseModel = responseModel;
	}
	
}
