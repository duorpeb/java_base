// 날짜 클래스 
// 마우스를 갖다 댔을 때, A 는 추상 클래스, I 는 인터페이스
	// Date 클래스는 비권장 (Depercated)

// Calendar 클래스
	// Calendar 클래스는 싱글톤 패턴으로 new 키워드를 사용하여 객체를 생성하는 것이 아닌 
	// getInstance() 를 이용하여 생성된 인스턴스를 읽어옴 
package day12;

import java.util.Calendar;

public class Date01 {
	public static void main(String[] args) {
		// Date 클래스 
//		Date d = new Date();
//		System.out.println(d.getDate());
		

		// Calendar 클래스 - 날짜 출력 
			// 사용 형식 : Calendar_변수명 = Calendar.getInstance();
			// 오늘 날짜를 리턴 
		Calendar c = Calendar.getInstance();
		
			// 날짜 받아오는 형식을 출력 
//		System.out.println(c);
		
			// 수 많은 형식 중 연도를 출력 
		int year1 = c.get(Calendar.YEAR);
		System.out.println(year1);
			
			// public static final int YEAR = 1; 로 
			// 선언되어있기에 아래 문장 출력 시 1 로 출력 
		int year2 = c.YEAR;
		System.out.println(year2);
		
			// 월은 0 ~ 11 로 표현되어 있기에 +1 해서 출력
//		System.out.println(c.get(Calendar.MONTH)); // 출력 : 2
		System.out.print(c.get(Calendar.MONTH)+1 + "월 "); // 출력 : 3
		
			// 일
		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "일 ");
		
			// 요일, 요일은 1 (일요일) ~ 7 (토요일)   
		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "요일");
		
		
			// 2025-03-14(금) 형식으로 출력하기		
		System.out.print(c.get(Calendar.YEAR) + "-"); 
		System.out.print("0" + (c.get(Calendar.MONTH)+1) + "-"); 
		
			// 일
		System.out.print(c.get(Calendar.DAY_OF_MONTH));
		
		int dateNum = c.get(Calendar.DAY_OF_WEEK);
		
		switch(dateNum) {
			case 1: System.out.println("(일)"); break;
			case 2: System.out.println("(월)"); break;
			case 3: System.out.println("(화)"); break;
			case 4: System.out.println("(수)"); break;
			case 5: System.out.println("(목)"); break;
			case 6: System.out.println("(금)"); break;
			case 7: System.out.println("(토)"); break;
		}
		System.out.println();
		
		
		// Calendar 클래스 - 시간 출력 
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
	
		
	}
}
