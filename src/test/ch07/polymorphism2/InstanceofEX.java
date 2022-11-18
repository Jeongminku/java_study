package test.ch07.polymorphism2;

public class InstanceofEX {
	//메소드
	public static void personInfo(Person person) { //static 선언으로 객체를 생성하지 않고 바로 사용 가능.
		System.out.println("name: "+ person.name);
		person.walk(); //Person의 walk를 실행함.
		
		if (person instanceof Student) {//		System.out.println("p2가 Student 타입을 (객체를) 참조하고 있나요?");
			System.out.println(person instanceof Student);	
			System.out.println("맞으니까 이제 강제타입 변환 써보세요");
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		}
	}
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person("호식이");
		//System.out.println(p1.name);
		personInfo(p1);
		
		Person p2 = new Student("고길동",10);
		//이 코드가 실행되는 순간 Student 객체에있는 Student생성자가 실행이 되고, 네임과 넘버 들어오고, super(부모생성자 네임)을 부르므로 부모생성자의 person이 실행되고
		//부모생성자의 this.name에 고길동을 넣게됌
		personInfo(p2);
		//이 코드를 실행하는 순간 new Student를 넘겨주기때문에
		//Person person = new Student("고길동",10)이 되므로 자동타입변환이 켜짐.
		
		
	}

}
