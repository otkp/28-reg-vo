package org.epragati.regservice.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@JsonInclude(Include.NON_NULL)
public class LockedDetailsVO {

	private Integer iterationNo;
	private String applicatioNo;
	private String module;
	private String lockedBy;
	private String prNo;
	private String lockedByRole;
	private LocalDateTime lockedDate;
	private LocalDateTime releaseDate;

	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss a")
	private LocalDateTime locallockedDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate fromDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate toDate;

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the locallockedDate
	 */
	public LocalDateTime getLocallockedDate() {
		return locallockedDate;
	}

	/**
	 * @param locallockedDate the locallockedDate to set
	 */
	public void setLocallockedDate(LocalDateTime locallockedDate) {
		this.locallockedDate = locallockedDate;
	}

	/**
	 * @return the releaseDate
	 */
	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the lockedBy
	 */
	public String getLockedBy() {
		return lockedBy;
	}

	/**
	 * @param lockedBy the lockedBy to set
	 */
	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	/**
	 * @return the lockedByRole
	 */
	public String getLockedByRole() {
		return lockedByRole;
	}

	/**
	 * @param lockedByRole the lockedByRole to set
	 */
	public void setLockedByRole(String lockedByRole) {
		this.lockedByRole = lockedByRole;
	}

	/**
	 * @return the lockedDate
	 */
	public LocalDateTime getLockedDate() {
		return lockedDate;
	}

	/**
	 * @param lockedDate the lockedDate to set
	 */
	public void setLockedDate(LocalDateTime lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * @return the applicatioNo
	 */
	public String getApplicatioNo() {
		return applicatioNo;
	}

	/**
	 * @param applicatioNo the applicatioNo to set
	 */
	public void setApplicatioNo(String applicatioNo) {
		this.applicatioNo = applicatioNo;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the iterationNo
	 */
	public Integer getIterationNo() {
		return iterationNo;
	}

	/**
	 * @param iterationNo the iterationNo to set
	 */
	public void setIterationNo(Integer iterationNo) {
		this.iterationNo = iterationNo;
	}

	/**
	 * 
	 * @return the prNo;
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * 
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

}
