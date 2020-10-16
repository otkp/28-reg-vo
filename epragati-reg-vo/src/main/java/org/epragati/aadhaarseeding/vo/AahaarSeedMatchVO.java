package org.epragati.aadhaarseeding.vo;

/**
 * 
 * @author pbattula
 *
 */
public class AahaarSeedMatchVO {
	
	private String key;
	private String ekycValue;
	private String dlValue;
	private Character matchState;
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the ekycValue
	 */
	public String getEkycValue() {
		return ekycValue;
	}
	/**
	 * @param ekycValue the ekycValue to set
	 */
	public void setEkycValue(String ekycValue) {
		this.ekycValue = ekycValue;
	}
	/**
	 * @return the dlValue
	 */
	public String getDlValue() {
		return dlValue;
	}
	/**
	 * @param dlValue the dlValue to set
	 */
	public void setDlValue(String dlValue) {
		this.dlValue = dlValue;
	}
	/**
	 * @return the matchState
	 */
	public Character getMatchState() {
		return matchState;
	}
	/**
	 * @param matchState the matchState to set
	 */
	public void setMatchState(Character matchState) {
		this.matchState = matchState;
	}
	
}
