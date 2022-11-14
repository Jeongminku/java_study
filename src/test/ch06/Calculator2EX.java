package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
		//Calculator2 calc2 = new Calculator2(); // 객체 생성(인스턴스 생성)
		//내가 생성한 인스턴스 calc2 만을 통해서 들어갈 수 있는것.
		
		// calc2.pi = 10; //1. 필드가 10으로 바뀜
		
		//int result1 = calc2.plus(30, 20);
		//System.out.println(result1);
		
		
		//스태틱 메소드(필드) 사용법 -------------> 클래스명.스태틱메소드() or 스태틱필드
		Calculator2.plus2(32, 14); //객체(인스턴스)를 생성하지 않아도 스태틱 메소드에 접근 가능.
		Calculator2.minus2(32, 14);
		System.out.println(Calculator2.ppi); //스태틱 필드에 접근
	}

}
