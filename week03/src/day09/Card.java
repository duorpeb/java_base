package day09;

// 트럼프 카드 (플레잉 카드) 중 하나의 카드를 출력
// 잘못된 모양 입력은 하트로 잘못된 숫자 입력은 1로 출력 
// 기본 생성자 (기본 초기화) 는 하트1
public class Card {
 private
  String shape, num;
 	String[] shpae = {"♥","◆","♠","♣"};
 
 	// 기본 생성자 
  public Card(){ 
  	 this.shape = shape;
     this.num = num;
  }
  
  
 public
 	// Print()
  void print() { System.out.print(getShape() + getNum() + " "); }
 
 
 	// PrintCard(){}
 	void printCard(){
 		for (int i = 0; i < 4; i++) {
	 		switch(i) {
	 			case 0: setShape("♥"); break;
	 			case 1: setShape("◆"); break;
	 			case 2: setShape("♠"); break;
	 			case 3: setShape("♣"); break;
	 		}
	 		
	 		for(int j = 1; j <= 13; j++) {
	 			setNum(String.valueOf(j));
	 			print();
	 			System.out.print("  ");
	 		}
	 		
	 		System.out.println();
 		}
 	}
 	
 	
 	// printCardArr() - 초기화 배열 
// 	String[] printCardArr() {
// 		String[] arr;
// 		
// 		for(int i = 0; i < 52; i++) {
// 			for(int j = 0; i < 4; j++) {
// 				String v = String.valueOf(j);
// 				
// 				switch(j) {
//		 			case 0: setShape("♥"); break;
//		 			case 1: setShape("◆"); break;
//		 			case 2: setShape("♠"); break;
//		 			case 3: setShape("♣"); break;
// 				}
// 				
// 				arr[i] = setShape(v);
// 			}
// 			
// 		}
// 		retrun 
// 	}
 	
 
 	// getShpae()
  String getShape() { return this.shape; }
  
  
  // setShape()
  void setShape(String shape){ 
	  switch(shape) {
	 	 case "♥" : this.shape = shape; break;		
	 	 
	 	 case "◆" : this.shape = shape; break;		
	 	 
	 	 case "♠" : this.shape = shape; break;		
	 	 
	 	 case "♣" : this.shape = shape; break;		
	 	 
	 	 default: this.shape = "♥"; 
	 }
  }

  
  // getNum() 
  String getNum(){ return this.num; }
  
  
  // setNum()
  void setNum(String num){ 
  	switch(num) {
  		case "1" : case "A" :
  			this.num = "A"; break;
  		
  		case "2" : this.num = num; break;
  		
  		case "3" : this.num = num; break;
  		
  		case "4" : this.num = num; break;
  		
  		case "5" : this.num = num; break;
  		
  		case "6" : this.num = num; break;
  		
  		case "7" : this.num = num; break;
  		
  		case "8" : this.num = num; break;
  		
  		case "9" : this.num = num; break;
  		
  		case "10": this.num = num; break;
  		
  		case "11": case "J" :
  			this.num = "J"; break;
  			
  		case "12" : case "Q" :
  			this.num = "Q"; break;
  			
  		case "13" : case "K" :
  			this.num = "K"; break;
  			
  		default: this.num = "A";
  	} 
  	// fin
  }
}



