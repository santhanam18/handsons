package com.eve;

public class StageEvent extends Event
{
private Integer noOfShows;
private Integer noOfSeatsPerShow;
public StageEvent()
{
	}
public StageEvent(Integer noOfShows, Integer noOfSeatsPerShow) {
	super();
	this.noOfShows = noOfShows;
	this.noOfSeatsPerShow = noOfSeatsPerShow;
}
public Integer getNoOfShows() {
	return noOfShows;
}
public void setNoOfShows(Integer noOfShows) {
	this.noOfShows = noOfShows;
}
public Integer getNoOfSeatsPerShow() {
	return noOfSeatsPerShow;
}
public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
	this.noOfSeatsPerShow = noOfSeatsPerShow;
}
double f=50;
public Double projectedRevenue()
{
	return noOfShows*noOfSeatsPerShow*f;
	}
}
