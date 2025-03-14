// 객체 생성 시 값을 초기화 하는 방법
// 객체 생성 시 값을 초기화 하는 방법으로는 초기화 (Initialization), 생성자 (Constructor) 가 있음
// 초기화의 종류로는 자동 초기화, 사용자 임의로 초기화, 초기화 블럭이 있음

// 초기화의 종류 
// 1) 자동 초기화란 멤버 변수 선언 시 기본적으로 int 는 0, String 은 null 값이 대입되는 것을 의미
// 2) 명시적 초기화란 기본값을 사용자 임의로 명시하여 주는 값을 의미 e.g., int a = 4;
// 3) 초기화 블럭 ( { ~ } ) 은 괄호 안에 초기값을 지정하는 것을 의미 

// 초기값의 우선 순위
// 생성자 > 초기화 블럭 > 명시적 초기값 > 자동 초기화
package day10;

public class Class03 {
	public static void main(String[] args) {
		Student a = new Student();
		
		System.out.println(a);
	}
}


class Student{
	// 명시적 초기화 
	private String place = "강남";
	private String name;
	private String phone;
	
	// 초기화 블럭 
	{
		place = "신촌";
		name = "XXX";
		phone = "010-0000-0000";
	}
	
	// 생성자
	public Student() {};
	public Student(String place) { this.place = place; }
	public Student(String place, String name) { this.place = place; this.name = name; };
	
	@Override
	public String toString() {
		return "Student [place = " + place + ", name = " + name + ", phone = " + phone + "]";
	}
}