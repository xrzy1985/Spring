package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		// Here, we create a Calculator object named cal, and cast the 
		// 	ApplicationContext from calc inside of our Beans.xml to a Calculator object		
		Calculator cal = (Calculator)applicationContext.getBean("calc");
		
		// So, we can use the methods we created inside of our Calculator class
		System.out.println("Addition: " + cal.add());
		System.out.println("Subtraction: " + cal.subtract());
		System.out.println("Multiplication: " + cal.multiply());
		System.out.println("Division: " + cal.divide());
		
	}

}
