package org.epragati.payments.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SBIResponce {
	
	private String sbi_ref_no;
	private String challan_No_1;
	private String check_Total;
	private String status;
	private String status_desc;
	private String dept_Name;
	private String nameOfRemitter;
	private String department_TransID_1;
	private String dept_code;
	private String hOA_1;
	private String hOA_1_Description;
	private String amount_1;
	private String credit_Account_1;
	private String department_TransID_2;
	private String challan_No_2;
	private String hOA_2;
	private String hOA_2_Description;
	private String amount_2;
	private String credit_Account_2;
	private String department_TransID_3;
	private String challan_No_3;
	private String hOA_3 ;
	private String hOA_3_Description;
	private String amount_3;
	private String credit_Account_3;
	private String department_TransID_4;
	private String challan_No_4;
	private String hOA_4;
	private String hOA_4_Description;
	private String amount_4;
	private String credit_Account_4;
	private String department_TransID_5;
	private String challan_No_5;
	private String hOA_5;
	private String hOA_5_Description;
	private String amount_5;
	private String credit_Account_5;
	private String other_Charges_TID_1;
	private String other_charges_Description_1;
	private String amount_6;
	private String credit_Account_6;
	private String other_Charges_TID_2;
	private String other_charges_Description_2;
	private String amount_7;
	private String credit_Account_7;
	private String dDO_Code;
	private String mode_of_Transaction;
	private String redirect_URL;
	private String ref_no;
	
	@JsonProperty("PG_TYPE")
	private String pgTYPE;
	private String card_no;
	private String name_on_card;
	private String addedon;
	private String unmappedstatus;
	private String Merchant_UTR;
	private String Settled_At;
	private String payment_source;
	private String cardnum;
	private String cardhash;
	private String hash;
	private String sbiRefId;
	private String appTransNo;
	
	private String error_Message;
	
	// For Verify
	private String Transaction_amount;
	private String transaction_No;
	private String checkSum;
	
	
	private Map<String, String> properties = new HashMap<>();
	private String additionalCharges;
	
	/**
	 * @return the sbi_ref_no
	 */
	public String getSbi_ref_no() {
		return sbi_ref_no;
	}
	/**
	 * @param sbi_ref_no the sbi_ref_no to set
	 */
	public void setSbi_ref_no(String sbi_ref_no) {
		this.sbi_ref_no = sbi_ref_no;
	}
	/**
	 * @return the challan_No_1
	 */
	public String getChallan_No_1() {
		return challan_No_1;
	}
	/**
	 * @param challan_No_1 the challan_No_1 to set
	 */
	public void setChallan_No_1(String challan_No_1) {
		this.challan_No_1 = challan_No_1;
	}
	/**
	 * @return the check_Total
	 */
	public String getCheck_Total() {
		return check_Total;
	}
	/**
	 * @param check_Total the check_Total to set
	 */
	public void setCheck_Total(String check_Total) {
		this.check_Total = check_Total;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the status_desc
	 */
	public String getStatus_desc() {
		return status_desc;
	}
	/**
	 * @param status_desc the status_desc to set
	 */
	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
	}
	/**
	 * @return the dept_Name
	 */
	public String getDept_Name() {
		return dept_Name;
	}
	/**
	 * @param dept_Name the dept_Name to set
	 */
	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	/**
	 * @return the nameOfRemitter
	 */
	public String getNameOfRemitter() {
		return nameOfRemitter;
	}
	/**
	 * @param nameOfRemitter the nameOfRemitter to set
	 */
	public void setNameOfRemitter(String nameOfRemitter) {
		this.nameOfRemitter = nameOfRemitter;
	}
	/**
	 * @return the department_TransID_1
	 */
	public String getDepartment_TransID_1() {
		return department_TransID_1;
	}
	/**
	 * @param department_TransID_1 the department_TransID_1 to set
	 */
	public void setDepartment_TransID_1(String department_TransID_1) {
		this.department_TransID_1 = department_TransID_1;
	}
	/**
	 * @return the dept_code
	 */
	public String getDept_code() {
		return dept_code;
	}
	/**
	 * @param dept_code the dept_code to set
	 */
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	/**
	 * @return the hOA_1
	 */
	public String gethOA_1() {
		return hOA_1;
	}
	/**
	 * @param hOA_1 the hOA_1 to set
	 */
	public void sethOA_1(String hOA_1) {
		this.hOA_1 = hOA_1;
	}
	/**
	 * @return the hOA_1_Description
	 */
	public String gethOA_1_Description() {
		return hOA_1_Description;
	}
	/**
	 * @param hOA_1_Description the hOA_1_Description to set
	 */
	public void sethOA_1_Description(String hOA_1_Description) {
		this.hOA_1_Description = hOA_1_Description;
	}
	/**
	 * @return the amount_1
	 */
	public String getAmount_1() {
		return amount_1;
	}
	/**
	 * @param amount_1 the amount_1 to set
	 */
	public void setAmount_1(String amount_1) {
		this.amount_1 = amount_1;
	}
	/**
	 * @return the credit_Account_1
	 */
	public String getCredit_Account_1() {
		return credit_Account_1;
	}
	/**
	 * @param credit_Account_1 the credit_Account_1 to set
	 */
	public void setCredit_Account_1(String credit_Account_1) {
		this.credit_Account_1 = credit_Account_1;
	}
	/**
	 * @return the department_TransID_2
	 */
	public String getDepartment_TransID_2() {
		return department_TransID_2;
	}
	/**
	 * @param department_TransID_2 the department_TransID_2 to set
	 */
	public void setDepartment_TransID_2(String department_TransID_2) {
		this.department_TransID_2 = department_TransID_2;
	}
	/**
	 * @return the challan_No_2
	 */
	public String getChallan_No_2() {
		return challan_No_2;
	}
	/**
	 * @param challan_No_2 the challan_No_2 to set
	 */
	public void setChallan_No_2(String challan_No_2) {
		this.challan_No_2 = challan_No_2;
	}
	/**
	 * @return the hOA_2
	 */
	public String gethOA_2() {
		return hOA_2;
	}
	/**
	 * @param hOA_2 the hOA_2 to set
	 */
	public void sethOA_2(String hOA_2) {
		this.hOA_2 = hOA_2;
	}
	/**
	 * @return the hOA_2_Description
	 */
	public String gethOA_2_Description() {
		return hOA_2_Description;
	}
	/**
	 * @param hOA_2_Description the hOA_2_Description to set
	 */
	public void sethOA_2_Description(String hOA_2_Description) {
		this.hOA_2_Description = hOA_2_Description;
	}
	/**
	 * @return the amount_2
	 */
	public String getAmount_2() {
		return amount_2;
	}
	/**
	 * @param amount_2 the amount_2 to set
	 */
	public void setAmount_2(String amount_2) {
		this.amount_2 = amount_2;
	}
	/**
	 * @return the credit_Account_2
	 */
	public String getCredit_Account_2() {
		return credit_Account_2;
	}
	/**
	 * @param credit_Account_2 the credit_Account_2 to set
	 */
	public void setCredit_Account_2(String credit_Account_2) {
		this.credit_Account_2 = credit_Account_2;
	}
	/**
	 * @return the department_TransID_3
	 */
	public String getDepartment_TransID_3() {
		return department_TransID_3;
	}
	/**
	 * @param department_TransID_3 the department_TransID_3 to set
	 */
	public void setDepartment_TransID_3(String department_TransID_3) {
		this.department_TransID_3 = department_TransID_3;
	}
	/**
	 * @return the challan_No_3
	 */
	public String getChallan_No_3() {
		return challan_No_3;
	}
	/**
	 * @param challan_No_3 the challan_No_3 to set
	 */
	public void setChallan_No_3(String challan_No_3) {
		this.challan_No_3 = challan_No_3;
	}
	/**
	 * @return the hOA_3
	 */
	public String gethOA_3() {
		return hOA_3;
	}
	/**
	 * @param hOA_3 the hOA_3 to set
	 */
	public void sethOA_3(String hOA_3) {
		this.hOA_3 = hOA_3;
	}
	/**
	 * @return the hOA_3_Description
	 */
	public String gethOA_3_Description() {
		return hOA_3_Description;
	}
	/**
	 * @param hOA_3_Description the hOA_3_Description to set
	 */
	public void sethOA_3_Description(String hOA_3_Description) {
		this.hOA_3_Description = hOA_3_Description;
	}
	/**
	 * @return the amount_3
	 */
	public String getAmount_3() {
		return amount_3;
	}
	/**
	 * @param amount_3 the amount_3 to set
	 */
	public void setAmount_3(String amount_3) {
		this.amount_3 = amount_3;
	}
	/**
	 * @return the credit_Account_3
	 */
	public String getCredit_Account_3() {
		return credit_Account_3;
	}
	/**
	 * @param credit_Account_3 the credit_Account_3 to set
	 */
	public void setCredit_Account_3(String credit_Account_3) {
		this.credit_Account_3 = credit_Account_3;
	}
	/**
	 * @return the department_TransID_4
	 */
	public String getDepartment_TransID_4() {
		return department_TransID_4;
	}
	/**
	 * @param department_TransID_4 the department_TransID_4 to set
	 */
	public void setDepartment_TransID_4(String department_TransID_4) {
		this.department_TransID_4 = department_TransID_4;
	}
	/**
	 * @return the challan_No_4
	 */
	public String getChallan_No_4() {
		return challan_No_4;
	}
	/**
	 * @param challan_No_4 the challan_No_4 to set
	 */
	public void setChallan_No_4(String challan_No_4) {
		this.challan_No_4 = challan_No_4;
	}
	/**
	 * @return the hOA_4
	 */
	public String gethOA_4() {
		return hOA_4;
	}
	/**
	 * @param hOA_4 the hOA_4 to set
	 */
	public void sethOA_4(String hOA_4) {
		this.hOA_4 = hOA_4;
	}
	/**
	 * @return the hOA_4_Description
	 */
	public String gethOA_4_Description() {
		return hOA_4_Description;
	}
	/**
	 * @param hOA_4_Description the hOA_4_Description to set
	 */
	public void sethOA_4_Description(String hOA_4_Description) {
		this.hOA_4_Description = hOA_4_Description;
	}
	/**
	 * @return the amount_4
	 */
	public String getAmount_4() {
		return amount_4;
	}
	/**
	 * @param amount_4 the amount_4 to set
	 */
	public void setAmount_4(String amount_4) {
		this.amount_4 = amount_4;
	}
	/**
	 * @return the credit_Account_4
	 */
	public String getCredit_Account_4() {
		return credit_Account_4;
	}
	/**
	 * @param credit_Account_4 the credit_Account_4 to set
	 */
	public void setCredit_Account_4(String credit_Account_4) {
		this.credit_Account_4 = credit_Account_4;
	}
	/**
	 * @return the department_TransID_5
	 */
	public String getDepartment_TransID_5() {
		return department_TransID_5;
	}
	/**
	 * @param department_TransID_5 the department_TransID_5 to set
	 */
	public void setDepartment_TransID_5(String department_TransID_5) {
		this.department_TransID_5 = department_TransID_5;
	}
	/**
	 * @return the challan_No_5
	 */
	public String getChallan_No_5() {
		return challan_No_5;
	}
	/**
	 * @param challan_No_5 the challan_No_5 to set
	 */
	public void setChallan_No_5(String challan_No_5) {
		this.challan_No_5 = challan_No_5;
	}
	/**
	 * @return the hOA_5
	 */
	public String gethOA_5() {
		return hOA_5;
	}
	/**
	 * @param hOA_5 the hOA_5 to set
	 */
	public void sethOA_5(String hOA_5) {
		this.hOA_5 = hOA_5;
	}
	/**
	 * @return the hOA_5_Description
	 */
	public String gethOA_5_Description() {
		return hOA_5_Description;
	}
	/**
	 * @param hOA_5_Description the hOA_5_Description to set
	 */
	public void sethOA_5_Description(String hOA_5_Description) {
		this.hOA_5_Description = hOA_5_Description;
	}
	/**
	 * @return the amount_5
	 */
	public String getAmount_5() {
		return amount_5;
	}
	/**
	 * @param amount_5 the amount_5 to set
	 */
	public void setAmount_5(String amount_5) {
		this.amount_5 = amount_5;
	}
	/**
	 * @return the credit_Account_5
	 */
	public String getCredit_Account_5() {
		return credit_Account_5;
	}
	/**
	 * @param credit_Account_5 the credit_Account_5 to set
	 */
	public void setCredit_Account_5(String credit_Account_5) {
		this.credit_Account_5 = credit_Account_5;
	}
	/**
	 * @return the other_Charges_TID_1
	 */
	public String getOther_Charges_TID_1() {
		return other_Charges_TID_1;
	}
	/**
	 * @param other_Charges_TID_1 the other_Charges_TID_1 to set
	 */
	public void setOther_Charges_TID_1(String other_Charges_TID_1) {
		this.other_Charges_TID_1 = other_Charges_TID_1;
	}
	/**
	 * @return the other_charges_Description_1
	 */
	public String getOther_charges_Description_1() {
		return other_charges_Description_1;
	}
	/**
	 * @param other_charges_Description_1 the other_charges_Description_1 to set
	 */
	public void setOther_charges_Description_1(String other_charges_Description_1) {
		this.other_charges_Description_1 = other_charges_Description_1;
	}
	/**
	 * @return the amount_6
	 */
	public String getAmount_6() {
		return amount_6;
	}
	/**
	 * @param amount_6 the amount_6 to set
	 */
	public void setAmount_6(String amount_6) {
		this.amount_6 = amount_6;
	}
	/**
	 * @return the credit_Account_6
	 */
	public String getCredit_Account_6() {
		return credit_Account_6;
	}
	/**
	 * @param credit_Account_6 the credit_Account_6 to set
	 */
	public void setCredit_Account_6(String credit_Account_6) {
		this.credit_Account_6 = credit_Account_6;
	}
	/**
	 * @return the other_Charges_TID_2
	 */
	public String getOther_Charges_TID_2() {
		return other_Charges_TID_2;
	}
	/**
	 * @param other_Charges_TID_2 the other_Charges_TID_2 to set
	 */
	public void setOther_Charges_TID_2(String other_Charges_TID_2) {
		this.other_Charges_TID_2 = other_Charges_TID_2;
	}
	/**
	 * @return the other_charges_Description_2
	 */
	public String getOther_charges_Description_2() {
		return other_charges_Description_2;
	}
	/**
	 * @param other_charges_Description_2 the other_charges_Description_2 to set
	 */
	public void setOther_charges_Description_2(String other_charges_Description_2) {
		this.other_charges_Description_2 = other_charges_Description_2;
	}
	/**
	 * @return the amount_7
	 */
	public String getAmount_7() {
		return amount_7;
	}
	/**
	 * @param amount_7 the amount_7 to set
	 */
	public void setAmount_7(String amount_7) {
		this.amount_7 = amount_7;
	}
	/**
	 * @return the credit_Account_7
	 */
	public String getCredit_Account_7() {
		return credit_Account_7;
	}
	/**
	 * @param credit_Account_7 the credit_Account_7 to set
	 */
	public void setCredit_Account_7(String credit_Account_7) {
		this.credit_Account_7 = credit_Account_7;
	}
	/**
	 * @return the dDO_Code
	 */
	public String getdDO_Code() {
		return dDO_Code;
	}
	/**
	 * @param dDO_Code the dDO_Code to set
	 */
	public void setdDO_Code(String dDO_Code) {
		this.dDO_Code = dDO_Code;
	}
	/**
	 * @return the mode_of_Transaction
	 */
	public String getMode_of_Transaction() {
		return mode_of_Transaction;
	}
	/**
	 * @param mode_of_Transaction the mode_of_Transaction to set
	 */
	public void setMode_of_Transaction(String mode_of_Transaction) {
		this.mode_of_Transaction = mode_of_Transaction;
	}
	/**
	 * @return the redirect_URL
	 */
	public String getRedirect_URL() {
		return redirect_URL;
	}
	/**
	 * @param redirect_URL the redirect_URL to set
	 */
	public void setRedirect_URL(String redirect_URL) {
		this.redirect_URL = redirect_URL;
	}
	/**
	 * @return the pgTYPE
	 */
	public String getPgTYPE() {
		return pgTYPE;
	}
	/**
	 * @param pgTYPE the pgTYPE to set
	 */
	public void setPgTYPE(String pgTYPE) {
		this.pgTYPE = pgTYPE;
	}
	/**
	 * @return the card_no
	 */
	public String getCard_no() {
		return card_no;
	}
	/**
	 * @param card_no the card_no to set
	 */
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	/**
	 * @return the name_on_card
	 */
	public String getName_on_card() {
		return name_on_card;
	}
	/**
	 * @param name_on_card the name_on_card to set
	 */
	public void setName_on_card(String name_on_card) {
		this.name_on_card = name_on_card;
	}
	/**
	 * @return the addedon
	 */
	public String getAddedon() {
		return addedon;
	}
	/**
	 * @param addedon the addedon to set
	 */
	public void setAddedon(String addedon) {
		this.addedon = addedon;
	}
	/**
	 * @return the unmappedstatus
	 */
	public String getUnmappedstatus() {
		return unmappedstatus;
	}
	/**
	 * @param unmappedstatus the unmappedstatus to set
	 */
	public void setUnmappedstatus(String unmappedstatus) {
		this.unmappedstatus = unmappedstatus;
	}
	/**
	 * @return the merchant_UTR
	 */
	public String getMerchant_UTR() {
		return Merchant_UTR;
	}
	/**
	 * @param merchant_UTR the merchant_UTR to set
	 */
	public void setMerchant_UTR(String merchant_UTR) {
		Merchant_UTR = merchant_UTR;
	}
	/**
	 * @return the settled_At
	 */
	public String getSettled_At() {
		return Settled_At;
	}
	/**
	 * @param settled_At the settled_At to set
	 */
	public void setSettled_At(String settled_At) {
		Settled_At = settled_At;
	}
	/**
	 * @return the payment_source
	 */
	public String getPayment_source() {
		return payment_source;
	}
	/**
	 * @param payment_source the payment_source to set
	 */
	public void setPayment_source(String payment_source) {
		this.payment_source = payment_source;
	}
	/**
	 * @return the cardnum
	 */
	public String getCardnum() {
		return cardnum;
	}
	/**
	 * @param cardnum the cardnum to set
	 */
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	/**
	 * @return the cardhash
	 */
	public String getCardhash() {
		return cardhash;
	}
	/**
	 * @param cardhash the cardhash to set
	 */
	public void setCardhash(String cardhash) {
		this.cardhash = cardhash;
	}
	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}
	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	/**
	 * @return the sbiRefId
	 */
	public String getSbiRefId() {
		return sbiRefId;
	}
	/**
	 * @param sbiRefId the sbiRefId to set
	 */
	public void setSbiRefId(String sbiRefId) {
		this.sbiRefId = sbiRefId;
	}
	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	/**
	 * @return the additionalCharges
	 */
	public String getAdditionalCharges() {
		return additionalCharges;
	}
	/**
	 * @param additionalCharges the additionalCharges to set
	 */
	public void setAdditionalCharges(String additionalCharges) {
		this.additionalCharges = additionalCharges;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @return the ref_no
	 */
	public String getRef_no() {
		return ref_no;
	}
	/**
	 * @param ref_no the ref_no to set
	 */
	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @return the error_Message
	 */
	public String getError_Message() {
		return error_Message;
	}
	/**
	 * @param error_Message the error_Message to set
	 */
	public void setError_Message(String error_Message) {
		this.error_Message = error_Message;
	}
	
	/**
	 * @return the transaction_amount
	 */
	public String getTransaction_amount() {
		return Transaction_amount;
	}
	/**
	 * @param transaction_amount the transaction_amount to set
	 */
	public void setTransaction_amount(String transaction_amount) {
		Transaction_amount = transaction_amount;
	}
	/**
	 * @return the transaction_No
	 */
	public String getTransaction_No() {
		return transaction_No;
	}
	/**
	 * @param transaction_No the transaction_No to set
	 */
	public void setTransaction_No(String transaction_No) {
		this.transaction_No = transaction_No;
	}
	/**
	 * @return the checkSum
	 */
	public String getCheckSum() {
		return checkSum;
	}
	/**
	 * @param checkSum the checkSum to set
	 */
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	
	
	@Override
	public String toString() {
		return "SBIResponce [sbi_ref_no=" + sbi_ref_no + ", challan_No_1="
				+ challan_No_1 + ", check_Total=" + check_Total + ", status=" + status + ", status_desc=" + status_desc
				+ ", dept_Name=" + dept_Name + ", nameOfRemitter=" + nameOfRemitter + ", department_TransID_1="
				+ department_TransID_1 + ", dept_code=" + dept_code + ", hOA_1=" + hOA_1 + ", hOA_1_Description="
				+ hOA_1_Description + ", amount_1=" + amount_1 + ", credit_Account_1=" + credit_Account_1
				+ ", department_TransID_2=" + department_TransID_2 + ", challan_No_2=" + challan_No_2 + ", hOA_2="
				+ hOA_2 + ", hOA_2_Description=" + hOA_2_Description + ", amount_2=" + amount_2 + ", credit_Account_2="
				+ credit_Account_2 + ", department_TransID_3=" + department_TransID_3 + ", challan_No_3=" + challan_No_3
				+ ", hOA_3=" + hOA_3 + ", hOA_3_Description=" + hOA_3_Description + ", amount_3=" + amount_3
				+ ", credit_Account_3=" + credit_Account_3 + ", department_TransID_4=" + department_TransID_4
				+ ", challan_No_4=" + challan_No_4 + ", hOA_4=" + hOA_4 + ", hOA_4_Description=" + hOA_4_Description
				+ ", amount_4=" + amount_4 + ", credit_Account_4=" + credit_Account_4 + ", department_TransID_5="
				+ department_TransID_5 + ", challan_No_5=" + challan_No_5 + ", hOA_5=" + hOA_5 + ", hOA_5_Description="
				+ hOA_5_Description + ", amount_5=" + amount_5 + ", credit_Account_5=" + credit_Account_5
				+ ", other_Charges_TID_1=" + other_Charges_TID_1 + ", other_charges_Description_1="
				+ other_charges_Description_1 + ", amount_6=" + amount_6 + ", credit_Account_6=" + credit_Account_6
				+ ", other_Charges_TID_2=" + other_Charges_TID_2 + ", other_charges_Description_2="
				+ other_charges_Description_2 + ", amount_7=" + amount_7 + ", credit_Account_7=" + credit_Account_7
				+ ", dDO_Code=" + dDO_Code + ", mode_of_Transaction=" + mode_of_Transaction + ", redirect_URL="
				+ redirect_URL + ", ref_no=" + ref_no + ", pgTYPE=" + pgTYPE + ", card_no=" + card_no
				+ ", name_on_card=" + name_on_card + ", addedon=" + addedon + ", unmappedstatus=" + unmappedstatus
				+ ", Merchant_UTR=" + Merchant_UTR + ", Settled_At=" + Settled_At + ", payment_source=" + payment_source
				+ ", cardnum=" + cardnum + ", cardhash=" + cardhash + ", hash=" + hash + ", sbiRefId=" + sbiRefId
				+ ", appTransNo=" + appTransNo + ", error_Message=" + error_Message + ", Transaction_amount=" 
				+ Transaction_amount + ", transaction_No=" + transaction_No + ", checkSum="
				+ checkSum + ", properties=" + properties + ", additionalCharges=" + additionalCharges + "]";
	}
	
	
}
