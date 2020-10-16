package org.epragati.rta.vo;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class TrailerChassisDetailsVO {

	private Integer gvw;
	private Integer gtw;
	private String chassisNo;
	private Integer ulw;
	private String makerName;
	private String color;

	/**
	 * @return the makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName
	 *            the makerName to set
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw
	 *            the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo
	 *            the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the gtw
	 */
	public Integer getGtw() {
		return gtw;
	}

	/**
	 * @param gtw
	 *            the gtw to set
	 */
	public void setGtw(Integer gtw) {
		this.gtw = gtw;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw
	 *            the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
