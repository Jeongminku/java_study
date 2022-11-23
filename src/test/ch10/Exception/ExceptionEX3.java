package test.ch10.Exception;

public class ExceptionEX3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//int형 데이터로 (형변환)바꿔주는것.
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) { //array는 배열이 3갠데 우리의 배열은 2개밖에 없으므로 에러 하나 발생할것 i<=array.length 에러
				//에러가 발생했을때 실행시켜주고싶은 것을 써주면 됨.
				e.printStackTrace();
				
			} catch (Exception e) { //int형 데이터로 바꿔주려고 했으나 1oo 은 숫자가 아니라 문자 이므로 에러가 발생함.
				e.printStackTrace();
			}
			
		}

	}

}
