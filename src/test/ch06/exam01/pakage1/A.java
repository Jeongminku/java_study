package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.

//class A {
	
//생성자는 public, default, private 접근제한자를 가질 수 있다.

public class A { // 생성자 : A(){}
	
	/*
	A strA = new A("프라이빗은 해당클래스 내에서만 접근이 가능함"); // private 생성자는 같은 클래스 내에서만 사용(접근)이 가능합니다.
	
	public A(boolean b) {// public
		
	} 
	
	A(int b) {// default
		
	}
	
	private A(String s) {// private
		
	} 
	*/
	
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; // O
		field2 = 1; // O
		field3 = 1; // O
		method1(); // O
		method2(); // O
		method3(); // O
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
}
/*

접근제한자 (클래스, 필드, 생성자, 메소드 에서)

1. 클래스 public, default 접근제한자를 가질 수 있다.

public 사용범위 : 모든 타 클래스

default 사용범위 : 같은 패키지 내 클래스


public class A -----------> public

아무것도 안쓴것  -------------> default



===================구분선===================
2. 생성자 public, default, private 접근제한자를 가질 수 있다. (사용할 수 있다.)


 */
