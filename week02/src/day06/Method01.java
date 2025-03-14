package day06;

// 클래스는 객체를 생성하기 위한 설계도 
// 클래스의 구성 : 멤버 변수, 메서드, 생성자 
public class Method01 {
	// 기능 (함수)를 Java 에서는 Method, JS 에서는 Function 이라고 함
	// 메서드의 선언 및 구현의 형식은 "접근제어자_리턴타입_메서드명(매개변수){ 구현부 }"
		// 리턴 타입은 반환할 값의 타입을 의미하며 반드시 1개여야 함  
		// 매개변수는 파라미터 기능을 하기위해 필요로 하는 값 
	
	// 메서드의 선언 위치는 클래스 안이고 다른 메서드 밖이어야 함 
	// 메서드의 선언 순서는 아무 상관이 없으며 호출되면 실행됨 
	
	// 두 수의 값을 더해 결과값을 리턴하는 메소드 생성 
	public static int add(int a, int b) {
		return a + b; 
	}
	
	public static void main(String[] args) {
		 System.out.println(add(2,4));
	}
}
