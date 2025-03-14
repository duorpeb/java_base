package day04;

import java.util.Scanner;

// regNum 의 주민등록번호를 참고하여 
// 생년월일과 성별을 출력 
public class StringExam01 {
	public static void main(String[] args) {
		String search_str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("- 를 포함하여 주민등록번호 14자리를 입력해주세요");
		System.out.println("Ex) ㅁㅁㅁㅁㅁㅁ-ㅁㅁㅁㅁㅁㅁㅁ");
		
		String str = new String();
		str = scan.nextLine();
		
		if(str != null) {
			System.out.print("생년월일 : ");
			System.out.println(str.substring(0,6));
		}
		
		search_str = str.substring(7,8);
		
		switch(search_str) {
			case "1" :
				System.out.println("남자입니다");
				break;
				
			case "3" :
				System.out.println("남자입니다");
				break;
				
			case "2":
				System.out.println("여자입니다");
				break;
				
			case "4":
				System.out.println("여자입니다");
				break;
			
			default:
				System.out.println("Wrong Input !!");
		}
	}
}
