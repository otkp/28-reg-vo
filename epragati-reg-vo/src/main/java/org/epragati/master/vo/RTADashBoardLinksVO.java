package org.epragati.master.vo;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RTADashBoardLinksVO {

	private String moduleImage;

	private String moduleTitle;

	private List<RTADashBoardServiceNamesVO> serviceNames;

	public String getModuleImage() {
		return moduleImage;
	}

	public void setModuleImage(String moduleImage) {
		this.moduleImage = moduleImage;
	}

	public String getModuleTitle() {
		return moduleTitle;
	}

	public void setModuleTitle(String moduleTitle) {
		this.moduleTitle = moduleTitle;
	}

	public List<RTADashBoardServiceNamesVO> getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(List<RTADashBoardServiceNamesVO> serviceNames) {
		this.serviceNames = serviceNames;
	}


}
