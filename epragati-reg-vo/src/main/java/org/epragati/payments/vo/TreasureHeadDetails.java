package org.epragati.payments.vo;

public class TreasureHeadDetails {

	private Long challanNo;
	private String deptCode;
	private String txtId;
	private String dateOfTxt;
	private String pos;
	private String bankRefNo;
	private Double amount;
	private String remitterName;
	private String headOfAccount;
	private String ddoCode;
	private String hoaDesc;
	private String creditAccount;

	public Long getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(Long challanNo) {
		this.challanNo = challanNo;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getTxtId() {
		return txtId;
	}

	public void setTxtId(String txtId) {
		this.txtId = txtId;
	}

	public String getDateOfTxt() {
		return dateOfTxt;
	}

	public void setDateOfTxt(String dateOfTxt) {
		this.dateOfTxt = dateOfTxt;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getBankRefNo() {
		return bankRefNo;
	}

	public void setBankRefNo(String bankRefNo) {
		this.bankRefNo = bankRefNo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getRemitterName() {
		return remitterName;
	}

	public void setRemitterName(String remitterName) {
		this.remitterName = remitterName;
	}

	public String getHeadOfAccount() {
		return headOfAccount;
	}

	public void setHeadOfAccount(String headOfAccount) {
		this.headOfAccount = headOfAccount;
	}

	public String getDdoCode() {
		return ddoCode;
	}

	public void setDdoCode(String ddoCode) {
		this.ddoCode = ddoCode;
	}

	/**
	 * @return the hoaDesc
	 */
	public String getHoaDesc() {
		return hoaDesc;
	}

	/**
	 * @param hoaDesc the hoaDesc to set
	 */
	public void setHoaDesc(String hoaDesc) {
		this.hoaDesc = hoaDesc;
	}
	
	/**
	 * @return the creditAccount
	 */
	public String getCreditAccount() {
		return creditAccount;
	}

	/**
	 * @param creditAccount the creditAccount to set
	 */
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreasureHeadDetails [challanNo=" + challanNo + ", deptCode=" + deptCode + ", txtId=" + txtId
				+ ", dateOfTxt=" + dateOfTxt + ", pos=" + pos + ", bankRefNo=" + bankRefNo + ", amount=" + amount
				+ ", remitterName=" + remitterName + ", headOfAccount=" + headOfAccount + ", ddoCode=" + ddoCode
				+ ", hoaDesc=" + hoaDesc + ", creditAccount=" + creditAccount + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	
	
	

}
