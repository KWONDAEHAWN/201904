package java0426;
import java.util.Scanner;

public class �ݺ���3 {

	public void t1() {
			
	while(true) {
		// true�� �������� ���� ������ �˴ϴ�.
		System.out.println("���� ����");

		}
	}
	public void t2() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�Է��ϼ��� >>");
			String input = scan.next();
			if("exit".equals(input)) {
				break;
			}
			System.out.println("���� ����");
		}
		System.out.println("while�� ����");
		scan.close();
	}
	
	public void t3() {
		int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
			}
		System.out.println("Count : " + count);
	}

	
}


