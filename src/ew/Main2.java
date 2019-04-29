package ew;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	javaex ex = new javaex();
	
	System.out.print("정수를 입력하세요");
	int score = scan.nextInt();
		ex.t1(score);
	}
}
