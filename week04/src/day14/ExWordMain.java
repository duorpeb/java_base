// 단어장 프로그램 (Map 활용)
// 기능 - 1) 단어 등록, 2) 단어 검색, 3) 단어 수정, 4) 단어 출력, 5) 단어 삭제, 6) 종료 
	// WordController 를 생성하여 메서드 구현 

// 기본 단어 5가지 등록 후 호출 후 값 띄우는 것 부터 먼저 
package day14;

import java.util.HashMap;
import java.util.Scanner;

public class ExWordMain {
	public static void main(String[] args) {
		int num = 0;
		String key;
		String value;
		String str;
		
		// Map 인스턴스 생성
		HashMap<String, String> dic = new HashMap<>();
		
		// ExWordController 인스턴스 생성
		ExWordController a = new ExWordController();
		
		// Scanner 객체 생성 
		Scanner sc = new Scanner(System.in);
		
		// 단어와 뜻 선입력
		a.baseWord(dic);
		
		do{
			// 메뉴 출력
			num = a.menuPrint();
			
			switch(num) {
				// 1) 단어 등록 
				case 1 :
					System.out.println("단어와 뜻을 입력하세요");
					System.out.print("단어 : ");
					key = sc.next();
					
					System.out.print("뜻 : ");
					value = sc.next();
					a.wordRegist(key,value); 
					break;
				
				// 2) 단어 검색 
				case 2 : 
					System.out.println("검색할 단어를 입력하세요");
					System.out.print("단어 : ");
					a.wordSearch(sc.next()); 
					break;
					
				// 3) 단어 수정 
				case 3 : 
					System.out.println("수정할 단어를 입력하세요");
					System.out.print("단어 : ");
					
					a.wordModify(sc.next()); break;
				
				// 4) 단어 출력 
				case 4 : a.wordPrint(); break;
				
				// 5) 단어 삭제 
				case 5 : 
					System.out.println("삭제할 단어를 입력하세요");
					System.out.print("삭제할 단어 : ");
					a.wordDelete(sc.next()); 
					break;
				
				// 6) 종료 
				case 6 : num = 6; System.out.println("Finished..!"); break;
			}
		}while(num != 6);
	}
}
