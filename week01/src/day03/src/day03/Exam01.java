package day03;

import java.util.Scanner;

/*	<과제 : Up & Down Game>
	
		▶ 1~50 까지의 랜덤 수를 생성하여 맞추는 게임
*/

public class Exam01 {
	public static void main(String[] args) {
		int num = 0;
		int rand_num = (int)(Math.random()*50)+1;
		int count = 0;
		
		char[] emoji = Character.toChars(0X1F600);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<Up/Down Game>");
		System.out.println("1~50 까지의 수 중 하나를 고르시오");
	
		
		while(num != rand_num) {
			System.out.print("정답 : ");
			
			num = scan.nextInt();
			
			// 형식 지정자는 큰 따옴표 쌍 (" ") 하나 당 하나만 사용 가능
			if(num < 1 || num > 50) { System.out.printf("Wrong Input !!" + "%n"); }
			
			else {
				if(num == rand_num) {
					if(count == 0) { System.out.println("대단해요! 한 번에 맞췄습니다"); }
					
					else {
						System.out.print("정답입니다! ");
						System.out.print(count + "번 만에 맞췄습니다 !" + "%n");
					}
				}
				
				else {
					System.out.print (num + " 보다 ");
					String right = num > rand_num ? "낮은 수 입니다" : "높은 수 입니다";
					System.out.print(right);
					System.out.printf("%n%n");
					count++;
					
					System.out.println("5번 중 " + (5-count) + "번 남았습니다");
					
					if(count == 5) { 
						System.out.print("Your Failed ");
						System.out.println(emoji);
						return;
					}
				}
			}
		}
		
		scan.close();
	}
}
