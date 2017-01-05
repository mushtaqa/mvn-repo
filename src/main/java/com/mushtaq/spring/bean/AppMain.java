package com.mushtaq.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = applicationContext.getBean("shapeService",ShapeService.class);
		System.out.println( shapeService.getCircle().getName());
	}

}
