package test.ch07.polymorphism2;

public class DriverEX {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus); //Vehicle vehicle = new Bus();
		driver.drive(taxi);//Driver객체의 drive함수에 taxi객체를 매개변수로 준다.
	}

}
