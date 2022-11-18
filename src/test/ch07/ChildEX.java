package test.ch07;
//Parent, Child, ChildEX
public class ChildEX {
  
	public static void main(String[] args) {
		/*자동타입변환
		//자식 객체 선언
		Child child = new Child();
		
		//부모가 자식을 품고있음. 자동타입변환 (부모에게 자식을 넣어줌)
		Parent parent = child;
		
		
		parent.method1(); // parent - method1()이 실행
		
		
		parent.method2(); // Child-method2()가 실행
		//★자동타입변환시 오버라이드 된 메소드를 불러온다.
		
		//parent.method3(); // 컴파일 에러 발생
		//The method method3() is undefined for the type Parent
		//★자식 객체에 있는 메소드는 불러오지 못한다.
		
		System.out.println("부모필드값:"+ parent.a);
		parent.a = 2;
		System.out.println("부모필드값:"+ parent.a);
		//parent.b = 1;
		//★자식객체에 있는 필드는 불러오지 못한다.     
		  
		 
		*/
	
		
		
		Parent parent = new Child(); //자동 타입 변환
		
		//instanceof = 객체타입을 확인하게해주는 자바에서 제공하는 연산자.
		
		/*
		if (parent instanceof type) { //parent 매개변수 가 type객체를 담고 있는가 라고 물음.
			type new_name = (type) parent;
			
		}
		*/
		
		//parent가 Child 타입이 아니라면, 강제타입 변환을 할 수 없음.
		if (parent instanceof Child) { //parent 매개변수가 Child객체를 담고있는가 
			//담고있으면 true를 뱉음.41010101010101010101010101010101010101010101010101010101010101010101010101010101010101010
			//true 라면 { } 안을 실행하라.
			System.out.println(parent instanceof Child);
			
			Child child = (Child)parent; //강제 타입 변환
			//강제타입변환을 하려면 자동타입변환(자식 -> 부모) 를 먼저 한 후에 강제타입변환(부모 -> 자식)을 해야함.
			
			System.out.println("자식필드 기본값:"+ child.b);
			child.b = 1; //자식 객체에 있는 필드에 접근 가능.
			System.out.println("자식필드 변경값:"+ child.b);
			child.method3(); // 자식 메소드에 있는 필드에 접근 가능.
			
		}
		
		
	}
}
/*
부모클래스 변수명 = 자식클래스 (자동타입변환)
 
부모 클래스에 선언된 필드와 메소드, 필드에만 접근이 가능하다.
자식 클래스에 오버라이딩 된 메소드가 있다면 오버라이딩된 메소드,필드 가 호출

부모클래스에 있는거 그대로 쓰는데 자식이 오버라이딩한거 있으면 부모클래스 값이 오버라이딩값으로 바뀜.

*/


/*
(강제타입변환) 
부모클래스 변수명 = 자식클래스     (자동타입변환) 후에
if (parent instanceof Child)를 사용하여 담고있는지 확인하고
자식클래스 변수명 = 부모클래스    (강제타입변환) 을 사용할 수 있다.


*/
