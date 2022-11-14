package test.ch06;
	
public class Calculator {
	/*
	//리턴값이 없는 메소드 선언 // 리턴값 없게 쓰려면 void 필수, void 썼는데 return값 주면 컴파일에러. 반대로 return 값 안썼는데 void없어도 컴파일 에러 
	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끄셔도 됩니다");
	}
	
	//void를 안썼기때문에 값을 return 해줘야 정상적으로 컴파일이 됌. (int 형으로 리턴값이 있는 메소드)
	int plus(int x,int y) { //return; 이것도 없는 판정이라서 안됌.
		int result = x + y;
		return result;
	}
	
	
	//double형으로 리턴값이 있는 메소드
	double divide (int x, int y) { //메소드 작성할때 int 값을 받기로 써놨음
		double result = (double)x / (double)y;
		return result;
	}
	*/
	
	
	//22.11.14 메소드 오버로딩 : 같은 이름의 메소드 여러개를 만든다.
	//주의 : 생성자 오버로드처럼 매개변수의 개수, 타입, 순서 중 하나이상 달라야함.
	double areaRectangle(double width) { //정사각형의 넓이를 구하는 공식
		return width * width;
	}
	
	double areaRectangle(double width, double height) { //직사각형의 넓이
		return width * height;
	}
	
	/*
	double areaRectangle(double height, double width) { // 같은 타입의 순서를 바꾸는건 주의 에 순서변경에 해당하지 않음. 다른타입으로 순서를 바꿔야함.
		return height * width;
	}
	*/
	
}
