package day10;

public class Super01 {
	public static void main(String[] args) {
		Parent a = new Parent();
		Child b = new Child();
		
		a.print(); System.out.println();
		b.print();
		System.out.println("-----------------------");
		
		// Parent Class 멤버 변수 값 수정  
		a.setX(4); a.setY(5); a.setZ(6);
		a.a = 40; a.b = 50; a.c = 60;
		
		// Child Class 의 멤버 변수 및 
		b.setI(400); b.setJ(500); b.setK(600);
		
		a.print(); System.out.println();
		b.print();
		
	} // main fin
}


class Parent{
	// 상속 불가 (Parent) 클래스에서만 사용 가능  
	private int x = 1, y = 2, z = 3;
	
	// 상속 가능 
	protected int a = 4, b = 5, c = 6;
	
	void print() {
		System.out.println("x : " + x + ", y : " + y + ", c : " + z);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
} // Parent class fin


// Child class 
class Child extends Parent{
	private int i = 1, j = 2, k = 3;

	
	// override
	// 부모의 메서드를 재정의 
	// super 는 기반 클래스의 멤버 변수 / 메서드를 사용할 때, 사용하는 키워드
	// this 는 자신의 멤버 변수 / 메서드를 사용할 때, 사용하는 키워드
	@Override
	void print() { 
		super.print();
		System.out.println("i : " + i + ", j : " + j + ", k : " + k);
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	public int getK() {
		return k;
	}


	public void setK(int k) {
		this.k = k;
	}
}
