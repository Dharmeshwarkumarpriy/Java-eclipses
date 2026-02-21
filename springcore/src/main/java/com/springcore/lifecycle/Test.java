package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// registering shutdown hook...
		context.registerShutdownHook();

		System.out.println("+++++++++++++++++++");
		Example1 e1 = (Example1) context.getBean("e1");
		System.out.println(e1);

		System.out.println("+++++++++++++++++++");
		Example2 e2 = (Example2) context.getBean("e2");
		System.out.println(e2);

		System.out.println("+++++++++++++++++++");
		Example3 example3=(Example3) context.getBean("example3");
		System.out.println(example3);
		
	}

}
