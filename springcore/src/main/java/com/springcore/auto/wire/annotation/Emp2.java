package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp2 {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Emp2(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor method.");
	}

	@Override
	public String toString() {
		return "Emp2 [address=" + address + "]";
	}
		
}
