package org.epragati.elastic.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RtaSearchResponse extends SearchResponse {

	private Boolean secondvehicleisnotrequired;

	private String status;

	private String httpStatus;

	private String message;

	private String errors;

	private String fieldErrors;

	private List<RtaDetails> rtaDetails;

	/**
	 * @return the rtaDetails
	 */
	public List<RtaDetails> getRtaDetails() {
		return rtaDetails;
	}

	/**
	 * @param rtaDetails
	 *            the rtaDetails to set
	 */
	public void setRtaDetails(List<RtaDetails> rtaDetails) {
		this.rtaDetails = rtaDetails;
	}

	/**
	 * @return the secondvehicleisnotrequired
	 */
	public Boolean getSecondvehicleisnotrequired() {
		return secondvehicleisnotrequired;
	}

	/**
	 * @param secondvehicleisnotrequired
	 *            the secondvehicleisnotrequired to set
	 */
	public void setSecondvehicleisnotrequired(Boolean secondvehicleisnotrequired) {
		this.secondvehicleisnotrequired = secondvehicleisnotrequired;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
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

}
