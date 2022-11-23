package test.ch07.polymorphism2;

public class AbstractEX {

	public static void main(String[] args) {

		Dog dog = new Dog();
//		dog.sound();
		
		Cat cat = new Cat();
//	cat.sound();
		
		//매개변수로 하는 다형성
		animalSound(dog);
		animalSound(cat);
		
	}
	
	//다형성 (필드로하는거, 매개변수로하는거)  여기서는 매개변수로 할거임.
	
			//매개변수로 하는 다형성
			//조건 1. 메소드가 있어야함.
	
	
	/* 기본형                        부모타입  변수이름
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	*/
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}