package com.aop.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//import org.aspectj.lang.annotation.Aspect;

@EnableAspectJAutoProxy
public class MyAspect {

	// before...
	@Bean("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {		
		System.out.println("payment started...");		
	}
	
	// after...
	@Bean("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {		
		System.out.println("payment done...");		
	}
	
}
