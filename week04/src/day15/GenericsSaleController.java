package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericsSaleController {
	// 멤버 변수로 Sale 클래스 리스트를 생성 
		// 제네릭 클래스 객체 생성 - 메뉴판  
	private ArrayList<GenericsSale<String/*Sale 의 K*/
	, Integer/*Sale 의 V*/>> list = new ArrayList<>();
		
		// 제네릭 클래스 객체 생성 - 주문 내역 
	private ArrayList<GenericsSale<String, Integer>> order = new ArrayList<>();
	
		// 합계 
	int sum = 0;
	
	
	// 기본 생성자 
	public GenericsSaleController() {};
	
	
	// 메서드 
		// add(), 메뉴 추가 
	public void add(Scanner sc) {
		// 제네릭 타입의 Obj 를 사용할 때, 형 변환을 해주거나
		// 형을 명시 해주어야 함 
			// 형 변환) int price = (int)s.getPrice();
			// 형을 명시) Sale<String, Integer>
		
		// 입력
		System.out.print("메뉴명 : ");
		String menu = sc.next();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		// 객체 생성 후 추가
		GenericsSale<String, Integer> s 
		= new GenericsSale<String, Integer>(menu, price);
		
		list.add(s);
		System.out.println("메뉴 추가 완료");
	}
	
		// print(), 메뉴 출력
	public void print() {
		for(GenericsSale<String, Integer> s : list) {
			System.out.println(s);
		}
	}
	
	
		// order(), 주문 메서드 
			// 메뉴와 수량을 입력받아 list 에서 메뉴의 가격을 찾아와 
			// 수량 * list 의 가격을 price 에 저장 
	public void order(Scanner sc) {
		int totalPrice = 0;
		
		// Input 
			// Menu
		System.out.println("메뉴 이름을 입력하세요");
		System.out.print("메뉴 이름 : ");
		String menu = sc.next();
		
			// Price
		System.out.println("메뉴 수량을 입력하세요");
		System.out.print("메뉴 수량 : ");
		int n = sc.nextInt();
		
		
		// order 에 가격과 메뉴 등록
		for(GenericsSale<String, Integer> s : list) {
			if(s.getMenu().equals(menu)) {
				totalPrice = n * s.getPrice();			
				
				order.add(new GenericsSale<String, Integer>(menu, totalPrice));	
				
				sum += totalPrice;
				
				System.out.println("주문 완료 !");
			}
		}		
		
		// for 문을 쓴 경우 코드 줄이기 
//	order.add(new GenericsSale<String, Integer>(menu, s.getPrice()*n));
	}
	
		// orderPirnt(), 주문내역 출력 메서드 
			// order 와 총 지불 금액을 출력
	public void orderPrint() {
		System.out.println("<주문 내역>");
		
		for(GenericsSale<String, Integer> s : order) {
			System.out.println(s);			
		}
		System.out.println();
		
		System.out.println("<총 지불 금액>");
		System.out.println("가격 : " + sum);
	}
}
