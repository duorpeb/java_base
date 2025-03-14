package day04;

import java.util.Scanner;

// 숫자 2개를 입력받고 6개의 메뉴 중 해당 메뉴에 따라 두 수의 연산 결과를 출력 

// 조건 1) 0 으로 나누거나 0 으로 나눈 나머지를 구하는 경우 다시 입력
// 조건 2) 숫자는 한 번만 입력받고 Menu 만 반복
public class DoWhile02 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int menu_num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		System.out.print("num 1 : ");
		num1 = scan.nextInt();
		
		System.out.print("num 2 : ");
		num2 = scan.nextInt();
		
		System.out.println();
		
		do {
			System.out.println("Select an operation between two numbers");
			System.out.println("1) +  2)  -  3)  *");
			System.out.println("4) /  5)  %  6)  Finish");
			
			menu_num = scan.nextInt();
			
			switch(menu_num){
				case 1: 
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
					
				case 2: 
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				
				case 3: 
					System.out.println(num1 + " × " + num2 + " = " + num1*num2);
					break;
					
				case 4: 
					if(num1 == 0 || num2 == 0) { System.out.println("Wrong Input !"); }
					
					else{ System.out.println(num1 + " / " + num2 + " = " + num1/num2); }
					
					break;
					
				case 5: 
					if(num1 == 0 || num2 == 0) { System.out.println("Wrong Input !"); }
					
					else{ System.out.println(num1 + " % " + num2 + " = " + num1%num2); }
					
					break;
					
				case 6: 
					System.out.println("Finish !");
					break;
					
				default:
					System.out.println("You must Enter of One to Six");
			}
			
			System.out.println("----------------------");
			
		}while(menu_num != 6);
		
		
		scan.close();
	}
}
