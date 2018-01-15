package com.offers;

import java.util.List;

public class OfferDateRange {

	private List travelStartDate;
	private List travelEndDate;
	private int lengthOfStay;

	public List getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

}