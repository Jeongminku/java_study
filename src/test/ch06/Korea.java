package test.ch06;

public class Korea {
	//final 필드
	//final 필드(저장된 값들을 절대로 변경할 수 없다. 최종값)
	//final 필드는 초기값을 무조건 줘야하며, 초기화 한 값이 곧 최종값이다.
	//필드 선언시에 주거나 or 생성자(constructor)에서 주어야 한다.
	final String nation = "대한민국";
	final String ssn; //ssn = 주민번호

	//인스턴스 필드
	String name;
	
	//생성자 클래스명(){} 형태 
	//final을 사용하려면 final 값을 초기화 해줘야함(무조건 초기값을 줘야함)
	//final값은 저장된 값(초기화 한 값이 곧 최종값)을 변경할 수 없음.
	Korea(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
}
