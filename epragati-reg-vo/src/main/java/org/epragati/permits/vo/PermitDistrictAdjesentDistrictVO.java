package org.epragati.permits.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.vo.BaseVO;
import org.epragati.master.vo.DistrictVO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PermitDistrictAdjesentDistrictVO extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DistrictVO distictVO;

	private List<PermitDistrictMappingVO> adjesentDistrictVO;

	/**
	 * @return the distictVO
	 */
	public DistrictVO getDistictVO() {
		return distictVO;
	}

	/**
	 * @param distictVO
	 *            the distictVO to set
	 */
	public void setDistictVO(DistrictVO distictVO) {
		this.distictVO = distictVO;
	}

	/**
	 * @return the adjesentDistrictVO
	 */
	public List<PermitDistrictMappingVO> getAdjesentDistrictVO() {
		return adjesentDistrictVO;
	}

	/**
	 * @param adjesentDistrictVO
	 *            the adjesentDistrictVO to set
	 */
	public void setAdjesentDistrictVO(List<PermitDistrictMappingVO> adjesentDistrictVO) {
		this.adjesentDistrictVO = adjesentDistrictVO;
	}

}
