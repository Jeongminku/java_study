package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
/*
	A aClass = new A();
	//에러가 발생함. import해도 못씁니다(해결법에 import가 뜨지도않음). 
	//	왜냐면 A클래스의 접근제한자는 default 이기 때문입니다.
	//다른 패키지에 속한 C는 default접근자를 사용한 A클래스에 접근할 수 없습니다.
	B bClass = new B();
	//그냥 사용하면 에러는 발생하지만 import하면 사용할 수 있습니다.
	//	왜냐면 B클래스는 접근제한자가 public 이기 때문입니다.
*/
	
	/*
	A aClass1 = new A(true); // public이라서 import만 하면 접근할 수 있습니다.
	A aClass2 = new A(123); //  default이기때문에, 다른 패키지에서는 접근할 수 없습니다.
	A aClass3 = new A("감자");// private이기때문에, 해당 클래스 밖에서는 접근할 수 없습니다. (A클래스 안에서만 호출이 가능합니다.)
	*/
	
	public void method() {
		public C() {
			A a = new A();
			
			a.field1 = 1; // O
			a.field2 = 1; // X 다른 패키지에 있기때문에 default값을 준 filed2는 사용이 불가능하다.
			a.field3 = 1; // X field3은 private 을 주었으므로, 해당 클래스에서만 사용이 가능하다.
			a.method1(); // O
			a.method2(); // X 다른 패키지에 있기때문에 default method2 사용이 불가능하다.
			a.method3(); // X method3에는 private을 주었으므로, 해당 클래스에서만 사용이 가능하다.

			
		}
		
			
	
}





/*
접근제한자 (클래스, 필드, 생성자, 메소드 에서)
1. 클래스




 */
