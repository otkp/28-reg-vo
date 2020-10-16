package org.epragati.regservice.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class PoliceClearanceCertificateVO {
	
	private String certificatSlNo;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate issuedDate;
	
	private String policeStationAddress;

	/**
	 * @return the certificatSlNo
	 */
	public String getCertificatSlNo() {
		return certificatSlNo;
	}

	/**
	 * @param certificatSlNo the certificatSlNo to set
	 */
	public void setCertificatSlNo(String certificatSlNo) {
		this.certificatSlNo = certificatSlNo;
	}

	/**
	 * @return the issuedDate
	 */
	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	/**
	 * @param issuedDate the issuedDate to set
	 */
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	/**
	 * @return the policeStationAddress
	 */
	public String getPoliceStationAddress() {
		return policeStationAddress;
	}

	/**
	 * @param policeStationAddress the policeStationAddress to set
	 */
	public void setPoliceStationAddress(String policeStationAddress) {
		this.policeStationAddress = policeStationAddress;
	}


}
