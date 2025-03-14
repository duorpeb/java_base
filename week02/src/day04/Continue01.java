package day04;

public class Continue01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { 
				System.out.print("★" + " ");
				continue; }
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("Finished..!");
	}
}
