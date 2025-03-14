// 생성자는 객체 생성 시 초기값을 지정해주는 역할 
// 생성자는 기본 생성자, 복사 생성자가 있음

// 기본 생성자는 컴파일시 String 은 null 로 int 는 0 으로 자동 초기화하는 것을 의미
// 사용자가 생성자를 생성 시 기본 생성자는 사라지기에 생성자를 만들 때는 기본 생성자와 같이 생성해야 함 
// 생성자는 여러 개 생성이 가능하며 이를 생성자 오버로딩이라 하며 
// 생성자 오버로딩 시 매개변수의 개수 혹은 타입이 달라야 함 
 
// 생성자는 리턴 타입이 없는 메서드와 같은 형태 
// e.g., public 클래스명(매개변수) { 초기값 지정; } 

// 생성자의 위치는 메소드 보다 위 멤버변수 보다 아래에 위치 

// 생성자 호출이 가능하며 기반 클래스 생성자의 호출을 가장 많이 활용
// 생성자의 호출은 생성자 { } 안의 가장 윗 줄에서만 가능
package day08;

public class Constructor01 {
	public static void main(String[] args) {
		
	}
}

class CarCons{
 private // 멤버 변수
  boolean power; 
 	String name, color, year;
 	int speed, door;
 	
 	// 기본 생성자
 	public CarCons() {}
 	
 	// 기본 생성자 오버로딩 (1)
 	public CarCons(String name) { this.name = name; }
	
 	// 기본 생성자 오버로딩 (2)
 	public CarCons(String name, String color) { 
 		// 생성자 호출
 		// 생성자의 호출은 생성자 { } 안의 가장 윗 줄에서만 가능
 		this(name); // == this.name = name;
 		
 		
 		this.color = color;
 	}

 public 
 
 	void display(){}
} 
 

