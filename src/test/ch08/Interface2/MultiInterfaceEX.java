package test.ch08.Interface2;

public class MultiInterfaceEX {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision(); //자동 형변환
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
	}

}
