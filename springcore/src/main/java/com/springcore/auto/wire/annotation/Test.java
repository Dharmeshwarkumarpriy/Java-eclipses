package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		System.out.println("++++++++++++++++++++");
		Emp emp= context.getBean("emp",Emp.class);
		System.out.println(emp);
		
		System.out.println("+++++++++++++++++++++");
		Emp1 emp1= context.getBean("emp1",Emp1.class);
		System.out.println(emp1);
		
		System.out.println("+++++++++++++++++++++");
		Emp2 emp2= context.getBean("emp2",Emp2.class);
		System.out.println(emp2);
	}

}
