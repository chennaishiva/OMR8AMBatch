package org.tcs;

import java.util.Scanner;

public class HdfcBank implements RbiBank, WorldBank {

	@Override
	public void fixed() {
		
	}

	@Override
	public void savings() {
		
	}

	@Override
	public void deposit() {
		
	}
	
	public static void main(String[] args) {
		HdfcBank h = new HdfcBank();
		h.savings();
		h.deposit();
		h.fixed();
	}

	

}
