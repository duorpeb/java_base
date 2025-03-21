// 메서드로 작업 
// 두 정수의 값이 주어졌을 때, 두 정수 사이의 모든 정수의 합을 리턴하는 메서드 

// 조건 1) a > b 일 때, 작은 값부터 큰 값까지 리턴 
// 조건 2) a = b 일 때, 자기 자신을 리턴 
package day09;

public class Exam01 {

 public 	
	static void main(String[] args) {
		Exam01 a = new Exam01();
		
		System.out.println("<메서드로 구현>");
		System.out.println("a < b 일 때 : " + a.sum(2, 5));
		System.out.println("a > b 일 때 : " + a.sum(5, 2));
		System.out.println("a == b 일 때 : " + a.sum(10, 10));
		
		System.out.println();
		System.out.println("<재귀 메서드로 구현>");
		System.out.println("a > b 일 때 : " + a.recurSum(5, 2));
		System.out.println("a > b 일 때 : " + a.recurSum(8, 1));
		System.out.println("a < b 일 때 : " + a.recurSum(1, 8));
		System.out.println("a == b 일 때 : " + a.recurSum(10, 10));
	}
	
 	// sum() 
  int sum(int a, int b) {
  	int result = 0;
  	
  	if(a > b) {
  		for(int i = b; b <= a; b++) { result += b; }	
  	} 
  		else if(a < b) {
  			for(int i = a; a <= b; a++) { result += a; }	
  	}
  		else if(a == b) { return a; }
  		
  	return result;
  } 
  
  
  // 재귀 메서드로 구현 
  int recurSum(int a, int b) {
  	// 큰 수까지 작은 수를 하나씩 증가시키며 더함 
  	// 하나 증가시키고 자기자신을 불러서 또 비교 
  	if(a == b) { return a; }
  	
  	return (a < b) ? a + recurSum(a+1, b) : recurSum(b, a);
  }
}

