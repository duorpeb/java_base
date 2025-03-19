package day15;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream03 {
	public static void main(String[] args) {
		// ArrayList 인스턴스 생성 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); list.add(2); list.add(3);
		list.add(4); list.add(5); list.add(6);
		list.add(7); list.add(8); list.add(9);
		
		// list 를 Stream 으로 생성 
		list.stream()
				.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// distinct() - 중복 제거 
		list.stream()
				.distinct()
				.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// sorted() - 정렬
		list.stream()
				.sorted()
				.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 중복 제거 후 합계 
			/*
			 * 연산은 기본 자료형만 가능하기에 
			 * Wrapper 클래스인 list 는 연산이 불가능 
			 * 
			 * 따라서, mapToInt() 를 이용하여 int 로 변환 후 .sum() 연산 
			 * */ 
		list.stream()
				.distinct()
				.mapToInt(n->n.intValue())
				.sum();
		
		
		// 스트림 객체의 연산 
			// 스트림 객체 생성 
		Stream<Integer> stream1 = Stream.of(10,20,30,40,50);
		
			// stream1 의 합계 
		int sum = 
						stream1.mapToInt(n -> n.intValue())
					 	.sum();
		System.out.println("steam1 의 합계 : " + sum);
		
			// stream1 의 평균
				/* 
				 * stream1 의 합계에서 stream1 이 소모되었기에 
				 * avg 에서 stream1 을 또 사용하면 Error 발생
				 * */ 
//		OptionalDouble avg = 
//											 stream1.mapToDouble(n -> n.doubleValue())
//											 .average();
//		System.out.println("stream1 의 평균 : " + avg);
										
	}
}
