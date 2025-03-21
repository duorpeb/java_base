package day12;

import java.util.Scanner;

public class Customer {
	private int id; 
	private String name; 
	private String grade;
	private int bonusPoint;
	private double bonusPointRatio;
	
	// 기본 생성자 
	public Customer() {}
	
	// 기본 생성자 오버로딩, +
	// Customer 는 실버 등급이기에 
	// 실버 등급의 디폴트값을 생성자로 설정 
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "Silver";
		this.bonusPointRatio = 0.01;
	}
	
	// 메서드 1) 보너스 적립 계산 메서드, calcPrice()
		// 구매 금액의 1% 적립하고 보너스 포인트에 누적 
		// 보너스 적립 여부, 할인 여부를 체크해서 구매 

	// 메서드 2) 출력 메서드, customerInfo()
		// e.g., ㅁㅁㅁ님은 VIP 고객이며 보너스 포인트는 1,000 점 입니다
		// 전담 상담사는 ㅁㅁㅁ 이고 번호는 1111 입니다 (VIP 일 경우에만 출력)
	
	// 메서드 3) 등급별 할인 적립 여부, gradeSale()
		// Silver 는 구매 시 할인 X, 보너스 포인트 1% 적립 
		// Gold 는 구매 시 10% 할인, 보너스 포인트 2% 적립 
		// VIP 는 구매 시 10% 할인, 보너스 포인트 3% 적립 
			// VIP 는 전담 상담사 (agentName, agentNum) 을 멤버 변수에 추가


	// 메서드 1) 보너스 적립 계산 메서드, calcPrice()
	public int calcPrice(int price) {
		char c,c1;

		Scanner sc = new Scanner(System.in);
		
		// 적립 여부 체크 
		System.out.print("보너스를 적립하시겠습니까? (Y/N) ");
		c = Character.toUpperCase(sc.next().charAt(0)); 
		
		// 할인 여부 체크, Silver 는 할인 X
//		System.out.print("할인을 받으시겠습니까? (Y/N) ");
//		c1 = Character.toUpperCase(sc.next().charAt(0)); 
		
		if(c == 'Y') {
			// Silver 
			this.bonusPoint += (int)(price * this.bonusPointRatio); 
			return price;
		}
		// 확인, System.out.println(bonusPoint);
		return price;
	}
	
	
	// 메서드 2) 출력 메서드 
	public void customerInfo() {
		System.out.print(name + "님은 " + grade + " 등급이며"); 
		System.out.println("보너스 포인트는 " + bonusPoint + " 입니다"); 
	}
	
	
	// 메서드 3) 
//	// 메서드 2) 등급별 할인 적립 메서드, gradeSale()
//	public int gradeSale() {		
//		switch(grade){
//			case "Silver": bonusPoint += (int)(price * 0.01); break;
//			
//			case "Gold": 
//				bonusPoint += (int)(price * 0.02); 
//				price = price - (int)(price * 0.1);
//				break;
//				
//			case "Vip": 
//				bonusPoint += (int)(price * 0.03); 
//				price = price - (int)(price * 0.1);
//				break;
//		}
//	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint
				+ ", bonusPointRatio=" + bonusPointRatio + "]";
	}

	
	// Getter(), Setter()
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusPointRatio() {
		return bonusPointRatio;
	}

	public void setBonusPointRatio(double bonusPointRatio) {
		this.bonusPointRatio = bonusPointRatio;
	}
}
