package test.ch09.InnerClass;
//중첩된 클래스가 내부에서 사용될 경우 사용법. 1, 2, 3
public class A {
	//중첩된 클래스 - 인스턴스 멤버 클래스
	//사용가능한 접근제한자 3가지
	//public, default, private
	class B {
		//필드
		int field1 = 1;
		
		//생성자
		B() {
			System.out.println("B()생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B의 method1() 실행");
			
		}
	}
	
	//A클래스에 만든것
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	
	
	
	
/*
	//1. B클래스를 필드로 만들기.
	B field = new B();
	
	//2. A클래스 생성자에서 사용이 가능합니다.
	A() {
		B b = new B();
	}
	
	//3. 메소드에서 사용 가능
	void method() {
		B b = new B();
	}
*/	
	
}
