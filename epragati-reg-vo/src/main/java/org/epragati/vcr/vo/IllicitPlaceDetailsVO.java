package org.epragati.vcr.vo;

public class IllicitPlaceDetailsVO {

	private String from;
	private String to;
	private int individualFare;
	private Boolean pointToPoint;
	private Boolean betweenStages ;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getIndividualFare() {
		return individualFare;
	}
	public void setIndividualFare(int individualFare) {
		this.individualFare = individualFare;
	}
	public Boolean getPointToPoint() {
		return pointToPoint;
	}
	public void setPointToPoint(Boolean pointToPoint) {
		this.pointToPoint = pointToPoint;
	}
	public Boolean getBetweenStages() {
		return betweenStages;
	}
	public void setBetweenStages(Boolean betweenStages) {
		this.betweenStages = betweenStages;
	}
	
	
	
}
