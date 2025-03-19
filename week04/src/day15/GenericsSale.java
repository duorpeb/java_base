package day15;

// Generic Programming
public class GenericsSale <K,V> {
	// 일반적인 멤버 변수 초기화 
//	private String menu;
//	private int price;
	
	// 제네릭 방식으로 멤버 변수 초기화  
	private K menu;
	private V price;
	
	public K getMenu() {
		return menu;
	}

	
	// 기본 생성자 
	public GenericsSale(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "Menu : " + menu + ", Price : " + price;
	}


	// Getter(), Setter()
	public void setMenu(K menu) {
		this.menu = menu;
	}


	public V getPrice() {
		return price;
	}


	public void setPrice(V price) {
		this.price = price;
	}
	// Getter(), Setter() fin
}
