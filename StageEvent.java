package com.abb1;

public class StageEvent extends Event{
	int noOfShow,noOfSeatsPerShow;

	public StageEvent(String name, String detail, String ownerName, int noOfShow, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShow = noOfShow;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public int getNoOfShow() {
		return noOfShow;
	}

	public void setNoOfShow(int noOfShow) {
		this.noOfShow = noOfShow;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public double calculateRevenue()
	{
		return (noOfSeatsPerShow*50*noOfShow);
	}

}
