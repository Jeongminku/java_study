package test.ch05;

public class ArrayMultiEX {

	public static void main(String[] args) {
//		int [] scores = { 10, 90, 10};
		int [][] scores = {
				{80, 90, 96},
				{76, 88}
		};
				
		
		System.out.println("1차원 배열 길이(반의 수)" + scores.length);
		System.out.println("2차원 배열길이(첫번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열길이(첫번째 반의 학생 수): " + scores[1].length);
		
		System.out.println("첫번째 반의 세번째 학생: " + scores[0][2]);
		System.out.println("두번째 반의 두번째 학생: " + scores[1][1]);
		
		//첫번째 반의 평균점수
		int class1Sum = 0;
		
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = 0;
		
		for (int i=0; i<scores[0].length; i++) {
			class1Avg = class1Sum / scores[0].length;
		}
		
		System.out.println("첫번째 반의 총합: " + class1Sum + " 첫번째 반의 평균점수: " + class1Avg);
		
		//두번째 반의 평균점수
		int class2Sum = 0;
		
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double class2Avg = 0;
		
		for (int i=0; i<scores[1].length; i++) {
			class2Avg = class2Sum / scores[1].length;
		}
		
		System.out.println("두번째 반의 총합: " + class2Sum + " 두번째 반의 평균점수: " + class2Avg);

		
		//전체 학생의 평균점수
		/* 
		 int [][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		*/
		int totalStudent = 0;
		int totalSum = 0;
		
		//System.out.println(scores.length); // scores.length => 2
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length; // 학생 수
			//이중 for 문
			for (int j=0; j<scores[i].length; j++) { // i가 0일때는 1반, i가 1일때는 2반을 돔.
				totalSum += scores[i][j]; //점수 합산 // i가 0일때 1반의 j는 3이하니까 0,1,2 를 데려옴.
			}
			
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생 평균: " + totalAvg);
		
/*		 int [][] scores = { {80, 90, 96},{76, 88} }; */
		int [][] mathScores = new int[2][3];
		
		for (int i=0; i < mathScores.length; i++) {
			for (int k=0; k<mathScores[i].length; k++) {
				//mathScores[i][k] = 80;
				System.out.println("수학점수" + mathScores[i][k] + "은 mathScores값입니다");
			}
		}
		/* 2행 3열
		int [][] mathScores = { 
				{80, 81, 82 }, 
				{83, 84, 85 } 
		};
		*/
		
		/*
		for문 없이 작성할경우
		mathScores[0][0] = 80;
		mathScores[0][1] = 81;
		mathScores[0][2] = 82;
		mathScores[1][0] = 83;
		mathScores[1][1] = 84;
		mathScores[1][2] = 85;
		mathScores[2][0] = 86;
		mathScores[2][1] = 87;
		mathScores[2][2] = 88;
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
