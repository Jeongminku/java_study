package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
	
		Korea k1 = new Korea("123456-1234567", "내이름은감자"); // argument = 매개변수
		k1.name = "사실나는 고구마"; // 인스턴스라서 변경 가능
		// k1.nation = "미국"; // final값으로 지정했기때문에 nation은 변경 불가.
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);

		System.out.println("==========구분선========");
		
		Korea k2 = new Korea("7548-115167");
		System.out.println(k1.ssn);
	}

}


