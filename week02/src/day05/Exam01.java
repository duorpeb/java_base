package day05;

import java.util.Scanner;

/*	<문제>
 		컴퓨터와 가위바위보 게임을 진행하여 결과를 출력 (0 = 가위, 1 = 바위 , 2 = 보)
 		
 		조건 1) 사용자는 선택하여 입력
*/
public class Exam01 {
	public static void main(String[] args) {
		// 컴퓨터의 가위, 바위, 보 변수 설정
		int com_rcp_num;
		com_rcp_num = (int)(Math.random()*2)+0;
		
		// 확인, System.out.println(com_rcp_num);
		
		// UI
		System.out.println("<가위/바위/보 게임>");
		System.out.println("가위/바위/보 중 하나를 선택하세요");
		System.out.print("사용자 : ");
	
		
		// 사용자의 가위, 바위, 보 입력
		int user_rcp_num = 0;
		
		Scanner sc = new Scanner(System.in);
		String user_rcp = sc.nextLine();
		
		
		if(!(user_rcp.equals("가위") || user_rcp.equals("바위") || user_rcp.equals("보"))){
			user_rcp_num = 999;
			System.out.println("Wrong Input !!");
		}
		else if("가위".equals(user_rcp) == true) { user_rcp_num = 0; }
		else if("바위".equals(user_rcp) == true) { user_rcp_num = 1; }
		else if("보".equals(user_rcp) == true) { user_rcp_num = 2; }
		else { }
		// 확인, System.out.println(user_rcp_num);
		
		// 사용자 : 컴퓨터
		// 0 0 무승부 0 1 패배 0 2 승리
		// 1 0 승리 1 1 무승부 1 2 패배 
		// 2 0 패배 2 1 승리 2 2 무 승부
		if(user_rcp_num == com_rcp_num) { System.out.println("무승부입니다"); }
		
		
		// 사용자가 가위를 냈을 때
		if(user_rcp_num == 0) {
			if(com_rcp_num == 1) { System.out.println("패배입니다"); } 
			
			if(com_rcp_num == 2) { System.out.println("승리입니다"); }
		}
		
		
		// 사용자가 바위를 냈을 때
		if(user_rcp_num == 1) {
			if(com_rcp_num == 0) { System.out.println("승리입니다"); } 
			
			if(com_rcp_num == 2) { System.out.println("패배입니다"); }
		}
		
		
		// 사용자가 보를 냈을 때
		if(user_rcp_num == 2) {
			if(com_rcp_num == 0) { System.out.println("패배입니다"); } 
			
			if(com_rcp_num == 1) { System.out.println("승리입니다"); }
		}
		
		
		System.out.println("Finished..!");
	}
}
