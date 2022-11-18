package test.ch07;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ChildEX2 {

	public static void main(String[] args) {
		//자식 객체 선언
		Child child = new Child();
		
		//부모가 자식을 품고있음. 자동타입변환 (부모에게 자식을 넣어줌)
		Parent parent = child;
		
		
		parent.method1(); // parent - method1()이 실행
		
		
		parent.method2(); // Child-method2()가 실행
		//★자동타입변환시 오버라이드 된 메소드를 불러온다.
		
		System.out.println("부모 1 실행");
		parent.method1();
		System.out.println("자식 1 실행");
		child.method1();
		System.out.println("부모 2 실행");
		parent.method2();
		System.out.println("자식 2 실행");
		child.method2();
		
		System.out.println("자식 3 실행");
		child.method3();
		//parent.method3(); // 컴파일 에러 발생
		//The method method3() is undefined for the type Parent
		//★자식 객체에 있는 메소드는 불러오지 못한다.
		
		System.out.println("부모필드값:"+ parent.a);
		parent.a = 2;
		System.out.println("부모필드값:"+ parent.a);
		//parent.b = 1;
		//★자식객체에 있는 필드는 불러오지 못한다.     
		 
		 
		

	}

}
