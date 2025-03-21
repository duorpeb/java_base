package day10;

public class Super02 {
	public static void main(String[] args) {
		Dog d = new Dog("초코","개");
		Cat c = new Cat("나비","고양이");
		
		d.printInfo();
		d.howl();
		System.out.println("-------------------");
		
		c.printInfo();
		c.howl();
	}
}
// 기반 클래스  
class Animal{
	private String name; // 동물 이름 
	private String category; // 동물 유형 
	
	// 기본 생성자
	public Animal() {}
	
	// 생성자 오버로딩 (1)
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	// 출력 메서드 
	void printInfo() {
		System.out.println("이름 : " + name);
	System.out.println("종 : " + category);
	}

	// 울음소리 출력 메서드 
	void howl() {
		System.out.print(name + "의 울음소리 : ");
	}

	
	// Getter() & Setter()
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}


// Animal 의 파생 클래스 - Cat {}
class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	void howl() {
		super.howl();
		System.out.println("야옹~");
	}
}

// Animal 의 파생 클래스 - Dog
class Dog extends Animal{
	// 생성자 
	// 기반 클래스의 생성자를 호출하여 파생 클래스의 생성자 생성 
	public Dog(String name, String category) { super(name, category); }
	
	// 기반 클래스의 Setter() 를 호출하여 생성자 생성
//	public Dog(String name, String category) {
//		super.setName(name);
//		super.setCategory(category); 
//	}
	
	@Override
	void howl() {
		super.howl();
		System.out.println("멍멍!");
	}
	
}




