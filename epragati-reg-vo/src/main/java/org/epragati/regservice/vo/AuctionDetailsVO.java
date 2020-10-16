package org.epragati.regservice.vo;

import java.util.List;

import org.epragati.constants.EnclosureType;
import org.epragati.images.vo.ImageInput;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;

public class AuctionDetailsVO {

	private String id;
	private String nameOfRequester;
	private String department;
	private String mviName;
	private String mviUserId;
	private String mviOfficeCode;
	private Integer noOfVehicles;
	private String dtcName;
	private String dtcUserId;
	private String dtcOfficeCode;
	private boolean auctionClosed;
	private List<KeyValue<EnclosureType, List<ImageVO>>> enclosures;
	private List<AuctionVehicleDetailsVO> vehicleDetails;
	private boolean dtcCompleted;
	private List<ActionDetailVO> actions;
	
	private List<ImageInput> imageInput;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameOfRequester() {
		return nameOfRequester;
	}
	public void setNameOfRequester(String nameOfRequester) {
		this.nameOfRequester = nameOfRequester;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public String getMviUserId() {
		return mviUserId;
	}
	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}
	public Integer getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(Integer noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	public String getDtcName() {
		return dtcName;
	}
	public void setDtcName(String dtcName) {
		this.dtcName = dtcName;
	}
	public String getDtcUserId() {
		return dtcUserId;
	}
	public void setDtcUserId(String dtcUserId) {
		this.dtcUserId = dtcUserId;
	}
	public String getDtcOfficeCode() {
		return dtcOfficeCode;
	}
	public void setDtcOfficeCode(String dtcOfficeCode) {
		this.dtcOfficeCode = dtcOfficeCode;
	}
	public boolean isAuctionClosed() {
		return auctionClosed;
	}
	public void setAuctionClosed(boolean auctionClosed) {
		this.auctionClosed = auctionClosed;
	}
	public List<KeyValue<EnclosureType, List<ImageVO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<EnclosureType, List<ImageVO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public List<ImageInput> getImageInput() {
		return imageInput;
	}
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}
	public List<AuctionVehicleDetailsVO> getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(List<AuctionVehicleDetailsVO> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	public boolean isDtcCompleted() {
		return dtcCompleted;
	}
	public void setDtcCompleted(boolean dtcCompleted) {
		this.dtcCompleted = dtcCompleted;
	}
	public List<ActionDetailVO> getActions() {
		return actions;
	}
	public void setActions(List<ActionDetailVO> actions) {
		this.actions = actions;
	}
	
	
}
