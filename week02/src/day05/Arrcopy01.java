package day05;

// 배열 복사 
// 같은 배열을 2개 생성 

// 배열의 길이는 정해져 있기에 
public class Arrcopy01 {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4};
		int arr1[] = arr;
		int arr2[] = new int[4];
		
		System.out.println("arr : " + arr);
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		
		// arr 출력
		System.out.println();
		System.out.println("<arr 출력>");	
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + " = " + arr[i] );
		}
		System.out.println();
		
		// arr1 출력 
		System.out.println();
		System.out.println("<arr1 출력>");		
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "]" + " = " + arr1[i] );
		}
		System.out.println();
		
		// 배열 복사 메서드 - System.arrcopy(이전배열, 번지, 새배열, 번지, 복사개수)
		// arr 배열의 데이터를 arr3 배열로 이동  
		int arr3[] = new int[7];
		
		// System.arrcopy()
		System.arraycopy(arr, 0, arr3, 0, arr.length-1);
		
		// arr3 출력
		System.out.println();
		System.out.println("<arr3 출력>");
		for(int s : arr3) {System.out.print(s + " ");}
	}
}
