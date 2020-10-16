package org.epragati.dispatcher.vo;

import java.util.List;

public class UIFormatVO {

	private Long noOfRecords;
	
	private List<RecordsVO> recordsVOs;
	
	public Long getNoOfRecords() {
		return noOfRecords;
	}
	public void setNoOfRecords(Long noOfRecords) {
		this.noOfRecords = noOfRecords;
	}
	public List<RecordsVO> getRecordsVOs() {
		return recordsVOs;
	}
	public void setRecordsVOs(List<RecordsVO> recordsVOs) {
		this.recordsVOs = recordsVOs;
	}
	
}
