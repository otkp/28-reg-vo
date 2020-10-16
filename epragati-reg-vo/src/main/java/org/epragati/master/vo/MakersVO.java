package org.epragati.master.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

	public class MakersVO {

		private Integer mmId;
		private Integer rId;
		private String makername;
		private Boolean status;
		/**
		 * @return the mmId
		 */
		public Integer getMmId() {
			return mmId;
		}
		/**
		 * @param mmId the mmId to set
		 */
		public void setMmId(Integer mmId) {
			this.mmId = mmId;
		}
		/**
		 * @return the rId
		 */
		public Integer getrId() {
			return rId;
		}
		/**
		 * @param rId the rId to set
		 */
		public void setrId(Integer rId) {
			this.rId = rId;
		}
		/**
		 * @return the makername
		 */
		public String getMakername() {
			return makername;
		}
		/**
		 * @param makername the makername to set
		 */
		public void setMakername(String makername) {
			this.makername = makername;
		}
		/**
		 * @return the status
		 */
		public Boolean getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(Boolean status) {
			this.status = status;
		}

}