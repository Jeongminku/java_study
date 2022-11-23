package test.ch09.InnerClass;

public class ALocal {
	
	void useB(int arg) { //final int arg 와 같음. (자바 8 부터는 final을 쓰지 않았지만 그렇게 취급됨.)
		
		//로컬변수(함수 내부에서 쓰이는 로컬변수) 생성
		int var = 1; //final int var과 같음.     (자바 8 부터는 final을 쓰지 않았지만 그렇게 취급됨.)
	
		
		
		class B {
			//클래스 B 내의 인스턴스 필드
			int field1 = 1;
			
			//클래스 B 내의 생성자
			B() {
				System.out.println("클래스 B 내의 생성자 B() 실행.");
			}
			
			//클래스 B 내의 인스턴스 메소드
			void method1() {
				System.out.println("클래스 B 내의 method1() 실행.");
			}
			
			void method2() {
//				arg = 2; //자바 8 부터는 final을 쓰지 않았지만 final처럼 취급되므로,중첩한곳(중첩한 클래스 내)에서는 로컬변수값을 바꿔줄수없다.
//				var = 3;  //자바 8 부터는 final을 쓰지 않았지만 final처럼 취급되므로,중첩한곳(중첩한 클래스 내)에서는 로컬변수값을 바꿔줄수없다.
			}
			
			
			
		}//class B 밖임.

		//useB 메소드 안임.
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
	}
}
