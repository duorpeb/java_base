// 람다식 
// 람다식이란 식을 단순하게 표현하는 방법을 의미 

// 람다식은 Lambda + Stream 으로 구성 
	/* Lambda 는 외부 자료의 Side-Effect 를 주지 않도록 구현하는 방식
		 *  
		 * 람다 함수 (Lamda functions) 는 익명 클래스를 사용하여 쓰는 함수
		 * 
		 * 람다의 장점은 병렬 처리가 가능하여 불필요한 연산을 최소화 할 수 있기에 코드 간결성이 좋음
		 * 람다의 단점은 반복문 사용 시 성능이 저하된다는 것과 가독성이 떨어진다는 것 
		 * 
		 * 람다 표현식 : (매개변수) -> { 구현; } (e.g., a -> { return; }) 
		 * 	→ 매개변수가 1개면 () 생략이 가능하지만 2개 이상인 경우 반드시 괄호 사용 
		 *  → return 이 없는 경우 { } 의 생략 가능  
		 * */  

	/* Stream 은 자료의 대상과 상관 없이 동일한 연산을 수행할 수 있도록 해주는 반복자
	 	* 
	 	* Stream 은 메서드 체이닝 기법을 사용
	 	* 
	 	* */ 
package day15;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {
	public static void main(String[] args) {
		// ArrayList 객체 생성 
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0, num = 10;
		
		while(i < 5) {
			list.add(num);
			
			num += 10;
			i++;
		}
		
		System.out.println(list);
		
		
		// 람다식 표현 (1)
		list.forEach(n -> {
			System.out.print(n + " ");
		});
		
		
		// 람다식 표현 (2) - 익명 메서드 
			// 람다식 표현 (1) 과 같은 방법 
		Consumer<Integer> method1 = (n) -> {
			System.out.print(n + " ");
		};
		
			// Consumer 를 활용한 출력 
		System.out.println();
		System.out.println("Consumer 를 활용한 출력");
		list.forEach(method1);
	}
}
