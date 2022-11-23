package test.ch10.Exception;
//4.예외떠넘기기 2
public class ThorwsEX2 {

	//main메소드는 JVM에서 실행을 하고
	//main메소드에 throws를 사용해서 예외를 떠넘기면 JVM은 예외 내용을 콘솔에 출력한다.
	public static void main(String[] args) throws ClassNotFoundException {
		findClass(); //메소드를 호출한 곳에서 예외처리하겠습니다.
		
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
