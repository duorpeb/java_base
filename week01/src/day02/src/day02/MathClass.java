package day02;

// Java Library 에 Math 클래스가 존재하기에 MathClass 로 클래스명 작성 
public class MathClass {
	public static void main(String[] args) {
		double num = 3.14258;
		
		// Math.round 는 반올림, Math.ceil 은 올림, Math.floor 는 버림 (소수 자리수는 무조건 0)
		// Math.max() 는 최대값, Math.min() 은 최소값
		
		// Math.round()
		long roundNum1 = Math.round(num);
		int roundNum2 = (int)Math.round(num);
		
		System.out.println(roundNum1);
		System.out.println(roundNum2);
		
		
		// Math.ceil()
		double ceilNum1 = Math.ceil(num);
		int ceilNum2 = (int)Math.ceil(num);
		
		System.out.println(ceilNum1);
		System.out.println(ceilNum2);
		
		
		// Math.floor()
		double floorNum1 = Math.floor(num);
		int floorNum2 = (int)Math.floor(num);
		
		
		// Math.max() 
		System.out.println(Math.max(3, 5));
		System.out.println(Math.min(6,1));
		
		
		// Math.random();
		// Math.random() 은 0 과 1 사이의 아무값을 리턴 (0 <= Math.random <= 1)
		System.out.println(Math.random());
		
			// (int)(Math.random()*count)+start 는 
			// start ~ count 까지의 수 중 아무값을 리턴 
		
		  // 아래의 경우 1 ~ 10 까지의 수 중 아무값을 리턴  
		System.out.println((int)(Math.random()*10)+1); 
		
			// 아래의 경우 1 ~ 6 까지의 수 중 아무값을 리턴 
		System.out.println((int)(Math.random()*6)+1); 
		
			
	}
}
