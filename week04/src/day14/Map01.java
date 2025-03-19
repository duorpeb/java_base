// Map
// 값을 2개 쌍으로 저장 (Key, value) 하며 
// Key 값은 중복 불가 value 값은 중복이 가능 
// Map 의 Key 값만 사용한다면 Set 의 형태 
// HashMap 을 자주 사용 

// HashMap 의 기본 형식
	// HashMap<클래스, 클래스> map = new HashMap<클래스, 클래스>();
	// HashMap 은 값이 2개 이기 때문에 향상된 for 문, Iterator 사용이 불가능
	// 따라서, HashMap 의 Key 값을 set 으로 구성 후 출력 

// Map 의 명령어 
	// List, Set 이 add() 로 추가했던 것에 비해 Map 은 put() 으로 추가 
	// get(Key) 는 value 값으로 return 됨 
	// remove(Key) 는 삭제하면서 Value 를 return
package day14;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {
	public static void main(String[] args) {
		// HashMap 객체 생성 
		HashMap<String, Integer> map = new HashMap<>();
		
		// Map.put() : Map 에 요소 추가 
		System.out.println("----------Map.put() : "
				+ "Map 에 요소 추가-------------");
			// 같은 값이 2번 들어가면 덮어쓰기 됨 
		map.put("Hot Americano", 4800);
		map.put("Ice Americano", 5300);
		map.put("Espresso", 4000);
		map.put("Cafelatte", 3300);

		System.out.println(map);
		map.replace("Hot Americano", 4400);
		System.out.println(map);
		System.out.println();
		
		
		// Key 값을 입력해 Value return
		System.out.println("----------Key 값을 입력해 Value return-------------");
		System.out.println(map.get("Hot Americano"));
		System.out.println();
		
		
		// Key 만 모아 Set 으로 Return
		System.out.println("----------Key 만 모아 "
				+ "Set 으로 Return-------------");
			// keySet() 은 자주 사용하는 형태
		System.out.println(map.keySet());
		System.out.println();
		
		
		// Value 만 모아 Set 으로 Return
		System.out.println("----------Value 만 모아 "
				+ "Set 으로 Return-------------");
		System.out.println(map.values());
		System.out.println();
		
		
		// 향상된 for 문을 사용하여 전체 출력 
		System.out.println("----------향상된 for 문을 사용"
				+ "하여 전체 출력-------------");
			// 합계 저장을 위한 변수 선언 
		int sum = 0;
		
		for(String s : map.keySet()) {
			sum += map.get(s);
			System.out.println(s + " : " + map.get(s));
		}
		System.out.println("금액 합계 : " + sum);
		System.out.println();
		
		// Iterator 출력 
		System.out.println("----------Iterator 출력-------------");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			
			System.out.println(s + " : " + map.get(s));
		}
		System.out.println();
		
		
		// map.remove(Object) : key 값을 주면 삭제하고 Value 를 리턴 
		System.out.println("----------map.remove"
				+ "Object)-------------");
		
		System.out.println(map.remove("Ice Americano"));
		System.out.println(map);
		System.out.println(map.remove("Hot Americano",4800)); // true
		System.out.println(map);
		System.out.println();
	}
}
