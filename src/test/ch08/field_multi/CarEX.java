package test.ch08.field_multi;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();//Car에 대한 객체 생성.
		myCar.run();
		
		
		//타이어 객체 교체
		//HankookTire였던 tire1과 tire2를 KumhoTire로 바꿔줌.
		myCar.tire1 = new KumhoTire(); // Tire tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		myCar.run();
	}

}
