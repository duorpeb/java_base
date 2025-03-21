// 재귀 메서드 (Recursion Method)
// 재귀 메서드란 메서드 안에서 본인의 메서드를 호출하는 메서드

package day09;

public class Overloading03 {
	public static void main(String[] args) {
		// ! (팩토리얼) 예제 
	}
	
	
	// 팩토리얼을 for 반복문 형태 
	public int fact1(int num) {
		if(num < 0 ) { return 0; }
		
		if(num == 0 || num == 1) { return 1; }
		
		// 곱한 값을 0 으로 만들지 않기 위한 초기화
		int result = 1;
		
		for(int i = 2; i <= num; i++) { result *= i; }
		
		return result;
	}
	
	
	// 팩토리얼을 재귀 형태로 
	public int fact2(int num) {
		if(num < 0 ) { return 0; }
		
		if(num == 0 || num == 1) { return 1; }
		
		return num * fact2(num-1);
	}
}
