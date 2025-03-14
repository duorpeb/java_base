// 계산기  
// 두 수를 입력받고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지, 종료의 옵션 중 하나를 선택
// 선택한 연산자의 연산 결과를 출력하고 각 연산은 하나의 메서드로 생성 
// 0으로 나눌 때의 에러도 체크 
package day07;

import java.util.Scanner;

public class MethodEx01 {
	// input()
	public static int[] inputArr() {
		int arr[] = new int[2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		System.out.print("첫 번째 수 : ");
		
		arr[0] = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		
		arr[1] = sc.nextInt();
		
		sc.close();
		
		return arr;
	} // input fin
	
	
	// add
	public static int add(int[] arr) {
		return arr[0] + arr[1];
	}
	
	
	// sub 
	public static int sub(int[] arr) {
		return arr[0] - arr[1];
	}
	
	
	// mul
	public static int mul(int[] arr) {
		return arr[0] * arr[1];
	}
	
	
	// div
	public static int div(int[] arr) {
		if(arr[1] == 0) {
			return -9999;
		} 
			else{
				return arr[0] / arr[1];
		}
	}
	
	
	// mod
	public static int mod(int[] arr) {
		if(arr[1] == 0) {
			return -9999;
		} 
			else{
				return arr[0] % arr[1];
		}
	}
	
	
	// display
	public static void display() {
		// 입력을 위한 변수 설정 
		int select = 0;
		Scanner sc = new Scanner(System.in);
		
		// UI
		System.out.println("\t<Oper>");
		System.out.printf("1) +\t 2) -\t 3) *" + "%n");
		System.out.println("4) /\t 5) %\t 6) 종료");
		
		select = sc.nextInt();
		
		// menue 선택
		switch(select) {
			case 1: 
				// add( inputArr() ) 는 add(Arr[]) 의 의미 
				// (Arr[] 는 int Arr[] = new int[2])
				System.out.println("답 : " + add(inputArr()));
				break;
				
			case 2: 
				System.out.println("답 : " + sub(inputArr())); 
				break;
				
			case 3: 
				System.out.println("답 : " + mul(inputArr()));
				break;
				
			case 4:
				System.out.println("답 : " + div(inputArr()));
				break;
				
			case 5: 
				System.out.println("답 : " + mod(inputArr())); 
				break;
				
			case 6: 
				System.out.println("Finished..!");
				break;
				
			default:
				System.out.println("잘못된 입력입니다");
		}
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		display();
	}
}
