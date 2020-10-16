package org.epragati.master.vo;

import java.io.Serializable;


/**
 * 
 * @author saroj.sahoo
 *
 */
public class PanResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean status;
	private String httpStatus;
	private  PanVO result;
	private String errors;
	private String fieldErrors;
	private String message;
	
	/**
	 * @return the status
	 */
	public boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
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
	 * @return the result
	 */
	public PanVO getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(PanVO result) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PanResponseVO [status=" + status + ", " + (httpStatus != null ? "httpStatus=" + httpStatus + ", " : "")
				+ (result != null ? "result=" + result + ", " : "") + (errors != null ? "errors=" + errors + ", " : "")
				+ (fieldErrors != null ? "fieldErrors=" + fieldErrors + ", " : "")
				+ (message != null ? "message=" + message : "") + "]";
	}
	
	
}
