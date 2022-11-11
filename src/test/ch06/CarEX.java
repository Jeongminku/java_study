package test.ch06;

public class CarEX {

	public static void main(String[] args) {
		
		/*
		// 1. 객체생성 (객체를 사용하기위해 가장먼저하는것)
		Car myCar = new Car(); //myCar 라는 Car 객체가 새로 생성된것.       myCar 10번지 - 10번지 찾아가서 힙 영역에 도달 -> 내용 존재 
		Car myCar2 = new Car(); //myCar2 20번지 - 20번지 찾아가서 힙 영역에 도달 -> 내용 존재          따라서 myCar와 myCar2 는 전혀 다른존재.
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		//System.out.println(myCar.start);
		
		myCar.speed = 60; // 필드 변경
		System.out.println(myCar.speed);
		myCar2.speed = 70;
		System.out.println(myCar == myCar2); //myCar 와 myCar2는 전혀 다른존재.
		System.out.println("수정된값 myCar: " + myCar.speed);
		System.out.println("수정된값 myCar2: " + myCar2.speed);
		*/
		
		Car myCar = new Car("그랜저","리블",255);
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
	}

}
//자바에서는 생성자를 명시하지않으면, 컴파일 과정에서 생성자를 생성해준다.

