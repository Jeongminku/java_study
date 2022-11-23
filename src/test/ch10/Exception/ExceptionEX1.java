package test.ch10.Exception;
//실행예외
public class ExceptionEX1 {

	public static void printLength(String data) {
		//예외처리
		try {
			int result = data.length(); //문자 수
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) { //에러가 났을 때 실행시킬 코드를 작성.
			//예외 처리 정보를 얻는 세가지 방법.
			System.out.println(e.getMessage()); //예외가 발생한 "이유"만을 리턴
			//System.out.println(e.toString()); //예외가 발생한 이유 + 예외의 종류 리턴
			//e.printStackTrace(); //예외가 발생한 이유 + 종류 리턴 + 예외가 발생한 곳 리턴
		
		} finally {//finally는 옵셔널하다.(써도되고 안써도됨)
			//마지막에 에러여부와 상관없이 무조건 실행 되는 코드.
			System.out.println("마무리 실행 \n");
		}
		//System.out.println("====구분선====");
		/*
		int result = data.length(); //문자 수
		System.out.println("문자 수: " + result);
		*/
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료");

	}

}
