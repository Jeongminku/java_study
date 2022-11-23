package test.ch10.Exception;

public class ExceptionEX4 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//int형 데이터로 (형변환)바꿔주는것.
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) { 
				//에러가 발생했을때 실행시켜주고싶은 것을 써주면 됨.
				e.printStackTrace();
				
			} catch (NullPointerException | NumberFormatException e) { //2가지 이상의 예외를 동일하게 처리할 수 있습니다.
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
			
		}

	}

}
