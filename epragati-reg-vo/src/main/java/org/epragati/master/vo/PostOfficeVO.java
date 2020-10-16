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
public class PostOfficeVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer district;
	private Integer postOfficeCode;
	private Integer postOfficeId;
	private String postOfficeName; 
	private Boolean status;
	
	//For Dl Details
	private Integer id;
	private String name;
	private Integer pincode;
	private Integer districtId;

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
		this.district = district;
	}

	public Integer getPostOfficeCode() {
		return postOfficeCode;
	}

	public void setPostOfficeCode(Integer postOfficeCode) {
		this.postOfficeCode = postOfficeCode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPostOfficeId() {
		return postOfficeId;
	}

	public void setPostOfficeId(Integer postOfficeId) {
		this.postOfficeId = postOfficeId;
	}

	public String getPostOfficeName() {
		return postOfficeName;
	}

	public void setPostOfficeName(String postOfficeName) {
		this.postOfficeName = postOfficeName;
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

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
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

}
