/**
 * 
 */
package org.epragati.master.vo;

import java.time.LocalDate;

import org.epragati.common.vo.BaseVO;

/**
 * @author saroj.sahoo
 *
 */
public class HolidayVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String slno;
	
	private LocalDate holidayDate;
	
	private String holidayDescription;
	
	private Boolean holidayStatus;

	/**
	 * @return the slno
	 */
	public String getSlno() {
		return slno;
	}

	/**
	 * @param slno the slno to set
	 */
	public void setSlno(String slno) {
		this.slno = slno;
	}

	/**
	 * @return the holidayDate
	 */
	public LocalDate getHolidayDate() {
		return holidayDate;
	}

	/**
	 * @param holidayDate the holidayDate to set
	 */
	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}

	/**
	 * @return the holidayDescription
	 */
	public String getHolidayDescription() {
		return holidayDescription;
	}

	/**
	 * @param holidayDescription the holidayDescription to set
	 */
	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}

	public Boolean getHolidayStatus() {
		return holidayStatus;
	}

	public void setHolidayStatus(Boolean holidayStatus) {
		this.holidayStatus = holidayStatus;
	}


}
