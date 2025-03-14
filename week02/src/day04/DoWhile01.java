package day04;

import java.util.Scanner;

// 메뉴 구성 
// menu 1 은 저장 menu 2 는 생성 menu 3 은 종료
public class DoWhile01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu_num = 0;
		
		do{
			System.out.println("<Menu>");
			System.out.println("1. Save");
			System.out.println("2. Create");
			System.out.println("3. Finish");
			
			System.out.print("Choice : ");
			
			menu_num = scan.nextInt();
			
			switch(menu_num) {
				case 1: System.out.println("This Saved..."); break;
				
				case 2: System.out.println("New Create !"); break;
				
				case 3: System.out.println("Finished !"); break;
				
				default: 
					System.out.println("Wrong Input");
					break;
			}
		}while(menu_num != 3);
		
		scan.close();
	}
}
