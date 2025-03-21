// 백화점 
	// 일반 고객, Gold 고객, VIP 고객이 있으며 일반 고객을 제외한 고객에게 할인
	// Customer 를 상속 받아 일반 / Gold / VIP 고객을 생성 

// Customer 의 멤버 변수
	// ID - int, 이름, 등급, 보너스 포인트 - int, 보너스 포인트 적립 비율 - double 
	// 일반 고객의 등급은 Silver, Gold 고객은 Gold, VIP 는 VIP
	// 기본 보너스 포인트 적립 비율은 구매 금액의 1% 

// 클래스는 3개 생성 - Silver, Gold, VIP
	// 메서드
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

// 생성 시 TIP
// Customer -> Silver
// GoldCustomer extends Customer{ }
// VipCustomer extends Customer{ }
package day12;

public class CustomerMain {
	public static void main(String[] args) {
		// 손님 등록
		Customer[] customerList = new Customer[10];
			
		int cnt = 0;
		
		Customer cLee = new Customer(1111, "리정혁");
		Customer cHong = new GoldCustomer(2222, "홍길동");
		Customer cKim = new VipCustomer(3333, "김철수", 1001, "순이");
		
		customerList[cnt] = cLee; cnt++;
		
		customerList[cnt] = cHong; cnt++;
		
		customerList[cnt] = cKim; cnt++;
		
		customerList[cnt] = new Customer(4444,"김영이"); cnt++;
		
		customerList[cnt] = new Customer(5555, "최순철"); cnt++;
		
		customerList[cnt] = new VipCustomer(6666, "박짱구", 1002, "영수");
		cnt++;
		
		customerList[cnt] = new GoldCustomer(7777, "박짱아"); cnt++;
		
		customerList[cnt] = new Customer(8888, "이순신"); cnt++;
		
		customerList[cnt] = new Customer(9999, "김장군"); cnt++;
		
		customerList[cnt] = new VipCustomer(10000, "신구", 1002, "영수");
		cnt++;
		
		// 할인율, 포인트 계산 
		System.out.println("\t     <할인율과 포인트 계산>");
		
		int price = 100000;
		
		for(int i = 0; i < cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getName()+
					"님의 지불금액은 "+salePrice+" / 보너스 포인트 "+
					customerList[i].getBonusPoint());
			System.out.println("-------------------------");
		}
		
		System.out.println();
		System.out.println("\t    <고객 정보 리스트>");
		for(int i = 0; i < cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("----------------------------------"
					+ "------------------------");
		}
		
		// Downcasting 
			// agentNum 가 1001 인 사람이 퇴사하여 
			// 1001 이 담당하던 사람들 자리에 1003, 김희철로 변경 
	}
}
