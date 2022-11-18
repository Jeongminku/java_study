package test.ch06;

public class ThisEX {

	public static void main(String[] args) {
		This myCar = new This("포르쉐");
		This yourCar = new This("벤츠");
		
		myCar.setSpeed(30);
		System.out.println(myCar.speed);
		
		myCar.run();
		yourCar.run();
		
		
	}

}
