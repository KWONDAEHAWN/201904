package com.java;

public class Test2 {

	public static void main(String[] args) {
		
		String c = "\\";
		
		System.out.println(c);
		
		System.out.println("\\");
		System.out.println("\u005c\u005c");
		/* ********************
		 * Ư�� ���� >> \
		 * \n : ���� �̵�
		 * \' : ' > ���� : ''
		 * \uD64D : ȫ
		 * ********************/
		System.out.println("GOO\n    DEE\n        ACADEMY");
		System.out.println("Goo\tDEE");
	}
}
