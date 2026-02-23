package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp1 {

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter value by annotation.");
	}

	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp1(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp1 [address=" + address + "]";
	}
		
}
