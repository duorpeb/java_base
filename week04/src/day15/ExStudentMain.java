
package day15;

import java.util.ArrayList;
import java.util.Comparator;

public class ExStudentMain {
	public static void main(String[] args) {
		// 멤버 변수 초기화
			// Student class List 생성 
		ArrayList<ExStudent> list = new ArrayList<>();
		
		// List 에 값 대입 
		list.add(new ExStudent("Park",11));
		list.add(new ExStudent("Lee",22));
		list.add(new ExStudent("Kim",33));
		list.add(new ExStudent("John",44));
		list.add(new ExStudent("Daniel",55));
		list.add(new ExStudent("Ji",66));
		list.add(new ExStudent("Son",77));
		list.add(new ExStudent("Ki",88));
		
		
		// Stream 을 이용하여 출력 
			// toString() 사용
		list.stream()
				.forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------");
		
			// toString() 미사용 
		list.stream()
				.forEach(n -> {
					String name = n.getName();
					int score = n.getScore();
					System.out.println(name + " : " + score);
				});
		System.out.println("-------------------------------------");
		
		
		// List 의 점수 합계와 인원수를 출력 	
			// 합계
		int sum = 
						list.stream()
						.mapToInt(n -> n.getScore()).sum();
		System.out.println("점수의 합계 : " + sum);
			
			// 인원 수 
		long cnt = 
							list.stream()
							.count();
		System.out.println("인원 수 : " + cnt);
		System.out.println("-------------------------------------");
		
			// 정렬, 가나다 순으로 정렬
			// 클래스 내부에 구현된 정렬 기능 (compareTo())이 없을 때 사용
		list.stream()
				.sorted(new Comparator<ExStudent>() {
					
					// o1 - o2 는 오름차순 정렬, o2 - o1 은 내림차순 정렬 
					@Override
					public int compare(ExStudent o1, ExStudent o2) {
						return o1.getName().compareTo(o2.getName());
					}
					
				}).forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------");
		
			// 정렬, 점수를 기준으로 내림차순 정렬 
			// 클래스 내부에 구현된 정렬 기능 (compareTo())이 없을 때 사용
		list.stream()
				.sorted(new Comparator<ExStudent>(){
			
				@Override
				public int compare(ExStudent o1, ExStudent o2) {
					return o2.getScore() - o1.getScore();
				}
		}).forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------");
		
			// Comparable<Student> 클래스에서 구현한 정렬 
			// class 객체에서만 사용 가능한 메서드
		list.stream().sorted().forEach(n -> System.out.println(n));
		
	}
}
