package org.epragati.elastic.vo;

public class SearchResponse {

	public Integer from; // from 100
	public Integer requestedSize; // 10
	public int count;// 2
	public long total;// 102
	public double responseTime;
	/**
	 * @return the from
	 */
	public Integer getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(Integer from) {
		this.from = from;
	}
	/**
	 * @return the requestedSize
	 */
	public Integer getRequestedSize() {
		return requestedSize;
	}
	/**
	 * @param requestedSize the requestedSize to set
	 */
	public void setRequestedSize(Integer requestedSize) {
		this.requestedSize = requestedSize;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	/**
	 * @return the responseTime
	 */
	public double getResponseTime() {
		return responseTime;
	}
	/**
	 * @param responseTime the responseTime to set
	 */
	public void setResponseTime(double responseTime) {
		this.responseTime = responseTime;
	}

	

}
