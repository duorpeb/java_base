package day02;

import java.util.Scanner;

/* 	<문제> 
	조건 1) 국어, 영어, 수학 점수를 입력받아 합계, 평균, pass 여부를 출력 
	조건 2) pass 여부는 80 이상이면 합격 (if 문을 사용) 
	조건 3) 입력값이 0 ~ 100 일 때만 통과 
*/  
public class Input02 {
	public static void main(String[] args) {
		int kor, eng, math, total, ave;
 
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		kor = scan.nextInt();
		
		eng = scan.nextInt();

		math = scan.nextInt();
	
		
		while(kor < 0 && kor > 100 || eng < 0 || eng > 100 && math < 0 || math > 100) { 
			System.out.println("점수를 다시 입력하세요");
			
			kor = scan.nextInt();
			
			eng = scan.nextInt();

			math = scan.nextInt();
		}
		
		
		if( (kor >= 0 && kor <= 100) && (eng >= 0 && eng <= 100) && (math >= 0 && math <= 100) ) {
			total = kor + eng + math;
			
			ave = (kor + eng + math)/3;
			
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + ave);		
			
			if (ave >= 80) { System.out.println("합격하셨습니다"); }
			
			else { System.out.println("불합격하셨습니다"); }
		}
		
		scan.close();
	}
}
