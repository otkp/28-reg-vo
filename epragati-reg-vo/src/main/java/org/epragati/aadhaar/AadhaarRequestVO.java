package org.epragati.aadhaar;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.master.vo.ApplicantAddressVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class AadhaarRequestVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String aadhaarNo;

	private String name;

	private String cov;

	private String prNo;

	private ApplicantAddressVO presentAddress;
	
	private String address;
	
	private List<String> aadhaarNos;
	
	private String covCode;
	
	private String covDecription;
	
	private String vehicleType;
	
	private String fatherName;
	
	private String makerName;
	
	private String makerClass;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime registrationDate;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov
	 *            the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	/**
	 * @param aadhaarNo
	 *            the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
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
	 * @return the aadhaarNos
	 */
	public List<String> getAadhaarNos() {
		return aadhaarNos;
	}

	/**
	 * @param aadhaarNos the aadhaarNos to set
	 */
	public void setAadhaarNos(List<String> aadhaarNos) {
		this.aadhaarNos = aadhaarNos;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	/**
	 * @return the covDecription
	 */
	public String getCovDecription() {
		return covDecription;
	}

	/**
	 * @param covDecription the covDecription to set
	 */
	public void setCovDecription(String covDecription) {
		this.covDecription = covDecription;
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
	 * @return the makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName the makerName to set
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return the makerClass
	 */
	public String getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass the makerClass to set
	 */
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

	/**
	 * @return the registrationDate
	 */
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the applicantAddressVO
	 */
	
}
