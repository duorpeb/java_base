package day06;

import java.util.Scanner;

// 야구게임 
// 컴퓨터가 3자리의 숫자를 생성하며 각 자리 수는 0~9의 수 (e.g., 112, 495)
// 컴퓨터가 생성한 수를 배열로 저장하되 각 숫자들이 중복이 되어서는 안됨

// 유저는 3자리 숫자를 입력하여 아무것도 일치하지 않으면 out, 
// 숫자만 일치하면 ball, 자리와 숫자가 일치하면 strike 
public class ArrayEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 비교를 위한 배열 생성 
		int comNum[] = new int[3]; // 컴퓨터
		int myNum[] = new int[3]; // 사용자 
		
		
		// 컴퓨터의 숫자 생성 (단, 한 번 나온 수의 중복 불가능)
		for(int i = 0; i < comNum.length; i++) { 
			// 난수 생성 
			int rand_num = (int)(Math.random()*10);
			
			// 빈 값과 비교가 불가능하기에 일단 값 대입 
			comNum[i] = rand_num;
			
			//배열에 rand_num 이 존재하는지 확인하기 위한 반복
			for(int j = 0; j < i; j++) { 
				// 조건식 - 중복 불가능 
				if(comNum[i] == comNum[j]) { 
					// 이전 idx 에 위치한 값과 같은 값이 나온다면 i 를 감소  
					i--; 
					break;
				}
			}
		}
		
		// 확인, for(int c : comNum) { System.out.print(c+" "); }
		
		while(true) {
			// myNum 입력
			System.out.println("숫자 입력 : ");
			
			// 문자열로 받은 데이터를 split() 를 이용해 한글자씩 배열로 저장
			String myStr = scan.next();
				// split("") 은 한 문자씩 나누겠다는 의미
			String[] myStrTemp = myStr.split(""); // 
			
				// 문자열을 숫자로 변환해서 myNum[0] ~ myNum[2]까지 정수로 저장
			for(int i=0; i<myNum.length; i++) {
				myNum[i] =  Integer.parseInt(myStrTemp[i]); 
			}
			
			
			// Strike 와 Ball 출력을 위한 변수 초기화
			int stk = 0;
			int ball = 0;
			
			
			// 비교를 위한 이중 for 문 
				// comNum
			for(int i = 0; i < comNum.length; i++) { 
				// myNum
				for(int j = 0; j < myNum.length; j++) { 
					// 값도 같고, 위치도 같다면...
					if(comNum[i] == myNum[j] && i == j) { stk++; }
					
					// 값만 같다면...
					else if(comNum[i] == myNum[j] && i != j) { ball++; }
				}
			}
			
			
			// 출력
			if(stk == 0 && ball == 0) {
				System.out.println("Out !");
			} else {
				System.out.println("> "+stk+" Strike "+ball+" Ball");
			}
			
			
			// 종료 조건 설정 
			if(stk == 3) {
				System.out.println("성공!! 종료.");
				break;
			}
			
		}
		
		scan.close();
	}
}
