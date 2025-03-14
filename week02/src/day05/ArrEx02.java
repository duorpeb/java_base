package day05;

/*	<문제>
 		▶ 배열의 길이가 10인 int 형 배열을 생성한 후 
 			해당 배열에 1~10 까지 저장한 후 출력
 		 		
 		int tmp = arr[0];
 		arr[0] = arr[random]
 		arr[random] = tmp;
*/
public class ArrEx02 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		// 배열의 길이가 10인 배열에 1~10 까지 저장
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// 섞기
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*arr.length); 
			
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
	
		for(int t : arr) { System.out.print( t + " " ); }
		System.out.println();
		
		
		// 오름차순 정렬
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { 
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; }
			}
		}
		
		for(int t : arr) {System.out.print(t + " ");}
		

	}
}
