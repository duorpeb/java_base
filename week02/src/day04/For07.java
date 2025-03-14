package day04;

import java.util.*;

// for 문을 이용하여 구구단을 출력 
public class For07 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " × " + i + " = " + (i*j) + "  ");
			}
			System.out.println();
		}
		
	}
}
