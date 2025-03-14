// 성적표
// 데이터를 입력받아 저장하고 성적표를 출력
// 항목 : 이름 국어 영어 수학 총점 평균 석차

//조건 1) 몇 명의 성적을 출력할지 결정 
package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam01Report {
	private String name;
	private int scoreKor;
	private int scoreEng;
	private int scoreMath;
	private int total;
	private double average;
	private int rank;
	
	// 기본 생성자 
	public Exam01Report() {}
	
  
  // reportInput(), 점수를 입력 받고 총점 저장 
  public void reportInput() {
  	// 총점 
  	int sumTmp = 0;
  	
  	Scanner sc = new Scanner(System.in);
  	
  	// 이름 입력
		System.out.println("이름을 입력하세요");
		System.out.print("이름 "+ " : ");
		
		setName(sc.nextLine());
		

		// 국어, 영어, 수학 점수 입력
			// 국어 
		System.out.println("국어점수를 입력하세요");
		System.out.print("국어 점수 : ");
		
			// 입력값 검사, 1~100 이 외의 값이 들어오면 다시 입력
		do {
			setScoreKor(sc.nextInt());
			
			if(getScoreKor() > 100 || getScoreKor() < 0) {
				System.out.println("다시 입력하세요"); 
				System.out.print("국어 점수 : ");
			} 
			
		}while(getScoreKor() > 100 || getScoreKor() < 0);
		
		sumTmp += getScoreKor();
		
			// 영어 
		System.out.println("영어점수를 입력하세요");
		System.out.print("영어 점수 : ");
		
			// 입력값 검사, 1~100 이 외의 값이 들어오면 다시 입력
		do {
			setScoreEng(sc.nextInt());
			
			if(getScoreEng() > 100 || getScoreEng() < 0) {
				System.out.println("다시 입력하세요"); 
				System.out.print("영어 점수 : ");
			} 
			
		}while(getScoreEng() > 100 || getScoreEng() < 0);
		
		sumTmp += getScoreEng();
		
		
			// 수학
		System.out.println("수학점수를 입력하세요");
		System.out.print("수학 점수 : ");
		
			// 입력값 검사, 1~100 이 외의 값이 들어오면 다시 입력
		do {
			setScoreMath(sc.nextInt());
			
			if(getScoreMath() > 100 || getScoreMath() < 0) {
				System.out.println("다시 입력하세요"); 
				System.out.print("수학 점수 : ");
			}
			
		}while(getScoreMath() > 100 || getScoreMath() < 0);
		
		sumTmp += getScoreMath();
		
		setTotal(sumTmp);
  } // reportInput() fin 
	
  
  // printDisplay(), 성적표 출력
  public void printDisplay() {
  	DecimalFormat df = new DecimalFormat("#.00");
  	
  	System.out.print(getName() + "\t ");
  	System.out.print(getScoreKor() + "\t ");
  	System.out.print(getScoreEng() + "\t ");
  	System.out.print(getScoreMath() + "\t ");
  	System.out.print(getTotal() + "\t ");
  	System.out.print(df.format(getAverage()) + "\t ");
  	System.out.print(getRank());
  	System.out.println();
  }
  
//	// 출력 
  	// toString() 을 이용하여 출력하는 방법 
//	@Override
//	public String toString() {
//		return  name + "\t " + scoreKor + "\t " + scoreEng + "\t " + scoreMath + "\t " + total 
//				+ "\t " + average + "\t ";
//	}


	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScoreKor() {
		return scoreKor;
	}

	public void setScoreKor(int scoreKor) {
		this.scoreKor = scoreKor;
	}

	public int getScoreEng() {
		return scoreEng;
	}

	public void setScoreEng(int scoreEng) {
		this.scoreEng = scoreEng;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
