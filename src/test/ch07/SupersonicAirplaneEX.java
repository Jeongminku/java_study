package test.ch07;
//Airplane, SupersonicAirplane, SupersonicAirplaneEX 파일 사용
public class SupersonicAirplaneEX {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		
		System.out.println("비행모드:"+ sa.flyMode);
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("비행모드:"+ sa.flyMode);
		sa.fly();
		//static이 붙었으므로 클래스명. 으로 가져올 수 있다.	
	}

}
