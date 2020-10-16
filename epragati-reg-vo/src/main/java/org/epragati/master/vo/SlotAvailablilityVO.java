package org.epragati.master.vo;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SlotAvailablilityVO<T> {
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate minDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate maxDate;
	private List<T> daysVo;
	
	public List<T> getDaysVo() {
		return daysVo;
	}
	/**
	 * @param daysVo the daysVo to set
	 */
	public void setDaysVo(List<T> daysVo) {
		this.daysVo = daysVo;
	}
	/**
	 * @return the minDate
	 */
	public LocalDate getMinDate() {
		return minDate;
	}
	/**
	 * @param minDate the minDate to set
	 */
	public void setMinDate(LocalDate minDate) {
		this.minDate = minDate;
	}
	/**
	 * @return the maxDate
	 */
	public LocalDate getMaxDate() {
		return maxDate;
	}
	/**
	 * @param maxDate the maxDate to set
	 */
	public void setMaxDate(LocalDate maxDate) {
		this.maxDate = maxDate;
	}
	
	
}
