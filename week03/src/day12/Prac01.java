package day12;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {String str = "";
		StringBuffer sb = new StringBuffer();
		
		sb.append("Good Boy!");
		sb.insert(0, "I'm a "); 
		
		System.out.println(sb.substring(0,4)); // 출력 : I'm
	}
}
