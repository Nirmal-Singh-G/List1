package com.test;

public class B extends A{
	public void delar() {
		System.out.println("The delar name is poorvika");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.company();
		b.delar();
	}

}
