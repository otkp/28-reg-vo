package org.epragati.vcr.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class InvoiceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonFormat(shape = Shape.STRING)
	private Integer ULW;
	@JsonFormat(shape = Shape.STRING)
	private Integer GVW;
	@JsonFormat(shape = Shape.STRING)
	private Integer excessLoad;
	private List<InvoiceArrayVO> invoiceArray;
	@JsonFormat(shape = Shape.STRING)
	private Integer totalInvoiceWeight;

	public Integer getULW() {
		return ULW;
	}

	public void setULW(Integer uLW) {
		ULW = uLW;
	}

	public Integer getGVW() {
		return GVW;
	}

	public void setGVW(Integer gVW) {
		GVW = gVW;
	}

	public Integer getExcessLoad() {
		return excessLoad;
	}

	public void setExcessLoad(Integer excessLoad) {
		this.excessLoad = excessLoad;
	}

	public List<InvoiceArrayVO> getInvoiceArray() {
		return invoiceArray;
	}

	public void setInvoiceArray(List<InvoiceArrayVO> invoiceArray) {
		this.invoiceArray = invoiceArray;
	}

	public Integer getTotalInvoiceWeight() {
		return totalInvoiceWeight;
	}

	public void setTotalInvoiceWeight(Integer totalInvoiceWeight) {
		this.totalInvoiceWeight = totalInvoiceWeight;
	}

	@Override
	public String toString() {
		return "InvoiceVO [ULW=" + ULW + ", GVW=" + GVW + ", excessLoad=" + excessLoad + ", invoiceArray="
				+ invoiceArray + ", totalInvoiceWeight=" + totalInvoiceWeight + "]";
	}

}
