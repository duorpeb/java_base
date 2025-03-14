package day05;

import java.text.DecimalFormat;

// 배열의 합계와 평균을 출력하고 최대값과 최소값을 출력  
public class Array03 {
	public static void main(String[] args) {
		int arr[] = {35,23,56,78,90,65,54,92};
		int sum = 0;
		int count = 1;
		
		// 합계 및 평균 구하기
		for(int num : arr) {
			sum += num;
			count++;
		}

		// 합계 및 평균 출력
		double avg = sum/count;
		
		// 소수점의 출력을 위한 코드
		// 정수의 형식을 변경, 형식은 #,0 
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("<합계 및 평균 출력>");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + df.format(avg));
		
		
		// 최대/최소값 출력  
		System.out.println();
		System.out.println("<최대/최소값 출력>");
		

		// 최대값 구하기
		int max = arr[0]; // 배열의 첫 번째 요소로 초기화

		for(int i = 1; i < arr.length; i++) {
		    if(arr[i] > max) { max = arr[i]; }
		}
		
		
		// 최소값 찾기
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
	    if(arr[i] < min) { min = arr[i]; }
		}
		
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
	}
}
