package test.ch08.Interface5;

public class CastEX {

	public static void main(String[] args) {
		Vehicle vc = new Bus(); //자동 타입변환(형변환)
		//vc.run();
		/*
		//강제타입변환
		if (vc instanceof Bus) {
			System.out.println("instanceof로 확인하였습니다");
			Bus bus = (Bus) vc;
			System.out.println("강제타입변환을 시전합니다.");
			bus.run();
			bus.checkFare();
		*/
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		ride(taxi);
		ride(bus);
		}
		
		   
		 
		
		
		
	
	public static void ride(Vehicle vehicle) {
		//vehicle이 Bus객체를 가지고 있습니까?
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			System.out.println("버스 참조하고있습니까?");
		}
	}
}
