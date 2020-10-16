package org.epragati.rta.vo;

import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.InvoiceDetailsVO;
import org.epragati.master.vo.MandalVO;
import org.epragati.master.vo.PostOfficeVO;
import org.epragati.master.vo.VahanDetailsVO;
import org.epragati.master.vo.VillageVO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RegistrationCorrectionsVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String applicationNo;

	private String prNo;

	private String displayName;

	private String firstName;

	private String fatherName;

	private ContactVO contact;

	private VillageVO villageVO;

	private MandalVO mandalVO;

	private PostOfficeVO pinCodeVO;

	private VahanDetailsVO vahanDetailsVO;

	private FinanceDetailsVO financeDetailsVO;

	private InvoiceDetailsVO invoiceDetailsVO;

	private String classOfVehicleDesc;

	private String vehicleType;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfRegistration;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationValidTill;

	private boolean isDuplicate;

	private String otherVillage;

	private OwnerTypeEnum ownerType;

	private String representativeName;
	
	private String entityName;

	/**
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the representativeName
	 */
	public String getRepresentativeName() {
		return representativeName;
	}

	/**
	 * @param representativeName the representativeName to set
	 */
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the contact
	 */
	public ContactVO getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactVO contact) {
		this.contact = contact;
	}

	/**
	 * @return the villageVO
	 */
	public VillageVO getVillageVO() {
		return villageVO;
	}

	/**
	 * @param villageVO the villageVO to set
	 */
	public void setVillageVO(VillageVO villageVO) {
		this.villageVO = villageVO;
	}

	/**
	 * @return the mandalVO
	 */
	public MandalVO getMandalVO() {
		return mandalVO;
	}

	/**
	 * @param mandalVO the mandalVO to set
	 */
	public void setMandalVO(MandalVO mandalVO) {
		this.mandalVO = mandalVO;
	}

	/**
	 * @return the pinCodeVO
	 */
	public PostOfficeVO getPinCodeVO() {
		return pinCodeVO;
	}

	/**
	 * @param pinCodeVO the pinCodeVO to set
	 */
	public void setPinCodeVO(PostOfficeVO pinCodeVO) {
		this.pinCodeVO = pinCodeVO;
	}

	/**
	 * @return the vahanDetailsVO
	 */
	public VahanDetailsVO getVahanDetailsVO() {
		return vahanDetailsVO;
	}

	/**
	 * @param vahanDetailsVO the vahanDetailsVO to set
	 */
	public void setVahanDetailsVO(VahanDetailsVO vahanDetailsVO) {
		this.vahanDetailsVO = vahanDetailsVO;
	}

	/**
	 * @return the financeDetailsVO
	 */
	public FinanceDetailsVO getFinanceDetailsVO() {
		return financeDetailsVO;
	}

	/**
	 * @param financeDetailsVO the financeDetailsVO to set
	 */
	public void setFinanceDetailsVO(FinanceDetailsVO financeDetailsVO) {
		this.financeDetailsVO = financeDetailsVO;
	}

	/**
	 * @return the invoiceDetailsVO
	 */
	public InvoiceDetailsVO getInvoiceDetailsVO() {
		return invoiceDetailsVO;
	}

	/**
	 * @param invoiceDetailsVO the invoiceDetailsVO to set
	 */
	public void setInvoiceDetailsVO(InvoiceDetailsVO invoiceDetailsVO) {
		this.invoiceDetailsVO = invoiceDetailsVO;
	}

	/**
	 * @return the classOfVehicleDesc
	 */
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	/**
	 * @param classOfVehicleDesc the classOfVehicleDesc to set
	 */
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the dateOfRegistration
	 */
	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	/**
	 * @param dateOfRegistration the dateOfRegistration to set
	 */
	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	/**
	 * @return the registrationValidTill
	 */
	public LocalDate getRegistrationValidTill() {
		return registrationValidTill;
	}

	/**
	 * @param registrationValidTill the registrationValidTill to set
	 */
	public void setRegistrationValidTill(LocalDate registrationValidTill) {
		this.registrationValidTill = registrationValidTill;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the isDuplicate
	 */
	public boolean isDuplicate() {
		return isDuplicate;
	}

	/**
	 * @param isDuplicate the isDuplicate to set
	 */
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	/**
	 * @return the otherVillage
	 */
	public String getOtherVillage() {
		return otherVillage;
	}

	/**
	 * @param otherVillage the otherVillage to set
	 */
	public void setOtherVillage(String otherVillage) {
		this.otherVillage = otherVillage;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
	

}