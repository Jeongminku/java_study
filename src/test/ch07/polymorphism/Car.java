package test.ch07.polymorphism;
	
	
public class Car {
	//필드로 타이어 객체 선언   (목표 : 필드로 다형성 구현하기)
	public Tire wingTire;
	
	//부모클래스 변수명 = 자식클래스   자동타입변환
	//public Tire wingTire = new HankookTire();
	//public Tire wingTire = new KumhoTire();
	
	public void run() {//타이어를 굴리는 역할을 합니다. 타이어 클래스의 roll()이라는 함수를 실행하면 됩니다. 
		wingTire.roll();
	}
}
