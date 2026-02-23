package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext  con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1= con.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("=====================");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println("=====================");
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass().getName());
		System.out.println("=====================");
		System.out.println(person1.getTrees());
		System.out.println(person1.getTrees().getClass().getName());
		System.out.println("=====================");
		System.out.println(person1.getDosts());
		System.out.println(person1.getDosts().getClass().getName());
		
		
	}

}
