package java0424;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] a) {
		���ǹ� t = new ���ǹ�();
		t.t1(11);
		
		boolean r = t.t2(10);
		System.out.println(r);
		
		int i = t.t3(1, 5);
		System.out.println(i);
		
		int ii = t.t4(1, 5);
		System.out.println(ii);
		
		String msg = t.t5(1, 5);
		System.out.println(msg);
		
		String msg2 = t.t6(1, 5);
		System.out.println(msg2);
		
		String msg3 = t.t7(1, 5);
		System.out.println(msg3);
		
		String msg4 = t.t8(0);
		System.out.println(msg4);
		
		String msg5 = t.t9(0);
		System.out.println(msg5);
		
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in); //console â���� �Է°� �޴� ��ü ����
		String msg6 = t.t10(scan.nextInt()); // console â���� �Է� ���� ������ ���ڰ����� ���
		scan.close();            // Scanner ��ü ����(����)
		System.out.println(msg6);
	}
}
