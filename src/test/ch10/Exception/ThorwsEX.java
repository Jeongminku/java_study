package test.ch10.Exception;
//4.예외 떠넘기기
public class ThorwsEX {

	public static void main(String[] args) {
		try {
			findClass(); //메소드를 호출한 곳에서 예외처리하겠습니다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
