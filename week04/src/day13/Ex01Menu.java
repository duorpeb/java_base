package day13;

public class Ex01Menu {
	// 멤버 변수 초기화
	private int menuNo; // 메뉴번호
	private String menuName; // 메뉴명
	private int price; // 가격
	
	// 기본 생성자 (1)
	public Ex01Menu() {}
	
	// 기본 생성자 (2)
		// 메뉴 번호, 메뉴 이름, 가격을 입력받아 메뉴 생성
	public Ex01Menu(int menuNo, String menuName, int price) {
		this.menuNo = menuNo;
		this.menuName = menuName;
		this.price = price;
	}

		
	// toString(), 출력
		// Source -> Generate toString()... Click !
	@Override
	public String toString() {
		return "[" + menuNo + ". " + menuName + ":" + price + "]";
	}
	
	
	// Getter(), Setter() 
	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// Getter(), Setter() fin
}
