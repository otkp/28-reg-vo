package org.epragati.cfstVcr.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@XmlRootElement(name = "NewDataSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxPaidVCRDetailsVO {
	
@XmlElement(name = "Table")
 private List<VcrTaxDetails> taxPaidVcrDetails;

/**
 * @return the taxPaidVcrDetails
 */
public List<VcrTaxDetails> getTaxPaidVcrDetails() {
	return taxPaidVcrDetails;
}

/**
 * @param taxPaidVcrDetails the taxPaidVcrDetails to set
 */
public void setTaxPaidVcrDetails(List<VcrTaxDetails> taxPaidVcrDetails) {
	this.taxPaidVcrDetails = taxPaidVcrDetails;
}
}
