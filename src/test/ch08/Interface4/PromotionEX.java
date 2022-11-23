package test.ch08.Interface4;

public class PromotionEX {

	public static void main(String[] args) {
		//객체생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a; //인터페이스 변수 선언
		//자동 타입변환(자동 형변환)
		
		a = b; // A a = new B();
		a = c;
		a = d;
		a = e;
		
		
		
	}

}
