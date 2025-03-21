// 메서드 오버로딩
// 메소드 오버로딩이란 동일한 이름의 메소드를 여러 개 만드는 케이스를 의미

// 오버로딩의 조건 
// 조건 1) 매개변수의 개수가 달라야 함
// 조건 2) 매개변수의 타입이 달라야 함 (리턴 타입과 매개변수의 이름은 상관 없음)

// 정적 메소드 (Static Method) 는 인스턴스 생성 
// (e.g., Overloading01 m7 = new Overloading01();) 없이 호출이 가능하며 
// 유틸리티 관련 함수를 만드는 데 유용하게 사용됨

// 인스턴스(객체) 생성(Instance Creation) 이란 클래스를 기반으로 
// 객체를 메모리에 할당하여 사용하는 과정을 의미하며 인스턴스(객체) 생성 시
// 객체가 Heap 영역에 할당되고 생성자를 통해 초기화가 이루어짐  
package day09;

public class Overloading01 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		// static 이 붙은 클래스가 아닌 이상 
		// 사용하기 위해선 먼저 클래스의 객체를 생성해야 함 
		Overloading01 m7 = new Overloading01();
		int add = m7.sum(num1, num2);
		
		System.out.println(add);
	}
	
	
	public int sum(int num1, int num2) { return num1 + num2; }
	public int sum(int num1, int num2,int num3) { return num1 + num2 + num3; }
}
