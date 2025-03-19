// Set
	// Set 은 순서가 없는 자료구조이기에 Idx 가 존재하지 않고  
	// 중복과 정렬이 불가능
	// Set 은 Idx 가 없기에 Idx 를 활용하는 메서드가 없음

// Set 의 형식
	// Set 의 형식 - 1) HashSet(), 대표적인 구현 클래스 
	 /* HashSet() 을 Linked List 로 구현 하는 것이 일반적 
	  * 
	  *
	  * 
	  * 
	  * */


	// Set 의 형식 - 2) TreeSet(), 정렬이 가능한 Set
		
package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {
	public static void main(String[] args) {
		// HashSet() 
			// new HashSet<> 에서 꺽쇠 안은 생략 가능 
		HashSet<String> set = new HashSet<String>();
		
			// 객체 추가
		set.add("Apple");
		set.add("Banana");
		set.add("Peach");
		set.add("Apple");
		set.add("Orange");
		set.add("Peach");
		
			// 추가된 순서대로 출력될 수도 있고 안될 수도 있음 
		System.out.println(set);
		System.out.println("------------------------");
		
			// Iterator 출력도 가능 
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			// System.out.println(it.next()); 도 가능 
			String t = it.next();
			System.out.println(t);
		} // while fin
		System.out.println("------------------------");
		
		
			// Set 은 기본적으로 정렬이 불가능하기에 
			// Set 을 List 로 변환하여 정렬 
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
			// 정렬하여 출력
			// Collection.sort 는 오름 차순만 가능
		Collections.sort(list); 
		System.out.println(list); 
		System.out.println("------------------------");
		
			// list.sort() 로 내림차순 정렬하여 출력 
//		list.sort(new Comparator<String>() {
//			
////			@Override
////			public int compare(String o1, String o2) { return; }
////		});
		
		
		//
	}
}
