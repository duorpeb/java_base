package day05;

import java.util.Scanner;

// 문자 배열 생성 
public class Array05 {	
	public static void main(String[] args) {
		String str_arr[] = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < str_arr.length; i++) {
			str_arr[i] = sc.nextLine(); 
		}
		
		for(String str : str_arr) {
			System.out.print(str + " ");
		}
		
		sc.close();
	}
}
