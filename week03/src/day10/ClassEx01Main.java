// main 클래스에서 처리
// 상품 10개를 등록 가능한 배열을 생성하고 스캐너를 통해서 상품을 등록받음
// 등록한 상품을 출력

// 모든 멤버 변수를 출력하는 라이브러리 기본 메서드 - toString() 
// Source → Generate toString() 

// @ 은 annotation 으로 annotation 은 자바 소스 코드에 추가하여 
// 사용할 수 있는 메타데이터의 일종으로 보통 @ 기호를 앞에 붙여서 사용

// Source → Generate Constructor using Fields 
// 를 누르면 생성자를 자동으로 만들어줌 
package day10;

import java.util.Scanner;

public class ClassEx01Main {
	public static void main(String[] args) {
		ClassEx01Product[] arr = new ClassEx01Product[10];
		
		char respon;
		boolean bool;
		int cnt = 0, price = 0;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		// 상품 등록
		do {
			bool = true;
			
			if(cnt >= arr.length) { return ; }
			
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			
			respon = Character.toUpperCase(sc.next().charAt(0));
			// respon = sc.next().charAt(0).toUpperCase();
			
			if(respon == 'Y') {
				ClassEx01Product pd = new ClassEx01Product();
				// 위와 같음 
// 			ClassExo1Product pd = new ClassEx01Product();	
//			pd.setName(name);
//			pd.setPrice(price);
				
				sc.nextLine();
				System.out.print("상품명 : ");	
				pd.setName(sc.nextLine());
				
				
				System.out.print("가격 : ");
				pd.setPrice(sc.nextInt());
				
				arr[cnt] = pd;
				cnt++;
			} 
				else if (respon == 'N') {
					// 상품 출력
					for(int i = 0; i < cnt; i++) {
						arr[i].productPrint();
						System.out.println("-------------------");
					}
					bool = false;
				}
				
				else { 
					System.out.println("Finished..!");  bool = false; 
				}
		
		}while(bool);	
	} // main fin
}
