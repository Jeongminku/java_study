package test.ch06;

public class Car {
	

	//1. 필드: 객체의 데이터를 저장!!
	String company = "현대자동차";
	String model;
	String color;
	//boolean start; //시동여부
	int maxSpeed;
	int speed;
	static int numbering = 0;
	
	//public class Car 이므로 Car 이름 똑같게 해줘야. (매개변수는 자유롭게 작성 가능.)
	//자바에서는 생성자를 명시하지않으면, 컴파일 과정에서 생성자를 생성해준다.
	

	
	Car(){
		numbering++;
	}
	
	Car(String model){
		//this.model = model;
		this(model, "오이색", 250); // 35번째가 모델,컬러,맥스스피드 순서이므로 this에도 순서를 모델,컬러, 맥스스피드 순서에 맞게  맞춰줘야.
	}			
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color , 290);
	}
	
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
