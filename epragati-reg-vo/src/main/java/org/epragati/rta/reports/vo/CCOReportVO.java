/**
 * 
 */
package org.epragati.rta.reports.vo;

public class CCOReportVO {

	private String name;
	private Integer approved;
	private Integer rejected;
	private Integer totalcount;
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
	 * @return the approved
	 */
	public Integer getApproved() {
		return approved;
	}
	/**
	 * @param approved the approved to set
	 */
	public void setApproved(Integer approved) {
		this.approved = approved;
	}
	/**
	 * @return the rejected
	 */
	public Integer getRejected() {
		return rejected;
	}
	/**
	 * @param rejected the rejected to set
	 */
	public void setRejected(Integer rejected) {
		this.rejected = rejected;
	}
	/**
	 * @return the totalcount
	 */
	public Integer getTotalcount() {
		return totalcount;
	}
	/**
	 * @param totalcount the totalcount to set
	 */
	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}
}
