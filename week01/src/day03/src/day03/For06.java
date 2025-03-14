package day03;

import java.util.Scanner;

// 최소 공배수 구하기
// 최소 공배수 구하는 공식 
// 최소 공배수 (LCM) = (a*b)/최대 공약수(GCD)
public class For06 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int i = 1;
		int gcd = 0;
		
		System.out.println("최소 공배수를 구할 두 수를 입력하세요");
		System.out.print(" 첫 번째 수 : ");
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		
		
		System.out.print(" 두 번째 수 : ");
		
		num2 = scan.nextInt();
		
		
		while(num1 < num2 ? i <= num2 : i <= num1) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
			
			i++;
		}
		
		
		System.out.println("");
		System.out.print(num1 + " 과(와) " + num2 + " 의 " + "최소 공배수는 ");
		System.out.print( ((num1*num2)/gcd) + " 입니다" );
	}
}
