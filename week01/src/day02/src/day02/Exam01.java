package day02;

import java.util.Scanner;

/*	<문제>
	조건 1) 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력 
	e.g., Input : 2, 3, + 
			  Output : 2 + 3 = 5
			  
	조건 2) +, -, *, /, % 이 외의 연산자가 입력되면 잘못된 연산자로 출력 		  
*/
public class Exam01 {
	public static void main(String[] args) {
		int num1, num2 = 0;
		
		// String 은 비교가 불가능하고 char 은 비교가 가능하기에 char 사용 
		char oper, respon;
	
		boolean bool = true;
		
			
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("두 수를 입력하세요");
//		System.out.print("Num 1 : ");
//		num1 = scan.nextInt(); 
//		
//		System.out.print("Num 2 : ");
//		num2 = scan.nextInt(); 
//		
//		// scan.next() 로 입력 받으면 String 으로 반환하기에 
//		// charAt() 을 사용하여 char 로 변환해주어야 함 
//		System.out.println("(+ / - / * / ÷) 연산자 중 하나를 입력하세요 ");
//		System.out.println("연산자 : ");
//		
//		// String 으로 입력받은 글자는 0부터 시작하기에 
//		// charAt(0) 으로 String 을 char 자료형으로 변환 
//		oper = scan.next().charAt(0);
//		
//		
//		switch(oper) {
//			case '+': 
//				System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); 
//				break;
//				
//			case '-': 
//				System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); 
//				break;
//				
//			case '*': 
//				System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); 
//				break;
//				
//			case '/': 
//				System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); 
//				break;
//				
//			default:
//				System.out.println("(+ / - / * / ÷) 의 연산자 중에 입력하세요");
//		}
		
		
		while(bool) {
			System.out.println("두 수를 입력하세요");
			System.out.print("Num 1 : ");
			num1 = scan.nextInt(); 
			
			System.out.print("Num 2 : ");
			num2 = scan.nextInt(); 
			
			// scan.next() 로 입력 받으면 String 으로 반환하기에 
			// charAt() 을 사용하여 char 로 변환해주어야 함 
			System.out.println("(+ / - / * / ÷ / %) 연산자 중 하나를 입력하세요 ");
			System.out.print("연산자 : ");
			
			// String 으로 입력받은 글자는 0부터 시작하기에 
			// charAt(0) 으로 String 을 char 자료형으로 변환 
			oper = scan.next().charAt(0);
			
			
			switch(oper) {
				case '+': 
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); 
					break;
					
				case '-': 
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); 
					break;
					
				case '*': 
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); 
					break;
					
				case '/': 
					if(num1 == 0 || num2 == 0) { System.out.println("0 이 아닌 수를 입력하세요"); }
					
					else{
						System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					} 
					break;
					
				case '%': 
					System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); 
					break;
					
				default:
					System.out.println("(+ / - / * / ÷) 의 연산자 중에 입력하세요");
					break;
			}
			
			System.out.println();
			
			System.out.println("종료하시겠습니까?(Y/N)");
			respon = scan.next().charAt(0);
			
			if(respon == 'Y' || respon == 'y') { bool = false; }
			
			// 아래 코드는 필요 없는 코드 
			// if(respon == 'N' || respon == 'n') { break; }
		}
	}
}
