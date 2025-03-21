// day08 의 Class02 에 Car 라는 클래스가 이미 존재하기 때문에
// class Car { } 와 같이 작성한다면 Error

// Class02 의 예제에 나온 메소드 + 문의 개수를 출력하는 메소드 
// 메소드 1) display() - 차량 정보를 출력하는 메소드
// 메소드 1.1) speedDisplay() - 속도와 시동 정보만 출력하는 메소드
// 메소드 2) start() - 시동을 켜고 끄는 메소드 (시동이 꺼져있으면 키고 켜져있으면 끔)
// 메소드 3) speed() - 속력을 조절하는 메소드
// 메소드 4) door() - 문의 개수를 출력하는 메소드 
// 메소드 5) Getter () 와 Setter
package day08;

public class Class02_1 {
	public static void main(String[] args) {
		CustomCar myCar = new CustomCar();
		myCar.display();
		
		System.out.println("--------------- 정보 입력 후 ----------------");
		myCar.setName("Sonata");
		myCar.setColor("White");
		myCar.setYear("2022");
		myCar.setDoor(4);
		
		myCar.start();
		myCar.display();
		System.out.println();
		
		System.out.println("--------------- 속도 +/- ----------------");
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDisplay();
		
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDisplay();
	}
}


// Class - CustomCar  
class CustomCar{
 private // 멤버 변수
  boolean power; 
 	String name, color, year;
 	int speed, door;
 	

 public 
 	// 메소드 1) display()
 	void display() {
	 System.out.println("<나의 자동차 정보>");
	 System.out.printf("자동차 이름 : " + getName() + "%n");
	 System.out.printf("자동차 색상 : " + getColor() + "%n");
	 System.out.printf("자동차 연식 : " + getYear() + "%n");
	 System.out.printf("자동차 문 개수 : " + getDoor() + " 개" + "%n");
	 System.out.println();
	 
	 System.out.printf("시동 (ON / OFF) : " + isPower() + "%n");
	 System.out.println("속도 : " + getSpeed() + " Km");
 } // display() fin
 
 
 // 메소드 2) speedDisplay()
 void speedDisplay(){
	 System.out.printf("시동 (ON / OFF) : " + isPower() + "%n");
	 System.out.println("속도 : " + getSpeed() + " Km");
 }
 
 
 // 메소드 2) start() 
 void start() {
	 if(speed == 0) { 
		 power = !power; 
		 
		 // (power ? "ON" : "OFF");
	 }
	 
	 else { System.out.println("Wrong Default !"); }
 }
 
 
 	// 메소드 3.1) speedUp()
 	void speedUp() {
 		if(speed >= 0 && speed <= 200) { speed += 10; }
 	}
 	
 	// 메소드 3.2) speedDown()
 	void speedDown() {
 		if(speed >= 0 && speed <= 200) { speed -= 10; }
 	}
 
 	
 	// 메소드 4) door()
 	void door() {
 		switch(door) {
 			case 2: door = 2; break;
 			case 4: door = 4; break;
 		}
 	}
 
 	
 	// 메소드 5) Getter() 와 Setter()
	public boolean isPower() {
		return power;
	}
	
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getYear() {
		return year;
	}
	
	
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public int getDoor() {
		return door;
	}
	
	
	public void setDoor(int door) {
		this.door = door;
	}
 
}
