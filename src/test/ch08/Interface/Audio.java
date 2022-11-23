package test.ch08.Interface;

public class Audio implements RemoteControl{

	private int volume; 
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio의 전원을 끕니다");

		
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
		
		System.out.println("현재 Audio볼륨은: " + this.volume +"입니다");
	}

	
	
	
	private int memoryVol;//필드
	//볼륨을 기억해둠.
	
//디폴트메소드를 Override시 반드시 public 을 붙여줘야 컴파일 에러가 발생하지 않는다.
	@Override
	public void setMute(boolean mute) {//public 빠지면 오류발생함.
		if (mute) {
			//원래있던 볼륨을 memoryVol에 저장(기억)해둠 -> 음소거처리함 -> 음소거를 해제함 -> 저장(기억)해뒀던 memoryVol값을 불러옴.
			this.memoryVol = this.volume; 
			System.out.println("음소거 처리 합니다.");
			setVol(RemoteControl.MIN_VOL);
		} else { 
			System.out.println("음소거 해 제.");
			setVol(this.memoryVol);
		}
		
	}
		
	
}
