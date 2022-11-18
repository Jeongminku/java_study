package test.ch07;

public class ComputerEX {

	public static void main(String[] args) {
		int r = 10;
		Calculator myCalc = new Calculator();
		myCalc.areaCircle(r);
		System.out.println(myCalc.areaCircle(r));

		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
	}

}
