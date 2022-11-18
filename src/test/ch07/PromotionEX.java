package test.ch07;
/*
		<- B  <- D
	A
		<- C  <- E
*/
class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}




public class PromotionEX {

	
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		//자동타입변환   부모클래스 변수명 = 자식;      부모 <- 자식
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b3 = e; //T: 상속관계에 있지 않으면 자동타입 변환을 할 수 없다.  
		C c2 = d; //T: 상속관계에 있지 않으면 자동타입 변환을 할 수 없다.
		//B와 E는 전혀 관계가 없음(상속관계가아님) 따라서 자동타입 변환 사용 불가
		
	}

}
