package com.java;

public class Var {
		
		public Var() {
			
			var();
		}// �⺻������ // ���������� ���� ������
		
	// �������� �Լ���(�Ű躯��) ���� ����
	//   void var()        {}	
		
		public int state1;
		protected int state2;
		int state3;
		private int state4;
		
		public void  var()	      {

		int a; // 1
		a = 1; // 2
		System.out.println(a); // 3
		
		int b;
		b = 2;
		System.out.println(b);
		
		int c,d,e;
		c = a;
		d = b;
		e = c + d;
		System.out.println(e * 2);
}
		void var2(int a, int b) {
			System.out.println(a + b);
		
	}
}