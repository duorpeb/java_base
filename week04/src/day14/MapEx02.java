// 상품과 가격을 추가하여 합계를 구함 
// 조건 1) main 에 map 을 생성하고 method 로 데이터를 채움 

// 조건 2) 메서드 내부에서 map 을 생성하여 map 을 메인으로 리턴 
	// e.g
	// 가위 1000 물감 3000, 합계 000

// 조건 3) Map 을 받아 출력하되 합계와 Map 을 같이 출력하는 메서드
package day14;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {
	public static void main(String[] args) {
		// Map 인스턴스 생성
		Map<String, Integer> map = new HashMap<>();
		
		// MapEx02 인스턴스 생성
		MapEx02 a = new MapEx02();
		
		a.saveReturn(map);
		a.returnMap();
		a.printMap(map);
		System.out.println("-------------------------------");
		
		// HashMap 인스턴스 생성 
		Map<String, Integer> userMap = a.returnMap();
		a.saveReturn(userMap);
		a.returnMap();
		a.printMap(userMap);
	}
	
	
	// saveReturn(), main 에 map 을 생성하고 method 로 데이터를 채움
	public void saveReturn(Map<String, Integer> map){
		map.put("Pen",1000);
		map.put("Brush",3000);
	}
	
	
	// returnMap(), 메서드 내부에서 map 을 생성하여 map 을 메인으로 리턴 
	public Map<String, Integer> returnMap(){
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Eraser",1500);
		map.put("NoteBook",2000);
		
		return map;
	}
	
	
	// printMap(), Map 을 받아 출력하되 합계와 Map 을 같이 출력 
	public void printMap(Map<String, Integer> map) {
		int sum = 0;
		
		for(String s : map.keySet()) {
			sum += map.get(s);
			System.out.println(s + " : " + map.get(s));
		}
		
		System.out.println("합계 : " + sum);
	}
}
