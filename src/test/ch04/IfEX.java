package test.ch04;

public class IfEX {

	public static void main(String[] args) {
		int score = 90;
		String name = "민쿠";
		/*
		if(score >= 90) {
			System.out.println("90점 이상입니다");
		}else {
			System.out.println("90점 이상이 아니네요");
		}
		*/
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			if (name.equals(name)) {
				System.out.println(name + "입니다");
			}
		}else if(score >= 80) {
			System.out.println("80점 이상입니다");
		}else if(score >= 70) {
			System.out.println("70점 이상입니다");
		}else {
			System.out.println("70도 안되셨네요");
		}
		
		//랜덤 함수
		//int num = Math.random(); //0.0 ~ 1.0 사이의 값만 랜덤으로.	
		int num = (int)(Math.random()*6) + 1;
		if(num==1) {
			System.out.println("1번");
		}else if(num==2) {
			System.out.println("2번");
		}else if(num==3) {
			System.out.println("3번");
		}else if(num==4) {
			System.out.println("4번");
		}else if(num==5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}
		
		
		
		//num 이라고 적힌 부분에 아래의 것들을 사용 할 수 있다.
		//byte, char, short, int, long
		//String 
		switch(num) {
		case 1: System.out.println("1번");		//num 값이 1이라면 case1의 값이 실행된다.
		break;
		case 2: System.out.println("2번");
		break;
		case 3: System.out.println("3번");
		break;
		case 4: System.out.println("4번");
		break;
		case 5: System.out.println("5번");
		break;
		default: System.out.println("6번");
		//default는 break를 쓸 필요가 없어요.
		}
		
		char grade = 'B';
		
		switch (grade){
		case 'A': System.out.println("1번");		//num 값이 1이라면 case1의 값이 실행된다.
		break;
		case 'B': System.out.println("2번");
		break;
		case 'C': System.out.println("3번");
		break;
		case 'D': System.out.println("4번");
		break;
		case 'E': System.out.println("5번");
		break;
		default: System.out.println("6번");
		//default는 break를 쓸 필요가 없어요.
		}

	}

}
