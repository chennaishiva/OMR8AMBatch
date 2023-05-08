package org.tcs;

public class NorthIndians extends Indians{

	@Override
	public void breakfast() {
		System.out.println("Poha");
	}
	
	public static void main(String[] args) {
		NorthIndians n = new NorthIndians();
		n.breakfast();
		n.voterId();
		n.panCard();
	}

}
