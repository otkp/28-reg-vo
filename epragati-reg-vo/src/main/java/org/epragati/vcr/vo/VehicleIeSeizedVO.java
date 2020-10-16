package org.epragati.vcr.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VehicleIeSeizedVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vehicleKeptAt;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfSeized;
	private MultipartFile[] multipart;
	private String latitude;
	private String longitude;
	private String address;
	private boolean releaseOrder;
	private boolean courtOrder;
	private boolean departmentAction;
	private String remarks;
	private List<KeyValue<String, List<ImageVO>>> enclosures;
	
	public String getVehicleKeptAt() {
		return vehicleKeptAt;
	}

	public void setVehicleKeptAt(String vehicleKeptAt) {
		this.vehicleKeptAt = vehicleKeptAt;
	}

	public LocalDate getDateOfSeized() {
		return dateOfSeized;
	}

	public void setDateOfSeized(LocalDate dateOfSeized) {
		this.dateOfSeized = dateOfSeized;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isReleaseOrder() {
		return releaseOrder;
	}

	public void setReleaseOrder(boolean releaseOrder) {
		this.releaseOrder = releaseOrder;
	}

	public boolean isCourtOrder() {
		return courtOrder;
	}

	public void setCourtOrder(boolean courtOrder) {
		this.courtOrder = courtOrder;
	}

	public boolean isDepartmentAction() {
		return departmentAction;
	}

	public void setDepartmentAction(boolean departmentAction) {
		this.departmentAction = departmentAction;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<KeyValue<String, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}

	public void setEnclosures(List<KeyValue<String, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}
	
	

}
