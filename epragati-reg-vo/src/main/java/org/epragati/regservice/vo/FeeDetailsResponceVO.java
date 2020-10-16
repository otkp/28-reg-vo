package org.epragati.regservice.vo;

import org.epragati.payments.vo.FeeDetailsVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FeeDetailsResponceVO {
	
	private String status;

	private String httpStatus;

	private String message;

	private String errors;

	private String fieldErrors;

	private FeeDetailsVO result;

	
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

	public FeeDetailsVO getResult() {
		return result;
	}

	public void setResult(FeeDetailsVO result) {
		this.result = result;
	}
	
	

}
