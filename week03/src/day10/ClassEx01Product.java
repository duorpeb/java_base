// Product 클래스 
// Product 클래스는 상품을 등록하는 클래스 
// 메서드 1) 상품명과 가격을 출력하는 메서드 
// 메서드 2) 상품을 추가하는 메서드  
package day10;

public class ClassEx01Product {
	// 멤버 변수
	private String name; 
 	private int price;
  
 	
 	// 기본 생성자
 	public ClassEx01Product() {}
 	
 	// 기본 생성자 오버로딩 (1)
 	public ClassEx01Product(String name, int price) {
 		this.name = name;
 		this.price = price;
 	}
 	
 	// 기본 생성자 오버로딩 (1)
 	public ClassEx01Product(String name) { this.name = name; }
 	
 
  // 상품명과 가격을 출력하는 메서드 
  void productPrint() {
  	System.out.println("<상품 정보>");
	 	System.out.println("상품명 : " + getName());
	 	System.out.println("가격 : " + getPrice());
 	}
  
  
  // Getter, Setter 
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
} // Class fin
