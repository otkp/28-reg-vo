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
public class DistrictVO extends BaseVO {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*private Integer did;

	private String sid;

	private String dcode;

	private Integer description;*/
	
	private Integer districCode;
	
	private Integer districtId;
	
	private String districtName;
	
	private String stateId;
	
	private String status;
	
	private String zonecode;
	
	//For DL Details
	private Integer id;
	private String name;

	/**
	 * @return the districCode
	 */
	public Integer getDistricCode() {
		return districCode;
	}

	/**
	 * @param districCode the districCode to set
	 */
	public void setDistricCode(Integer districCode) {
		this.districCode = districCode;
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
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
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
	 * @return the zonecode
	 */
	public String getZonecode() {
		return zonecode;
	}

	/**
	 * @param zonecode the zonecode to set
	 */
	public void setZonecode(String zonecode) {
		this.zonecode = zonecode;
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

	
	
}
