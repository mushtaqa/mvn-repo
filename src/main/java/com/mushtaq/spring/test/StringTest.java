package com.mushtaq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mushtaq.spring.service.TriangleService;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext(new String[] {"spring.xml", "spring-service.xml"});
		System.out.println(((TriangleService)appContext.getBean("triangleService")).draw());

	}

}
