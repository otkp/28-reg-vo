package org.epragati.master.vo;

import org.epragati.common.vo.BaseVO;
import org.epragati.util.custom.validation.Conditional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class VillageVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// private Integer vid;

	// private String mid;

	// private String vname;

	private Integer mandalId;

	private String status;

	private Integer villageCode;

	private Integer villageId;

	@Conditional(selected = "villageName",message = "Invalid Village Name",values = {} )
	private String villageName;

	//For DL details
	private Integer id;
	private String Name;
	/**
	 * @return the mandalId
	 */
	public Integer getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId the mandalId to set
	 */
	public void setMandalId(Integer mandalId) {
		this.mandalId = mandalId;
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
	 * @return the villageCode
	 */
	public Integer getVillageCode() {
		return villageCode;
	}

	/**
	 * @param villageCode the villageCode to set
	 */
	public void setVillageCode(Integer villageCode) {
		this.villageCode = villageCode;
	}

	/**
	 * @return the villageId
	 */
	public Integer getVillageId() {
		return villageId;
	}

	/**
	 * @param villageId the villageId to set
	 */
	public void setVillageId(Integer villageId) {
		this.villageId = villageId;
	}

	/**
	 * @return the villageName
	 */
	public String getVillageName() {
		return villageName;
	}

	/**
	 * @param villageName the villageName to set
	 */
	public void setVillageName(String villageName) {
		this.villageName = villageName;
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
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

}
