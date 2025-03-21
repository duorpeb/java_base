// <트럼프 카드>
// 메소드 1) printCard() - 카드 출력
// 메소드 2) 생성자() - 카드 초기화
// 메소드 3) shuffle() - 카드 섞는 기능 
// 메소드 4) draw() - 카드 한 장을 나눠주는 기능
package day09;

public class CardPack {
 private
 	// Card 클래스를 담는 pack 배열 (idx 0 ~ 51) 
 	// 자료형 배열명[] = new 자료형[개수];
 
 	// Card 객체 52개를 배열 형태로 만들어 사용하기 위해 작성한 코드로 
  // Card 객체를 담을 레퍼런스 변수 52개가 배열 형태로 생성된 것 
 	Card pack[] = new Card[52];
 
  // pack 배열의 index 체크 변수 
 	int cnt = 0;
 
  // 기본 생성자 - 카드 셔플 순서를 순서대로 초기화
 	// Card pack[] = new Card[52]; 는 각 객체가 완전히 생성된 것은 아니기에 
 	// Card 객체 pack 을 사용하기 위해서는 pack[cnt] = c 와 같이 초기화해주어야 함 
  public CardPack() { 
  	// CardPack 클래스의 객체가 생성되면 52장의 Card Class 객체가 생성되어야 함 
  	String s = "";
  	
  	// 4가지 모양을 넣기위한 반복문
		for1 : for(int i = 1; i <= 4; i++) {  
			switch(i) {
			case 1: s = "♥"; break;
			case 2: s = "◆"; break;
			case 3: s = "♠"; break;
			case 4: s = "♣"; break;
			}
			
			// 1~13까지 숫자를 넣기위한 반복문
			for2 : for(int j = 1; j <= 13; j++) { 
				// Card class 객체 1개 생성 (새 카드 1장 생성)
				Card c = new Card();
				
				// pack 배열에 카드 담기 
				c.setShape(s);
				c.setNum(String.valueOf(j));
				pack[cnt] = c;  
				cnt++;
			} // for2 fin
		} // for1 fin 
  } // CardPack() fin 
	
  
 public
  // shuffle() - 카드 섞기 
  void shuffle() {
	 for(int i = 0; i < pack.length; i++) {
		 int rand = (int)(Math.random()*pack.length);
		 
		 Card tmp = pack[i];
		 pack[i] = pack[rand];
		 pack[rand] = tmp;
	 }
 	}
 	
  
  // draw() - 카드 뽑기, 자료형 Card
  Card draw() {
  	// 더 이상 뽑을 카드가 없을 때 null 반환 
  	if(cnt == 0) { return null; }
  	
  	cnt--;
  	return pack[cnt];
  }
 
	public Card[] getPack() {
		return pack;
	}

	
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
}
