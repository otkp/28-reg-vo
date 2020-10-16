package org.epragati.common.vo;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class CorrectionFieldsVO {

	private Map<String,List<CorrectionVO>> correctionFields;

	public Map<String, List<CorrectionVO>> getCorrectionFields() {
		return correctionFields;
	}

	public void setCorrectionFields(Map<String, List<CorrectionVO>> correctionFields) {
		this.correctionFields = correctionFields;
	}
	
}
