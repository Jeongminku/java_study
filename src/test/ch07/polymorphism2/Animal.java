package test.ch07.polymorphism2;
//abstract: 추상 클래스란? 상속을 하기위해 만든 클래스이다. 완전하지 않은 클래스이다. 추상 메소드를 가질 수 있다.
public abstract class Animal {
	//일반 메소드 쓸수는 있다.
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언   추상메소드는 구현을 할 수 없기때문에 { } 를 쓰면 오류가 난다.
	//public abstract void sound() {}
	
	//추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야한다.
	public abstract void sound();
}
