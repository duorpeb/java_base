package day12;

import java.util.Scanner;

class VipCustomer extends Customer{
	private double saleRatio;
	private int agentNum;
	private String agentName;
	
	// 기본 생성자 
	public VipCustomer() {}

	
	// 기본 생성자의 오버로딩 
	// VipdCustomer 는 Vip 등급이기에 
	// Vip 등급의 디폴트값을 생성자로 설정
	public VipCustomer(int id, String name, int agentNum, String agentName) {
		super(id,name);
		super.setGrade("Vip");
		super.setBonusPointRatio(0.03);
		this.saleRatio = 0.1;
		this.agentNum = agentNum;
		this.agentName = agentName;
	}
	
	
	// calcPrice() 의 오버라이딩
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
		else if(c == 'Y' && c1 == 'Y') {
			// Gold
			sum += (int)(price * super.getBonusPointRatio()); 
			super.setBonusPoint(sum);
			
			return price - (int)(price * saleRatio);
		}
		
		return price;
	}

	
	// customerInfo() 의 오버라이딩
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담사는 "+agentName+"("+agentNum+")입니다.");
	}
	

	// toString()
	@Override
	public String toString() {
		return "VipCustomer [saleRatio=" + saleRatio + ", agentNum=" + agentNum + ", agentName=" + agentName + "]";
	}


	//Getter(), Setter()
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public int getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(int agentNum) {
		this.agentNum = agentNum;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
}