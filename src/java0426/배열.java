package java0426;

public class �迭 {

	public void a1() {
		int a; //���� ����
		int[] aa;//�迭 ����
		
		a = 1;
		
		aa = new int[5]; // �迭 ���� �� ũ�� ����
		aa[0] = 1;
		
		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println(aa[0]);
		System.out.println(bb[0]);
		System.out.println(bb[1]);
	}
/*	public void a2() {
		int one��[] = new int[9];
		one��[0] = (1 * 1);
		one��[1] = (1 * 2);
		one��[2] = (1 * 3);
		one��[3] = (1 * 4);
		one��[4] = (1 * 5);
		one��[5] = (1 * 6);
		one��[6] = (1 * 7);
		one��[7] = (1 * 8);
		one��[8] = (1 * 9);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		//[0  1  2  3  4  5  6  7, 8 << ��ġ�� (�ε���)
		
		System.out.println("1 * 5 = " + one��[4]);
		
	} */
	public void a3() {
		int ��[] = new int[9];
		for(int i = 1; i <= 9; i++) { //���� �迭�� ������ �� ��� �ݺ��� ����
			int �� = (1 * i);
			int index = (i - 1); // 0,1,2,3,4,5,6,7,8
			��[index] = ��;
		}
		for(int i = 0; i < ��.length; i++) {
			int �� = (i + 1);
			System.out.println("1 * " + �� +" = " + ��[i]);
		}
	}
	public void a4() {
		String[] ���� = new String[7];
		����[0] = "��";
		����[1] = "��";
		����[2] = "ȭ";
		����[3] = "��";
		����[4] = "��";
		����[5] = "��";
		����[6] = "��";
		
		/*for(int i == 0; i <����.length; i = i+2) {
			System.out.println(����[i]);
		} ȸ���� ���� ������ �޸� ������ �Ҽ����� (�����ڵ���)*/ 
		
		for(int i =0; i <=7; i++) {
			if(i % 2 == 0) {
				System.out.println(����[i] + "����");
			}
		}
	}
	public void a5() {
		int[][] ���� = new int[5][5];
		����[0][0] = 5;
		����[0][1] = 3;
		����[1][2] = 1;
		
		
		for(int i = 0; i <����.length; i++) {
			for(int j = 0; j <����[i].length; j++) {
				System.out.print(����[i][j]);
			}
			System.out.println();
		}
	}
	public void a6() {
		//���� ���� �޷� �����͸� ���� �迭�� �����͸� ��� ������.
		
		String[][] ���� = new String[7][5];
		
		for(int i = 0; i < 7;  i++) {
			
			for(int j = 0; j < 5 ; j++) {
				System.out.print(����[i][j]);
				
				}
			System.out.println();
		}
	}
}
