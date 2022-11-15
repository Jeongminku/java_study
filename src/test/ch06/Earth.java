package test.ch06;

public class Earth {
	//상수(상수를 선언할때는 변수명을 대 문 자 로 선언해야 + 스네이크 타입)
	//final이 붙었으므로 절대로 변경 X (변경 불가능)
	//static이 붙었으므로 전역변수 (어디서든 사용 가능)
	static final double EARTH_RADIUS = 6400; // 지구 반지름
	static final double EARTH_SURFACE_AREA;// 지구 겉넓이(표면적)
	
	//static 필드를 초기화 해줄때 사용할 static 블록
	//EARTH_SURFACE_AREA는 final의 특징도 가지므로 초기화(최종값 설정)를 해줘야함.
	//EARTH_SURFACE_AREA는 static의 특징도 가지므로 static 블록에서 설정해주기로 함.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
}
/*
자바 스크립트 상수
const a = 1;   상수 : 불변의 값.


자바에서의 상수 
불변의 값(final), 공유해서 사용 가능(static)
절대로 변하면 안되면서 공유해야 하는 값인 경우
예 ) 원주율 3.141592...
지구의 무게 등


*/