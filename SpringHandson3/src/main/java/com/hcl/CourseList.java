package com.hcl;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList= new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}
public double revenue()
{
	double revenue,individualRevenue=0;
	for(Course courses:courseList)
	{
		revenue=200*0.2*courses.getFee();
		individualRevenue+=revenue;
	}
	
	return individualRevenue;
	}
}
