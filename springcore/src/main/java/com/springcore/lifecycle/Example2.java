package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Example2 implements InitializingBean,DisposableBean {

	// // implementing lifecycle methods of spring bean using interfaces InitializingBean DisposableBean...
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Example2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example2 [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("taking example2 init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destory
		System.out.println("going to bottle back to shop : destroy");
		
	}
		
}
