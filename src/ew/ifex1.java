package ew;

public class ifex1 {
String msg = "";
	
	public void ifex(int score) {
		
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		}
	}
	public void ifex2(int score) {
		
		if(score >= 60) {
			System.out.println("합격을 축하합니다!!.");
		} else {
			System.out.println("다음에 다시 오세요.");
		}
	}
	public void ifex3(int score) {
		if(score >=90) {
			System.out.println("A학점입니다.");
		}else if(score >= 80) {
			System.out.println("B학점입니다.");
		}else if(score >= 70) {
			System.out.println("C학점입니다.");
		}else if(score >= 60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}
	public void ifex4(int score) {
		String grade = null;
		if(score >=90) {
			if(score >= 95) grade = "A+";
			else grade = "A0";
		}else if(score >= 80) {
			if(score >= 85) grade = "B+";
			else grade = "B0";
		}else if(score >= 70) {
			if(score >= 75) grade = "C+";
			else grade = "C0";
		}else if(score >= 60) {
			if(score >= 65) grade = "D+";
			else grade = "D0";
		}else {
			grade = "F";
		}
		System.out.println(grade + "학점 입니당");
	}
}

