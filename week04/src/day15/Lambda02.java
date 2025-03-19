// Map 을 구성하여 forEach 로 출력 
package day15;

import java.util.HashMap;

public class Lambda02 {
	public static void main(String[] args) {
		// Map 인스턴스 생성 
		HashMap<String, Integer> map = new HashMap<>();
		
		// 무작위로 출력됨
		map.put("길석", 11);
		map.put("영이", 22);
		map.put("순이", 33);
		map.put("철수", 44);
		map.put("훈이", 55);
		map.put("유리", 66);
		
		map.forEach((x,y)->{ System.out.println(x + " : " + y); });
		System.out.println("---------------------------");
		
		// 람다용 함수형 인터페이스 사용 (1) 
		Number sum = (a,b) -> { return a + b; };
		
		System.out.println(sum.userGenerics(10, 100));
		
		
		// 람다용 함수형 인터페이스 사용 (2) 
		Number max = (a,b) -> (a >= b) ? a : b;
		
		System.out.println(max.userGenerics(20, 30));
		
	}
}


// 람다용 함수형 인터페이스
	// 람다용 함수형 인터페이스 선언 시 @FunctionalInterface 사용 
	// 람다용 함수형 인터페이스 선언 시 메서드는 반드시 한 개 여야 함 
@FunctionalInterface
interface Number{
	// 메서드
		// add(a,b) - return a + b;  
	int userGenerics(int a,int b);
}