package day05;

import java.util.Scanner;

/* 	<문제>
		▶ 파일명을 저장하고 있는 배열이 주어졌을 때 검색어를 입력하면
		 검색어를 포함하는 파일을 출력 
		 
		조건 1) 만약 검색결과가 없으면 "검색 결과가 없습니다" 출력 
		
		조건 2) 대소문자 상관없이 검색 
*/ 
public class ArrEx01 {
	public static void main(String[] args) {
		String[] fileName = {"aa1.java","ab2.java","ba3.java","bb4.java",
												 "ca5.java","cb6.java","cc7.java","da8.java"};
		
		// 검색어 입력 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색 내용 : ");
		
		String find = sc.nextLine().toLowerCase();
	
		
		for(int i = 0; i < fileName.length; i++){
			int equal_key = fileName[i].indexOf(".");
			
			if(fileName[i].substring(0,equal_key).toLowerCase().contains(find)) {
				System.out.println("검색 결과 : " + fileName[i]);
			}
		}
		
		sc.close();
	}
}
