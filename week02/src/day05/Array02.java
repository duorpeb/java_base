package day05;

import java.util.Scanner;

// 5명의 점수를 입력 받아 배열을 생성하고 해당 배열을 출력
// 출력 시 점수의 합계와 평균을 출력 
public class Array02 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요");
		
		
		// 점수 입력 및 합계 저장 
		for(int i = 0; i < arr.length; i++) {
			System.out.print("점수 " + (i+1) + " : ");
			
			int score = sc.nextInt();
			
			if(score >= 0) { arr[i] = score; }
			sum += arr[i]; 
		}
		
		
		// 배열 출력
		System.out.println();
		System.out.println("<배열 출력>");
		
		for(int i = 0; i < arr.length; i++) { 
			System.out.print("arr" + "[" + i + "]" + " = " + arr[i]);
			System.out.println();
		}
		
		
		// 총합과 평균을 출력
		System.out.println();
		System.out.println("<합계 및 평균 출력>");
		System.out.println("점수의 총합 : " + sum);
		System.out.println("평균 : " + ((double)sum/(arr.length)));
		
		
		// 향상된 for 문 
		// 향상된 for 문은 처음부터 마지막까지의 값을 탐색할 때 사용 (전체 탐색 시 사용)
		// 또한, idx 를 활용할 수 없으며 idx 로 접근이 불가능한 경우 사용 (부분 탐색 불가능)
		System.out.println();
		System.out.println("<향상된 for 문>");
		
		// arr[0] 부터 arr[4] 까지의 값을 num 에 저장 
		for(int num : arr) {
			// 이와 같이 조건문으로 검사 가능 if(num % 2 == 0)
			
			System.out.println(num);
		}
		
		sc.close();
	}
}
