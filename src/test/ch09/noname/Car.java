package test.ch09.noname;

public class Car {
	//필드로 다형성 활용(필드에 Tire객체 대입)
	//필드에서 익명자식객체 사용해보기
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {//이름없는 클래스 + 상속을 동시에.
		//{ 내부는 }상속을 받은 일종의 클래스 라고 생각, 이름이 없는 객체를 생성하는것.
		 
		
		@Override
		public void roll() {
			System.out.println("한 국 타이어가 굴러갑니다.");
		}	
	};
	
	//메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		//로컬변수에 익명 자식객체 사용해보기
		Tire tire = new Tire() {

			@Override
			public void roll() {
				System.out.println("GOLD 호 타이러가 굴러갑니다");
			}
			
			
		};
		tire.roll();
		
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
}
