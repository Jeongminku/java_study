package test.ch09.InnerClass;

public class AStaticEX {

	public static void main(String[] args) {
		
		AStatic.B b = new AStatic.B();

		System.out.println(b.field1);
		b.method1();
		
	}

}
