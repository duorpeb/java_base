// 성적표
// 데이터를 입력받아 저장하고 성적표를 출력
// 항목 : 이름 국어 영어 수학 총점 평균 석차

// 조건 1) 몇 명의 성적을 출력할지 결정 
// 석차는 메인에서 
package day10;

import java.util.Scanner;

public class Exam01Main {
	public static void main(String[] args) {
		int outputNum = 0;

		// UI
  	System.out.println("몇 명의 성적을 출력하시겠습니까?");
  	System.out.print("성적을 출력할 인원 수 : "); 
  	
  	Scanner sc = new Scanner(System.in);
  	
  	outputNum = sc.nextInt();
  	
  	// Exam01Report 형 배열 studentArr 에 
  	// 입력 받은 값을 저장하고 총점 및 평균을 구함
  	Exam01Report[] studentArr = new Exam01Report[outputNum];
		
  	for(int i = 0; i < studentArr.length; i++) {
  		Exam01Report r = new Exam01Report();
  		r.reportInput();
  		studentArr[i] = r;
  		
  		// 평균 
  		studentArr[i].setAverage(studentArr[i].getTotal()/3.0);
  		System.out.println();
  	} // fin
  	
  	// 석차 구하기
  	for(int i = 0; i < studentArr.length; i++) {
  		int rank = 1;
  		
  		for(int j = 0; j < studentArr.length; j++) {
  			if(studentArr[i].getTotal() < studentArr[j].getTotal()) {
  				rank++;
  			}
  		}
  		studentArr[i].setRank(rank);
  	} // fin
  	
  	// 성적표 출력
  	System.out.println("\t\t\t<성적표>");
  	System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 석차");
  	
  	for(int i = 0; i < studentArr.length; i++) {
  		studentArr[i].printDisplay();
  	}
  	
  	sc.close();
	}
}
