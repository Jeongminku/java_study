package test.ch08.Interface3;

public class ExtendsEX {

	public static void main(String[] args) {
/*
		InterfaceC mt = new InterfaceCImpl(); //자동 형변환
		mt.methodA();
		mt.methodB();
		mt.methodC();
*/

		
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; // 자동 타입 변환
		ia.methodA();
		// ia.methodB(); 오류 발생함. InterfaceA에는 추상메소드가 methodA() 밖에 없기 때문
		
		
		System.out.println("===구분선===");
		InterfaceB ib = impl;
		ib.methodB();
		
		
		
		
		
		
		//인터페이스C는 A와B를 상속받았으므로 A와 B에 있는 추상메소드도 사용이 가능하다.
		System.out.println("===구분선===");
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
