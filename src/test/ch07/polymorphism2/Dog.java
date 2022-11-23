package test.ch07.polymorphism2;

//The type Dog must implement the inherited abstract method Animal.sound()
//추상 메소드를 반드시 오버라이드 해줘야 오류가 안남.
//추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야한다.
public class Dog extends Animal {

	@Override //이걸 반드시 해줘야 상속에 오류가 나지 않는다.
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("강아지소리: 강아지는 강하다");
	}

}
