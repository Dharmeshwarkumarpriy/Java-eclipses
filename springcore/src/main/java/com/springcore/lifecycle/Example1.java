package com.springcore.lifecycle;

public class Example1 {

	// implementing lifecycle methods of spring bean using xml...
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Example1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example1 [price=" + price + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void hey() {
		System.out.println("inside init method : hey how are you");
	}
	
	public void bye() {
		System.out.println("inside destroy method: bye");
	}
	
}
