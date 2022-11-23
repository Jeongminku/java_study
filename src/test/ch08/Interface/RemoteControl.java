package test.ch08.Interface;

public interface RemoteControl {
//상수
	//인터페이스에 선언된 필드는 모두 상수가 된다.
	//인터페이스에서는 타입만 적어도 상수 취급이 된다 ----public static final을 쓰지 않아도 자동으로 상수로 변환된다.
	int MAX_VOL = 100;
	int MIN_VOL = 0;
	
	double PI = 3.14;

	
//추상메소드
	//public interface의 추상메소드 ---- abstract를 쓰지 않아도 자동으로 추상메소드로 변환된다.
	//public void turnOn();
	
	
	//public을 쓰지 않아도 컴파일 과정에서 public abstract가  자동으로 붙는다. ===> 추상 메소드 이기 때문에.
	void turnOn();
	
	void turnOff();
	void setVol(int volume);
	
	
	
//디폴트 메소드
	//인터페이스에서 실행 메소드를 구현하고 싶을 때 사용합니다.
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 처리 합니다.");
			setVol(MIN_VOL);
		} else {
			System.out.println("음소거 해제.");
		}
	}
	
	
	
	
//static 메소드
	//코드를 구현 할 수 있다.
	//public이 없어도 컴파일 과정에서 public이 붙는다.
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}
	
	
	
	
}
