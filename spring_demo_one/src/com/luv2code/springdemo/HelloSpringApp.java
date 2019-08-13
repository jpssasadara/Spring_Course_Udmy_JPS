package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//retrieve second bean from spring container
		Coach theCricketCoach = context.getBean("myCricketCoach",Coach.class);
		//call the method on the new bean
		System.out.println(theCricketCoach.getDailyWorkout());
		//close
		context.close();
	}

}
