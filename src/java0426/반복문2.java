package java0426;

public class �ݺ���2 {

	public void t1() {
		for(int i = 0; i<10; i++) {
			System.out.println("Break ��");
			break; //����
			// System.out.println("break ��"); //�ڵ��ۼ� �Ұ�
		}
	}
	public void t2 () {
		for(int i = 0; i <10; i++) {
			System.out.println("Continue ��"); //�ڵ� ���� ����
			continue; //���� ������ �ٷ� �̵�
//			System.out.println("Continue ��"); // �ڵ� �ۼ� �Ұ�
		}
	}
	public void t3() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "��° ���a");
			if(i % 2 == 0) {
				continue;
			}else {
				break;
			}
		}
	}
	public void t4(int stop) {
		for(int i = 0; i < 10; i++) {
			if( i % 2 == 0) {
				continue;
			}else if(i == stop) {
				break;
			}
			System.out.println(i + "��° ���");
		}
	}
}
