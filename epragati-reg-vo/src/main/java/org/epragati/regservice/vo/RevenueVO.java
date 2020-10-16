package org.epragati.regservice.vo;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@XmlRootElement
public class RevenueVO {
	
	    private String applicationNo;
	    private String paymentCfstStatus;
		public String getPaymentCfstStatus() {
			return paymentCfstStatus;
		}
		public void setPaymentCfstStatus(String paymentCfstStatus) {
			this.paymentCfstStatus = paymentCfstStatus;
		}
		public String getApplicationNo() {
			return applicationNo;
		}
		public void setApplicationNo(String applicationNo) {
			this.applicationNo = applicationNo;
		}
		

}
