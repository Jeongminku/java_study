package test.ch07.package1;

public class B {
	public void method () {
		 
		
		A a = new A(); // O 생성자는 문제없이 실행된거 확인함.
		
		a.field = "1"; // O 필드에 문제없이 접근함.
		
		a.method(); // O 메소드도 문제없이 접근함.
		
	}
}
