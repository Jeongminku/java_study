package test.ch06;
	
public class Calculator {
	//리턴값이 없는 메소드 선언 // 리턴값 없게 쓰려면 void 필수, void 썼는데 return값 주면 컴파일에러. 반대로 return 값 안썼는데 void없어도 컴파일 에러 
	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끄셔도 됩니다");
	}
	
	//void를 안썼기때문에 값을 return 해줘야 정상적으로 컴파일이 됌. (int 형으로 리턴값이 있는 메소드)
	int plus(int x, int y) { //return; 이것도 없는 판정이라서 안됌.
		int result = x + y;
		return result;
	}
	
	
	//double형으로 리턴값이 있는 메소드
	double divide (int x, int y) { //메소드 작성할때 int 값을 받기로 써놨음
		double result = (double)x / (double)y;
		return result;
	}
	
}
