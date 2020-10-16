package org.epragati.rta.vo;

import java.util.List;
import java.util.Map;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.common.vo.CorrectionVO;
import org.epragati.images.vo.ImageInput;
import org.springframework.web.multipart.MultipartFile;

public class CorrectionsVO {
	
    private String serviceType;
	
	private String selectedRole;
	
	private String prNo;
	
	private String trNo;
	
	private String appNo;
	
	private String chassisNo;	
	
	private String token;
	
	private Map<String, List<CorrectionVO>> reg;
	
	private List<CollectionCorrectonSaveVO> data;
	
	private Object targetCollection;
	
	private Object sourceCollection;
	
	private AadhaarDetailsRequestVO aadharRequestModel;
	
	private String ticketNumber;
	
	private  MultipartFile[] uploadfiles;
	
	private List<ImageInput> imagesInput;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Map<String, List<CorrectionVO>> getReg() {
		return reg;
	}

	public void setReg(Map<String, List<CorrectionVO>> reg) {
		this.reg = reg;
	}

	public List<CollectionCorrectonSaveVO> getData() {
		return data;
	}

	public void setData(List<CollectionCorrectonSaveVO> data) {
		this.data = data;
	}

	public Object getTargetCollection() {
		return targetCollection;
	}

	public void setTargetCollection(Object targetCollection) {
		this.targetCollection = targetCollection;
	}

	public Object getSourceCollection() {
		return sourceCollection;
	}

	public void setSourceCollection(Object sourceCollection) {
		this.sourceCollection = sourceCollection;
	}

	public AadhaarDetailsRequestVO getAadharRequestModel() {
		return aadharRequestModel;
	}

	public void setAadharRequestModel(AadhaarDetailsRequestVO aadharRequestModel) {
		this.aadharRequestModel = aadharRequestModel;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public MultipartFile[] getUploadfiles() {
		return uploadfiles;
	}

	public void setUploadfiles(MultipartFile[] uploadfiles) {
		this.uploadfiles = uploadfiles;
	}

	public List<ImageInput> getImagesInput() {
		return imagesInput;
	}

	public void setImagesInput(List<ImageInput> imagesInput) {
		this.imagesInput = imagesInput;
	}
	
	

}
