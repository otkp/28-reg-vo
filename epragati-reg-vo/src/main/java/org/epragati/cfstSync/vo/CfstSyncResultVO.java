package org.epragati.cfstSync.vo;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

	
	@JsonInclude(Include.NON_NULL)
	public class CfstSyncResultVO {

		private String status;

		private String httpStatus;

		private String message;

		private String errors;

		private String fieldErrors;

		private Map<String,String> result;

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

		public Map<String, String> getResult() {
			return result;
		}

		public void setResult(Map<String, String> result) {
			this.result = result;
		}

}
