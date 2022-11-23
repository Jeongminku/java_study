package test.ch08.Interface;

public class RemoteControlEX {
	//인터페이스를 사용하려면 처음부터 자동타입변환 모습으로 써주고 사용하면 된다.
	public static void main(String[] args) {
/*
		RemoteControl rc = new Television();
		rc.turnOn();

		
		RemoteControl ad = new Audio();
		ad.turnOn();
*/	
	
		
		
/*
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		rc.turnOff();
		
		rc.setVol(120);
		//rc.setVol(50);
		//rc.setVol(-20);
		
		
		
		rc = new Audio(); //오디오로 교체
		rc.turnOn();
		rc.turnOff();
		
		
		//rc.setVol(120);
		rc.setVol(50);
		//rc.setVol(-20);
		
		//static의 특성을 가졌기 때문에 객체를 생성하지않고 호출이 가능하다.
		System.out.println(RemoteControl.MAX_VOL);
		System.out.println(RemoteControl.MIN_VOL);
*/
		
		RemoteControl rc;
		
		rc = new Television(); //자동형변환 취급됨.
		rc.turnOn(); 
		rc.setVol(50); //메소드는 오버라이드 된 녀석을 따라감. 그래서 Television의 setVol을 따라감.
		
		
		rc.setMute(true); //음소거하기
		
		rc.setMute(false); //음소거 해제
		
		System.out.println("==========구분선==========");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVol(71);
		
		rc.setMute(true); 
		
		rc.setMute(false); 
		//memoryVol을 활용하여 다시 setMute(false)가 되었을때 이전의 값을 가져오게함.
		
		
		RemoteControl.changeBattery();
		System.out.println();
	}


}
