package test.ch09.Outer;

public class A {
	//A클래스의 인스턴스 필드&&메소드.
	int field1;
	void method1() {}
	
	//A클래스의 정적(static) 필드&&메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void methodB() {
			field1 = 10; //A클래스의 인스턴스 필드 접근 O
			method1(); //A클래스의 인스턴스 메소드 접근 O
			
			field2 = 300; //A클래스의 static 필드 접근 O
			method2(); //A클래스의 static 필드 접근 O
		}
	}
	
	//정적(static) 멤버클래스
	static class C{
		void methodC() {//static 멤버 클래스(C)에서는 바깥 클래스(A)의 인스턴스 필드와 메소드에 접근 할 수가 없다.
			field1 = 10; //A클래스의 인스턴스 필드 접근 X 불가
			method1(); //A클래스의 인스턴스 메소드 접근 X 불가
			
			field2 = 300; //A클래스의 static 필드 접근 O
			method2(); //A클래스의 static 필드 접근 O
		}
		
		
	}
}
