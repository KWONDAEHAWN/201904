package java0425;

import java.util.Scanner;

public class Test {

	public Test() {
		System.out.println("�򰡸� �����ϰڽ��ϴ�.");
		��(); //�� ù��° ����
	}
	Scanner scan = new Scanner(System.in);
	
	int num = 1;
	int input = 0;
	String score = "";
	
	public void ��() {

		System.out.print(num + "���л��� ���� ������ �Է��Ͻÿ� :");
		input = scan.nextInt();
		if(input == 100 || input >= 90) {
			score = "A";
		}else if(input == 89 || input >= 80) {
			score = "B";
		}else if(input == 79 || input >= 70) {
			score = "C";
		}else if(input == 69 || input >= 60) {
			score = "D";
		}else {
			score = "F";
		}
		System.out.println(num + "���л��� ���� ����� "+ score + "�Դϴ�");
		num++;
//		scan.close();
		if(num > 10) {
			System.out.println("�򰡰� ����Ǿ����ϴ�");
			return;
		}else {
			��();
		}
		

		
		

	}
}
