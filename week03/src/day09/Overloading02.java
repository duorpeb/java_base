// 가변인자 메서드의 오버로딩
// 매개변수의 개수가 고정되어 있지 않는 경우 사용하는 방식 
package day09;

public class Overloading02 {
	public static void main(String[] args) {
		Overloading02 ol = new Overloading02();
		
	}
	
	// ... 은 Spread Operator 로 매개 변수를 (들을) 배열로 인식하여 할당 
	public int sum(int ...num) {
		int result = 0;
		
		for(int tmp : num) { result += tmp; }
		
		return result;
	}
	
}
