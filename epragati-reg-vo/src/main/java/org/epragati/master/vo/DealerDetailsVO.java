package org.epragati.master.vo;

/**
 * @author saroj.sahoo
 *
 */
public class DealerDetailsVO {

	private String applicationNo;
	
	private String dealerId;

	private String dealerName;

	private String registeredWith;

	private String representedBy;

	private ContactVO contact;

	private ApplicantAddressVO address;

	private DealerVehicalDetailsVO vehicalDetails;

	private BankDetailsVO bankDetails;
	
	private OfficeVO officeDetails;

	private String premisesDetail;

	private String makersName;

	private String makerClass;

	private String dealerSelectedMakerName;

	private String dealerSelectedMakerClass;

	
	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	/**
	 * @return the dealerId
	 */
	public String getDealerId() {
		return dealerId;
	}

	/**
	 * @param dealerId
	 *            the dealerId to set
	 */
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}

	/**
	 * @param dealerName
	 *            the dealerName to set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	/**
	 * @return the makersName
	 */
	public String getMakersName() {
		return makersName;
	}

	/**
	 * @param makersName
	 *            the makersName to set
	 */
	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	/**
	 * @return the makerClass
	 */
	public String getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass
	 *            the makerClass to set
	 */
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

	/**
	 * @return the dealerSelectedMakerName
	 */
	public String getDealerSelectedMakerName() {
		return dealerSelectedMakerName;
	}

	/**
	 * @param dealerSelectedMakerName
	 *            the dealerSelectedMakerName to set
	 */
	public void setDealerSelectedMakerName(String dealerSelectedMakerName) {
		this.dealerSelectedMakerName = dealerSelectedMakerName;
	}

	/**
	 * @return the dealerSelectedMakerClass
	 */
	public String getDealerSelectedMakerClass() {
		return dealerSelectedMakerClass;
	}

	/**
	 * @param dealerSelectedMakerClass
	 *            the dealerSelectedMakerClass to set
	 */
	public void setDealerSelectedMakerClass(String dealerSelectedMakerClass) {
		this.dealerSelectedMakerClass = dealerSelectedMakerClass;
	}

	public String getRegisteredWith() {
		return registeredWith;
	}

	public void setRegisteredWith(String registeredWith) {
		this.registeredWith = registeredWith;
	}

	public String getRepresentedBy() {
		return representedBy;
	}

	public void setRepresentedBy(String representedBy) {
		this.representedBy = representedBy;
	}

	public ContactVO getContact() {
		return contact;
	}

	public void setContact(ContactVO contact) {
		this.contact = contact;
	}

	public ApplicantAddressVO getAddress() {
		return address;
	}

	public void setAddress(ApplicantAddressVO address) {
		this.address = address;
	}

	public DealerVehicalDetailsVO getVehicalDetails() {
		return vehicalDetails;
	}

	public void setVehicalDetails(DealerVehicalDetailsVO vehicalDetails) {
		this.vehicalDetails = vehicalDetails;
	}

	public BankDetailsVO getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetailsVO bankDetails) {
		this.bankDetails = bankDetails;
	}

	public String getPremisesDetail() {
		return premisesDetail;
	}

	public void setPremisesDetail(String premisesDetail) {
		this.premisesDetail = premisesDetail;
	}

	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

}
