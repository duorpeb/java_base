package day13;

public class Exception01 {
	public static void main(String[] args) {
	
		  
//		  - try ~ catch
//		  - try ~ catch ~ finally
//		  - try : 예외가 발생할 가능성이 있는 구문을 작성 
//		  - catch : try 구문에서 발생한 에외를 처리
//		  - finally : try 구문외 반드시 실행되어야 하는 구문을 작성 (생략가능)

		
//			System.out.println(1+0);
//			System.out.println(1/0); //exception 발생라인
//			System.out.println(1-0);
		
		try {
			// 예외 발생가능성이 있는 코드 작성
			System.out.println(1+1);
			System.out.println(1-1);
			System.out.println(1*1);
			System.out.println(1/0); //exception 발생라인
			System.out.println(2+2);
			
		} catch (Exception e) {
			// e: Exception 클래스의 객체 (예외의 모든 클래스를 잡아주는 역할)
			e.printStackTrace(); // 예외 구문을 콘솔에 출력
			System.out.println("0으로 나누었습니다.");
			System.out.println(e.getMessage());
		}
		
		// Exception 발생해도 처리되는 구역
		System.out.println(3+3);
		System.out.println(4-4);
	}
}
