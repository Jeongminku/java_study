package test.ch07.polymorphism;

public class CarEX {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// myCar.run(); // 객체를 넣어주지않고 실행시키니 java.lang.NullPointerException 오류 발생 하려면 void run()안에 Tire tire = new Tire(); 를 넣었어야.
		
		//Tire객체를 넣어준다.
		myCar.wingTire = new Tire(); // 타이어 객체를 넣어줌
		myCar.run();
		System.out.println("========구분선========");
		myCar.wingTire = new HankookTire();
		myCar.run();
		System.out.println("========구분선========");
		myCar.wingTire = new KumhoTire();
		myCar.run();
	}

}
