package org.epragati.gstn.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * 
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class GSTNDataVO {
	
    private String stjCd;
	
	private String stj;
	
	private String lgnm;
	
	private String dty;
	
	private List<GSTNEntityAddressVO> adadr;
	
	private String cxdt;
	
	private String gstin;
	
	private List<String> nba;
	
	private String lstupdt;
	
	private String rgdt;
	
	private String ctb;
	
	private GSTNEntityAddressVO pradr;
	
	private String sts;
	
	private String tradeNam;
	
	private String ctjCd;
	
	private String ctj;
	
	private LocalDate createdDate;
	
	private LocalDate lastUpdate;

	public String getStjCd() {
		return stjCd;
	}

	public void setStjCd(String stjCd) {
		this.stjCd = stjCd;
	}

	public String getStj() {
		return stj;
	}

	public void setStj(String stj) {
		this.stj = stj;
	}

	public String getLgnm() {
		return lgnm;
	}

	public void setLgnm(String lgnm) {
		this.lgnm = lgnm;
	}

	public String getDty() {
		return dty;
	}

	public void setDty(String dty) {
		this.dty = dty;
	}

	public List<GSTNEntityAddressVO> getAdadr() {
		return adadr;
	}

	public void setAdadr(List<GSTNEntityAddressVO> adadr) {
		this.adadr = adadr;
	}

	public String getCxdt() {
		return cxdt;
	}

	public void setCxdt(String cxdt) {
		this.cxdt = cxdt;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public List<String> getNba() {
		return nba;
	}

	public void setNba(List<String> nba) {
		this.nba = nba;
	}

	public String getLstupdt() {
		return lstupdt;
	}

	public void setLstupdt(String lstupdt) {
		this.lstupdt = lstupdt;
	}

	public String getRgdt() {
		return rgdt;
	}

	public void setRgdt(String rgdt) {
		this.rgdt = rgdt;
	}

	public String getCtb() {
		return ctb;
	}

	public void setCtb(String ctb) {
		this.ctb = ctb;
	}

	public GSTNEntityAddressVO getPradr() {
		return pradr;
	}

	public void setPradr(GSTNEntityAddressVO pradr) {
		this.pradr = pradr;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

	public String getTradeNam() {
		return tradeNam;
	}

	public void setTradeNam(String tradeNam) {
		this.tradeNam = tradeNam;
	}

	public String getCtjCd() {
		return ctjCd;
	}

	public void setCtjCd(String ctjCd) {
		this.ctjCd = ctjCd;
	}

	public String getCtj() {
		return ctj;
	}

	public void setCtj(String ctj) {
		this.ctj = ctj;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
