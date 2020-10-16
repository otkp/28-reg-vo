package org.epragati.payments.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PaymentsResponseVO {

	private Boolean status;

	private String httpStatus;

	private String message;

	private String errors;

	private String fieldErrors;

	private TransactionDetailVO result;

	private String errorIds;


	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the httpStatus
	 */
	public String getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
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
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the errors
	 */
	public String getErrors() {
		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
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
	 * @param fieldErrors
	 *            the fieldErrors to set
	 */
	public void setFieldErrors(String fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	/**
	 * @return the result
	 */
	public TransactionDetailVO getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(TransactionDetailVO result) {
		this.result = result;
	}

	/**
	 * @return the errorIds
	 */
	public String getErrorIds() {
		return errorIds;
	}

	/**
	 * @param errorIds
	 *            the errorIds to set
	 */
	public void setErrorIds(String errorIds) {
		this.errorIds = errorIds;
	}

}
