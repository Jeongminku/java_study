package test.ch06;

public class Calculator2 {
		
	//1. 필드 (속성)
	//인스턴스 필드
	double pi = 3.14159;
	
	
	//정적 필드 만들기
	static double ppi = 3.14159;
	
	
	
	//2. 메소드 (기능)
	//인스턴스 메소드
	int plus(int x, int y) {
		return (x + y);
	}
	
	int minus(int x, int y) {
		return (x - y);
	}
	
	
	//스태틱 메소드
	static int plus2(int x, int y) {
		return (x + y);
	}
	
	static int minus2(int x, int y) {
		return (x - y);
	}
	
}


//인스턴스 멤버 = 객체를 통해서 들어가는 멤버.