package org.epragati.permits.vo;

import java.util.List;

import org.epragati.common.vo.BaseVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PermitValidationsVO extends BaseVO {

	private List<String> covList;

	private boolean status;

	private CovValidationVO validations;

	private boolean bodyTypeBasedGoodsDetails;

	/**
	 * @return the covList
	 */
	public List<String> getCovList() {
		return covList;
	}

	/**
	 * @param covList
	 *            the covList to set
	 */
	public void setCovList(List<String> covList) {
		this.covList = covList;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the validations
	 */
	public CovValidationVO getValidations() {
		return validations;
	}

	/**
	 * @param validations
	 *            the validations to set
	 */
	public void setValidations(CovValidationVO validations) {
		this.validations = validations;
	}

	/**
	 * @return the bodyTypeBasedGoodsDetails
	 */
	public boolean isBodyTypeBasedGoodsDetails() {
		return bodyTypeBasedGoodsDetails;
	}

	/**
	 * @param bodyTypeBasedGoodsDetails
	 *            the bodyTypeBasedGoodsDetails to set
	 */
	public void setBodyTypeBasedGoodsDetails(boolean bodyTypeBasedGoodsDetails) {
		this.bodyTypeBasedGoodsDetails = bodyTypeBasedGoodsDetails;
	}

}
