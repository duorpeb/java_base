package day03;

import java.util.Scanner;

//약수는 나누어서 떨어지는 수의 집합을 의미
public class For05 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int i = 1;
		int count = 0;
		int gcd = 0;
		
		// 첫 번째 수 
		System.out.println("공약수를 구할 수를 입력하세요");
		System.out.print("첫 번째 수 : ");
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		
		
		System.out.print("두 번째 수 : ");
		
		num2 = scan.nextInt();
		
		
		System.out.println();
		System.out.print(num1 + " 의 약수는 ");

		
		while(i <= num1) {
			if(num1%i == 0) { 
				System.out.print(i + "  "); 
				count++;
			}
			
			i++;
		}
		
		System.out.println("입니다");
		
		System.out.println(num1 + " 의 약수의 개수는 " + count + "개 입니다");
		
		count = 0;
		i = 1;
		
		
		// 두 번째 수
		System.out.println();
		System.out.print(num2 + " 의 약수는 ");

		
		while(i <= num2) {
			if(num2%i == 0) { 
				System.out.print(i + "  "); 
				count++;
			}
			
			i++;
		}
		
		System.out.println("입니다");
		
		System.out.println(num2 + " 의 약수의 개수는 " + count + "개 입니다");
		System.out.println();
		
		
		// 공약수 출력
		i = 1;
		
		System.out.print(num1 + " 과(와) " + num2 + " 의 공약수는 ");
		
		 
		
		while(num1 < num2 ? i <= num2 : i <= num1) {
			if(num1%i == 0 && num2%i == 0) {
				System.out.print(i + " ");
				gcd = i;
			}
			
			i++;
		}
		
		System.out.print("입니다");
		
		System.out.println();
		System.out.println(num1 + " 과(와) " + num2 + " 의 최대 공약수는 " + gcd + " 입니다");
		
		
	} 
}
