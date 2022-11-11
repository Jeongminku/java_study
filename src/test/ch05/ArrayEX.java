package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
				
/*
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		String season2[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		
		int[] scores = {83, 90, 87};
		
		//총합, 평균
		int sum = 0;
		for (int i = 0; i <3; i++) {
			sum += scores[i];
		}
		
		double avg = (double) sum / (scores.length);
		System.out.println(avg);
		
		System.out.println("총합= "+sum + ", 평균= " + avg);
		
*/
		
		int[] arr1 = new int[3];
		/*
		 * 초기값
		 * byte : 0
		 * short : 0
		 * char : '\u0000'
		 * int : 0
		 * long: 0L
		 * float : 0.0f
		 * double : 0.0
		 * boolean : false
		 * 
		 * String: null(클래스는 초기값이 null)
		 */
		
		
		for (int i = 0; i<3; i++) {
			//System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		
		for (int i = 0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		
		for (int i = 0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		for (int i = 0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		
		// arr3.length = 10; length는 값을 가져올 수만 있지 length값을 변경하거나 그럴 수 없다.
		
		
	}

}
