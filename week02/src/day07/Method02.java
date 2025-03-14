package day07;

public class Method02 {
	// 두 정수가 주어지면 두 수의 합을 리턴하는 메서드 
	// sum
	public static int sum(int a, int b) {
		return a + b;
	}
	
	
	// 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	// displaySum
	public static void displaySum1(int a, int b) {

		System.out.println(a + b);
	}
	
	
	// 합을 출력하기만 하는 메서드 
	public static void displaySum2() {
		int a = 3;
		int b = 4;
		
		System.out.println(a + b); 
	}
	
	
	// main 
	public static void main(String[] args) {
		// sum
		System.out.println(sum(5,2));
		
		// displaySum1 
		displaySum1(5,6);
		
		// displaySum2
		displaySum2();
		
	} // main fin
}
