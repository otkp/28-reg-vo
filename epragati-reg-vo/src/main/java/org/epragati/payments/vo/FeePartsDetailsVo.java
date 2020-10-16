package org.epragati.payments.vo;

import java.util.Map;

import org.epragati.util.payment.ServiceEnum;

/**
 * FeePartsDetailsVo methods used for maintain
 * amount details
 * @author naga.pulaparthi
 *
 */
public class FeePartsDetailsVo {

	//FEE applicant fee variables.
	private Double amount=0.0;
	private String HOA;
	
	private String Credit_Account;
	private Map<ServiceEnum,Double> serviceWise;
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the hOA
	 */
	public String getHOA() {
		return HOA;
	}

	/**
	 * @param hOA the hOA to set
	 */
	public void setHOA(String hOA) {
		HOA = hOA;
	}

	/**
	 * @return the credit_Account
	 */
	public String getCredit_Account() {
		return Credit_Account;
	}

	/**
	 * @param credit_Account the credit_Account to set
	 */
	public void setCredit_Account(String credit_Account) {
		Credit_Account = credit_Account;
	}

	public Map<ServiceEnum, Double> getServiceWise() {
		return serviceWise;
	}

	public void setServiceWise(Map<ServiceEnum, Double> serviceWise) {
		this.serviceWise = serviceWise;
	}



	


	/*//OTHER_RECEIPTS variables
	private Double amount2=0.0;
	private String HOA_2;
	private String HOA_2_Description;

	//QLY_TAX variables
	private Double amount3=0.0;
	private String HOA_3;
	private String HOA_3_Description;

	//LIFE_TAX variables
	private Double amount4=0.0;
	private String HOA_4;
	private String HOA_4_Description;

	//GREEN_TAX variables
	private Double amount5=0.0;
	private String HOA_5;
	private String HOA_5_Description;

	//SERVICE_FEE variables
	private Double amount6=0.0;
	private String HOA_6;
	private String HOA_6_Description;

	//POSTAL_FEE variables
	private Double amount7=0.0;
	private String HOA_7;
	private String HOA_7_Description;

	//TEST_FEE variables
	private Double amount8=0.0; //this amount also will be include to amount1 as applicant fee while headers preparation.
	private String HOA_8;
	private String HOA_8_Description;
	
	//CARD_FEE variables
	private Double amount9=0.0; //this amount also will be include to amount1 as applicant fee while headers preparation .
	private String HOA_9;
	private String HOA_9_Description;
	
	


//NOTE: IF you add extra fee type need to add in total amount
	public Double totalAmount(){
		return this.amount1+this.amount2+this.amount3+this.amount4
				+this.amount5+this.amount6+this.amount7+this.amount8+this.amount9;
	}
	*//**
	 * @return the amount1 //FEE applicant fee variables.
	 *//*
	public Double getAmount1() {
		return amount1;
	}
	*//**
	 * //FEE applicant fee variables.
	 * @param amount1 the amount1 to set
	 *//*
	public void setAmount1(Double amount1) {
		this.amount1 = amount1;
	}
	*//**
	 * @return the hOA_1
	 *//*
	public String getHOA_1() {
		return HOA_1;
	}
	*//**
	 * @param hOA_1 the hOA_1 to set
	 *//*
	public void setHOA_1(String hOA_1) {
		HOA_1 = hOA_1;
	}
	*//**
	 * @return the hOA_1_Description
	 *//*
	public String getHOA_1_Description() {
		return HOA_1_Description;
	}
	*//**
	 * @param hOA_1_Description the hOA_1_Description to set
	 *//*
	public void setHOA_1_Description(String hOA_1_Description) {
		HOA_1_Description = hOA_1_Description;
	}
	*//**
	 * @return the credit_Account_1
	 *//*
	*//**
	 * @return the credit_Account
	 *//*
	public String getCredit_Account() {
		return Credit_Account;
	}
	*//**
	 * @param credit_Account the credit_Account to set
	 *//*
	public void setCredit_Account(String credit_Account) {
		Credit_Account = credit_Account;
	}
	*//**
	 * @return the amount2
	 *//*
	public Double getAmount2() {
		return amount2;
	}
	*//**
	 * @param amount2 the amount2 to set
	 *//*
	public void setAmount2(Double amount2) {
		this.amount2 = amount2;
	}
	*//**
	 * @return the hOA_2
	 *//*
	public String getHOA_2() {
		return HOA_2;
	}
	*//**
	 * @param hOA_2 the hOA_2 to set
	 *//*
	public void setHOA_2(String hOA_2) {
		HOA_2 = hOA_2;
	}
	*//**
	 * @return the hOA_2_Description
	 *//*
	public String getHOA_2_Description() {
		return HOA_2_Description;
	}
	*//**
	 * @param hOA_2_Description the hOA_2_Description to set
	 *//*
	public void setHOA_2_Description(String hOA_2_Description) {
		HOA_2_Description = hOA_2_Description;
	}
	*//**
	 * @return the amount3
	 *//*
	public Double getAmount3() {
		return amount3;
	}
	*//**
	 * @param amount3 the amount3 to set
	 *//*
	public void setAmount3(Double amount3) {
		this.amount3 = amount3;
	}
	*//**
	 * @return the hOA_3
	 *//*
	public String getHOA_3() {
		return HOA_3;
	}
	*//**
	 * @param hOA_3 the hOA_3 to set
	 *//*
	public void setHOA_3(String hOA_3) {
		HOA_3 = hOA_3;
	}
	*//**
	 * @return the hOA_3_Description
	 *//*
	public String getHOA_3_Description() {
		return HOA_3_Description;
	}
	*//**
	 * @param hOA_3_Description the hOA_3_Description to set
	 *//*
	public void setHOA_3_Description(String hOA_3_Description) {
		HOA_3_Description = hOA_3_Description;
	}
	*//**
	 * @return the amount4
	 *//*
	public Double getAmount4() {
		return amount4;
	}
	*//**
	 * @param amount4 the amount4 to set
	 *//*
	public void setAmount4(Double amount4) {
		this.amount4 = amount4;
	}
	*//**
	 * @return the hOA_4
	 *//*
	public String getHOA_4() {
		return HOA_4;
	}
	*//**
	 * @param hOA_4 the hOA_4 to set
	 *//*
	public void setHOA_4(String hOA_4) {
		HOA_4 = hOA_4;
	}
	*//**
	 * @return the hOA_4_Description
	 *//*
	public String getHOA_4_Description() {
		return HOA_4_Description;
	}
	*//**
	 * @param hOA_4_Description the hOA_4_Description to set
	 *//*
	public void setHOA_4_Description(String hOA_4_Description) {
		HOA_4_Description = hOA_4_Description;
	}
	*//**
	 * @return the amount5
	 *//*
	public Double getAmount5() {
		return amount5;
	}
	*//**
	 * @param amount5 the amount5 to set
	 *//*
	public void setAmount5(Double amount5) {
		this.amount5 = amount5;
	}
	*//**
	 * @return the hOA_5
	 *//*
	public String getHOA_5() {
		return HOA_5;
	}
	*//**
	 * @param hOA_5 the hOA_5 to set
	 *//*
	public void setHOA_5(String hOA_5) {
		HOA_5 = hOA_5;
	}
	*//**
	 * @return the hOA_5_Description
	 *//*
	public String getHOA_5_Description() {
		return HOA_5_Description;
	}
	*//**
	 * @param hOA_5_Description the hOA_5_Description to set
	 *//*
	public void setHOA_5_Description(String hOA_5_Description) {
		HOA_5_Description = hOA_5_Description;
	}
	*//**
	 * @return the amount6
	 *//*
	public Double getAmount6() {
		return amount6;
	}
	*//**
	 * @param amount6 the amount6 to set
	 *//*
	public void setAmount6(Double amount6) {
		this.amount6 = amount6;
	}
	*//**
	 * @return the hOA_6
	 *//*
	public String getHOA_6() {
		return HOA_6;
	}
	*//**
	 * @param hOA_6 the hOA_6 to set
	 *//*
	public void setHOA_6(String hOA_6) {
		HOA_6 = hOA_6;
	}
	*//**
	 * @return the hOA_6_Description
	 *//*
	public String getHOA_6_Description() {
		return HOA_6_Description;
	}
	*//**
	 * @param hOA_6_Description the hOA_6_Description to set
	 *//*
	public void setHOA_6_Description(String hOA_6_Description) {
		HOA_6_Description = hOA_6_Description;
	}
	*//**
	 * @return the amount7
	 *//*
	public Double getAmount7() {
		return amount7;
	}
	*//**
	 * @param amount7 the amount7 to set
	 *//*
	public void setAmount7(Double amount7) {
		this.amount7 = amount7;
	}
	*//**
	 * @return the hOA_7
	 *//*
	public String getHOA_7() {
		return HOA_7;
	}
	*//**
	 * @param hOA_7 the hOA_7 to set
	 *//*
	public void setHOA_7(String hOA_7) {
		HOA_7 = hOA_7;
	}
	*//**
	 * @return the hOA_7_Description
	 *//*
	public String getHOA_7_Description() {
		return HOA_7_Description;
	}
	*//**
	 * @param hOA_7_Description the hOA_7_Description to set
	 *//*
	public void setHOA_7_Description(String hOA_7_Description) {
		HOA_7_Description = hOA_7_Description;
	}
	*//**
	 * @return the amount8
	 *//*
	public Double getAmount8() {
		return amount8;
	}
	*//**
	 * @param amount8 the amount8 to set
	 *//*
	public void setAmount8(Double amount8) {
		this.amount8 = amount8;
	}
	*//**
	 * @return the hOA_8
	 *//*
	public String getHOA_8() {
		return HOA_8;
	}
	*//**
	 * @param hOA_8 the hOA_8 to set
	 *//*
	public void setHOA_8(String hOA_8) {
		HOA_8 = hOA_8;
	}
	*//**
	 * @return the hOA_8_Description
	 *//*
	public String getHOA_8_Description() {
		return HOA_8_Description;
	}
	*//**
	 * @param hOA_8_Description the hOA_8_Description to set
	 *//*
	public void setHOA_8_Description(String hOA_8_Description) {
		HOA_8_Description = hOA_8_Description;
	}
	*//**
	 * @return the amount9
	 *//*
	public Double getAmount9() {
		return amount9;
	}
	*//**
	 * @param amount9 the amount9 to set
	 *//*
	public void setAmount9(Double amount9) {
		this.amount9 = amount9;
	}
	*//**
	 * @return the hOA_9
	 *//*
	public String getHOA_9() {
		return HOA_9;
	}
	*//**
	 * @param hOA_9 the hOA_9 to set
	 *//*
	public void setHOA_9(String hOA_9) {
		HOA_9 = hOA_9;
	}
	*//**
	 * @return the hOA_9_Description
	 *//*
	public String getHOA_9_Description() {
		return HOA_9_Description;
	}
	*//**
	 * @param hOA_9_Description the hOA_9_Description to set
	 *//*
	public void setHOA_9_Description(String hOA_9_Description) {
		HOA_9_Description = hOA_9_Description;
	}*/
	
	
	

}
