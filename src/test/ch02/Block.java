package test.ch02;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		//변수 사용범위가 블록을 기준으로하므로 if 블록안에있는 v2를 밖에서 쓸수없음. , 하지만 블록안에서 블록 바깥에 있는것을 가져다가 쓸수는 있음
		if (v1 > 10) {
			int v2 = v1 -10;
			int v3 = v1 + v2 + 5;
		}
		System.out.println("안녕");
	}

}
