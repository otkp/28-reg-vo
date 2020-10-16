package org.epragati.payments.vo;

import org.epragati.util.payment.GatewayTypeEnum;

public class PaymentGatewayTypeVO {
	private Integer id;
	private String name;
	private GatewayTypeEnum gatewayTypeEnum;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
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
	 * @return the gatewayTypeEnum
	 */
	public GatewayTypeEnum getGatewayTypeEnum() {
		return gatewayTypeEnum;
	}
	/**
	 * @param gatewayTypeEnum the gatewayTypeEnum to set
	 */
	public void setGatewayTypeEnum(GatewayTypeEnum gatewayTypeEnum) {
		this.gatewayTypeEnum = gatewayTypeEnum;
	}
	
	
}