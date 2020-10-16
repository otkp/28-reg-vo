package org.epragati.payments.vo;

public class PayuPaymentPart {

	private String name;
	private String merchantId;
	private String value;
	private String commission;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PayuPaymentPart [" + (name != null ? "name=" + name + ", " : "")
				+ (merchantId != null ? "merchantId=" + merchantId + ", " : "")
				+ (value != null ? "value=" + value + ", " : "")
				+ (commission != null ? "commission=" + commission + ", " : "")
				+ (description != null ? "description=" + description : "") + "]";
	}

	
	

}
