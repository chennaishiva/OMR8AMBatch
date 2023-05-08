package org.tcs;
//child class 2
public class Client extends Company{
	
	public void clientId() {
		System.out.println("654534");
		
		int a = 10;
		double b = 2.2;
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientId();
		c.companyId();
		c.companyName();
	}

}
