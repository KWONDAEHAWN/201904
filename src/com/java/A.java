package com.java;

public class A {
	 //�⺻ ������
	public A() {
		new B("�ȳ�!"); //B Ŭ���� ������ ����
	}
	public A(String msg) {
		System.out.println("B class : " + msg);
	}
}
