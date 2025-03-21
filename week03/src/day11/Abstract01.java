// 추상 클래스
// 추상 클래스는 추상 메서드, 일반 메서드, 멤버 변수, 상수로 구성될 수 있음 
// 추상 클래스의 인스턴스 (객체) 생성은 불가

// 추상 클래스의 형식 : abstract_class_클래스명 
// 추상 클래스를 사용하기 위해선 abstract 를 반드시 적어야 하며 
// 인터페이스에서는 abstract 생략이 가능 (인터페이스는 추상 메서드만 존재하기 때문)

// 추상 메서드의 형식 : 접근제어자_abstract_리턴타입_메서드명(매개 변수); 
// 추상 메서드는 메서드의 선언부만 있고 구현은 없는 메서드로 
// 추상 메서드가 포함된 추상 클래스를 상속 시 하위 클래스에서 반드시 오버라이딩해야 함 
package day11;

public class Abstract01 {
	public static void main(String[] args) {
		Dog d = new Dog("초코","개");
		d.printInfo();
		d.howl();
		d.eating("개껌"); System.out.println();
		
		Cat c = new Cat("나비","고양이");
		c.printInfo();
		c.howl();
		c.eating("츄르");
	}
}


// 추상 클래스
abstract class Animal{
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println("이름 : " + name); 
		System.out.println("종 : " + category); 		
	}
	
	// 추상 메서드
	public abstract void howl();
}


// Dog{}, 추상 클래스 Animal{} 을 상속 받아 구현
class Dog extends Animal{
	
	private String eat;
	
	// 기본 생성자
	public Dog() {}
	
	// 기본 생성자의 오버로딩 (1)
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println(super.name + " 울음소리 : 멍멍!");
	}
	
	
	public void eating(String eat) {
		this.eat = eat;
		
		System.out.println(name + "은 " + eat + "를(을) 좋아합니다");
	}
}


// Cat{}, 추상 클래스 Animal{} 을 상속 받아 구현
class Cat extends Animal{

	private String eat;
	
	// 기본 생성자
	public Cat() {}
	
	// 기본 생성자의 오버로딩 (1)
	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	public void eating(String eat) {
		this.eat = eat;
		
		System.out.println(name + "은 " + eat + "를(을) 좋아합니다");
	}
	
	@Override
	public void howl() {
		System.out.println(name + " 울음소리 : 야옹~ ");
	}
} 

