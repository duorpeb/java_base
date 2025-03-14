package day10;

public class Static01 {
	public static void main(String[] args) {
		// 클래스 멤버는 객체 생성 없이 사용 가능 
		Tv.printBrand();
		
		// 객체 멤버는 인스턴스 생성읋 한 후 사용 가능
		Tv a = new Tv();
		a.printPower();
	}
}

class Tv{
	private boolean power;
	private static final String BRAND = "LG";
	
	public static void printBrand() {
		System.out.println("Brand : " + BRAND);
		
		// static 메서드에 인스턴스 생성 없이 일반 객체 멤버 변수 호출 불가능 
		// System.out.println(power);
	}
	
	void printPower() { 
		System.out.println(power ? "ON" : "OFF"); 
		
		// 일반 객체 메서드에 static 멤버 변수 사용 가능
		System.out.println("Brand : " + BRAND);
	}
}
