package org.epragati.master.vo;

import java.util.Map;

import org.epragati.util.payment.GatewayTypeEnum;


/**
 * 
 * @author pbattula
 *
 */

public class GateWayVO{


	private Integer id;
	private GatewayTypeEnum gateWayType;
	private Map<String,String> gatewayDetails;

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
	 * @return the gateWayType
	 */
	public GatewayTypeEnum getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(GatewayTypeEnum gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the gatewayDetails
	 */
	public Map<String, String> getGatewayDetails() {
		return gatewayDetails;
	}

	/**
	 * @param gatewayDetails the gatewayDetails to set
	 */
	public void setGatewayDetails(Map<String, String> gatewayDetails) {
		this.gatewayDetails = gatewayDetails;
	}

	}
