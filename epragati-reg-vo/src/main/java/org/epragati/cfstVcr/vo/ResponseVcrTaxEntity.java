package org.epragati.cfstVcr.vo;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class ResponseVcrTaxEntity {
	
	private String status;
	
	private String httpStatus;
	
	private String message;
	
	private String errors;
	
	private String fieldErrors;
	
	private TaxPaidVCRDetailsVO result;
	
	private String errorIds;
	
	/**
	 * @return the errorIds
	 */
	public String getErrorIds() {
		return errorIds;
	}

	/**
	 * @param errorIds the errorIds to set
	 */
	public void setErrorIds(String errorIds) {
		this.errorIds = errorIds;
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
	public TaxPaidVCRDetailsVO getResult() {
		return result;
	}

	public void setResult(TaxPaidVCRDetailsVO result) {
		this.result = result;
	}
	}
