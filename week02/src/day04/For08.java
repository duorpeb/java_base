package day04;

// 이중 for 문 
public class For08 {
	public static void main(String[] args) {
		// 1 2 3   
		// 4 5 6  
		// 7 8 9  
		int number = 1;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) { 
				System.out.print(number + " ");
				number++; 
			}
			
			System.out.println();
		}
		
	}
}
