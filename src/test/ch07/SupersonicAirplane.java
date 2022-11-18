package test.ch07;

//초음속 비행기
public class SupersonicAirplane extends Airplane {
	// 상수(static final) 만들기
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// 필드 (비행 상태 를 저장할 필드?)
	public int flyMode = NORMAL;

	@Override
	//메소드에 final을 붙이면 그 메소드는 오버라이드 불가.
	public void fly() {
		// super.메소드명() => 부모 클래스의 메소드 실행
		// super.fly();
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행모드입니다");
		} else {
			super.fly();
			//Airplane에 final 붙이면 그 클래스는 부모 클래스로 사용할 수 없음.
			//그러면 부모클래스로 불러왔던애들 오류발생함.
		}
	}
}
