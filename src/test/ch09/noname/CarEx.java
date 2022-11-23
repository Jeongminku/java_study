package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run1();
			System.out.println("=====구분선=====");
		myCar.run2();
			System.out.println("=====구분선=====");
		myCar.run3(new Tire() {

			@Override
			public void roll() {
				
				System.out.println("미쉐린 타이어가 굴러갑니다.");			}
			
		});
	}

}
