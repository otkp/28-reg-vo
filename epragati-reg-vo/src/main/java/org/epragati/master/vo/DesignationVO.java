package org.epragati.master.vo;

import org.epragati.common.vo.BaseVO;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class DesignationVO  extends BaseVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String deptId;
	
	private String desigId;
	
	private String desigName;
	
	private String desigStatus;

	/**
	 * @return the deptId
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the desigId
	 */
	public String getDesigId() {
		return desigId;
	}

	/**
	 * @param desigId the desigId to set
	 */
	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}

	/**
	 * @return the desigName
	 */
	public String getDesigName() {
		return desigName;
	}

	/**
	 * @param desigName the desigName to set
	 */
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}

	/**
	 * @return the desigStatus
	 */
	public String getDesigStatus() {
		return desigStatus;
	}

	/**
	 * @param desigStatus the desigStatus to set
	 */
	public void setDesigStatus(String desigStatus) {
		this.desigStatus = desigStatus;
	}
}
