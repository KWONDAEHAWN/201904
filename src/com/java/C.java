package com.java;

public class C {
	
	int count = 0;
	
	public C() {
		System.out.println(count);
		count++;
		new C();
	}
}
