package com.hcl;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double budget;
		CourseList courseList=new CourseList();
		ArrayList<String> availableCourse= new ArrayList<String>();
ApplicationContext context=new  ClassPathXmlApplicationContext("CourseAppContext.xml");
Course course1= context.getBean("course1",Course.class);
Course course2= context.getBean("course2",Course.class);
Course course3= context.getBean("course3",Course.class);
courseList.insert(course1);
courseList.insert(course2);
courseList.insert(course3);
System.out.println("Enter your Budget");
budget=sc.nextDouble();
availableCourse=courseList.noOfCourse(budget);
if(availableCourse.isEmpty())
{
	System.out.println("No Course available");
	}
else
{
	for(String coursename:availableCourse)
	{
		System.out.println(coursename);
	}
	}
((ClassPathXmlApplicationContext)context).close();
	}
}
