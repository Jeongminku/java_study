package test.ch08.Interface;

public interface Service {
//디폴트메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
//static(정적) 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}
	
	/*
//private 메소드    (버전이 낮아서 안맞음)
	private void defaultCommon() {
		System.out.println("defaultMethod1 중복 코드");
		System.out.println("defaultMethod2 중복 코드");
	}
	*/

}
