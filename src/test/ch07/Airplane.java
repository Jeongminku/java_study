package test.ch07;
//일반 비행기

//클래스에 final을 앞에 붙여주면 그 클래스는 부모클래스로 사용 불가.
public /*final*/ class Airplane {
	//메소드
	public void land() {
		System.out.println("착륙");
	}
	//메소드에 final을 붙이면 그 메소드는 오버라이드 불가.
	public /*final*/ void fly() {
		System.out.println("일반 비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	}
}
