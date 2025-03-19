// 배열에서 짝수만 정렬하여 출력 

// Stream 의 연산
	/* 최종 연산은 반드시 마지막에 하나만 사용
	 *
	 *  → 중간 연산의 메서드 
	 *   1) filter() : 조건에 맞는 값만 다음 메서드로 넘김 (≒ if) 
	 *   2) distinct() : 중복 제거 
	 *   3) limit() : 스트림의 일부를 잘라 다음 메서드로 넘김 
	 *   4) sorted() : 정렬해서 다음 메서드로 넘김 
	 *   5) map() : 스트림 종류를 변경 
	 *   6) peek() : 스트림 작업 수행 
	 *   7) skip() : 스트림 일부를 건너뜀
	 *   
	 *  → 최종 연산의 메서드 
	 *   1) forEach() 
	 *   2) count()
	 *   3) sum()
	 *   4) average()
	 *   5) max()
	 *   6) min()
	 *   7) allMatch() : 스트림 요소가 모두 일치하는 지 보고 모두 일치하면 true, 아니면 false 를 반환 
	 *   8) toArray() : 배열로 변환하여 반환 
	 *   9) toList() : 리스트로 변환하여 반환
	 *   10) collect() : 스트림을 수집 
	 *   10.1) collect(Collector.toList()) : 스트림을 수집해서 배열로 변환   
	 *   10.2) collect(Collector.toArray()) : 스트림을 수집해서 리스트로 변환   
	 * */
package day15;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream04 {
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,6,5,7,8,0,9,6,2,1,3,4,5};
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(6); list.add(5);
		list.add(7); list.add(8); list.add(0);
		list.add(9); list.add(6); list.add(2);
		
		// 생성 → 중복 제거 → 홀수 제거 → 정렬 → 출력
		list.stream()
				.distinct()
				.filter(n -> n % 2 == 0)
				.sorted()
				.forEach(n -> System.out.print(n + " "));
		
		
		// 스트림으로 생성하여 중복제거하고 정렬하여 홀수만 배열로 리턴 
		int[] resultArr = 
										Arrays.stream(arr)
										.distinct()
										.filter(n -> n % 2 == 0)
										.sorted()
										.toArray();
		System.out.println();
		
		// 주소를 반환
		System.out.print(resultArr + " ");
		System.out.println();
		
		// 값을 반환 
		for(int i : resultArr) {
			System.out.print(i + " ");
		}
	}
}
