package day06;

import java.util.Scanner;

//데이터를 입력받아 저장하고 성적표를 출력
//항목 : 이름 국어 영어 수학 총점 평균 석차

//조건 1) 몇 명의 성적을 출력할지 결정 
public class MultiArrEx01_1 {	
	public static void main(String[] args) {
		// 성적표의 헤더 배열
		String multiArr1[] = {"이름","국어","영어","수학","총점","평균","석차"};
		
		// 테스트 참가 인원 설정
		System.out.print("몇 명의 성적을 출력하시겠습니까? ");
		Scanner sc = new Scanner(System.in);
	
		int row = sc.nextInt();
		
		
		// 참가 인원에 따른 배열의 크기 초기화   
		String multiArr2[][] = new String[row][7];
		
		// 데이터 (이름, 국어, 영어, 수학) 입력 받기 
		for(int i = 0; i < row; i++) {
			int sum = 0;
			double avg = 0;
			
			sc.nextLine();
			
			// 이름 입력 
			System.out.println("이름을 입력하세요");
			System.out.print("학생 이름 : ");
			
			multiArr2[i][0] = sc.nextLine();
			// System.out.println(multiArr2[i][0]);
			
	
			// 점수 입력 및 총점 저장 
			for(int j = 1; j < 4; j++) {
				System.out.print(multiArr1[j] + " 점수 입력 : ");
				
				multiArr2[i][j] = sc.nextLine();
				
				sum += Integer.parseInt(multiArr2[i][j]); 
			}
			multiArr2[i][4] = String.valueOf(sum);	
			
			avg = sum / 3.0;
			// 확인, System.out.println(avg);
			
			multiArr2[i][5] = String.valueOf(avg);
		}
		
		
		// 석차 구하기 
    for (int i = 0; i < multiArr2.length; i++) {
    	// 기본 석차는 1등으로 설정
    	int rank = 1; 
      
      for (int j = 0; j < multiArr2.length; j++) {
      	// 총점이 낮으면 석차 증가
        if (i != j && Integer.parseInt(multiArr2[i][4]) < Integer.parseInt(multiArr2[j][4])) { 
           rank++;
        }
      }
      // 석차 저장
      multiArr2[i][6] = Integer.toString(rank); 
    }
 		System.out.println();
 		
 		
 		// 성적표 헤더 출력 
 		for(int i = 0; i < multiArr1.length; i++) {
 			System.out.print(multiArr1[i] + "\t");
 		}
 		System.out.println();
 		
 		
 		// 성적표 내용 출력 
 		for(int i = 0; i < row; i++) {
 			for(int j = 0; j < multiArr2[i].length; j++) {
 				System.out.print(multiArr2[i][j] + "\t");
 			}
 			System.out.println();
 		}
 		
 	
 		sc.close();
	}
}


