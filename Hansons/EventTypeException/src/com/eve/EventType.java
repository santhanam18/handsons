package com.eve;

import javax.naming.event.EventContext;

public class EventType {
private long id;
private String name;
public EventType()
{
	}
public EventType(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
