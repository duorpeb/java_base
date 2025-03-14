// LocalDateTime 클래스 
package day12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		
		// today.get변수명() 으로 각각의 값을 사용할 수 있음 
		System.out.println(today);
		
		// LocalDateTime 형 객체를 String 형으로 변환 
		String tDate = today.toString();
		System.out.println(tDate);
		System.out.println("----------------------------");
		
		// substring(시작지점,종료지점) 만을 이용하여 출력
			// 시작지점의 idx 는 포함하지만 종료지점의 idx 는 포함하지 않음
			// 날짜,
		String dateStr1 = tDate.substring(0,10);
		System.out.println("날짜 : " + dateStr1);
		
			// 시간 
		String timeStr1 = tDate.substring(11,19);
		System.out.println("시간 : " + timeStr1);
		System.out.println("----------------------------");
		
		// substring(idx,배열명.indexOf()) 를 이용하여 출력
		String dateStr2 = tDate.substring(0,tDate.indexOf("T"));
		System.out.println("날짜 : " + dateStr2);
		
		String timeStr2 = tDate.substring(11,tDate.indexOf("."));
		System.out.println("시간 : " + timeStr2);
		
		
		// 날짜 형식으로 지정하여 출력 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	}
}
