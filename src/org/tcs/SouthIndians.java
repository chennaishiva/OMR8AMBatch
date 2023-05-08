package org.tcs;

public class SouthIndians extends Indians{

	@Override
	public void breakfast() {
		System.out.println("idly or dosa");
	}
	
	public static void main(String[] args) {
		SouthIndians s =new SouthIndians();
		s.breakfast();
		s.panCard();
		s.voterId();
	}

}
