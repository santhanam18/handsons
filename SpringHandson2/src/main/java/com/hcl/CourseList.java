package com.hcl;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList= new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}

	public void discount() {
		String highName = null, lowName = null;
		double high = 0;
		double low = 1000;
		for (Course courses : courseList) {
			if (courses.getFee() > high) {
				high = courses.getFee();
				highName = courses.getName();
			} else if (courses.getFee() < low) {
				low = courses.getFee();
				lowName = courses.getName();
			}
		}
		System.out.println("Discount " + high*0.1 + " for " + highName + " Course");
		System.out.println("Discount " + low*0.05 + " for " + lowName + " Course");
	}

}
