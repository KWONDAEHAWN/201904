package ew;

public class ifex1 {
String msg = "";
	
	public void ifex(int score) {
		
		if(score >= 60) {
			System.out.println("�հ��� �����մϴ�.");
		}
	}
	public void ifex2(int score) {
		
		if(score >= 60) {
			System.out.println("�հ��� �����մϴ�!!.");
		} else {
			System.out.println("������ �ٽ� ������.");
		}
	}
	public void ifex3(int score) {
		if(score >=90) {
			System.out.println("A�����Դϴ�.");
		}else if(score >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(score >= 70) {
			System.out.println("C�����Դϴ�.");
		}else if(score >= 60) {
			System.out.println("D�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
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
		System.out.println(grade + "���� �Դϴ�");
	}
}

