// 과목과 점수를 입력받아 map 에 저장하고 합계와 평균을 출력 
// 종료 키워드가 나올 때 까지 반복 (1 은 계속 0 은 종료)

// e.g.,
	// 국어 89
	// 수학 90
	// 계속하시겠습니까 (1 = 계속 / 0 = 종료) 
package day14;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {
	public static void main(String[] args) {	
		// 멤버 변수 초기화
		int c = 1;
		int sum = 0;
		double avg = 0.0;
		
		// Scanner 초기화
		Scanner sc = new Scanner(System.in);
		
		// Map 객체 초기화
		HashMap<String, Integer> map = new HashMap<>();
		
		do {
			// UI			 
			System.out.println("과목과 점수를 입력하세요");
			System.out.print("과목 : ");
			String course = sc.next();
			
			System.out.print("점수 : ");
			int score = sc.nextInt();

			// Map 객체에 저장 
			map.put(course, score);

			// 선택
			System.out.println("Continue..? (계속 = 1 / 종료 = 0)");
			System.out.print("입력 : ");
			c = sc.nextInt();
			
			System.out.println("--------------------------------");
		} while(c != 0);
		
		// 총점 저장
		for(int i : map.values()) {
			sum += i;
		}
		
		// 평균 저장 
		avg = (sum / map.size());
		
		
		// 출력 
		if(c == 0 || c != 1) { 
			// UI
			System.out.println("\t<점수표>");
			
			// 과목명과 점수 출력 
			for(String s : map.keySet()) {
				sum += map.get(s);
				System.out.println(s + " : " + map.get(s));
			}
	
			// 총점과 평균 출력
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		}
	}
}
 