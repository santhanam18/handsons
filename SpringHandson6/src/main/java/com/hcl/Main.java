package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
User user=context.getBean("user",User.class);
user.display();
	}

}
