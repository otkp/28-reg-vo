package org.epragati.master.vo;

import java.util.List;

import org.epragati.common.vo.BaseVO;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class RolesVO extends BaseVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private Integer userNo;

	private String description;

	private Integer status;

	private Integer roleId;

	private List<String> menuCodes;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the menuCodes
	 */
	public List<String> getMenuCodes() {
		return menuCodes;
	}

	/**
	 * @param menuCodes
	 *            the menuCodes to set
	 */
	public void setMenuCodes(List<String> menuCodes) {
		this.menuCodes = menuCodes;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

}
