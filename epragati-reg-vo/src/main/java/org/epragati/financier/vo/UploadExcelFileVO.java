package org.epragati.financier.vo;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class UploadExcelFileVO {

	private MultipartFile[] excelFileName;
	private String description;
	private String uploadedBy;
	private String modifiedBy;
	public MultipartFile[] getExcelFileName() {
		return excelFileName;
	}
	public void setExcelFileName(MultipartFile[] excelFileName) {
		this.excelFileName = excelFileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	@Override
	public String toString() {
		return "ExcelUploadFileVO [excelFileName=" + Arrays.toString(excelFileName) + ", description=" + description
				+ ", uploadedBy=" + uploadedBy + ", modifiedBy=" + modifiedBy + "]";
	}
	
	
	
	
}
