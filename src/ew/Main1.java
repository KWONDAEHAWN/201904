package ew;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ifex1 ex = new ifex1();
				
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		ex.ifex(score);
		
		ex.ifex2(score);
		
		ex.ifex3(score);
		
		ex.ifex4(score);
	}

}
