package com.hcl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeAppContext.xml");
		Employee emp = context.getBean(Employee.class, "employee");
		Address ads = context.getBean(Address.class, "address");
		emp.display();
		ads.display();
		((ClassPathXmlApplicationContext)context).close();
	}

}
