// 제네릭 (Generic)
// 제네릭이란 데이터의 타입을 나중에 확정하는 기법
// 클래스나 메서드를 생성할 때, 어떤 데이터가 들어올지 확신할 수 없다면 
// 먼저 제네릭 타입으로 구현한 뒤 나중에 인스턴스 생성 시 자료형을 확정하여 구현 

// 객체의 타입을 컴파일 할 때, 체크가 가능하기에 타입의 안정성을 
// 해치지 않는 선에서 적당히 형 변환이 가능 
package day15;

import java.util.Scanner;

public class GenericsMain {
	public static void main(String[] args) {
		// 제네릭 프로그래밍 (템플릿) 
			// <E> 가 템플릿 
			// List<E> list = new ArrayList<E>();
		
		// 앞서 했던 Sale 클래스를 제네릭으로 생성 
		
		Scanner scan = new Scanner(System.in);
		
		GenericsSaleController gsc = new GenericsSaleController();
		
		int menu = 0;
		
		do {
			System.out.println("<실행할 작업 선택>");
			System.out.println("1) 메뉴추가\t 2) 메뉴보기\t 3) 제품주문");
			System.out.println("4) 주문내역보기\t 5) 종료");
			System.out.print("선택 : ");
			
			menu = scan.nextInt();
			
			switch(menu) {
				case 1: gsc.add(scan); break;
				
				case 2: gsc.print(); break;
				
				case 3: gsc.order(scan); break;
				
				case 4: gsc.orderPrint(); break;
				
				case 5: System.out.println("종료"); break;
				
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			System.out.println("----------------------"
					+ "----------------------");
			
		}while(menu != 5);
		
		scan.close();
	}
}
