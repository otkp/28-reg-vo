package org.epragati.master.vo;

import java.io.Serializable;

public class DLResponceVO implements Serializable {

	private static final long serialVersionUID = 1L;

    private String status;
    private String httpStatus;
    private String message;
    private DlDetailsVO result;
    private String errors;
    private String fieldErrors;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the httpStatus
	 */
	public String getHttpStatus() {
		return httpStatus;
	}
	/**
	 * @param httpStatus the httpStatus to set
	 */
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the result
	 */
	public DlDetailsVO getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(DlDetailsVO result) {
		this.result = result;
	}
	/**
	 * @return the errors
	 */
	public String getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(String errors) {
		this.errors = errors;
	}
	/**
	 * @return the fieldErrors
	 */
	public String getFieldErrors() {
		return fieldErrors;
	}
	/**
	 * @param fieldErrors the fieldErrors to set
	 */
	public void setFieldErrors(String fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
    
    

}
