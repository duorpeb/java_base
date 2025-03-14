package day02;

import java.util.Scanner;

public class Input01 {
	public static void main(String[] args) {
		// console input : 콘솔에서 값을 입력받는 것을 의미 
		// Scanner 클래스 : 객체를 생성 후 new 키워드 
		// 클래스명 객체 이름 = new 클래스명(값);
		// 객체명.next() 은 한 단어만 입력(문자)
		// 객체명.nextline() 은 공백 포함 
		// 객체명.next자료형() 은 자료형의 입력 (e.g., nextInt 는 정수 입력)
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자를 입력하세요");
//		
//		int num = scan.nextInt();
//		
//		System.out.println(num);

		System.out.println("여러 단어 입력");
		String s = scan.next();
		System.out.println(s);
		
		// Enter 처리용 
		scan.nextLine(); 
		
		System.out.println("여러 단어 입력");
		String s1 = scan.nextLine();
		System.out.println(s1);
		
		
		
		scan.close();
	}
}
