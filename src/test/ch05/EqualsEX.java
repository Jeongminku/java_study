package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		//String은 리터럴이 같으면 같은 주소를 가리킨다. (참조한다)
		String strVar1= "홍길동";
		String strVar2= "홍길동";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다아름");
		}

		//값을 비교할땐 equals
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1와 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		//strVar3 과 strVar4는 다른 주소를 갖고있기때문에 이름이 같아도 참조가 다르다.
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다아름");
		}
		
		
		
		
		
		
		
		
		
	}




}


