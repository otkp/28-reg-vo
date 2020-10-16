/**
 * 
 */
package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author saroj.sahoo
 *
 */
public class HolidayExcemptionVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate excemptionDate; 
	
	private boolean holidayType;
	
	private String id;
	
	private List<String> officeCode;
	
	private Integer serviceId;

	/**
	 * @return the excemptionDate
	 */
	

	/**
	 * @return the holidayType
	 */
	public boolean isHolidayType() {
		return holidayType;
	}

	/**
	 * @param holidayType the holidayType to set
	 */
	public void setHolidayType(boolean holidayType) {
		this.holidayType = holidayType;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	
	
	public List<String> getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(List<String> officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the excemptionDate
	 */
	public LocalDate getExcemptionDate() {
		return excemptionDate;
	}

	/**
	 * @param excemptionDate the excemptionDate to set
	 */
	public void setExcemptionDate(LocalDate excemptionDate) {
		this.excemptionDate = excemptionDate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
