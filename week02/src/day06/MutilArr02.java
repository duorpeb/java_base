package day06;

public class MutilArr02 {
	public static void main(String[] args) {
		int multiArr1[][] = new int[5][3];
		int k = 1;
		
		// 2차원 배열에 데이터 저장하고 출력하기(1)
		// UI
		System.out.println("<multiArr1>");
		
		for(int i = 0; i < multiArr1.length; i++) {
			for(int j = 0; j < multiArr1[i].length; j++) {
				multiArr1[i][j] += k++;
				System.out.print(multiArr1[i][j] + " ");
			}
			System.out.println();
		}
		// 출력 결과
		// 1 2 3 
		// 4 5 6
		// 7 8 9 
		// 10 11 12
		// 13 14 15
		System.out.println();
		
		
		// 1~50 까지의 수 중 난수를 배열에 저장하여 출력 
		System.out.println("<MultiArr2>");
		int multiArr2[][] = new int[5][3];
		
		for(int i = 0; i < multiArr2.length; i++) {
			for(int j = 0; j < multiArr2[i].length; j++) {
				// 난수 변수 초기화
				int rand_num = (int)(Math.random()*50)+1;
				
				multiArr2[i][j] = rand_num;
				System.out.print(multiArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		// main finish
	}
}
