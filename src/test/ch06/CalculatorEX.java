package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) {

		//객체생성하기
		Calculator myCalc = new Calculator(); 
		
/*		22.11.11
		myCalc.powerOn();
		
		
		int result1 = myCalc.plus(5, 2); // 받아올 변수 = 객체.메소드
		System.out.println(result1);
		
		int x = 10, y = 4;
		//double x = 10, y = 4; // double로 쓸수없는 이유가 메소드 작성할때 int 값을 받기로 써놨음
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		
		myCalc.powerOff();
	}
*/
		//22.11.14 메소드 오버로딩에 이어서.
		
		double result1 = myCalc.areaRectangle(10);
		System.out.println(result1);
		double result2 = myCalc.areaRectangle(10,20);
		System.out.println(result2);

	
	
}
}