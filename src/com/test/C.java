package com.test;

public class C extends B{
	public void consumer() {
		System.out.println("customer");
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.company();
		c.delar();
		c.consumer();
	}
}
