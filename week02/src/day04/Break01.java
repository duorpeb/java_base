package day04;

public class Break01 {
	public static void main(String[] args) {
		int i = 0, j = 0, k=0;
		
		for(;;){
			if(j == 100) { break; }
			
			System.out.print(j);
			j++;
			
			for(;;){
				if(k == 200) { break; }
				
				System.out.print(k);
				k++;
			}// 2번째 for 문
			
		}	// 1번째 for 문
		
		
	}
}
