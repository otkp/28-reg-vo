package org.epragati.gstn.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class GSTNEntityAddressVO {
	
	private EntityAddressVO addr;
	
	private String ntr;

	public EntityAddressVO getAddr() {
		return addr;
	}

	public void setAddr(EntityAddressVO addr) {
		this.addr = addr;
	}

	public String getNtr() {
		return ntr;
	}

	public void setNtr(String ntr) {
		this.ntr = ntr;
	}
}
