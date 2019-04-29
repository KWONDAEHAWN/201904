package java0424;

public class 조건문 {

	/********************************
	 * - if문
	 * if(조건식) {} ^필수, 조건
	 * else{} if 조건이 아닌것
	 * else if(조건식) {} 두번째 조건이 필요 할때
	 * - 비교자 대상 (비교자)
	 * == : 같다
	 * != : 같지 않다
	 * > : 크다
	 * < : 작다
	 * >= : 크거나 같다
	 * <= : 작거나 같다
	 * 
	 * - switch 문
	 * switch(비교값)
	 * case 값 : 비교값과 값이 같으면 실행
	 * default : 비교값이 case 값에 없으면 실행
	 *******************************/
	public void t1(int a) {
		if(10 == a) {
			System.out.println("같다");
		}
		else {
			System.out.println("같지않다");
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
			return "두개의 값이 같다";
		}else if(a != b) {
			return "두개의 값이 같지 않다";
		}else if(a > b) {
			return "a 변수의 값이 크다";
		}else if(a < b) {
			return "b 변수의 값이 크다";
		}else if(a >= b) {
			return "a 변수의 값이 b보다 크거나 같다";
		}else if(a <= b) {
			return "a 변수의 값이 b보다 작거나 같다";
		}else {
			return "두개의 값을 비교 할 수 없다";
	}
}
		public String t6(int a, int b) {
			if(a == b) {
				return "두개의 값이 같다";
			}
			if(a != b) {
				return "두개의 값이 같지 않다.";
			}
			if(a > b) {
				return "a 변수의 값이 크다";
			}
			if(a < b) {
				return "b 변수의 값이 크다";
			}
			return "두개의 값을 비교 할 수 없다.";
		}
		// else if를 써주면 연결성, 해답이 나오면 멈춤
		// t6과 같이 if만 쓰면 분리, 연결성x 답을 찾아줘도 계속 실행
		// 하지만 return을 써줌으로써 t5와 t6은 결과는 같음
		// t7은 return이 마지막에 선언해주었기 때문에 모두 참이 나올수도 있음.
		public String t7(int a, int b) {
			String msg = "";
			if(a == b) {
				msg = "두개의 값이 같다";
			}
			if(a != b) {
				msg = "두개의 값이 같지 않다.";
			}
			if(a > b) {
				msg = "a 변수의 값이 크다";
			}
			if(a < b) {
				msg = "b 변수의 값이 크다";
			}
			return msg;
		}
		public String t8(int a) {
			String msg ="";
			switch (a) {
			case 0:
				msg = "전달 받은 값은 0입니다.";
				break;
			default:
				msg = "전달 받은 값은 case에 없습니다.";
				break;
			}
			return msg;
		}
		//값이 고정되잇는것에 많이 씀.
		//값을 고정해주고 비교하는 용
		//위에 case 0 <- 0이랑 비교
		//break가 없으면 case랑 값이 일치해도 default로 내려감
		
		public String t9(int a) {
			String msg = "";
			
			switch (a) {
			case 0:
				msg = msg + "0비교";
				
			case 1:
				msg = msg + "1비교";
				
			case 2:
				msg = msg + "2비교 범위의 값입니다.";
				
				break;
			default:
				msg = "0~2 범위의 값이 아닙니다.";
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


