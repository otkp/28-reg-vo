package org.epragati.common.location.vo;

import java.io.Serializable;

public class PSResponceVO  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
  //  private String httpStatus;
    //private String message;
    private PrajasachivalayamResponseVO result;
   // private String errors;
   // private String fieldErrors;
	public PrajasachivalayamResponseVO getResult() {
		return result;
	}
	public void setResult(PrajasachivalayamResponseVO result) {
		this.result = result;
	}
//	public String getHttpStatus() {
//		return httpStatus;
//	}
//	public void setHttpStatus(String httpStatus) {
//		this.httpStatus = httpStatus;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public String getErrors() {
//		return errors;
//	}
//	public void setErrors(String errors) {
//		this.errors = errors;
//	}
//	public String getFieldErrors() {
//		return fieldErrors;
//	}
//	public void setFieldErrors(String fieldErrors) {
//		this.fieldErrors = fieldErrors;
//	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
