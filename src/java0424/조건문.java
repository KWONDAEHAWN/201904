package java0424;

public class ���ǹ� {

	/********************************
	 * - if��
	 * if(���ǽ�) {} ^�ʼ�, ����
	 * else{} if ������ �ƴѰ�
	 * else if(���ǽ�) {} �ι�° ������ �ʿ� �Ҷ�
	 * - ���� ��� (����)
	 * == : ����
	 * != : ���� �ʴ�
	 * > : ũ��
	 * < : �۴�
	 * >= : ũ�ų� ����
	 * <= : �۰ų� ����
	 * 
	 * - switch ��
	 * switch(�񱳰�)
	 * case �� : �񱳰��� ���� ������ ����
	 * default : �񱳰��� case ���� ������ ����
	 *******************************/
	public void t1(int a) {
		if(10 == a) {
			System.out.println("����");
		}
		else {
			System.out.println("�����ʴ�");
		}
	}
	public boolean t2(int a) {
		if(10 == a) {
			return true;
		} else {
			return false;
		}
	}
	public int t3(int a, int b) {
		if(a == b) {
			return 1;
		} else {
			return 0;
		}
	}
		
		public int t4(int a, int b) {
			if(a > b) {
				return a;
			}else if(a <b) {
				return b;
			}else {
				return -1;
			}
		}

		public String t5(int a, int b) {
		if(a == b) {
			return "�ΰ��� ���� ����";
		}else if(a != b) {
			return "�ΰ��� ���� ���� �ʴ�";
		}else if(a > b) {
			return "a ������ ���� ũ��";
		}else if(a < b) {
			return "b ������ ���� ũ��";
		}else if(a >= b) {
			return "a ������ ���� b���� ũ�ų� ����";
		}else if(a <= b) {
			return "a ������ ���� b���� �۰ų� ����";
		}else {
			return "�ΰ��� ���� �� �� �� ����";
	}
}
		public String t6(int a, int b) {
			if(a == b) {
				return "�ΰ��� ���� ����";
			}
			if(a != b) {
				return "�ΰ��� ���� ���� �ʴ�.";
			}
			if(a > b) {
				return "a ������ ���� ũ��";
			}
			if(a < b) {
				return "b ������ ���� ũ��";
			}
			return "�ΰ��� ���� �� �� �� ����.";
		}
		// else if�� ���ָ� ���Ἲ, �ش��� ������ ����
		// t6�� ���� if�� ���� �и�, ���Ἲx ���� ã���൵ ��� ����
		// ������ return�� �������ν� t5�� t6�� ����� ����
		// t7�� return�� �������� �������־��� ������ ��� ���� ���ü��� ����.
		public String t7(int a, int b) {
			String msg = "";
			if(a == b) {
				msg = "�ΰ��� ���� ����";
			}
			if(a != b) {
				msg = "�ΰ��� ���� ���� �ʴ�.";
			}
			if(a > b) {
				msg = "a ������ ���� ũ��";
			}
			if(a < b) {
				msg = "b ������ ���� ũ��";
			}
			return msg;
		}
		public String t8(int a) {
			String msg ="";
			switch (a) {
			case 0:
				msg = "���� ���� ���� 0�Դϴ�.";
				break;
			default:
				msg = "���� ���� ���� case�� �����ϴ�.";
				break;
			}
			return msg;
		}
		//���� �������մ°Ϳ� ���� ��.
		//���� �������ְ� ���ϴ� ��
		//���� case 0 <- 0�̶� ��
		//break�� ������ case�� ���� ��ġ�ص� default�� ������
		
		public String t9(int a) {
			String msg = "";
			
			switch (a) {
			case 0:
				msg = msg + "0��";
				
			case 1:
				msg = msg + "1��";
				
			case 2:
				msg = msg + "2�� ������ ���Դϴ�.";
				
				break;
			default:
				msg = "0~2 ������ ���� �ƴմϴ�.";
				break;
			}
			return msg;
		}
		public String t10(int score) {
			String grade = "";
			
			switch (score /10) {
			case 10:
			case 9:
			grade="A";
			break;
			case 8:
			grade="B";
			break;
			case 7:
			grade="C";
			break;
			case 6:
			grade="D";
			break;
			
			default :
			grade="F";
			break;
			}
			return grade;
		}
}


