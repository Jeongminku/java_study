package test.ch06;

public class This {
	//필드
	String model;
	int speed;
	
	//생성자
	This(String model) {
		this.model = model; 
		//this 생략 X
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
		//this 생략 X
	}
	
	void run() {
		this.setSpeed(100);
		//setSpeed 라고 써도 상관없음.
		//같은 클래스 간의 메소드를 호출시 this 생략가능
		System.out.println(this.model + "," + this.speed); //this 생략가능
	}
}


/*
this가 생략이 안되는 경우: 매개변수명과 필드명이 겹칠때는 this를 반드시 사용하여 this.필드명 을 사용하도록 한다.
						즉 this가 써있는것이 필드를 가리키는 경우가 됨.
						

*/