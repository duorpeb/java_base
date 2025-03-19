package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01SaleController {
	// Ex01SaleController 의 멤버 변수 초기화 
		// 메뉴 리스트 멤버 변수 초기화  
	private ArrayList<Ex01Menu> menuList = new ArrayList<>();
		// 기본 메뉴 생성에 따른 menuNo 초기화
	private int menuNo = 6;
	
		// 주문 리스트 멤버 변수 초기화 
	private ArrayList<Ex01Order> orderList = new ArrayList<>();
	
	
	// addMenu(), Ex01Menu 의 생성자로 기본메뉴를 생성
	public void addMenu() {
		menuList.add(new Ex01Menu(1, "짜장면", 1500));
		menuList.add(new Ex01Menu(2, "짬뽕", 2000));
		menuList.add(new Ex01Menu(3, "탕수육", 5000));
		menuList.add(new Ex01Menu(4, "음료수", 500));
		menuList.add(new Ex01Menu(5, "쟁반짜장", 4000));
		menuList.add(new Ex01Menu(6, "유산슬", 5000));
	}
	
	
	// add(), 메뉴 추가 메서드 
	public void add(Scanner scan) {
		// 메뉴 추가 시 menuNo++ 
		menuNo++;
		
		// UI
		System.out.println("메뉴 이름을 입력하세요");
		System.out.print("메뉴 이름 : ");
		String name = scan.next();
		
		System.out.println("메뉴 가격을 입력하세요");
		System.out.print("메뉴 가격 : ");
		int price = scan.nextInt();
		
		// 메뉴 추가
		menuList.add(new Ex01Menu(menuNo, name, price));
		
		// 확인
		System.out.println("<메뉴 추가 작업 완료>");
	}

	
	// delete(), 메뉴 삭제
		// 메뉴 삭제 방법으로는 인덱스를 제거 하는 것 (List.remove(Idx)) 과 
		// 객체를 가져와서 삭제하는 방식 (Set.get()) 총 2가지 방식 존재 
	public void delete(Scanner scan) {
		System.out.println("삭제할 메뉴 번호를 입력하세요");
		System.out.println("삭제할 메뉴 번호 입력 : ");
		int no = scan.nextInt();
		
		// 삭제 코드 
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).getMenuNo() == no) {
				// remove(Idx) 방식
				menuList.remove(i);
				
				// 객체를 가져와서 삭제하는 방식
					// menuList.remove(menuList.get(i));
				System.out.println("<메뉴 삭제 작업 완료>");
				return;
			}
		}
		
		// 삭제 코드를 메서드화 (삭제 메서드 findIdx())
		
		
		System.out.println("해당 메뉴가 없습니다.");
	}

	
	// update(), 
	public void update(Scanner scan) {
		// 메뉴수정 => 메뉴 no 받아서 가격만 수정
		System.out.println("수정할 번호 >");
		int no = scan.nextInt();
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getMenuNo() == no) {
				
				// 수정할 객체 출력
				System.out.println(menuList.get(i));
				
				System.out.println("수정할 가격 >");
				int price = scan.nextInt();
				
				Ex01Menu m = new Ex01Menu(no, menuList.get(i).getMenuName(), price);
				menuList.set(i, m);
				System.out.println("-메뉴수정완료-");
				return;
			}
		}
		
		System.out.println("찾는 메뉴가 없습니다.");
	}

	
	// menuPrint(), 메뉴 출력 메서드
	public void menuPrint() {
		
		System.out.println("----menu----");
		for(Ex01Menu m : menuList) {
			// toString() 으로 출력
			System.out.println(m); 
		}
		
		System.out.println("-------------");
	}

	
	// orderPick(), 주문 번호와 수량을 입력 받아 orderList 객체에 추가
		// order 객체의 주문 이름/가격은 menu 에서 찾아와서 추가 
	public void orderPick(Scanner scan) {
		// 메뉴 리스트 출력하여 보여주기 
		menuPrint();  
		
		// 메뉴 번호와 수량을 입력 	
			// 메뉴 번호
		System.out.println("메뉴번호 >");
		int no = scan.nextInt();
			// 수량
		System.out.println("수량 > ");
		int count = scan.nextInt();
		
		// 메뉴번호로 이름과 가격을 검색
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).getMenuNo() == no) {
				String name = menuList.get(i).getMenuName();
				int price = menuList.get(i).getPrice();
				
				Ex01Order order = new Ex01Order(no, name, price, count);
				orderList.add(order);
				System.out.println("-주문추가 완료-");
				return;
			}
		}
		System.out.println("메뉴가 없습니다.");
		
		
	}
	
	
	// orderPrint(), 영수증
	public void orderPrint() {

		
	}
	
	
	// findIdx(), 메뉴 번호를 주면 menuList 에서 
	// 검색하여 index 를 리턴하는 메서드 
	public int findIdx(int searchNo) {
		// Idx 를 리턴할 변수 생성 
		int tmpIdx = -1;
		
		// UI, 매개변수가 Scanner 인 경우
//		System.out.println("메뉴 번호 입력 : ");
//		int arrNo = sc.nextInt();
		
		// 기존의 menuList 에서 입력받은 Idx 번호를 검색 
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).getMenuNo() == searchNo) {
				tmpIdx = i;
			}
		}
		
		if(tmpIdx == -1) {System.out.println("Not Found..!"); }
		
		// return Idx
		return tmpIdx;
	}

	
	// Getter(), Setter() 
	public ArrayList<Ex01Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Ex01Menu> menuList) {
		this.menuList = menuList;
	}

	public ArrayList<Ex01Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Ex01Order> orderList) {
		this.orderList = orderList;
	}
}
