package org.epragati.master.vo;

import java.util.List;

import org.epragati.util.RoleEnum;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@JsonInclude(Include.NON_NULL)
public class RTADashboardVO {

	private RoleEnum role;

	private String dashBoardTitle;

	private List<RTADashBoardLinksVO> registartionServices;
	private List<RTADashBoardLinksVO> dlServices;
	private String otherServicesTitle;

	private List<RTAOtherServicesTitlesVO> otherServicesList;

	private RTADashboardVO aoDashBoard;
	private RTADashboardVO rtoDashBoard;
	private RTADashboardVO ccoDashBoard;
	public RTADashboardVO getMviDashBoard() {
		return mviDashBoard;
	}

	public void setMviDashBoard(RTADashboardVO mviDashBoard) {
		this.mviDashBoard = mviDashBoard;
	}

	private RTADashboardVO mviDashBoard;


	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	public String getDashBoardTitle() {
		return dashBoardTitle;
	}

	public void setDashBoardTitle(String dashBoardTitle) {
		this.dashBoardTitle = dashBoardTitle;
	}

	public List<RTADashBoardLinksVO> getRegistartionServices() {
		return registartionServices;
	}

	public void setRegistartionServices(List<RTADashBoardLinksVO> registartionServices) {
		this.registartionServices = registartionServices;
	}

	public String getOtherServicesTitle() {
		return otherServicesTitle;
	}

	public void setOtherServicesTitle(String otherServicesTitle) {
		this.otherServicesTitle = otherServicesTitle;
	}

	public List<RTAOtherServicesTitlesVO> getOtherServicesList() {
		return otherServicesList;
	}

	public void setOtherServicesList(List<RTAOtherServicesTitlesVO> otherServicesList) {
		this.otherServicesList = otherServicesList;
	}

	public List<RTADashBoardLinksVO> getDlServices() {
		return dlServices;
	}

	public void setDlServices(List<RTADashBoardLinksVO> dlServices) {
		this.dlServices = dlServices;
	}

	public RTADashboardVO getAoDashBoard() {
		return aoDashBoard;
	}

	public void setAoDashBoard(RTADashboardVO aoDashBoard) {
		this.aoDashBoard = aoDashBoard;
	}

	public RTADashboardVO getRtoDashBoard() {
		return rtoDashBoard;
	}

	public void setRtoDashBoard(RTADashboardVO rtoDashBoard) {
		this.rtoDashBoard = rtoDashBoard;
	}

	public RTADashboardVO getCcoDashBoard() {
		return ccoDashBoard;
	}

	public void setCcoDashBoard(RTADashboardVO ccoDashBoard) {
		this.ccoDashBoard = ccoDashBoard;
	}

}
