package day08;

import java.util.Scanner;

public class Class01 {
	public static void main(String[] args) {
		// x = 0, y = 0 으로 초기화 된 Point 타입 객체 p 생성
		Point p = new Point(); 
		
		// p.outputValue()
		System.out.println("<p.outputValue>");
		System.out.println("Before Initialize x : " + p.getX() + ", y : " + p.y );
		
		p.setX(10);// p.x == p,setX(), x == getX()
		p.setY(20);// p.y == p.setY(), y == getY()
		System.out.println("Before Initialize x : " + p.getX() + ", y : " + p.y );
		
		// x + y 값을 x 값으로 설정
		p.setX(p.getX() + p.getY());
		
		System.out.print("p.outputValue : ");
		p.outputValue();
	}
}

// (x,y) 
class Point{
	// 멤버 변수
	// 멤버 변수와 매개 변수의 이름이 같은 경우
	// 멤버 변수를 "this.멤버 변수" 형식으로 사용하여 멤버 변수를 구분 
	
	// 멤버 변수는 초기값을 설정하지 않아도 자동 초기화 되며 
	// 정수값은 0 으로 String 은 null 로 초기화
	int x = 0;
	
	int y = 0;
	
public	
	// 메소드
	// outputValue() - 출력 메소드 
	void outputValue() {
		System.out.println("(" + x + ")" + ", " + "(" + y + ")");
	}
	
	
	// Getter 메소드 생성 
	int getX() { return x; }
	
	int getY() { return y; }
	
	
	// Setter 메소드 생성 
	public void setX(int x) { this.x = x; }
	
	public void setY(int y) { this.y = y; }
}