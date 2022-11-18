package test.ch06;

public class GetSetEX {

	public static void main(String[] args) {
		
		GetSet mygetset = new GetSet();
		
		// mygetset.speed = 12; ----  private이라서 접근이 안됌.
		// private에 접근하기위해선 get, set을 사용해야.
		
		mygetset.setSpeed(13);
		System.out.println(mygetset.getSpeed());
		System.out.println(mygetset.isStop()); 
		
		
		if(!mygetset.isStop()) {//달릴때
			mygetset.setStop(true); //멈춤
		}
		System.out.println(mygetset.getSpeed());
		
	}

}
