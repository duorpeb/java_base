package day07;

import java.util.Scanner;

public class Method04 {
	// 정수 (2~9 중 하나) 를 입력받아 
	// 해당 입력값에 해당하는 구구단을 출력하는 메서드 생성 
	// displayMul
	public static void displayMul() {
		int a = 0;
		
		System.out.println("구구단 몇 단을 출력하시겠습니까?");
		System.out.print("입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a >= 2 && a <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(a + " × " + i + " = " + a*i);
			}
		} 
			else {
				System.out.println("잘못된 입력입니다");
		}
	} // displayMul fin
	
	
	// displayMul2
	// 구구단 출력 메서드 
	public static void displayMul2() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " × " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
	} // displayMul2 fin
	
	
	// main
	public static void main(String[] args) {
		// displayMul();
		
		displayMul2();
		
		
		
	} // main fin
}
