package day04;

import java.util.Scanner;

/*	<문제>
 		입력받은 숫자의 합계와 평균을 출력 
 
  	조건 1) 사용자로부터 숫자를 입력받으며 사용자가 0 or 음수를 입력한 경우 종료 
  	조건 2) 사용자로부터 0 or 음수를 입력받으면 이전까지 입력받은 숫자들의 합과 평균을 출력
  	조건 3) 입력받은 숫자가 없는 경우, 합계 평균 출력 하지 않고 숫자를 입력해달라는 문구 넣기 
*/
public class Exam01 {
	public static void main(String[] args) {
		boolean bool;
		
		int sum = 0;
		int count = 1;
		
		double aver = 0.0;
		
		
		Scanner scan = new Scanner(System.in);
		
		do{
			bool = true;
			
			System.out.println("Enter Numbers");
			System.out.print("Number : ");
			
			short number = scan.nextShort();
			
			if(number <= 0 && count == 1) {
				System.out.println("수를 입력해주세요");
			}
			
			else if(number <= 0) {
				System.out.println("합 : " + sum);
				System.out.println("평균 : " + aver);
				System.out.println("Finished... ");
				
				bool = false;
			}
			
			
			else {
				sum += number; 
				count++;
				aver = (sum/count);
			}
			
			System.out.println();
			
		}while(bool); 
		
	}
}
