// 정수 배열을 랜덤으로 생성하고 출력 
// 해당 배열을 정렬 후 다시 출력
// 입력된 정수 배열을 출력하는 메서드 생성 -> printArr()
// 입력되는 정수 배열을 오름차순 정렬하는 메서드 생성 -> ascSort() 
package day07;

import java.util.Scanner;

public class MethodEx02_2 {
	// intArr() - 정수 배열 생성
	public static int[] intArr() {
		int rand_num = 0, num = 0;
		
		System.out.println("n 개의 정수를 가진 배열을 생성합니다");
		System.out.print("n : ");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			rand_num = (int)(Math.random()*30)+1;
			arr[i] = rand_num;

//		// 중복 제거
//			if(arr[i] == arr[i-1]) {
//				while(arr[i] != arr[i+1]) {
//					arrrand_num 
//				}
//			}
		}
		return arr;
	} // intArr() fin
	
	
	// printArr() - 생성된 배열 출력 
	public static void printArr(int[] arr) {
		int cnt = 0;
		
		// UI
		System.out.println("<배열>");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	} // printArr() fin
	
	
	// sortAsc() - 오름차순 정렬
	public static void sortAsc(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} // sortAsc() fin
	
	
	public static void main(String[] args) {
		int arr[] = intArr();
		
		printArr(arr);
		System.out.println();
		System.out.println("---------- 정렬 후 ---------");
		System.out.println();
		sortAsc(arr);
		printArr(arr);
	}
}
