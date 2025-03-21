package day12;

import java.util.Scanner;

class GoldCustomer extends Customer{
	
	private double saleRatio;
	
	// 기본 생성자
	public GoldCustomer() {}

	// 기본 생성자 오버로딩, +
	// GoldCustomer 는 골드 등급이기에 
	// 골드 등급의 디폴트값을 생성자로 설정
	public GoldCustomer(int id, String name) {
		super(id,name);
		
		// GoldCustomer 에서 추가/수정
		super.setGrade("Gold");
		super.setBonusPointRatio(0.02);
		this.saleRatio = 0.1;
	}
	
	// calcPrice() 만 가져와서 수정 
	@Override
	public int calcPrice(int price) {
		char c,c1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 적립 여부 체크 
		System.out.print("보너스를 적립하시겠습니까? (Y/N) ");
		c = Character.toUpperCase(sc.next().charAt(0)); 
		
		// 할인 여부 체크
		System.out.print("할인을 받으시겠습니까? (Y/N) ");
		c1 = Character.toUpperCase(sc.next().charAt(0)); 
		
		// 적립만
		if(c == 'Y' && c1 == 'N') {
			// Gold
			sum += (int)(price * super.getBonusPointRatio()); 
			super.setBonusPoint(sum);
			
			return price;
		}
		
		// 적립 + 할인
		if(c == 'Y' && c1 == 'Y') {
			// Gold
			sum += (int)(price * super.getBonusPointRatio()); 
			super.setBonusPoint(sum);
			
			return price - (int)(price * saleRatio);
		}
		
		return price;
	}

	
	// 출력, toString()
	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + "]";
	}



	// Getter(), Setter()
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
}
