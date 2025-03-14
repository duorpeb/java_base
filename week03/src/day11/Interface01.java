package day11;

public class Interface01 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn(); t.volUp(); t.volUp();
		t.chUp(); t.chUp(); t.chDown();
		t.turnOff();
	}
}


// 인터페이스 선언 (1)
interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

// 인터페이스 선언 (2)
interface Remote{
	void volUp();
	void volDown();
}

// 상속과 구현을 동시에
	// class Tv extends A implements B {}
	// 위와 같이 상속과 구현을 동시에 할 수 있으며 extends 먼저 적음 

// 인터페이스의 다중 구현 
class Tv implements Power, Remote{
	private boolean power;
	private int vol; 
	private int ch;
	
	@Override
	public void volUp() {
		if(power) { vol++; System.out.println("vol : " + vol);}
	}

	@Override
	public void volDown() {
		if(power) { vol--; System.out.println("vol : " + vol);}
	}

	@Override
	public void turnOn() { power = true; System.out.println("TV ON");}

	@Override
	public void turnOff() { power = false; System.out.println("TV OFF"); }

	public void chUp() { if(power) { ch++; System.out.println("ch : " + ch); } }
	
	public void chDown() { if(power) { ch--; System.out.println("ch : " + ch); } }
	
}
