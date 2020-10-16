package org.epragati.master.vo;

import java.io.Serializable;


public class VahavMasterVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private VahanDetailsVO responseModel;
    private String responseType;
    private String errorDesc;
	/**
	 * @return the responseModel
	 */
	public VahanDetailsVO getResponseModel() {
		return responseModel;
	}
	/**
	 * @param responseModel the responseModel to set
	 */
	public void setResponseModel(VahanDetailsVO responseModel) {
		this.responseModel = responseModel;
	}
	/**
	 * @return the responseType
	 */
	public String getResponseType() {
		return responseType;
	}
	/**
	 * @param responseType the responseType to set
	 */
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}
	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VahavMasterDTO [responseModel=" + responseModel + ", responseType=" + responseType + ", errorDesc="
				+ errorDesc + "]";
	}
    
}
