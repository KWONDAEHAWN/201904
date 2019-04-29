package java0424;

public class Main {
	
	//1.생성자 : {}
	// >> 생성자 안에 생성자 생성은 하지 않는다.
	// >> 생성자 안에 메소드 생성은 하지 않는다.
	//2.변수, 상수 - 클래스 전역 
	//3.메소드 : {} > 변수 - 메소드 전역 - 지역 
	// >> 메소드 안에 메소드 생성은 하지 않는다.
	// >> 메소드 안에 생성자 생성은 하지 않는다.
	//4.static(정적) : 만들지 않는다, 단 main 메소드만 static을 사용한다.
	//5.기능 구현 할 때 가능하면 클래스를 적극 활용한다.
	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		int c ;
		float d;
		계산기 calc = new 계산기(); // 기능 : 계산기
		
		calc.테스트(a, b);
		//덧셈 함수 호출
		c=calc.덧셈(a,b);
		c=calc.뺄셈(a,b);
		d=calc.나눗셈(a,b);
		d=calc.곱셈(a,b);
		
	}	
}
