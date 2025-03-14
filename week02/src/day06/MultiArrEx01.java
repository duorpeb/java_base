package day06;

import java.util.Scanner;

// 데이터를 입력받아 저장하고 성적표를 출력
// 항목 : 이름 국어 영어 수학 총점 평균 석차

// 조건 1) 몇 명의 성적을 출력할지 결정 
public class MultiArrEx01 {
	public static void main(String[] args) {
		// 성적표의 헤더 배열
		String multiArr1[] = {"이름","국어","영어","수학","총점","평균","석차"};
		
		
		// 각 학생의 이름 초기화
		String multiArr2 [][] = { {"Park","0","0","0","0","0","0"},{"Lee","0","0","0","0","0","0"}
			,{"Kim","0","0","0","0","0","0"},{"Choo","0","0","0","0","0","0"}
			,{"Ji","0","0","0","0","0","0"} }; 
		
		
		// 데이터 설정
		for(int i = 0; i < multiArr2.length; i++) {
			for(int j = 1; j < multiArr2[i].length-3; j++) {
				// 점수를 랜덤으로 생성
				int rand_num = (int)(Math.random()*100)+1;
				
				// 정수를 문자열로 변환, Integer.parseInt();
				String change_rand_num = Integer.toString(rand_num);
				
				// 변환한 데이터를 배열에 저장
				multiArr2[i][j] = change_rand_num;
				
				// 확인, System.out.print(multiArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 총점 및 평균 구하기 
		for(int i = 0; i < multiArr2.length; i++) {
			// 총점을 위한 변수 sum 생성
			int sum = 0;
			
			for(int j = 1; j < multiArr2[i].length-3; j++) {
				// 각 점수를 sum 변수에 저장
				sum += Integer.parseInt(multiArr2[i][j]);
				// 확인, System.out.println(sum);
				
				// 총점
				multiArr2[i][4] = String.valueOf(sum);
				
				// 평균 
				multiArr2[i][5] = String.valueOf((sum/3));
			}
		}
		// 총점 확인 
//		for(int i = 0; i < multiArr2.length; i++) {
//			System.out.print(Integer.parseInt(multiArr2[i][4]) + " ");
//		}
		
		// 평균 확인 
//		for(int i = 0; i < multiArr2.length; i++) {
//			System.out.print(Integer.parseInt(multiArr2[i][5]) + " ");
//		}
		
		System.out.println();
	
		
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
    
    // 석차 확인
//		for(int i = 0; i < multiArr2.length; i++) {
//			System.out.print(Integer.parseInt(multiArr2[i][6]) + " ");
//		}
		
		
		// 성적표를 출력할 인원 수 지정
		System.out.println("몇 명의 성적을 출력하시겠습니까?");
		System.out.print("인원 수 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();;
		
		
		
		// 성적표 헤더 출력 
		System.out.println();
		
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
		// 형식 지정은 어디에서?
	}
}
