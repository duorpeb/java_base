package day07;

public class Method03 {
	// 사칙연산 메서드 5개 생성
	// 두 정수의 연산 결과를 리턴
	
	// add
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	// subtrac 
	public static int subtrac(int a, int b) {
		return a-b;
	}
	
	
	// multi
	public static int multi(int a, int b) {
		return a*b;
	}
	
	
	// div
	public static int div(int a, int b) {
		if(b == 0) {
			return -9999;
		} 
			else{
				return a/b;
		}
			
	}
	
	
	// mod
	public static int mod(int a, int b) {
		if(b == 0) {
			return -9999;
		} 
			else{
				return a%b;
		}
			
	}
	
	
	// main
	public static void main(String[] args) {
		int a = 0, b = 0;
		
		int result = div(a,b);
		
		// add
		System.out.println(add(20,7));
		
		// subtrac
		System.out.println(subtrac(20,7));
		
		// multi
		System.out.println(multi(20,7));
		
		// div
		System.out.println(div(20,7));
		
		// mod
		System.out.println(mod(20,7));
		
		// 다른 파일에 있는 static 인 클래스의 메소드를 호출할 경우
		// 클래스명을 찍고 메소드명을 적으면 됨 e.g., 클래스명.메소드명();
		System.out.println("----------------------------------------------------------"
				+ "-----------------------------------------------------------------------");
		Method04.displayMul2();
	
	} // main fin
	
}
