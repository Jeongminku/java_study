package test.ch08.field_multi;

public class DriverEX {

	public static void main(String[] args) {
		//각각 객체 생성.
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driveVehicle(bus);
		driver.driveVehicle(taxi);
		//이 taxi를 실행하는 순간
		//Vehicle vehicle = new Taxi(); 랑 똑같아짐.
		//자동타입변환이 된다.
		
	}

}
