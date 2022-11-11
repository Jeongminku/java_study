package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
/*	.charAt(인덱스번호)   , .length()
 		String ssn = "9506241230123"; //주민번호
		char sex = ssn.charAt(6); //charAt(인덱스번호)
		int length = ssn.length(); //문자열의 길이를 가져다줌.
		//System.out.println(length); 13자리
		
		if (length == 13) {
			System.out.println("주민번호 자릿수 13자리가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
*/
	
		
/* .replace		
 		String oldStr = "자바 문자열";
		System.out.println(oldStr);
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
*/	

/*		//substring (인덱스번호 0부터, 6 이전까지) 잘라주세요.
		//substring(7) 인덱스번호 7번부터 맨 끝자리까지 잘라주세요.
		String ssn = "950624-1230123";
		String firstName = ssn.substring(0,6);
		System.out.println(firstName); //주민번호 앞자리를 찍음
		
		String secondName = ssn.substring(7); // 주민번호 뒷자리를 찍음
		System.out.println(secondName);
*/

		
/*
		String subject = "자바 프로그래밍";
		//있으면 해당 인덱스번호를 찍어주고 없으면 -1
		int location = subject.indexOf("프로래밍");
		System.out.println(location);
		int location2 = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location2);
		System.out.println(substring);
		//substring(1개쓰면) 1개쓴거부터 끝까지 잘라주세요 이기때문에. 프로그래밍 이라고 출력함.
		
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}
		
		boolean result = subject.contains("자바");
		
		if (result) {
			System.out.println("자바가 포함된 책입니다.");
		} else {
			System.out.println("자바와 관련이 없는 책입니다");
		}
*/
		
		String board = "1,자바 학습,참조타입 String 공부중";
		//, 단위로 나눠서 배열에다가 정리해줌.
		String[] tokens = board.split(",");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
	}

}
