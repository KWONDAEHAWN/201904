package java0429;

import java.util.Scanner;

public class �迭 {


	public void t1() {
		
		boolean[][] ǥ = new boolean[5][5];
		ǥ[0][0] = false;
		ǥ[0][1] = false;
		ǥ[0][2] = false;
		ǥ[0][3] = false;
		ǥ[0][4] = false;

		ǥ[1][0] = true;
		ǥ[1][1] = true;
		ǥ[1][2] = true;
		ǥ[1][3] = true;
		ǥ[1][4] = true;
		
		ǥ[2][0] = false;
		ǥ[2][1] = false;
		ǥ[2][2] = false;
		ǥ[2][3] = false;
		ǥ[2][4] = false;
		
		ǥ[3][0] = true;
		ǥ[3][1] = true;
		ǥ[3][2] = true;
		ǥ[3][3] = true;
		ǥ[3][4] = true;
		
		ǥ[4][0] = false;
		ǥ[4][1] = false;
		ǥ[4][2] = false;
		ǥ[4][3] = false;
		ǥ[4][4] = false;
		
		for(int y = 0; y < ǥ.length; y++) {
			
			for(int x = 0; x <ǥ[y].length; x++) {
				System.out.print(ǥ[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t2() {
		int[][] ǥ = new int[5][5];
		
		for(int y = 0; y < ǥ.length; y++) {
			for(int x= 0; x < ǥ[y].length; x++) {
				if(y % 2 == 0) { //¦�� {0,2,4}
					ǥ[y][x] = 0;
				}else { //Ȧ�� {1,3}
						ǥ[y][x] = 1;
					
				}
			}
		}
		for(int y = 0; y < ǥ.length; y++) {
			
			for(int x = 0; x <ǥ[y].length; x++) {
				System.out.print(ǥ[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t3() {
		int[][] ǥ = new int[5][5];
		
		for(int y= 0; y < ǥ.length; y++) {
			for (int x = 0; x<ǥ.length; x++){
				if(y == x || y + x == 4){
					System.out.print(1);
				}else { //else if(y + x ==4){ �ᵵ����
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
	public void t4() {
		int [][] �� = new int[10][10];
		
		for(int y = 0; y<��.length; y++) {
			for(int x = 0;x<��[y].length; x++) {
				if(y == 0 || x == 0) {
					System.out.print(" �� ");
			} else if(x == 9 || y == 9) {
				System.out.print(" �� ");
			} else {
				System.out.print(" �� ");
			}
		}
			System.out.println();
	}
		System.out.println();
}
	public boolean t5(int aX, int aY, int bX, int bY) {

		boolean result = false;
		int [][] �� = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		
		for(int y = 0; y < ��.length; y++) {
			for(int x = 0; x < ��[y].length; x++) {
				
				if(��[aY][aX] == 0) {
					aY = bY;
					aX = bX;
					result = true;
				}
				
	
				if(y == aY && x == aX){
					System.out.print(" �� ");
				}else if(��[y][x] == 1) {
					System.out.print(" �� ");
				}else { 
					System.out.print(" �� ");
				}
			}
			System.out.println();
		}
	
	return result;
}
	public void t6() {
		Scanner scan =new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t5(aX,aY, bX,bY); //ó�� ��ġ ������ ���Ͽ� �ʿ��� ȣ��κ�
		while(true) {
			String input = scan.next();
			switch (input.toUpperCase()) {
			case "W": //��
				aY--;		
				break;
			case "S": //�Ʒ�
				aY++;		
				break;
			case "A": //����
				aX--;		
				break;
			case "D": //������
				aX++;		
				break;
			default:
				break;
			}
			System.out.println(aY + "," + aX + "," + bY + "," + bX);
			if (t5(aX,aY, bX,bY)) { // �̵��� ���Ͽ� ȣ�� �κ�
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}

		}
		
	}
}
