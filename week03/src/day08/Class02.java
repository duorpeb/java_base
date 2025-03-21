package day08;

import java.util.Scanner;

public class Class02 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.display();
		
		myCar.setName("Sonata");
		myCar.setColor("White");
		myCar.setYear("2018");
		System.out.println("--------정보 입력 후--------");
		myCar.display();
		
		System.out.println("--------시동 입력 전--------");
		myCar.start();
		myCar.speedPrint();
		System.out.println();
		
		System.out.println("--------속도 증가 --------");
		myCar.speed();
		myCar.speed();
		myCar.speed();
		myCar.speed();
		myCar.speed();
	}
}


class Car{
	// 멤버 변수 - name, color, year, power, speed
private
	String name, color, year;
	boolean power;
	int speed;

	// 메서드
	// 메서드 1) display() - 현재 상태 (멤버 변수 상태) 출력하는 메소드 생성
	// 메서드 2) start() - 시동을 켜고 끄는 메소드 생성 (꺼져있으면 키고 켜져있으면 끔)
	// 메서드 3) speed() - 속도를 증감시킬 수 있는 메소드 생성 
	// 메서드 4) Getter, Setter 메소드 
public
	// 메서드 1) display() - 자동차의 모든 정보 출력 
	void display() {
		System.out.println("<자동차 정보>");
		System.out.printf("자동차 이름 : " + getName() + "%n");
		
		
		System.out.printf("자동차 색상 : " + getColor() + "%n");
		System.out.printf("자동차 연식 : " + getYear() + " 년식" + "%n");
		System.out.println();
		
		System.out.printf("(On / Off) : " + getStart() + "%n");
		System.out.println("속도 : " + getSpeed());
	}

	
	// 메서드 1.1) speedPrint() - 시동과 속도를 출력 
	void speedPrint() {
		System.out.println("(On / Off) : " + (power? "ON" : "OFF"));
		System.out.println("속도 : " + getSpeed());
	}

	
	// 메서드 2) start()
	boolean start() {
		power = false;
		String rsp;
		
		System.out.println("시동을 거시겠습니까? (Y/N)");
		Scanner sc = new Scanner(System.in);
		
		rsp = sc.next().toUpperCase();
		
		if(rsp.charAt(0) == 'Y') { power = true; }
			else { power = false; }
		
		sc.close();
		
		return power;
	}
	
	
	// 메서드 3) speed()
	int speed() {
		char modify;
		
		System.out.println("Speed Up (+) / Speed Down (-)");
		Scanner sc = new Scanner(System.in);
		
		modify = sc.next().charAt(0);
		
		if(modify == '+') { 
			if (speed <= 200 && speed >= 0) { return (speed+10); } 
			
			else { speed = -99999; }
		}
			else { 
				if((speed <= 200 && speed >= 0)) { return (speed-10); } 
				
				else { speed = -99999; }
			}
		
		return speed;
	}
	
	
	// 메서드 4) Getter
	String getName() { return name; }
	
	String getColor() { return color; }
	
	String getYear() { return year; }
	
	boolean getStart() { return power; }
	
	int getSpeed() { return speed; }

	
	
	
	// 메서드 4.1) Setter
	// setName()
	void setName(String name) { 
		this.name = name;
	}
	
	
	// setColor()
	void setColor(String color) { 
		this.color = color;
	}
	
	
	// setYear()
	void setYear(String year) { 
		this.year = year;
	}
	
	
	// setStart()
	void setStart(boolean bool) { this.power = bool; }

	// setSpeed()
	void setSpeed(int x) { this.speed = x; }
	
}