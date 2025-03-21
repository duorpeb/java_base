// 로또 번호 생성 
// 당첨 번호와 사용자 번호를 비교하여 등수를 추출 
// 6개 모두 일치하면 1등, 5개 일치 (보너스 번호 일치) 하면 2등, 5개 일치 3등
// 4개 일치 4등, 3개 일치 5등, 나머지는 꽝 

// 메서드 1) lottoArr(), 로또 번호 생성 메서드 (난수 생성 시 중복 불가) 
// 메서드 2) checkNum(), 중복 번호 생성 방지 메서드
// 메서드 3) userArr(), 사용자가 입력한 번호가 저장될 배열 생성 메서드 
// 메서드 4) compareArr(), 배열을 비교하여 등수를 확인하는 메서드 
// 메서드 5) dispaly(), 출력 메서드 
	// lottoArr() 의 보너스 번호는 [ ] 안에 출력 되도록 생성
	// userArr() 의 배열은 "1 2 3 4 5 6" 형태로 출력 
	// 등수도 출력 
package day08;

import java.util.Scanner;

public class MethodEx03 {
	// 메서드 1) lottoArr() - 로또 번호 생성 메서드 
	public static int[] lottoArr() {
		int[] arr = new int[7];
		int randNum = 0;
		int i = 0;
		
		// 중복 확인 
		do {
			// 난수 범위 설정 형식
			// (int)(Math.random()*(end-start+1)) + start
			randNum = (int)(Math.random()*45) + 1;
			
			// 중복 확인
			if(checkNum(arr,randNum)) { arr[i] = randNum; i++; }
			
		}while(i<arr.length);

		return arr;
	} // lottoArr() fin 
	
	
	// 메서드 2) checkNum() - 중복 번호 생성 방지 메서드 
	public static boolean checkNum(int[] arr, int num) {
		boolean bool = false;
		
		for(int t : arr) {
			if(t != num) { bool = true; }
		}
		
		return bool;
	} // checkNum() fin
	
	
	// 메서드 3) userArr() - 사용자의 번호를 입력받는 배열 생성 
	public static int[] userArr() {
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 번호를 입력하세요 ");
			System.out.print((i+1) + "번 숫자 : ");
			
			if(i > 0 && arr[i] == arr[i-1]) { System.out.println("Wrong Input !"); }
		
			arr[i] = sc.nextInt();
			
			System.out.println();
		}
		sc.close();
		
		return arr;
	} // userArr() fin 
	
	
	// 메서드 4) compareArr() - lottoArr() 와 userArr() 를 비교하여 등수 출력
	public static void compareArr(int[] userArr, int[] lottoArr) {
		int cnt = 0;
		
		for(int t : userArr) {
			for(int i = 0; i < lottoArr.length; i++) {
				if(t == lottoArr[i]) { cnt++; }
			}
		}
		
		switch(cnt) {
			case 1: 
			case 2:
				System.out.println("꽝입니다"); break;
				
			case 3: 
				System.out.println("5등입니다"); break;
				
			case 4: 
				System.out.println("4등입니다");
			
			case 5:
				int bonusNum = lottoArr[6];
				
				for(int t : userArr) {
					if(t == bonusNum) { System.out.println("2등입니다"); }
					
					else { System.out.println("3등입니다"); }
				}
				break;
				
			case 6:
				System.out.println("축하합니다! 1등입니다!");
				
			default:
		}
	}
	
	
	// 메서드 5) display() - 배열 출력 메서드
	public static void display(int[] userArr, int[] lottoArr) {	
			// userArr 배열 출력 
			System.out.print("사용자의 번호 : ");
			
			for(int i = 0; i < userArr.length; i++) {
				System.out.print(userArr[i] + " ");
			} 
			System.out.println();
			
			
			// lottoArr 배열 출력
			System.out.print("당첨 번호 : ");
			
			for(int i = 0; i < lottoArr.length; i++) { 
				if(i == 6) { 
					System.out.print( "[ " + lottoArr[i] + " ]");
					break;
				}
				System.out.print(lottoArr[i] + " ");
				
			}
			System.out.println();
			
			compareArr(userArr,lottoArr);
	}
	
	// main
	public static void main(String[] args) {
		display(userArr(),lottoArr());
	} // main fin 
}
