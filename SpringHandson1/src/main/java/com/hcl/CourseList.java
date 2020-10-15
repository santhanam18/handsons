package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
	private ArrayList<Course> courseList;
	public CourseList()
	{}
	public CourseList(ArrayList<Course> courseList) {
		super();
		this.courseList = courseList;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public void insert(Course course)
	{
        courseList.add(course);
	}
	public ArrayList<String> noOfCourse (double budget)
	{
		ArrayList<String> noOfCourseAvaliable =new ArrayList<String>();
		for(Course course:courseList)
		{
		if(budget>course.getFee())
			noOfCourseAvaliable.add(course.getName());
		}
		
		return noOfCourseAvaliable;
		
	}

}
