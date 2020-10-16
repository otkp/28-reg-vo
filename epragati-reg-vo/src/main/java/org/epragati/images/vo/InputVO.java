package org.epragati.images.vo;

import java.util.List;
import java.util.Set;

import org.epragati.master.vo.DealerRegVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.util.payment.ServiceEnum;

public class InputVO {

	private String prNumber;
	private String applicationNo;
	private List<ImageInput> imageInput;

	private String trNo;
	private List<String> serivceType;

	private String name;
	private String url;

	private DealerRegVO dealerRegVO;
	private RegServiceVO regServiceVO;
	
	private ServiceEnum serviceType;	
	

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the prNumber
	 */
	public String getPrNumber() {
		return prNumber;
	}

	/**
	 * @param prNumber the prNumber to set
	 */
	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	/**
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public List<String> getSerivceType() {
		return serivceType;
	}

	public void setSerivceType(List<String> serivceType) {
		this.serivceType = serivceType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the dealerRegVO
	 */
	public DealerRegVO getDealerRegVO() {
		return dealerRegVO;
	}

	/**
	 * @param dealerRegVO the dealerRegVO to set
	 */
	public void setDealerRegVO(DealerRegVO dealerRegVO) {
		this.dealerRegVO = dealerRegVO;
	}

	public RegServiceVO getRegServiceVO() {
		return regServiceVO;
	}

	public void setRegServiceVO(RegServiceVO regServiceVO) {
		this.regServiceVO = regServiceVO;
	}

	public ServiceEnum getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceEnum serviceType) {
		this.serviceType = serviceType;
	}

	


	
}
