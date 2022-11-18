package test.ch07;

public class Computer extends Calculator {

	@Override //우클릭 -> 소스 -> override
	//Override = 부모클래스에 있는 메소드를 재 정의할때 사용하는것.
	//반환타입, 메소드 이름, 매개변수가 다 같아야합니다.
	//오버라이드 vs 부모객체 가 되면 오버라이드 된 것을 실행합니다.
	public double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle()이 실행되었습니다");
		// return super.areaCircle(r);
		return Math.PI * r * r;
		
	}
	
}
