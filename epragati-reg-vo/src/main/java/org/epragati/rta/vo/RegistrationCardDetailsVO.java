package org.epragati.rta.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.DealerDetailsVO;
import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.master.vo.InvoiceDetailsVO;
import org.epragati.master.vo.OfficeVO;
import org.epragati.master.vo.RegistrationValidityVO;
import org.epragati.master.vo.VahanDetailsVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class RegistrationCardDetailsVO {
	
	//RC
	private boolean isDuplicate;
	
	private String vehRegNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate regDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime regValidity;
	
	private OfficeVO officeDetails;
	
	//Vehicle
	private String vehCategory;
	
	private OwnerTypeEnum ownerType;
	
	private VahanDetailsVO vahanDetails;
	
	private String classOfVehicleDesc;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxPaidUpto;
	
	private String signOfAuth;
	
	//Owner
	private String signOfOwner;
	
	private String name;
	
	private String parentsName;
	
	private ApplicantAddressVO presentAddress;
	
	
	private String firstName;
	
	//Tax
	private Long amount;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxValidUpto;
	
	private boolean backendUpdateFlag;  //(nothing but isCardPrinted)
	
	private FinanceDetailsVO financeDetails;
	
	private InsuranceDetailsVO insuranceDetails;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime approvedDate;
	
	private RegistrationValidityVO registrationValidity;
	
	private DealerDetailsVO dealerDetails;
	
	private InvoiceDetailsVO invoiceDetails;
	
	private String regNo;
	
	private ApplicantDetailsVO applicantDetails;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate cardPrintedDate;
	
	private List<Integer> serviceIds;
	

	public ApplicantDetailsVO getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetailsVO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public InvoiceDetailsVO getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetailsVO invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
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
	 * @return the vehRegNo
	 */
	public String getVehRegNo() {
		return vehRegNo;
	}

	/**
	 * @param vehRegNo the vehRegNo to set
	 */
	public void setVehRegNo(String vehRegNo) {
		this.vehRegNo = vehRegNo;
	}

	/**
	 * @return the regDate
	 */
	public LocalDate getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the regValidity
	 */
	public LocalDateTime getRegValidity() {
		return regValidity;
	}

	/**
	 * @param regValidity the regValidity to set
	 */
	public void setRegValidity(LocalDateTime regValidity) {
		this.regValidity = regValidity;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeVO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeVO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the vehCategory
	 */
	public String getVehCategory() {
		return vehCategory;
	}

	/**
	 * @param vehCategory the vehCategory to set
	 */
	public void setVehCategory(String vehCategory) {
		this.vehCategory = vehCategory;
	}

	/**
	 * @return the vahanDetails
	 */
	public VahanDetailsVO getVahanDetails() {
		return vahanDetails;
	}

	/**
	 * @param vahanDetails the vahanDetails to set
	 */
	public void setVahanDetails(VahanDetailsVO vahanDetails) {
		this.vahanDetails = vahanDetails;
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
	 * @return the taxPaidUpto
	 */
	public LocalDate getTaxPaidUpto() {
		return taxPaidUpto;
	}

	/**
	 * @param taxPaidUpto the taxPaidUpto to set
	 */
	public void setTaxPaidUpto(LocalDate taxPaidUpto) {
		this.taxPaidUpto = taxPaidUpto;
	}

	/**
	 * @return the signOfAuth
	 */
	public String getSignOfAuth() {
		return signOfAuth;
	}

	/**
	 * @param signOfAuth the signOfAuth to set
	 */
	public void setSignOfAuth(String signOfAuth) {
		this.signOfAuth = signOfAuth;
	}

	/**
	 * @return the signOfOwner
	 */
	public String getSignOfOwner() {
		return signOfOwner;
	}

	/**
	 * @param signOfOwner the signOfOwner to set
	 */
	public void setSignOfOwner(String signOfOwner) {
		this.signOfOwner = signOfOwner;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parentsName
	 */
	public String getParentsName() {
		return parentsName;
	}

	/**
	 * @param parentsName the parentsName to set
	 */
	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	/**
	 * @return the presentAddress
	 */
	public ApplicantAddressVO getPresentAddress() {
		return presentAddress;
	}

	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(ApplicantAddressVO presentAddress) {
		this.presentAddress = presentAddress;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the taxValidUpto
	 */
	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	/**
	 * @param taxValidUpto the taxValidUpto to set
	 */
	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}

	/**
	 * @return the backendUpdateFlag
	 */
	public boolean isBackendUpdateFlag() {
		return backendUpdateFlag;
	}

	/**
	 * @param backendUpdateFlag the backendUpdateFlag to set
	 */
	public void setBackendUpdateFlag(boolean backendUpdateFlag) {
		this.backendUpdateFlag = backendUpdateFlag;
	}

	/**
	 * @return the financeDetails
	 */
	public FinanceDetailsVO getFinanceDetails() {
		return financeDetails;
	}

	/**
	 * @param financeDetails the financeDetails to set
	 */
	public void setFinanceDetails(FinanceDetailsVO financeDetails) {
		this.financeDetails = financeDetails;
	}

	/**
	 * @return the insuranceDetails
	 */
	public InsuranceDetailsVO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param insuranceDetails the insuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsVO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
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

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	public RegistrationValidityVO getRegistrationValidity() {
		return registrationValidity;
	}

	public void setRegistrationValidity(RegistrationValidityVO registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	public DealerDetailsVO getDealerDetails() {
		return dealerDetails;
	}

	public void setDealerDetails(DealerDetailsVO dealerDetails) {
		this.dealerDetails = dealerDetails;
	}

	public LocalDate getCardPrintedDate() {
		return cardPrintedDate;
	}

	public void setCardPrintedDate(LocalDate cardPrintedDate) {
		this.cardPrintedDate = cardPrintedDate;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}


}
