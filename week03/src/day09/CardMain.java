package day09;

public class CardMain {
	public static void main(String[] args) {
		Card c = new Card();
		CardPack cp = new CardPack();
		
		// 기본 생성자 확인, c.Print();
//		c.setShape("#");
//		System.out.print("Shape : # \t" + "출력 결과 : ");
//		c.print();
//		
//		c.setNum("22");
//		System.out.print("Num : 22 \t" + "출력 결과 : ");
//		c.print();
//		
//		c.setShape("◆");
//		System.out.print("Shape : ◆ \t" + "출력 결과 : ");
//		c.print();
//		
//		c.setNum("7");
//		System.out.print("Num : 7 \t" + "출력 결과 : ");
//		c.print();
//		
//		c.setNum("12");
//		System.out.print("Num : 12 \t" + "출력 결과 : ");
//		c.print();
//		
//		c.setShape("♣");
//		System.out.print("Shape : ♣ \t" + "출력 결과 : ");
//		c.print();
		System.out.println("-------------------------------------");
		
	// cardpack 객체 확인
			int cnt = 0;
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=13; j++) {
					cp.getPack()[cnt].print();
					cnt++;
				}
				System.out.println();
			}
	}
}
