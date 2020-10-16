package org.epragati.master.vo;

import java.io.Serializable;

public class VahanVehicleResponseVO implements Serializable{
	

    
	/**
	 * 
	 */
	private static final long serialVersionUID = 8236001950881823820L;
	private String status;
    private String httpStatus;
    private String message;
    private VahanVehicleDetailsVO result;
    private String errors;
    private String fieldErrors;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the result
	 */
	public VahanVehicleDetailsVO getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(VahanVehicleDetailsVO result) {
		this.result = result;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public String getFieldErrors() {
		return fieldErrors;
	}
	public void setFieldErrors(String fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

}
