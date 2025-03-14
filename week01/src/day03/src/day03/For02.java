package day03;

public class For02 {
	public static void main(String[] args) {
		// for 문 - 1~10 까지 출력
//		for(int i = 1; i <= 10; i++) { System.out.print(i + "  "); }
//		
//		System.out.println();
//		
//		
//		// while 문 - 1~10 까지 출력
//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.print(i + "  ");
//			i++;
//		}
		
		
		// 1~10 까지 수 중 짝수만 출력
//		int i = 1;
//		
//		while(i <= 10) {
//			if(i%2 == 0) { System.out.print(i + "  "); }
//			i++;
//		}
		
		
		// 1~10 까지의 합계를 출력 
//		int i = 1;
//		int sum = 0;
//		
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("sum : " + sum);
		
		
		// 1~10 까지의 수 중 짝수의 합, 홀수의 합을 출력 
		int i = 1;
		int sum1 = 0;
		int sum2 = 0; 
		
		while(i <= 10){
			if(i%2 == 0) { sum1 += i; }
			
			if(i%2 == 1) { sum2 += i; }
			
			i++;
		}
		
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);
		
	}
}
