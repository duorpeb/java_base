package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExWordController {
	// 멤버 변수 초기화 
	private HashMap<String, String> dic = new HashMap<>();
	
	
	// 기본 생성자 
	public ExWordController() {} 
	
	
	// 메서드 
		// menuPrint(), 메뉴 출력 및 작업 선택
	public int menuPrint() {
		int num = 0;
		
		System.out.println("\t <작업 선택>");
		System.out.println("1) 단어 등록\t 2) 단어 검색\t 3) 단어 수정");
		System.out.println("4) 단어 출력\t 5) 단어 삭제\t 6) 종료");
		System.out.println("-------------------------"
				+ "--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 선택 : ");
		num = sc.nextInt();
		
		return num;
	}
	
	
		// baseWord(), 기본 단어 5개 등록
			// main 에 map 을 생성하고 method 로 데이터를 채움
	public void baseWord(Map<String, String> map){
		dic.put("Red","빨간");
		dic.put("Green","녹색의");
		dic.put("Blue","파랑의");
		dic.put("Black","검정색의");
		dic.put("White","하얀색의");
	}
	
	
		// wordRegist(), 단어 등록
	public Map<String, String> wordRegist(String key, String value) {
		dic.put(key, value);
		
		System.out.println("등록 완료 !");
		
		return dic;
	}

	
		// wordSearch(), 단어 검색
	public void wordSearch(String s) { 
		dic.get(s); 
		
		for(String tmp : dic.keySet()) {
			if(tmp.equals(s)) { System.out.println(tmp); }
		}
		
		// containsKey() 는 Key 에 값이 존재하는지 확인하는 메서드
			// true or false 로 반환 
//		dic.containsKey(s);
	}
		
	
		// wordDelete(), 단어 삭제
	public void wordDelete(String s) { 
		dic.remove(s); 
		
		System.out.println("삭제 완료 !");
	}

	
		// wordPrint(), 단어 출력
	public void wordPrint() {
		for(String s : dic.keySet()) {
			System.out.println(s + " " + dic.get(s));
		}
	}
	
	
		// wordModify(), 단어 수정
	public void wordModify(String s) {
		Scanner sc = new Scanner(System.in);
		
		// 수정 내용 입력
		System.out.println("변경될 의미의 내용을 입력하세요");
		System.out.print("의미 : ");
		String meanning = sc.next();
		
		// 삭제 값이 없으면 null 있으면 value 를 리턴 
		dic.replace(dic.get(s), meanning);
		
		dic.put(s, meanning);
		
		System.out.println("수정 완료 !");
	}


	// toString()
	@Override
	public String toString() {
		return "ExWordController [dic=" + dic + "]";
	}
	
	
	// Getter(), Setter()
}
