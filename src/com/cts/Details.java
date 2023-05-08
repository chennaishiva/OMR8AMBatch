package com.cts;

import org.tcs.Company;

//child class
public class Details extends Company {

	public void age() {
		System.out.println("Age is 26");
	}
	
	public static void main(String[] args) {
		Details d = new Details();
		d.age();
		d.companyId();
		d.companyName();
		
	}
	
	
}
