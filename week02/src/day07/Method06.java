// 1_ 랜덤으로 정수 5개를 담는 배열을 생성하여 리턴하는 메소드 작성  
// 2_ 1번 에서 만든 배열을 입력받아 평균을 리턴하는 메소드 생성
// 3_ 1번에서 만든 배열을 출력하고 2번에서 만든 평균을 출력하는 메소드 생성 

package day07;


public class Method06 {
	// intArr, 배열 생성 
	public static int[] intArr() {
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			int rand_num = (int)(Math.random()*100)+0;
			
			arr[i] = rand_num;
		}
		
		return arr;
	} // intArr fin
	
	
	
	// avg, 평균을 리턴 
	public static double avg(int[] avgArr) {
		int sum = 0;
		
		for(int i = 0; i < avgArr.length; i++) {
			sum += avgArr[i];
		}
		
		return ((double)sum/avgArr.length);
	} // avg fin
	
	
	
	// display1
	public static void display1(int[] printArr, double avg) {
		// UI
		System.out.println("<display 1>");
		
		
		// 배열 출력 
		System.out.println("배열을 출력합니다");
		
		for(int i = 0; i < printArr.length; i++) {
			System.out.print(printArr[i] + " ");
		}
		System.out.println(); System.out.println();
		
		// 평균 출력 
		System.out.println("배열의 평균을 출력합니다");
		System.out.println("평균 : " + avg);
		System.out.println();
	} // display1 fin
	
	
	
	// display2 
	public static void display2() {
		int printArr[] = intArr();
		
		// UI
		System.out.println("<display 2>");
		
		// 배열 출력
		System.out.println("배열을 출력합니다");
		
		for(int i = 0; i < printArr.length; i++) {
			System.out.print(printArr[i] + " ");
		}
		System.out.println();
		
		// 배열의 평균 출력
		System.out.println();
		System.out.println("배열의 평균을 출력합니다");
		System.out.println("평균 : " + avg(printArr));
	}
	
	
	
	// main
	public static void main(String[] args) {
		// display1
		int randArr[] = intArr();
		double avg = avg(randArr);
		
		display1(intArr(),avg);
		
		
		// display2
		display2();
	}
}
