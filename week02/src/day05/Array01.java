package day05;

import java.util.Scanner;

// 배열이란 같은 자료형, 같은 의미를 가지는 변수들의 집합 (참조 자료형)
// 참조 변수의 객체들은 객체가 생성되고 나면 자동 초기화 

// 생성 후 초기화의 기본 형식 중 첫 번째 방법을 가장 많이 사용
// 1) 자료형[] _ 배열명 = new _ 자료형[길이];
// 2) 자료형[] _ 배열명 = new _ 자료형[]{값1, 값2, 값3, ... 값 n};
// 3) 자료형[] _ 배열명 = {값1, 값2, 값3, ... 값 n};
public class Array01 {
	public static void main(String[] args) {
		
		// String 과 배열의 길이는 length - 1
		// 아래와 같이 선언과 생성을 따로 작성할 수 있음 
		int[] arr1; // 선언만
		arr1 = new int[5]; // 객체 생성 
		int arr2[] = new int[5]; // 방법 1, 선언과 생성을 한 번에 (0 으로 자동 초기화)
		
		
		// 배열의 길이가 10 인 배열을 생성하고 1~10 까지의 값을 저장 후 출력
		int arr3[] = new int[10];
		
		for(int i = 0; i < arr3.length; i++){
			arr3[i] = i+1;
			System.out.print(arr3[i] + " ");
		}
		
			
	}
}
