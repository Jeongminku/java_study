package test.ch06;

public class Car2 {

	//인스턴스 필드
	int speed;
	
	
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed + "의 속도로 달립니다.");
	}
	void run2() {
		this.run(); // 9번에 있는 run()을 가리킴., 인스턴스끼리는 서로서로 가져오기 가능.
		System.out.println(this.speed + "의 속도로 달립니다.");
	}
	
	static { //정적(static) 블록
		// this.speed = 200;
		//static블록에서도 인스턴스 관련된 모든것에 접근 할 수 없습니다.
		// this.run();
		//static블록에서는 인스턴스 관련된 모든것에 접근 할 수 없습니다.
	}
	
	
	//static 메소드
	static void simulate() {
		
		// this.speed = 200; // static에서는 this를 사용할 수 없습니다.
		// this.run(); // static에서는 this를 사용할 수 없습니다.
		
		// static 메소드 내에서 인스턴스 필드, 인스턴스 메소드를 가져오고싶다면
		// 아래의 방식처럼 접근하는 방법밖에는 없습니다. (new로 새로 객체(인스턴스)를 생성하고 가져오는 방식)
		Car2 myCar = new Car2(); //자기 자신 안에서도 인스턴스 생성 가능
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		
		simulate(); 
		//어차피 Car2에 있기때문에 Car2.simulate(); 라고 안써도 작동하는것.
		//다른위치였다면 당연히 Car2 라고 써줬어야겠죠?
		
		
		Car2 myCar = new Car2(); //자기 자신 안에서도 인스턴스 생성 가능
		
		myCar.speed = 50;
		myCar.run();
		
	}

}
