package org.epragati.master.vo;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class MandalVO extends BaseVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer mandalCode;
	
	private String mandalName;
	
	private Integer districtId;
	
	private String mandalId;
	
	private String officeCode;
	
	private String nonTransportOffice;
	
	private String transportOfice;
	
	private String hsrpoffice;
	
	private String status;
	
	private String mviAddressOfficeCode;

	//For dl details
	private Integer id;
	private String name;
	/**
	 * @return the mandalCode
	 */
	public Integer getMandalCode() {
		return mandalCode;
	}

	/**
	 * @param mandalCode the mandalCode to set
	 */
	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the mandalId
	 */
	public String getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId the mandalId to set
	 */
	public void setMandalId(String mandalId) {
		this.mandalId = mandalId;
	}

	
	/**
	 * @return the nonTransportOffice
	 */
	public String getNonTransportOffice() {
		return nonTransportOffice;
	}

	/**
	 * @param nonTransportOffice the nonTransportOffice to set
	 */
	public void setNonTransportOffice(String nonTransportOffice) {
		this.nonTransportOffice = nonTransportOffice;
	}

	/**
	 * @return the transportOfice
	 */
	public String getTransportOfice() {
		return transportOfice;
	}

	/**
	 * @param transportOfice the transportOfice to set
	 */
	public void setTransportOfice(String transportOfice) {
		this.transportOfice = transportOfice;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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
	 * @return the hsrpoffice
	 */
	public String getHsrpoffice() {
		return hsrpoffice;
	}

	/**
	 * @param hsrpoffice the hsrpoffice to set
	 */
	public void setHsrpoffice(String hsrpoffice) {
		this.hsrpoffice = hsrpoffice;
	}

	/**
	 * @return the mviAddressOfficeCode
	 */
	public String getMviAddressOfficeCode() {
		return mviAddressOfficeCode;
	}

	/**
	 * @param mviAddressOfficeCode the mviAddressOfficeCode to set
	 */
	public void setMviAddressOfficeCode(String mviAddressOfficeCode) {
		this.mviAddressOfficeCode = mviAddressOfficeCode;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	
}
