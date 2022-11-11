package test.ch04;

import java.util.Scanner;

public class KeyControlEX {

	public static void main(String[] args) {
		// 키보드에서 1,2를 입력했을때 속도를 증가, 감속시키고, 3을 입력하면 종료
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
 
		while (run) {
			System.out.println("---------------구분선-----------");
			System.out.println("1.증속, 2.감소, 3.중지");
			System.out.println("--------------구분선-----------");
			System.out.println("선택: ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("3")) {
//				run = false;
//				System.out.println("프로그램종료");
//				break; //break 를 만나면 반복문을 바로 끝나버림.
//				System.out.println("하하하하"); 소용이 없다. break를 만났기때문에.
				continue; //다시 반복문으로 바로 올라간다. 아래 뭐가 있어도 정상작동안함.
				
//				System.out.println("continue아래라서 작동안함");
			}
		}

	}

}
