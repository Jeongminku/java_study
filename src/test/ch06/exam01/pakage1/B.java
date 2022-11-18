package test.ch06.exam01.pakage1;

public class B {
	// A aClass = new A(); //A클래스는(default)이므로 같은 패키지 내 에서 접근이 가능하다.
	
	
	/*
	A aClass1 = new A(true); // public이라서 접근하는데 문제가 없습니다.
	A aClass2 = new A(123); //  default지만, 같은 패키지에 있으므로 접근에 문제가 없습니다.
	A aClass3 = new A("감자");// private이기때문에, 해당 클래스 밖에서는 접근할 수 없습니다. (A클래스 안에서만 호출이 가능합니다.) 
	*/
	
	
	public void method() {
	A a = new A();
	
	a.field1 = 1; // O
	a.field2 = 1; // O 같은 패키지에 있기때문에 default값을 준 filed2는 사용이 가능하다.
	a.field3 = 1; // X field3은 private 을 주었으므로, 해당 클래스에서만 사용이 가능하다.
	a.method1(); // O
	a.method2(); // O 같은 패키지에 있기때문에 default method2 사용이 가능하다.
	a.method3(); // X method3에는 private을 주었으므로, 해당 클래스에서만 사용이 가능하다.
	}
}
