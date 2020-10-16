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
public class InsuranceCompanyVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String insCompId;
	
	private String insCompidDescription;
	
	private Boolean status;

	public String getInsCompId() {
		return insCompId;
	}

	public void setInsCompId(String insCompId) {
		this.insCompId = insCompId;
	}

	public String getInsCompidDescription() {
		return insCompidDescription;
	}

	public void setInsCompidDescription(String insCompidDescription) {
		this.insCompidDescription = insCompidDescription;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}


}
