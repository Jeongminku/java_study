package test.ch09.InnerClass;

public class AEX {

	public static void main(String[] args) {
/*
		//외부에서 중첩된 B클래스를 사용해보기.		
		A a = new A(); //중첩클래스는 항상 가장 밖에 있는 녀석을 먼저 정의해줘야 안에있는(B)녀석을 쓸 수 있음.

		A.B b = a.new B();
*/	
		
		A a = new A();
		a.useB();
		
		
	}

}
