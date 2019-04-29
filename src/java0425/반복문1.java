package java0425;

public class 반복문1 {
	/****************************************
	 *for 문 : for(1, 2, 3){ 실행문 }
	 *1) 초기화식 : for문에서 사용 할 변수 선언 및 초기값 정의
	 *2) 조건식 : if문과 동일하게 거짓을 찾기 위한 조건
	 *3) 증감식 : for문에서 사용할 변수를 변화를 주기 위한 식
	 ****************************************/ 
	
	public void t1() {
		for(int i = 0; i < 10; i++) {
		System.out.println(i); // 0 ~ 9
		}
	}
	//변화를 줄수 있음.
	public void t2(int s) {  
		System.out.println("반복문 시작");
		for(int i = 0; i < s; i++) {
			System.out.println(i);
		}
		System.out.println("반복문 종료");
	}
	//변화를 줄수 있음.
	public void t3(int a, int b) { 
		System.out.println("t3 반복문 시작");
		for(;a < b; a++)
			System.out.println(a);
		System.out.println("t3 반복문 종료");
	}
	public void t99(int b) {
		System.out.println("반복문시작쓰~");
		for(int a = 0; a < b; a++) {
		System.out.println(a);

	}
		System.out.println("반복문끝나쓰~");
}
	public void t4() {  // 0 ~ 4
		for(int i = 0; i <5; i++) {
			if(i % 2 == 0) {
				System.out.print("★");
			}else {
				System.out.print("☆");
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
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}
	public void  t6() {
		System.out.println("별찍기 시작.");
		int t = 0;
		for(int i = 0; i < 9; i++) {
			if(i>4) {
				t = t - 2;
			}
			
			for(int j = 0; j <= t; j++) {
				if((j-t) % 2 == 0) {
					System.out.print("★");
				}else{
					System.out.print("☆");
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
					System.out.println(i +"단" );
				}
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("");
		}
	}
	public void t8( ) {
		for(int i = 1; i <=9; i+= 3) {
			System.out.println(i+"단"+"\t"+(i+1)+"단");
			for(int j = 1; j <=9; j++) {
				
				System.out.println(i + "*" + j + "=" +(i*j));
				
				}
			
			}	
		}
	}