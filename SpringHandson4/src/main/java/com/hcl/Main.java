package com.hcl;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		String name,password,mobileNumber;
		Owner owner=context.getBean("owner",Owner.class);
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name,password and mobile number fo the user");
  name=sc.next();
  password=sc.next();
  mobileNumber=sc.next();
  owner.setDetails(name, password, mobileNumber);
  owner.display();
  ((AnnotationConfigApplicationContext)context).close();
	}

}
