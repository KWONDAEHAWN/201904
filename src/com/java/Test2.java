package com.java;

public class Test2 {

	public static void main(String[] args) {
		
		String c = "\\";
		
		System.out.println(c);
		
		System.out.println("\\");
		System.out.println("\u005c\u005c");
		/* ********************
		 * 특수 문자 >> \
		 * \n : 한줄 이동
		 * \' : ' > 문자 : ''
		 * \uD64D : 홍
		 * ********************/
		System.out.println("GOO\n    DEE\n        ACADEMY");
		System.out.println("Goo\tDEE");
	}
}
