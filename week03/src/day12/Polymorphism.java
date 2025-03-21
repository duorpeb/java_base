// 객체지향 프로그래밍의 특징 
	// 1) 프로그램의 독립적인 단위인 객체들을 모아서 처리 
	// 2) 각각의 객체는 메시지를 주고 받으며 데이터를 처리
	// 3) 객체지향 프로그래밍에서는 추상화, 캡슐화, 상속, 다형성을 활용 

// 추상화 (Abstraction)
	// 
package day12;

public class Polymorphism {
	public static void main(String[] args) {
		// Cat, Dog, Eagle, Human
		Cat c = new Cat();
		Dog d = new Dog();
		Eagle e = new Eagle();
		Human h = new Human();
		
		c.move();
		d.move(); d.dogMove();
		e.move(); e.flying();
		h.move(); h.working();
		
		System.out.println("<부모 객체로 자식 객체를 생성>");
		Animal a = new Cat(); Animal a1 = new Dog(); 
		Animal a2 = new Eagle(); Animal a3 = new Human();
		
		// 자식 객체로 부모 객체 생성 불가능 
		// Human h1 = new Animal(); 은 Error
		
		a.move();
		
		// 부모 객체로 자식 객체 생성 시 자식 객체의 메소드 사용 불가능
		// 따라서, a1.dogMove(); 은 Error
		a1.move();  
		
		// moveAnimal 메서드 실행
		System.out.println();
		System.out.println("=========< moveAnimal() 메서드 실행 > =========");
		Polymorphism poly = new Polymorphism();
		poly.moveAnimal2(c);
		poly.moveAnimal3(e);
		poly.moveAnimal(h);
		System.out.println();
		
		// 부모의 객체로 생성된 (상속받은) 객체는 모두 메서드 사용가능.
		// 부모 객체로 생성된 객체이기 때문에 당연히 가능
		System.out.println("=========< 다형성을 활용한 메서드 실행 > =========");
		poly.moveAnimal4(a);
		poly.moveAnimal4(a2);
		poly.moveAnimal4(a3);
		// 자식 객체로 생성된 객체도 형변환이 자동으로 이루어져 출력 가능
		poly.moveAnimal4(e);
//			poly.moveAnimal4(d);  //Dog는 상속받지 않았기 때문에 불가능
		
		
		// 상속을 받지 않은 객체는 생성 불가능, Animal a4 = new Robot();
		System.out.println("\n");
		System.out.println("=========< Animal 배열 생성 예시 > =========");
		
		Animal[] aniList = new Animal[5];
		int cnt = 0;
		
		aniList[cnt] = a; cnt++; 
		aniList[cnt] = a1; cnt++;
		aniList[cnt] = a2; cnt++;
		aniList[cnt] = a3; cnt++;
		
		for(int i = 0; i < cnt; i++) { aniList[i].move(); System.out.println(); }
		
		System.out.println("\n");
		System.out.println("=========< DownCasting Exam > =========");
		
		// 다운 캐스팅은 자동으로 이루어지지 않음, Cat c1 = aniList[0]; 은 Err
		// 아래와 같이 강제적 형 변환 해야 함 
			// Cat c1 = (Eagle)aniList[0] 으로 작성 시 Runtime Err 
		Cat c1 = (Cat)aniList[0];
		
		
		System.out.println("\n");
		System.out.println("=========< instanceof oper Exam > =========");
		
		// instanceof 연산자는 객체가 해당 클래스 형이 맞는치 체크하는 연산자
		System.out.println(aniList[0] instanceof Cat);
		System.out.println(aniList[1] instanceof Cat);
		
//		int humanIndex = -1;
//		int tigerIndex = -1;
//		int eagleIndex = -1;
//		for(int i=0; i<cnt; i++) {
//			if(aniList[i] instanceof Human) {
//				Human downcastHuman = (Human)aniList[i];
//				downcastHuman.readBook();
//				humanIndex = i;
//			}else if(aniList[i] instanceof Tiger) {
//				Tiger downcastTiger = (Tiger)aniList[i];
//				downcastTiger.hunting();
//				tigerIndex = i;
//			}else if(aniList[i] instanceof Eagle) {
//				Eagle downcastEagle = (Eagle)aniList[i];
//				downcastEagle.flying();
//				eagleIndex = i;
//			}else {
//				System.out.println("error");
//			}
//			
//		}
//		System.out.println("Human index"+ humanIndex);
//		System.out.println("Tiger Index"+tigerIndex);
//		System.out.println("Eagle index"+eagleIndex);
	}
	
	// 각 객체의 move를 실행해주는 메서드
	public void moveAnimal2(Cat Cat) {
		Cat.move();
	}
	
	public void moveAnimal3(Eagle eagle) {
		eagle.move();
	}
	
	public void moveAnimal(Human human) {
		human.move();
	}
	
	
	//다형성을 활용한 메서드로 변경
	public void moveAnimal4(Animal animal) {
		animal.move();
	}
}


// Animal
class Animal{
	public void move() { System.out.println("Moooooooove-___-"); }
}

// Cat
class Cat extends Animal{
	public void move() { System.out.println("야옹-___-"); }
}

// Dog
class Dog extends Animal {
	@Override
	public void move() { System.out.print("멍멍-___- "); }
	
	public void dogMove() { System.out.println("🐕🐕🐕"); }
}

// Eagle
class Eagle extends Animal {
	@Override
	public void move() { System.out.print("flyyyyyyyyyyy "); }
	
	public void flying() { System.out.println("🕊️🕊️🕊️"); }
}

// Human
class Human extends Animal {
	@Override
	public void move() { System.out.print("workkkkkkkkk "); }
	
	public void working() { System.out.println("🚶‍♂️🚶‍♂️🚶‍♂️"); }
}

// Robot
class Robot{ public void move() { System.out.println("전기가 필요합니다"); } }


// moveAnimal(), 각 객체의 move() 를 실행해주는 메서드 
