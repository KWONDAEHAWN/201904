package com.java;

public class A {
	 //기본 생성자
	public A() {
		new B("안녕!"); //B 클래스 생성자 생성
	}
	public A(String msg) {
		System.out.println("B class : " + msg);
	}
}
