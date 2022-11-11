package test.ch04;

import java.util.Scanner;

public class KeyControlEX2 {

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
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
