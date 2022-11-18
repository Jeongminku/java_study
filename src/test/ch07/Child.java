package test.ch07;

public class Child extends Parent {
	//자식 필드
	public int b = 5;
	
	
	
	@Override
	public void method2() {
		System.out.println("Child-method2()가 실행되었습니다");
	}

	public void method3() {
		System.out.println("Child-method3()이 실행되었습니다");
	}
}
