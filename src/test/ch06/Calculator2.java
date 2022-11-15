package test.ch06;

public class Calculator2 {
		
	//1. 필드 (속성)
	//인스턴스 필드
	double pi = 3.14159;
	

	
	//정적 필드 만들기
	static double ppi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	
	//static블록: static 필드에 대한 초기화 작업이 필요할 때 사용함.
	static {
		info = model + "_" + number; //_ 를 붙여서 만들어달라는 요청이 들어와서 만든 것.
		//calc1_1
		//정적필드에는 this. 를 안붙여도 된다.(붙이면 오류남)
		//this. 라는 뜻은 이 객체 (ex Calculator2) 를 의미함.
		//static은 클래스 안에는있지만 클래스와 큰 상관이 없으므로 쓰면 안됌.
	}
	
	
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



/*
static메소드에서는 static 변수만 사용할 수 있다.
static메소드에서는 인스턴스 변수는 사용할 수 없다.


인스턴스 메소드에서는 static 변수를 사용 O 가능함.



*/