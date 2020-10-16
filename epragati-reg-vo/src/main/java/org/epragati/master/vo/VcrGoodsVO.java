package org.epragati.master.vo;

import java.io.Serializable;

public class VcrGoodsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7304413818166584595L;
	private int id;
	private String goodsDesc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	
	
}
