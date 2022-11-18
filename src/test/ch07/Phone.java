package test.ch07;

//부모 클래스 Phone
public class Phone {
	// 필드생성
	public String model;
	public String color;

	//생성자
	//모든 객체는 생성자를 만들어야한다.
	//나는 생성자를 쓰지 않았어도 자바는 컴파일러에서 알아서 만들어줌.
	
	/* 부모 생성자 호출1 ---- 부모생성자 - 슈퍼 용
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	*/
	
	/*
	// 부모 생성자 호출2 ---- 부모생성자 - 슈퍼 용
	public Phone() {
		System.out.println("부모 생성자 실행");
	}
	*/
	// 부모 생성자 호출3
	public Phone(String model, String color) {
		System.out.println("부모 생성자 호출");
		this.model = model;
		this.color = color;
	}
	
	
	
	// 메소드
	public void bell() {
		System.out.println("벨이 울립니다");
	}

	public void sendVoice(String message) {
		System.out.println("자기 목소리:" + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방 목소리:" + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
