package test.ch05;

import java.util.Calendar;

public class WeekEX {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1일요일 2월요일 ~ 7토요일
		
		
		
		//숫자를 열거 상수로 변환해서 변수에 대입.
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
				
		if(today == Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		}else {
			System.out.println("으딜 쉬려고 일해 일 일요일아직아니야");
		}
		
	}

}

/*
Calendar 는 import 시켜줘야 사용 가능.



*/
