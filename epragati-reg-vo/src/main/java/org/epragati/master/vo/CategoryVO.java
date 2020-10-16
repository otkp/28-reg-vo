package org.epragati.master.vo;

/**
 * @author sairam.cheruku
 *
 */
public class CategoryVO {

	private Integer cotegoryid;

	private String categorycode;

	private String categorydescription;

	private Boolean status;

	/**
	 * @return the cotegoryid
	 */
	public Integer getCotegoryid() {
		return cotegoryid;
	}

	/**
	 * @param cotegoryid
	 *            the cotegoryid to set
	 */
	public void setCotegoryid(Integer cotegoryid) {
		this.cotegoryid = cotegoryid;
	}

	/**
	 * @return the categorycode
	 */
	public String getCategorycode() {
		return categorycode;
	}

	/**
	 * @param categorycode
	 *            the categorycode to set
	 */
	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}

	/**
	 * @return the categorydescription
	 */
	public String getCategorydescription() {
		return categorydescription;
	}

	/**
	 * @param categorydescription
	 *            the categorydescription to set
	 */
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
