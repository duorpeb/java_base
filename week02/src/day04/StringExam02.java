package day04;

import java.util.Scanner;

// 파일이 파일명.확장자로 되어 있을 때 
// 파일을 파일명과 확장자로 분리하여 출력 
// 확장자가 .java 면 "java 파일입니다" 출력 
// 그 이외의 확장자는 "기타 파일입니다" 출력
public class StringExam02 {
	public static void main(String[] args) {
		String fileName = new String();
		
		System.out.println("<File List>");
		System.out.printf("a.java" + "%n" + "b.txt" + "%n");
		System.out.printf("b.cpp" + "%n" + "d.mp4" + "%n");
		System.out.printf("e.java" + "%n" + "f.cc" + "%n");
		
		System.out.println();
		System.out.println("파일명을 입력하세요");
		System.out.print("파일명 : ");
		
		Scanner scan = new Scanner(System.in);
		
		fileName = scan.nextLine();
		
		// indexOf();
		// indexOf() 는 괄호 안의 문자를 문자열에서 탐색하여 
		// 찾는 문자가 있으면 해당 문자의 index 를 반환하고 찾는 문자가 없으면 -1 을 반환
		// 해당 문자열에 같은 문자가 여러 개 있는 경우 처음 만나는 위치의 값을 반환
		int e = fileName.indexOf(".");
		
		
		// substring(), length()
		// 문자열의 마지막을 구하는 경우 일반적으로 '문자열 길이 - 1' 을 사용하지만 
		// substring() 은 마지막 index 를 포함하지 않기에 -1 하지 않아도 됨
		System.out.println(fileName.substring((e+1),fileName.length())); 
		
		String equalKey = fileName.substring((e+1),fileName.length());
		
		
		// equals(), "비교 기준 대상".equals("비교 대상");
		if(equalKey.equals("java")){
			System.out.println("java 파일입니다");
		}
		
		else { System.out.println("기타 파일입니다"); }
	}
}
