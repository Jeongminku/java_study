package test.ch10.makeException;
//5. 사용자 정의 예외
//xxxException   xxx : 원하는 이름, Exception : 예외처리인걸 알려주기 위함.
public class InsufficientException extends Exception  {//일반예외 Exception | 상속예외 RuntimeException 둘중 하나를 상속받아야.   
	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
