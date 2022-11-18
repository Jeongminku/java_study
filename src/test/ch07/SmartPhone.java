package test.ch07;

// 자식클래스 A    // 자식클래스 extends 부모클래스
public class SmartPhone extends Phone {

	// 필드

	public boolean wifi;

	// 생성자 -- 생성자 이름은 클래스 이름과 똑같이.
	// 부모클래스에서 쓰면 밑에꺼 오류남.
	/* public SmartPhone(String model, String color) {
		this.model = model;// this.model은 부모(Phone)의 필드 model을 말한다.
		// 자식클래스는 부모클래스의 값을 가져와서 쓸 수 있다는 것.
		this.color = color;
	}*/
	
	/*
	//부모 생성자 호출1
	public SmartPhone(String model, String color) {
		super(model, color); //부모 생성자 호출
	}
	*/
	/*
	//부모 생성자 호출2
		public SmartPhone(String model, String color) {
			// System.out.println("자식 생성자 호출"); - 부모 생성자가 먼저 호출이 되어야함.
			super(); //부모 생성자 호출
			System.out.println("자식 생성자 호출");
			this.model = model; //초기값을 넣는것
			this.color = color; //초기값을 넣는것
		}
	*/
	//부모 생성자 호출3
			public SmartPhone(String model, String color) {
				
				super(model, color); //부모 생성자 호출
				System.out.println("자식 생성자 호출");
//				this.model = model; //초기값을 넣는것
//				this.color = color; //초기값을 넣는것
			}

	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		
	}

}
