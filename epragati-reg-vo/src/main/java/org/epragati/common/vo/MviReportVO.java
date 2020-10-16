package org.epragati.common.vo;

import java.util.List;
import java.util.Map;

public class MviReportVO {
	private Map<String, Integer> totalVcrCount;
	private List<String> MviNames;
	
	
	public Map<String, Integer> getTotalVcrCount() {
		return totalVcrCount;
	}
	public void setTotalVcrCount(Map<String, Integer> totalVcrCount) {
		this.totalVcrCount = totalVcrCount;
	}
	public List<String> getMviNames() {
		return MviNames;
	}
	public void setMviNames(List<String> mviNames) {
		MviNames = mviNames;
	}
	
}
