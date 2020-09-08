package com.abb1;

public class Exhibition extends Event {
	int noOfStall;

	public Exhibition(String name, String detail, String ownerName, int noOfStall) {
		super(name, detail, ownerName);
		this.noOfStall = noOfStall;
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}
	public double calculateRevenue()
	{
		return (noOfStall*10000);
	}
	
	

}
