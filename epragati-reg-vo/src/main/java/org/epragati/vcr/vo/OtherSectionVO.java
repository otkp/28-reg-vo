package org.epragati.vcr.vo;

import java.io.Serializable;
import java.util.List;

import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;
import org.springframework.web.multipart.MultipartFile;

public class OtherSectionVO implements Serializable{
	
	private String mviRemark;	
	private MultipartFile[] multipart;
	private String latitude;
	private String longitude;
	private List<KeyValue<String, List<ImageVO>>> enclosures;
	
	
	public String getMviRemark() {
		return mviRemark;
	}
	public void setMviRemark(String mviRemark) {
		this.mviRemark = mviRemark;
	}
	public MultipartFile[] getMultipart() {
		return multipart;
	}
	public void setMultipart(MultipartFile[] multipart) {
		this.multipart = multipart;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public List<KeyValue<String, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}
	
	

}
