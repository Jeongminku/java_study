package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A{
	public D() {
		super(); //A클래스의 생성자 호출  : 성공 (protected지만 상속받았기때문)
	}

	public void method1() {
		super.field = "1";
		super.method();
		//super.  -> 상위(부모) 클래스를 말함.
		
		
		
		//상속을 받았을 때는  this. 를 통해서도 접근 가능
		//this = 이 객체가 가진~~
		this.field = "2";
		this.method();
		
	}
	
	
	
	public void method2 () {
		//*protected 사용시 직접 객체를 생성해서 사용할 수는 없다.
		
		A a = new A(); // X
		
		a.field = "1"; // X
		
		a.method(); // X
		
	}
}
