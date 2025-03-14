package day03;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		// 1~10 까지 출력
//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.print(i + "  ");
//			i++;
//		}
		
		
		// 1~10 까지의 수 중 짝수만 출력 
//		int i = 1;
//		
//		while(i <= 10) {
//			if(i%2 == 0) { System.out.print(i + "  "); }
//			i++;
//		}

		
		// 입력받은 수 부터 입력받은 수 까지를 출력 
		int n = 0;
		int m = 0;
		int count = 0;
		
		System.out.println("n 부터 m 까지의 수를 출력합니다");
		System.out.println("n 을 입력하세요");
		System.out.print("n : ");
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt(); 
		
		System.out.println();
		System.out.println("m 을 입력하세요");
		System.out.print("m : ");
		
		m = scan.nextInt();
		
	
		while(n <= m) {
			System.out.print(n + "  ");
			n++;
			count++;
			
			if(count % 10 == 0) { System.out.println();}
		}
		
		
	}
}
