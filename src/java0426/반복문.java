package java0426;

import java.util.Scanner;

public class 반복문 {

	public void lv1() {
		System.out.println("구구단시작쓰");
		for(int y = 1; y <= 9; y++) {
			
			System.out.println(y + "단");
			for (int x = 1; x <=9; x++) {
				System.out.println(y + "*" + x +  "=" + " = "+ (y*x));
			}
			System.out.println();
		}
	}
	
	public void lv2() {
		
		System.out.println("구구단시작쓰zzz");
		for(int y = 1; y <= 9; y = y+3) {
			System.out.print(y + "단\t\t");
			System.out.print((y + 1) + "단\t\t");
			System.out.print((y + 2) + "단\t\t");
			System.out.println();
			for (int x = 1; x <=9; x++) {
				System.out.print(y + "*" + x +  "=" + " = "+ (y*x)+"\t");
				System.out.print((y + 1) + "*" + x +  "=" + " = "+ (y*x)+"\t");
				System.out.print((y + 2) + "*" + x +  "=" + " = "+ (y*x)+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
	public void lv3() {
		
		System.out.println("구구단시작쓰adasfs");
		for(int y = 1; y <= 3; y++) {
			System.out.print(y + "단\t\t");
			System.out.print((y + 3) + "단\t\t");
			System.out.print((y + 6) + "단\t\t");
			System.out.println();
			for (int x = 1; x <=9; x++) {
				System.out.print(y + "*" + x +  "=" + " = "+ (y*x)+"\t");
				System.out.print((y + 3) + "*" + x +  "=" + " = "+ ((y+3)*x)+"\t");
				System.out.print((y + 6) + "*" + x +  "=" + " = "+ ((y+6)*x)+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
	public void lv4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("X축으로 출력 나올 갯수를 입력하세요.");
		//X축으로 출력 나올 갯수를 입력받는다.
		int x축 = scan.nextInt();
		
		for(int y = 1; y <= 9; y = y + x축) {
			for(int x = 1; x <=9; x++) {
				for(int 계산 = 0; 계산 <x축; 계산++) {
					System.out.print((y+계산) + "*" + x +  "=" + " = "+ (y+계산) * x+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		scan.close();
		
		
	}
	public void lv5() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("X축으로 출력 나올 갯수를 입력하세요:");
	//X축으로 출력 나올 갯수를 입력받는다.
	System.out.println("Y축으로 출력 나올 갯수를 입력하세요:");
	int x축 = scan.nextInt();
	int y축 = scan.nextInt();
	for(int y = 1; y <= (y축 * x축); y = y + x축) {
		for(int x = 1; x <=9; x++) {
			for(int 계산 = 0; 계산 <x축; 계산++) {
				if((y+계산) > 9) {
					break;
				}
				System.out.print((y+계산) + "*" + x +  "=" + (y+계산) * x+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	scan.close();
	
	
	}
}

