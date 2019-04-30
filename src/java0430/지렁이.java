package java0430;

import java.util.Scanner;

public class 지렁이 {

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
	int[] 꼬리 = new int[6];
	int count = 0;
	int[] history = {1,1}; // Y , X
	int[][] 먹을꺼 = {
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
			switch (scan.next().toUpperCase()) { // 입력받은 값이 무적건 대문자로
			//사용자에게 명령어를 받는다.
			case "W":  //위쪽 (-1)
				play[0] = play[0] -1; 
				break;
			case "S":  //아래쪽 (+1)
				play[0] = play[0] +1;
				break;
			
			case "A":  //왼쪽 (-1)
				play[1] = play[1] -1;
				break;

			case "D":  //오른쪽 (+1)
				play[1] = play[1] +1;
				break;
			default:
				break;
			}
			
			// 벽 예외 처리
			if(play[0] == 0) {
				play[0] = 1;
			}else if(play[1] == 0) {
				play[1] = 1;
			}else if(play[1] == 8) {
				play[1] = 7;
			}else if(play[0] == 9 && play[1] == 7) {
				view();
				System.out.println("게임 그만");
				break;
			}if(play[0] == 9) {
				play[0] = 8;
			}
			

			//먹을꺼 예외 처리 : 6개라서 반복문이 필요하다.
			for(int 대상 = 0; 대상 < 먹을꺼.length; 대상++) {
				if(play[0] == 먹을꺼[대상][0] && play[1] == 먹을꺼[대상][1]) {
					꼬리[count] = 대상 + 1; // 1,2,3,4,5,6
					count++;
					

				}
			}
			if(count > 0) {
				//먹을꺼의 히스토리 적용
				for(int 대상 = 0; 대상 < count; 대상++) {
					int 오리지날대상 = 꼬리[대상] - 1;
					if(먹을꺼[오리지날대상][0] != play[0] && 먹을꺼[오리지날대상][1] != play[1]) {
					먹을꺼[오리지날대상][0] = history[0];
					먹을꺼[오리지날대상][1] = history[1];
					}else {
						int 오리지날전대상 = 꼬리[대상-1] -1;
						먹을꺼[오리지날대상][0] = 먹을꺼[오리지날전대상][0];
						먹을꺼[오리지날대상][1] = 먹을꺼[오리지날전대상][0];
					}
				}
			}
			view();
			
			//먹을꺼의 히스토리 적용
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
					System.out.print(" ♣ ");
					continue;
				}
				
				for(int 대상 = 0; 대상 < 먹을꺼.length; 대상++) {
					for(int i = 0; i <= count; i++) {
						
					
					if(대상 + 1 != 꼬리[i]) {
						if(먹을꺼[대상][0] == row && 먹을꺼[대상][1] == col) {
							System.out.print(" ♥ ");
							check = false;
							break;
						}
					} else if((대상 + 1) == 꼬리[i]) {
						if(먹을꺼[대상][0] == row && 먹을꺼[대상][1] ==col) {
						System.out.print(" ♣ ");
						check = false;
						break;
						}
					}
				}
				}				
				if(check) {
				if(map[row][col] == 0) {
					System.out.print(" ■ ");
				}else if(map[row][col] == 1) {
					System.out.print(" □ ");
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
