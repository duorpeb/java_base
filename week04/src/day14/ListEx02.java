// 숫자를 입력 받고 입력받은 숫자로 list 를 구성 
// 전체 출력 -> 전체 합계 출력 
// 각 점수대의 그룹 출력 

// 배열을 List 로 변환하는 경우,
	// List<자료형> list = new ArrayList<자료형>(Arrays.asList(arr)); 
	// 자료형은 같은 자료형이어야 함 
package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {
	public static void main(String[] args) {
		// 멤버 변수 초기화
		String str = "";
		
		// UI
		System.out.println("숫자를 입력하세요");
		System.out.println("Ex) 34,43,18,80,62, ...");
		System.out.print("숫자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		// split() 활용해 set 에 수를 추가
		String[] strArr = str.split(",");
		
		// list 객체 생성
		List<Integer> list = new ArrayList<Integer>();
		
		// set 객체 생성, HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i < strArr.length; i++) {
			list.add(Integer.parseInt(strArr[i])); 			
		}

		// 확인, set
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(set); // 출력 : [12, 34, 67, 42]	
//		}
		
		// 그룹 별 인원 수 저장 
			// e.g., 점수가 70 점 이상 인원수 : n 명 
			// e.g., 점수가 80 점 이상 인원수 : m 명 
		int sum = 0, count = 0;
		
		for(int n : list) {
			sum += n; 
			if(n >= 70) { count++; }
		}
			 			
		System.out.println("총점 : " + sum);
		System.out.println("70 점 이상 인원 수는 " + count + "명 입니다");
	
		sc.close();
	} // main fin
}
