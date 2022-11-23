package test.ch07.polymorphism2;

//The type Cat must implement the inherited abstract method Animal.sound()
//추상 메소드를 반드시 오버라이드 해줘야 오류가 안남.
//추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야한다.
public class Cat extends Animal{

	@Override  //이걸 반드시 해줘야 상속에 오류가 나지 않는다.
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("고양이소리: 여섯시 내 고양");
	} 
	
}
