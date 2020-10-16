package org.epragati.common.vo;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public enum UserStatusEnum {

	ACTIVE("ACTIVE"),INACTIVE("INACTIVE");

	private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private UserStatusEnum(String name){
		this.name = name;
	}
}
