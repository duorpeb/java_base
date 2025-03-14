package day03;

import java.util.Scanner;

/*	<과제 2 : 주사위 게임>
		
		▶ 조건 1) 주사위를 던져 총 30칸을 이동하면 목적지에 도착하고 종료
			- 주사위를 던져 나온 수를 n 이라고 할 때, 
				(30 - n) 칸 남았다는 것을 사용자에게 보여줄 것
			
			- 도착 시 주사위를 던진 횟수를 보여주며 도착을 알려줄 것  	
		
		▶ 조건 2) 주사위는 1부터 6까지 랜덤으로 생성 
*/

public class Exam02 {
	public static void main(String[] args) {
		boolean bool = true;
		
		int dice_sum = 0;
		int count = 0;
		
		char respon; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<주사위 게임>");
		System.out.println("주사위의 총 합이 30 이상이 되는 경우 게임이 종료됩니다");
		
		
		do {
			System.out.println("주사위를 던지시겠습니까? (Y/N)");
			respon = scan.next().charAt(0);
			
			if(respon == 'Y' || respon == 'y') {
				int dice = (int)(Math.random()*6)+1;
				
				System.out.println();
				System.out.println("주사위의 수는 " + dice + "입니다");
				dice_sum += dice;
				count++;
				
				if(dice_sum >= 30) { break; }
				System.out.println("총 " + (30 - dice_sum) + " 칸 남았습니다");
			}
			
			if(respon == 'N' || respon == 'n') { bool = false; }
			
		} while(bool || dice_sum < 30);
		
		
		System.out.println("목적지에 도착했습니다!");
		System.out.println("주사위를 총 " + count + "번 굴렸습니다");

		scan.close();
	}
}
