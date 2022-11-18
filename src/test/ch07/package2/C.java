package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	public void method () {
		 
		
		A a = new A(); // X A의 생성자에 접근 못함
		
		a.field = "1"; // X a필드에 접근 못함.
		
		a.method(); // X a메소드 접근못함
		
		
		//이유 : A소스는 패키지1    vs C소스는 패키지2 에 있으므로. 가져오지못함.
	}
}
