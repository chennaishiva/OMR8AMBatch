package org.tcs;

public class Test extends Sample {
	
	@Override
	public void savings() {
		System.out.println("22%");
	}
	
	//child --> sub 
	//parent -> super
	
	public void fixed(int age) {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		t.savings();
		t.fixed(44);
	}

}
