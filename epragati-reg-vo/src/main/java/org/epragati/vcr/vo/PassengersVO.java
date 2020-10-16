package org.epragati.vcr.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class PassengersVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonFormat(shape = Shape.STRING)
	private Integer noOfseats;
	@JsonFormat(shape = Shape.STRING)
	private Integer noOfPasssengers;
	@JsonFormat(shape = Shape.STRING)
	private Integer overloadedPassenger;

	public Integer getNoOfseats() {
		return noOfseats;
	}

	public void setNoOfseats(Integer noOfseats) {
		this.noOfseats = noOfseats;
	}

	public Integer getNoOfPasssengers() {
		return noOfPasssengers;
	}

	public void setNoOfPasssengers(Integer noOfPasssengers) {
		this.noOfPasssengers = noOfPasssengers;
	}

	public Integer getOverloadedPassenger() {
		return overloadedPassenger;
	}

	public void setOverloadedPassenger(Integer overloadedPassenger) {
		this.overloadedPassenger = overloadedPassenger;
	}

	@Override
	public String toString() {
		return "PassengersVO [noOfseats=" + noOfseats + ", noOfPasssengers=" + noOfPasssengers
				+ ", overloadedPassenger=" + overloadedPassenger + "]";
	}

}
