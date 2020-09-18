package com.air;

public class Airport {
	private String airportName;
	private Country country;
	public Airport()
	{
		
	}
	public Airport(String airportName, Country country) {
		super();
		this.airportName = airportName;
		this.country = country;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	

}
