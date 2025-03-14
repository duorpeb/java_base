package day03;

// 1~50 까지의 수 중 짝수만 출력 
public class While02 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		
		// 방법 1) count 변수 사용 
//		while(i <= 50) {
//			if(i%2 == 0) {
//				System.out.print(i + "  ");
//				count++;
//			}
//			
//			if(count % 5 == 0) { System.out.println(); }
//			
//			i++;
//		}
		
		
		// 방법 2) 식 사용 
		while(i <= 50) {
			if(i%2 == 0) {
				System.out.print(i + "  ");
				
				if(i%10 == 0) { System.out.println(); }
			}
			
			i++;
			
		}

	}
}
