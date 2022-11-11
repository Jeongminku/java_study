package test.ch05;

public class RefferenceEX {

	public static void main(String[] args) {
		
		/* 기본타입을 원소로 갖는 배열 (primitive 타입)
		 * arr1 arr2 arr3 비교하기 와 null 주의
		int[] arr1;
		int[] arr2;
		int[] arr3;

		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // arr1호 vs arr2호 주소가 서로 다르니까 false
		System.out.println(arr2 == arr3); // arr2호의 주소를 arr3호 로 넘겨준다. 그러므로 arr2와 arr3은 동,호수 완전히 동일 true
		
		int[] intArray = null; //null을 넣어버리면 null이 들어가있어서 참조가 안되는거 주의.
		intArray[0] = 10;
		*/
		
/* //참조타입을 원소로 갖는 배열
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		System.out.println(strArray[0] == strArray[1]); // 주소가 같으므로 true
		System.out.println(strArray[0] == strArray[2]); // 주소가 다르므로 false
		System.out.println(strArray[0].equals(strArray[2])); //equals 는 값을 비교하는거라서 true
*/	

		
/* 배열 복사하기.		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		//배열 복사 -> 동시에 배열의 크기를 늘려줄 예정
		/*
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];

		}
		
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		//System.arraycopy(원본배열, 원본배열 복사 시작 인덱스번호, 새 배열, 새 배열에서 붙여넣기 하고싶은 인덱스 번호, 복사항목 수);
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}
*/	
		
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}
//참조 예제