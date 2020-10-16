package org.epragati.dealer.vo;

import java.util.List;

import org.epragati.regservice.vo.CitizenApplicationSearchResponceVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
public class TrIssuedReportVO {

	private Integer pageNumber;

	private Integer totalPageSize;

	private List<TrIssuedVO> voList;

	private List<VcrFinalServiceVO> evcrList;

	private List<CitizenApplicationSearchResponceVO> resultList;

	private double total;

	public List<VcrFinalServiceVO> getEvcrList() {
		return evcrList;
	}

	public void setEvcrList(List<VcrFinalServiceVO> evcrList) {
		this.evcrList = evcrList;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(Integer totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public List<TrIssuedVO> getVoList() {
		return voList;
	}

	public void setVoList(List<TrIssuedVO> voList) {
		this.voList = voList;
	}

	public List<CitizenApplicationSearchResponceVO> getResultList() {
		return resultList;
	}

	public void setResultList(List<CitizenApplicationSearchResponceVO> resultList) {
		this.resultList = resultList;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

}
