package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		applicationContext.getBean("Point10");
		
		Point p = (Point)applicationContext.getBean("Point10");
		
		System.out.println(p.getA());
		
		System.out.println(p.getB());
		
		applicationContext.getBean("PrintHW");
		
		Hello h = (Hello)applicationContext.getBean("PrintHW");
		
		System.out.println(h.getHelloWorld());
	}

}
