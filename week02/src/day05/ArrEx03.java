package day05;

// 길이가 10인 배열을 생성한 뒤 
// 해당 배열에 1~100까지의 난수 중 하나를 저장 
// 오름차순 정렬 후 출력 
public class ArrEx03 {
	public static void main(String[] args) {
		// 길이가 10 인 배열 생성 
		int arr[] = new int[10];
		
		// idx[0] ~ idx[9] 에 난수 저장
		for(int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random()*100)+1;
			
			arr[i] = rand;
		}
		
		// 확인 
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		
		
		// 오름차순 정렬
		int tmp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}	
			}
		}
		
		
		// 출력
		for(int t : arr) {
			System.out.print(t + " ");
		}
	
		
	}
}
