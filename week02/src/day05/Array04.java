package day05;

import java.text.DecimalFormat;

// 10 개의 값을 가지는 배열을 생성한 뒤 
// 1~50 까지의 랜덤 수를 배열에 저장 
// 합계, 평균, 최대, 최소를 출력 
public class Array04 {
	public static void main(String[] args) {
		// 10 개의 값을 가지는 배열 생성 
		int arr[] = new int[10]; 
		int sum = 0;
		int count = 0;
		
		
		System.out.println("<배열 값 출력>");
		
		// 랜덤 수를 배열에 저장 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			
			// 배열값 출력 
			System.out.print(arr[i] + " ");
			
			// 합계 및 평균 출력을 위한 값 저장
			sum += arr[i];
			count++;
			
		}
		System.out.printf("%n" + "%n");
		
		
		// 출력 - 1) 합계 및 평균 출력
		double avg = sum/count;
		
		// 소수점의 출력을 위한 코드
		// 정수의 형식을 변경, 형식은 #,0 
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("<합계 및 평균 출력>");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + df.format(avg));
		
		
		// 최대값 구하기
		int max = arr[0]; // 배열의 첫 번째 요소로 초기화

		for(int i = 1; i < arr.length; i++) {
		    if(arr[i] > max) { max = arr[i]; }
		}
		
		
		// 출력 - 2) 최대값 출력 
		System.out.println();
		System.out.println("<최대값 출력>");	
		System.out.println("최대값 : " + max);
		
		
		// 최소값 구하기
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) { min = arr[i];}
		}
		
		
		// 출력 - 3) 최소값 출력 
		System.out.println();
		System.out.println("<최소값 출력>");	
		System.out.println("최소값 : " + min);
	}
}
