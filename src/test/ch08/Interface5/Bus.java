package test.ch08.Interface5;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

	public void checkFare() {
		System.out.println("승차 요금 체크");
	}
}
