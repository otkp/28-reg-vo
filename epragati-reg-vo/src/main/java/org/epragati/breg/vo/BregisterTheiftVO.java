package org.epragati.breg.vo;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.util.payment.ServiceEnum;
import org.springframework.stereotype.Component;

@Component
	public class BregisterTheiftVO {
		
		private String intiObjDate;
		private String revocationDate;
		private String objRemarks;
		private String revRemarks;
		private String  serviceStatus;
		
		
		public String getIntiObjDate() {
			return intiObjDate;
		}
		public void setIntiObjDate(String intiObjDate) {
			this.intiObjDate = intiObjDate;
		}
		public String getRevocationDate() {
			return revocationDate;
		}
		public void setRevocationDate(String revocationDate) {
			this.revocationDate = revocationDate;
		}
		public String getObjRemarks() {
			return objRemarks;
		}
		public void setObjRemarks(String objRemarks) {
			this.objRemarks = objRemarks;
		}
		public String getRevRemarks() {
			return revRemarks;
		}
		public void setRevRemarks(String revRemarks) {
			this.revRemarks = revRemarks;
		}
		public String getServiceStatus() {
			return serviceStatus;
		}
		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}
			
		

	}

