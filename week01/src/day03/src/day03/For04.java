package day03;

import java.util.Scanner;

//약수는 나누어서 떨어지는 수의 집합을 의미
public class For04 {
	public static void main(String[] args) {
		int n = 0;
		int i = 1;
		int count = 0;
		
		System.out.println("약수를 구할 수를 입력하세요");
		System.out.print("n : ");
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		System.out.println();
		System.out.print(n + "의 약수는 ");
		
//		for(int i = 1; i <= n; i++) {
//			if(n%i == 0) { System.out.print(i + "  ");}
//		}

		
		while(i <= n) {
			if(n%i == 0) { 
				System.out.print(i + "  "); 
				count++;
			}
			
			i++;
		}
		
		System.out.println("입니다");
		
		System.out.println(n + "의 약수의 개수는 " + count + "개 입니다");
	} 
}
