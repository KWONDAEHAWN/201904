package java0426;

import java.util.Scanner;

public class �ݺ��� {

	public void lv1() {
		System.out.println("�����ܽ��۾�");
		for(int y = 1; y <= 9; y++) {
			
			System.out.println(y + "��");
			for (int x = 1; x <=9; x++) {
				System.out.println(y + "*" + x +  "=" + " = "+ (y*x));
			}
			System.out.println();
		}
	}
	
	public void lv2() {
		
		System.out.println("�����ܽ��۾�zzz");
		for(int y = 1; y <= 9; y = y+3) {
			System.out.print(y + "��\t\t");
			System.out.print((y + 1) + "��\t\t");
			System.out.print((y + 2) + "��\t\t");
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
		
		System.out.println("�����ܽ��۾�adasfs");
		for(int y = 1; y <= 3; y++) {
			System.out.print(y + "��\t\t");
			System.out.print((y + 3) + "��\t\t");
			System.out.print((y + 6) + "��\t\t");
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
		
		System.out.println("X������ ��� ���� ������ �Է��ϼ���.");
		//X������ ��� ���� ������ �Է¹޴´�.
		int x�� = scan.nextInt();
		
		for(int y = 1; y <= 9; y = y + x��) {
			for(int x = 1; x <=9; x++) {
				for(int ��� = 0; ��� <x��; ���++) {
					System.out.print((y+���) + "*" + x +  "=" + " = "+ (y+���) * x+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		scan.close();
		
		
	}
	public void lv5() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("X������ ��� ���� ������ �Է��ϼ���:");
	//X������ ��� ���� ������ �Է¹޴´�.
	System.out.println("Y������ ��� ���� ������ �Է��ϼ���:");
	int x�� = scan.nextInt();
	int y�� = scan.nextInt();
	for(int y = 1; y <= (y�� * x��); y = y + x��) {
		for(int x = 1; x <=9; x++) {
			for(int ��� = 0; ��� <x��; ���++) {
				if((y+���) > 9) {
					break;
				}
				System.out.print((y+���) + "*" + x +  "=" + (y+���) * x+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	scan.close();
	
	
	}
}

