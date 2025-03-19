// 람다식 - Stream
	/* Stream 이란 데이터의 연속적인 흐름을 처리할 수 있는 API 로 
	 * 컬렉션(List, Set, Map), 배열 등의 데이터를 함수형 프로그래밍 스타일로 다룰 수 있도록 도와줌
	 * 
	 * 자료구조를 복사하여 스트림 객체로 생성하고 스트림을 이용하여 
	 * 연산을 수행하고 연산을 수행한 스트림은 소모
	 * 
	 * 스트림은 기존 자료를 변경할 수 없고 메서드 체이닝 방식을 사용 
	 * 
	 * 스트림은 스트림만의 연산을 가지고 있음 
	 *  
	 * 	→ 스트림의 연산은 연산의 유형은 중간 연산 과 최종 연산으로 구분
	 *  → 최종 연산은 반드시 마지막에 하나만 사용해야 함 
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
	 *   8) toArray() : 배열로 변환
	 *   9) toList() : 리스트로 변환  
	 *   10) collect() : 스트림을 수집 
	 *   10.1) collect(Collector.toList()) : 스트림을 수집해서 배열로 변환   
	 *   10.2) collect(Collector.toArray()) : 스트림을 수집해서 리스트로 변환   
	 * */
package day15;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Stream01 {
	public static void main(String[] args) {
		// 멤버 변수 초기화
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		// 기본 형태 
		for(int i : arr) { sum += i; }
		
		System.out.println(sum);
		
		
		// 기본 형태를 스트림으로 표현 (1)
			// 배열을 스트림으로 구성해서 합계를 구함
			// 스트림은 작업이 수행된 뒤 소멸 
		int userTmp = Arrays.stream(arr).sum();
		System.out.println("1 : " + userTmp);
		System.out.println("2 : " + (userTmp +12));
		
		
		// 기본 형태를 스트림으로 표현 (2)
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		
		// 기본 형태를 스트림으로 표현 (3)
		int over5 =
							Arrays.stream(arr)
							.filter(n -> n >= 5)
							.sum();
		System.out.println(over5);
	}
}
