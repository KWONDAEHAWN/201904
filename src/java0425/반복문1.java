package java0425;

public class �ݺ���1 {
	/****************************************
	 *for �� : for(1, 2, 3){ ���๮ }
	 *1) �ʱ�ȭ�� : for������ ��� �� ���� ���� �� �ʱⰪ ����
	 *2) ���ǽ� : if���� �����ϰ� ������ ã�� ���� ����
	 *3) ������ : for������ ����� ������ ��ȭ�� �ֱ� ���� ��
	 ****************************************/ 
	
	public void t1() {
		for(int i = 0; i < 10; i++) {
		System.out.println(i); // 0 ~ 9
		}
	}
	//��ȭ�� �ټ� ����.
	public void t2(int s) {  
		System.out.println("�ݺ��� ����");
		for(int i = 0; i < s; i++) {
			System.out.println(i);
		}
		System.out.println("�ݺ��� ����");
	}
	//��ȭ�� �ټ� ����.
	public void t3(int a, int b) { 
		System.out.println("t3 �ݺ��� ����");
		for(;a < b; a++)
			System.out.println(a);
		System.out.println("t3 �ݺ��� ����");
	}
	public void t99(int b) {
		System.out.println("�ݺ������۾�~");
		for(int a = 0; a < b; a++) {
		System.out.println(a);

	}
		System.out.println("�ݺ���������~");
}
	public void t4() {  // 0 ~ 4
		for(int i = 0; i <5; i++) {
			if(i % 2 == 0) {
				System.out.print("��");
			}else {
				System.out.print("��");
		}
			System.out.println("");
	}
}
	public void st() {
		for(int i = 0; i<5; i++) {
			for(int j =0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			}

	}
	public void t5() {
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j <= i; j++) {
				if((i-j) % 2 == 0) {
					System.out.print("��");
				}else {
					System.out.print("��");
				}
			}
			System.out.println("");
		}
	}
	public void  t6() {
		System.out.println("����� ����.");
		int t = 0;
		for(int i = 0; i < 9; i++) {
			if(i>4) {
				t = t - 2;
			}
			
			for(int j = 0; j <= t; j++) {
				if((j-t) % 2 == 0) {
					System.out.print("��");
				}else{
					System.out.print("��");
				}
		}
			t++;
			System.out.println("");
	}
 }
	public void t7() {

		for(int i = 1; i <=9; i++) {
			for(int j = 1; j <=9; j++) {
				if(j == 1) {
					System.out.println(i +"��" );
				}
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("");
		}
	}
	public void t8( ) {
		for(int i = 1; i <=9; i+= 3) {
			System.out.println(i+"��"+"\t"+(i+1)+"��");
			for(int j = 1; j <=9; j++) {
				
				System.out.println(i + "*" + j + "=" +(i*j));
				
				}
			
			}	
		}
	}