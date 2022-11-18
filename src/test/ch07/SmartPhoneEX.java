package test.ch07;

public class SmartPhoneEX {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("S23","레인보우");
		
		//Phone에서 상속받은 필드 읽기 : 자식 객체에서도 부모 필드에 접근이 가능합니다.
		System.out.println(myPhone.model + "," + myPhone.color);

		//Phone에서 상속받은 메소드 읽기: 자식 객체에서도 부모 메소드에 접근이 가능하다.
		myPhone.bell();
		myPhone.sendVoice("여보세요 드라군");
		myPhone.receiveVoice("리시빙 트랜스미션");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		System.out.println(myPhone.wifi);
	}

}
