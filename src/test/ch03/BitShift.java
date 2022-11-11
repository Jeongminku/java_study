package test.ch03;

public class BitShift {

	public static void main(String[] args) {
		//비트 이동 연산자
		int num1 = 1; //2진수 00000000000~00001 을
		int result1 = num1 << 3; //을 0000000~01000 오른쪽으로 3칸 옮기고 빈공간을 0으로 채움.
		System.out.println(result1); // 1 X 2의 3승 = 8  
		// << 좌측이동연산자는 2의 거듭제곱을 곱한 결과와 같다.
		
		
		// >> 우측이동연산자 2의 거듭제곱을 나눈 결과와 같다.   -8 / 2의 3승 = -1
		int num2 = -8; // 1111111111111~11000
		int result2 = num2 >> 3; //빈 공간을 1로 채움, 남은 0 3개 버려짐. 1111111111~11111 -> -1
		System.out.println(result2); // 결과 : -1
		
		
		// >>> 우측이동연산자.
		int num3 = -8;
		int result3 = num3 >>> 3; // 빈 공간을 0으로 채움
		System.out.println(result3); 
	}
	

}


/*비트 이동 연산자 (쉬프트 연산자)
0000000000000000001
0000000000000001000 << 이만큼 이동해주세요.
>> 이만큼 이동해주세요. 1처리
0000000000000001000
0000000000000001111

>>> 0처리
0000000000000001000
0000000000000000001

*/