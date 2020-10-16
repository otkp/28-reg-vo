package org.epragati.regservice.vo;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TheftVehicleDetailsVO {

	private String type;
	private String status;
	@Size(max = 25, message = ValidatorConstants.INVALID_FIR_NO)
	@Conditional(selected = "firNo", message = ValidatorConstants.INVALID_FIR_NO, values = {})
	private String firNo;
	@Size(max = 4, message = ValidatorConstants.INVALID_FIR_YEAR)
	@Conditional(selected = "firYear", message = ValidatorConstants.INVALID_FIR_YEAR, values = {})
	private Integer firYear;

	@JsonFormat(pattern = "dd-MM-yyyy")
	@Conditional(selected = "date", message = ValidatorConstants.INVALID_DATE_FORMAT, values = {})
	private LocalDate complaintDate;
	private String district;
	@Size(max = 50, message = "Invalid Police Station Name")
	private String policeStationName;
	@Conditional(selected = "remarks", message = ValidatorConstants.INVALID_REMARKS, values = {})
	private String remarks;
	private String revocationRemarks;
	private String state;
	private String otherState;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the firNo
	 */
	public String getFirNo() {
		return firNo;
	}

	/**
	 * @param firNo the firNo to set
	 */
	public void setFirNo(String firNo) {
		this.firNo = firNo;
	}

	/**
	 * @return the firYear
	 */
	public Integer getFirYear() {
		return firYear;
	}

	/**
	 * @param firYear the firYear to set
	 */
	public void setFirYear(Integer firYear) {
		this.firYear = firYear;
	}

	/**
	 * @return the complaintDate
	 */

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the policeStationName
	 */
	public String getPoliceStationName() {
		return policeStationName;
	}

	/**
	 * @param policeStationName the policeStationName to set
	 */
	public void setPoliceStationName(String policeStationName) {
		this.policeStationName = policeStationName;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the otherState
	 */
	public String getOtherState() {
		return otherState;
	}

	/**
	 * @param otherState the otherState to set
	 */
	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the complaintDate
	 */
	public LocalDate getComplaintDate() {
		return complaintDate;
	}

	/**
	 * @param complaintDate the complaintDate to set
	 */
	public void setComplaintDate(LocalDate complaintDate) {
		this.complaintDate = complaintDate;
	}

	/**
	 * @return the revocationRemarks
	 */
	public String getRevocationRemarks() {
		return revocationRemarks;
	}

	/**
	 * @param revocationRemarks the revocationRemarks to set
	 */
	public void setRevocationRemarks(String revocationRemarks) {
		this.revocationRemarks = revocationRemarks;
	}

	/**
	 * @return the complaintDateStr
	 */

}
