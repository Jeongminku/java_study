package test.ch06;

public class GetSet {
	
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) { //set변수명(바꿀 매개변수)
		if (speed < 0 ) {
			this.speed = 0;
			return; // return문을 만나면 함수가 끝남. 그때 void에서는 return;이라고 표현하면 됌.
		}
		this.speed = speed;
		
	}

	
	
	public boolean isStop() { //자동차가 멈춤상태 = true
		return stop;
	}
	public void setStop(boolean stop) { //자동차가 달리는중 = false
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
	
	
}
