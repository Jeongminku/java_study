package test.ch06;

public class Car {
	

	//1. 필드: 객체의 데이터를 저장
	String company = "현대자동차";
	String model;
	String color;
	//boolean start; //시동여부
	int maxSpeed;
	int speed;

	
	//public class Car 이므로 Car 이름 똑같게 해줘야. (매개변수는 자유롭게 작성 가능.)
	//자바에서는 생성자를 명시하지않으면, 컴파일 과정에서 생성자를 생성해준다.
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}