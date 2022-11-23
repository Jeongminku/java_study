package test.ch09.Outer;

public class Athis {
	//Athis 클래스의 인스턴스 필드를 생성.
	String field1 = "Athis 인스턴스 필드";
	
	//Athis 클래스의 인스턴스 메소드를 생성
	void method(){
		System.out.println("Athis 인스턴스 메소드");
	}
	
	class B{
		
		//내부B 클래스의 인스턴스 필드 생성
		String filed1 = "내부 B의 인스턴스 필드";
		
		//내부 B클래스의 인스턴스 메소드를 생성1
		void method() {
			System.out.println("내부 B의 인스턴스 메소드");
		}
		//내부 B클래스의 인스턴스 메소드를 생성2
		void print() {
			//B객체의 필드와 메소드를 사용하였습니다.
			System.out.println(this.filed1); //Athis.B 의 field1
			this.method(); //Athis.B의 method
			
			
			//A객체의 필드와 메소드를 사용하였습니다.
			System.out.println(Athis.this.field1);  //Athis의 this의 field1를 가져오므로 A객체의 필드를 불러옵니다.
			Athis.this.method(); //Athis의 this의 method를 가져옵니다
		}
	}//내부 B클래스 끝
	
	
	//A클래스의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
	
}
