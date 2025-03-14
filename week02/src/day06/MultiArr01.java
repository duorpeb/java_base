package day06;

// 배열의 유형 
// 1차원 배열 - 배열명[]
// 2차원 배열 - 배열명[행(x)][열(y)] == { {},{} }
// 3차원 배열 - 배열명[][][] == { {}, {}, {} }

// 배열의 길이 
// 1차원 배열 - arr.length (for 1개)
// 2차원 배열 - arr[i].length, 어떤 열의 길이 (for 2개)
// 3차원 배열 - arr[i][j].length, 어떤 면의 길이 (for 3개)

public class MultiArr01 {
	public static void main(String[] args) {
		int arr1[][] = new int[2][3];
		
		int arr2[][] = { {1,2,3,}, {1,2,3,} };		
		
		// arr1 출력
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				// 값 입력, arr2[i][j] = i+1;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 다차원 배열의 지정 idx 출력
		System.out.println("arr2[0][1] : " + arr2[0][1]);
		System.out.println("arr2[0][2] : " + arr2[0][2]);
		System.out.println("arr2[1][0] : " + arr2[1][0]);
		System.out.println("arr2[1][2] : " + arr2[1][2]);
		
		// Run-time Error, 
		//System.out.println("arr2[1][3] : " + arr2[1][3]);
		
		
		// finish
	}
}
