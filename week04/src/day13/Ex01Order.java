package day13;

// Ex01Menu 를 상속 받아 Ex01Order 생 
public class Ex01Order extends Ex01Menu {

	// Ex01Order 의 멤버 변수 초기화 - 수량, 금액 (가격 = 수량 * 금액)
	private int count; // 수량
	private int total; // 합계 (가격 * 수량)
	
	// 기본 생성자 (1)
	public Ex01Order() {}
	
	// 기본 생성자 (2), Ex01Menu 를 상속 받아 생성 
	public Ex01Order(int menuNo, String menuName, int price, int count) {
		// super(menuNo, menuName, price) 는
		// Ex01Menu 의 menuNo, menuName, price 를 상속 
		super(menuNo, menuName, price);
		this.count = count;
		this.total = price * count;
	}
	
	// printOrder(), 한 주문에 대한 출력 메서드 
		// Ex01Menu.toString() ( == super.toString() )을 상속 
	public void printOrder() {
		System.out.println(super.getMenuNo() + ". " +
				super.getMenuName() + "  " + super.getPrice() +
				" " + this.count + " => " + this.total);
	}

	// toString(), 출력 메서드 
	@Override
	public String toString() {
		return "Order [count=" + count + ", total=" + total + "]";
	}
	
	
	// Getter(), Setter() 
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	// Getter(), Setter() fin
}
