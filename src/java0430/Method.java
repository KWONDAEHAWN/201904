package java0430;

public class Method {

	int a;
	
	
	public static void A() {
		System.out.println("Method A() ȣ��");
	}
	public void A(int a) {
		this.a = a;
	}
	public void A(String a) {
		System.out.println(a + this.a);
	}
	
}
