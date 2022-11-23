package test.ch08.Interface;
//인터페이스를 상속받을때는 implements를 사용한다.
public class Television implements RemoteControl {
	
	//필드
	private int volume;
	
	
	
	
	
	//추상메소드가 정의되어있기때문에 반드시 재정의 해야 컴파일오류가 발생하지 않는다.
	//인터페이스 내에 추상메소드가 있기때문에 반드시 구현을 해줘야 컴파일오류가 발생하지 않는다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다");
		
	}

	@Override
	public void setVol(int volume) {
		if (volume > RemoteControl.MAX_VOL) {
			System.out.println("MIN_VOL보다 큽니다.");
			this.volume = RemoteControl.MAX_VOL;
			//System.out.println("현재 음량은: "+ this.volume +"입니다");
		}else if (volume < RemoteControl.MIN_VOL) {
			System.out.println("MIN_VOL보다 작습니다");
			//System.out.println("현재 음량은: "+ this.volume +"입니다");
			this.volume = RemoteControl.MIN_VOL;
		}else { 
			this.volume = volume;
			//System.out.println("현재 음량은: "+ this.volume +"입니다");
		}
		
		System.out.println("현재 TV볼륨은: " + this.volume +"입니다");
	}
	
	
}
