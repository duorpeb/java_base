package day03;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		// 구구단 2단만 출력 
//		int n = 2;
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(n + " × " + i + " = " + (n*i));
//		}
		
		
		// 사용자로부터 입력받은 구구단을 출력
		System.out.println("구구단의 몇 단을 출력할까요?");
		System.out.print(" n : ");
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int i = 1;
		
		num = scan.nextInt();
		
		System.out.println();
		
		while(i <= 9) {
			System.out.println(num + " × " + i + " = " + (num*i));
			i++;
		}
		
		scan.close();
		
	}
}
