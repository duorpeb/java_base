// 앞서 했던 야구 게임 예제의 기능을 각각의 분리 
// 메서드 1) randNumArr(), 중복되지 않는 값으로만 이루어진 난수 배열 생성 메서드 생성 
// 메서드 2) userArr(), 사용자로부터 수를 입력받아 사용자의 숫자 야구 패 생성 
// 메서드 3) cntStr(), 두 개의 배열을 입력받아 스트라이크 개수를 카운트하는 메서드 생성  
// 메서드 4) cntBall(),두 개의 배열을 입력받아 볼 개수를 카운트하는 메서드 생성  
// 메서드 5) cntOutt(),두 개의 배열을 입력받아 아웃 개수를 카운트하는 메서드 생성 
package day07;

import java.util.Scanner;

public class Exam01 {
	// 메서드 1) randNumArr() - 난수 배열 생성 
	public static int[] randNumArr() {
		int arr[] = new int[3];
		int randNum;
		
		for(int i = 0; i < 3; i++) {
			// 이전 값과 다를 때까지 반복
			do {
				// 난수 생성
        randNum = (int)(Math.random() * 9) + 0; 
        
			} while (i > 0 && randNum == arr[i - 1]); 
			
			// 배열에 값 대입 
			arr[i] = randNum;
		}
		// 정수형 배열 arr 반환
		return arr;
	} // randNumArr fin
	
	
	// 메서드 2) userArr() - 사용자로부터 수를 입력받아 사용자의 숫자 야구 패 생성 
	public static int[] userArr() {
		int arr[] = new int[3];
		
		// UI
		System.out.println("\t<숫자 야구 게임>");
		System.out.println("숫자 야구 게임에 사용할 수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		// 배열에 저장 
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 수 정답 입력 : ");
			arr[i] = sc.nextInt();
		}
		// 확인, 
//		for(int i = 0; i < 3;) {
//			System.out.print(arr[i] + " ");
//		}
		sc.close();
		
		return arr;
	}
	
	
	// 메서드3) cntStr() - 스트라이크 개수 카운트 
	public static int cntStr(int[] arr1, int[] arr2) {
		int cnt = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) { cnt++; }
		}
		
		return cnt;
	} // cntStr fin
	
	
	// 메서드4) cntBall() - 볼 개수 카운트 
	public static int cntBall(int[] arr1, int[] arr2) {
		int cnt = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(i != j && arr1[i] == arr2[j]) { cnt++; }
			}
		}
		
		if(cnt == 3) { System.out.println("You win !" + "%n" +"Finished..!"); }
		
		return cnt;
	} // cntBall fin
	
	
	// 메서드5) cntOut() - 아웃 개수 카운트 
	public static int cntOut(int[] arr1, int[] arr2) {
		int cnt = 0;
		
		if(cntStr(arr1, arr2) == 0 && cntBall(arr1, arr2) == 0) { cnt++; }
		
		return cnt;
	}
	
	
	// main
	public static void main(String[] args) {
		int comNum[] = randNumArr();
		int myNum[] = userArr();
		
		
		System.out.print(cntStr(comNum,myNum) + " Strike" + " "); 
		System.out.print(cntBall(comNum,myNum) + " Ball" + " ");
		System.out.println(cntOut(comNum,myNum) + " Out");
		
		
		// 컴퓨터 수 확인,
		System.out.println();
		System.out.print("comNum : ");
		
		for(int i = 0; i < 3; i++) {
			System.out.print(comNum[i] + " ");
		} // 수 확인 fin
	} // main fin
}