package com.mendonca.model;

public class LocationStats {

	private String state;
	private String county;
	private int latestTotalCases;
	private int diffFromPrevDay;
	
	
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCounty(String county) {
		this.county = county;
	}
	
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	
	

	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}

	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", county=" + county + ", latestTotalCases=" + latestTotalCases + "]";
	}
	
	
	
	
	
	
}
