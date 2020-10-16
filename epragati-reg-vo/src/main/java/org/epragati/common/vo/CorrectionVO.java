package org.epragati.common.vo;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

public class CorrectionVO {

private String jsonPath;
	
	private String feildLabel;
	
	private String fieldValue;
	
	private String regExpression;
	
	private String dataType;
	
	private String fieldType;
	
	private String api;
	
	private String mode;
	
	private Boolean notify;
	
	private List<CorrectionParamsVO> apiParam;
	
	private String onChange;
	
    private String valuePath;
	
	private String namePath;
	
	

	public Boolean getNotify() {
		return notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}

	public List<CorrectionParamsVO> getApiParam() {
		return apiParam;
	}

	public void setApiParam(List<CorrectionParamsVO> apiParam) {
		this.apiParam = apiParam;
	}

	public String getOnChange() {
		return onChange;
	}

	public void setOnChange(String onChange) {
		this.onChange = onChange;
	}

	public String getValuePath() {
		return valuePath;
	}

	public void setValuePath(String valuePath) {
		this.valuePath = valuePath;
	}

	public String getNamePath() {
		return namePath;
	}

	public void setNamePath(String namePath) {
		this.namePath = namePath;
	}

	public String getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(String jsonPath) {
		this.jsonPath = jsonPath;
	}

	public String getFeildLabel() {
		return feildLabel;
	}

	public void setFeildLabel(String feildLabel) {
		this.feildLabel = feildLabel;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getRegExpression() {
		return regExpression;
	}

	public void setRegExpression(String regExpression) {
		this.regExpression = regExpression;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
}
