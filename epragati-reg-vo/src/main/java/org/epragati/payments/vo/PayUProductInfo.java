package org.epragati.payments.vo;

import java.util.List;

public class PayUProductInfo {

	private List<TreasureHeadDetails> treasureHeads;
	private List<PayuPaymentPart> paymentParts;
	
	//appTransNo is a application transaction reference  number(Data primary Key)
	private String appTransNo;

	public List<TreasureHeadDetails> getTreasureHeads() {
		return treasureHeads;
	}

	public void setTreasureHeads(List<TreasureHeadDetails> treasureHeads) {
		this.treasureHeads = treasureHeads;
	}

	public List<PayuPaymentPart> getPaymentParts() {
		return paymentParts;
	}

	public void setPaymentParts(List<PayuPaymentPart> paymentParts) {
		this.paymentParts = paymentParts;
	}

	/**
	 * @return the appTransNo
	 */
	public String getAppTransNo() {
		return appTransNo;
	}

	/**
	 * @param appTransNo the appTransNo to set
	 */
	public void setAppTransNo(String appTransNo) {
		this.appTransNo = appTransNo;
	}
	

}
