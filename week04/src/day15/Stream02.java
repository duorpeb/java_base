// 점수 배열을 생성한 후 70 점 이상만 필터하여
// 합계, 평균, 가장 높은 점수를 출력 
package day15;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Stream02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77,88,99};
		
		
		// 합계
		int sum = 
						Arrays.stream(arr)
						.filter(n -> n >= 70)
						.sum();
		System.out.println("arr 점수의 합계 : " + arr);
		
		
		// 평균
		OptionalDouble avg = 
						 					Arrays.stream(arr)
						 					.filter(n -> n >= 70)
						 					.average();
		System.out.println("arr 점수의 평균 : " + avg);				
		
		
		// 가장 높은 점수를 출력 
		int s = 0;
			// 내가 작성한 코드 
//		int highScore = 
//									Arrays.stream(arr)
//									.sorted()
//									.forEach(n -> {
//										for(int i = 1; i < arr.length; i++){
//												if(arr[s] < arr[i]) { n = i; }
//										}
//									});
//		System.out.println("가장 높은 점수는 " + highScore + "점 입니다");
		
		
			// 수업 코드 
		OptionalInt highScore2 = 
									 Arrays.stream(arr)
									 .max();
		System.out.println("가장 높은 점수는 " + highScore2 + "점 입니다");
	}
}
