package java0430;

import java.util.Scanner;

public class ������ {

	int[][] map = {
			{0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,1,0},
	};
	int[] play = {1,1}; // Y , X
	int[] ���� = new int[6];
	int count = 0;
	int[] history = {1,1}; // Y , X
	int[][] ������ = {
			{2,2},
			{2,7},
			{4,5},
			{6,2},
			{6,7},
			{8,4},
	};
	
	public void start() {
		Scanner scan = new Scanner(System.in); 
		view();	
		while(true) {
			switch (scan.next().toUpperCase()) { // �Է¹��� ���� ������ �빮�ڷ�
			//����ڿ��� ��ɾ �޴´�.
			case "W":  //���� (-1)
				play[0] = play[0] -1; 
				break;
			case "S":  //�Ʒ��� (+1)
				play[0] = play[0] +1;
				break;
			
			case "A":  //���� (-1)
				play[1] = play[1] -1;
				break;

			case "D":  //������ (+1)
				play[1] = play[1] +1;
				break;
			default:
				break;
			}
			
			// �� ���� ó��
			if(play[0] == 0) {
				play[0] = 1;
			}else if(play[1] == 0) {
				play[1] = 1;
			}else if(play[1] == 8) {
				play[1] = 7;
			}else if(play[0] == 9 && play[1] == 7) {
				view();
				System.out.println("���� �׸�");
				break;
			}if(play[0] == 9) {
				play[0] = 8;
			}
			

			//������ ���� ó�� : 6���� �ݺ����� �ʿ��ϴ�.
			for(int ��� = 0; ��� < ������.length; ���++) {
				if(play[0] == ������[���][0] && play[1] == ������[���][1]) {
					����[count] = ��� + 1; // 1,2,3,4,5,6
					count++;
					

				}
			}
			if(count > 0) {
				//�������� �����丮 ����
				for(int ��� = 0; ��� < count; ���++) {
					int ����������� = ����[���] - 1;
					if(������[�����������][0] != play[0] && ������[�����������][1] != play[1]) {
					������[�����������][0] = history[0];
					������[�����������][1] = history[1];
					}else {
						int ������������� = ����[���-1] -1;
						������[�����������][0] = ������[�������������][0];
						������[�����������][1] = ������[�������������][0];
					}
				}
			}
			view();
			
			//�������� �����丮 ����
			history[0] = play[0];
			history[1] = play[1];
			
		}
	}
	public void view() {
		for(int row = 0; row < map.length; row ++) {
			for(int col = 0; col < map[row].length; col++){
				//System.out.print(map[row][col]);
				boolean check = true;
				if(play[0] == row && play[1] == col) {
					System.out.print(" �� ");
					continue;
				}
				
				for(int ��� = 0; ��� < ������.length; ���++) {
					for(int i = 0; i <= count; i++) {
						
					
					if(��� + 1 != ����[i]) {
						if(������[���][0] == row && ������[���][1] == col) {
							System.out.print(" �� ");
							check = false;
							break;
						}
					} else if((��� + 1) == ����[i]) {
						if(������[���][0] == row && ������[���][1] ==col) {
						System.out.print(" �� ");
						check = false;
						break;
						}
					}
				}
				}				
				if(check) {
				if(map[row][col] == 0) {
					System.out.print(" �� ");
				}else if(map[row][col] == 1) {
					System.out.print(" �� ");
				}
			}
		}
		System.out.println();
		}
	}
	public void move() {
		
	}
	
	public void sum() {
		
	}
}
