package java0424;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����Դϴ�.");
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		String b = scan.next();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int c = scan.nextInt();
		
		���� calc = new ����();
		String msg ="";
		switch(b) {
			case "+":
				msg = a + "+" + c + " = "+ calc.����(a, c);
				break;
			case "-":
				msg = a + "-" + c + " = "+ calc.����(a, c);
				break;
			case "*":
				msg = a + "*" + c + " = " + calc.����(a, c);
				break;
			case "/":
				msg = a + "/" + c + " = " + calc.������(a, c);
				break;
			default:
				msg = "��� �� �� �����ϴ�";
				break;
		}
System.out.println(msg);
		
	}
}
		

