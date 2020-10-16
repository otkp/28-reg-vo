package org.epragati.master.vo;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class DealerAndVahanMappedCovVO {
	
	private String vahanCovType;
	private String dealerCovType;
	private boolean status;
	private String category;
	
	public String getVahanCovType() {
		return vahanCovType;
	}
	public void setVahanCovType(String vahanCovType) {
		this.vahanCovType = vahanCovType;
	}
	public String getDealerCovType() {
		return dealerCovType;
	}
	public void setDealerCovType(String dealerCovType) {
		this.dealerCovType = dealerCovType;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
