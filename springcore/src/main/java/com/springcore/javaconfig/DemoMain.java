package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
			//	Student student = con.getBean("getStudent",Student.class);
				Student student1 = con.getBean("student",Student.class);
				Student student2 = con.getBean("temp",Student.class);
				Student student3 = con.getBean("con",Student.class);
	//	System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println("++++++++++++++++");
		student1.study();
		
				
	}

}
