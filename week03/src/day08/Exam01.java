// TV Remote Controller 클래스 생성 
package day08;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		myTv.power();
		
		System.out.println();
		myTv.ch();
		
		myTv.tvDisplay();
		
		myTv.chUp();
		myTv.chUp();
		myTv.chUp();
		myTv.chUp();
		myTv.chUp();
		
		myTv.volUp();
		myTv.volUp();
		myTv.volUp();
		myTv.volUp();
		myTv.volUp();
		myTv.volUp();
		myTv.volUp();
//		myTv.volUp();
//		myTv.volUp();
//		myTv.volUp();
//		myTv.volUp();
//		myTv.volUp();
		
		System.out.println();
		myTv.tvDisplay();
		
		System.out.println();
		System.out.println("--------------- Power OFF ---------------");
		myTv.power();
	}
}

// TvRc 의 메소드
// 메소드 1) power() - TV 의 전원
// 메소드 2) ch() - TV 의 채널 
// 메소드 3) vol() - TV 의 볼륨 
// 메소드 4) Getter() 와 Setter() 
class Tv{
 // 멤버 변수	
 // brand : Tv 의 Brand, power : Tv 의 Power, ch : 채널 선택, vol : 볼륨 조절	
 private
  // boolean 의 초기값은 false;
 	boolean power;
  
	int vol, ch;

	
 public
 	// 메소드 1) power()
   void power(){
	  if(power = !power) { 
	  	if(power = true) {
	  	  System.out.println("■■■■■■ <TV 정보 출력> ■■■■■■■");
	  	  System.out.println("■ \t\t\t ■");
	  	  System.out.println("■ \t\t\t ■");
	  	  System.out.println("■ \t\t\t ■");
	  	 
	  	  System.out.println("■\t SamSung \t ■");
	  	 
	  	  System.out.println("■ \t\t\t ■");
	  	  System.out.println("■ \t\t\t ■");
	  	  System.out.println("■ \t\t\t ■");
	  	  System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
	  	}
	  } 
	   	else { System.out.println("TV OFF"); }
  }	// power() fin
 
 
 // 메소드 1.1) tvDisplay(), tvDisplay() 내에서 모든 정보가 출력
  void tvDisplay(){
	  System.out.println("■■■■■■ <TV 정보 출력> ■■■■■■■");
	  
	  if(getCh() < 10) { System.out.println("■ \t\t" + "ch : " + getCh() + "   ■"); }
	  else if(getCh() > 10) { System.out.println("■ \t\t" + "ch : " + getCh() + "  ■"); }
	  
	  if(getVol() == 10) { System.out.println("■ \t\t" + "vol : " + getVol() + " ■"); }
	  else { System.out.println("■ \t\t" + "vol : " + getVol() + "  ■"); }
	  
	  System.out.println("■ \t\t\t ■");
	 
	  System.out.println("■\t    내용 \t\t ■");
	 
	  System.out.println("■ \t\t\t ■");
	  System.out.println("■ \t\t\t ■");
	  System.out.println("■ \t\t\t ■");
	  System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
  }	// tvDisplay() fin
 
  
  // 메소드 2) ch() - TV 채널 조정 
  // channel 은 1~30 까지 있으며 임의로 선택 가능 
  int ch() {
  	int choiceNum = 0;
  	
  	System.out.println("     <채널 선택>");
  	System.out.println("1) ↑ (+)  2) ↓ (-)");
  	System.out.println("3) 채널 직접 입력");
  	System.out.print("선택 : ");
  	
  	Scanner sc = new Scanner(System.in);
  	
  	choiceNum = sc.nextInt();
  	
  	switch(choiceNum) {
  		case 1: chUp(); break;
  		
  		case 2: chDown(); break;
  		
  		case 3: 
  			System.out.println();
  			System.out.println("채널을 입력하세요");
  			System.out.print("채널 : ");
  			
  			int choiceCh = sc.nextInt();
  			if(choiceCh > 0 && choiceCh <= 30) {
  				ch = choiceCh; 
  				System.out.println("현재 채널은 " + choiceCh + "번 입니다");
  			} 
  			
  			else { 
  				System.out.println("잘못된 입력입니다 !");
  			}
  			break;
  		
  		default:
  			System.out.println("Finished...!");
  	}
	  return ch;
  } // ch() fin
 
 
  // 메소드 2.1) chUp() - 채널 1 증가 
  int chUp() { 
  	if(0 < getCh() && getCh() <= 30) { ch++; }  
  	
  	else if(getCh() > 30) { setCh(1); }
  	
  	else { System.out.println("Wrong Input !"); }
  	
  	return ch;
  } // chUp() fin
  
  // 메소드 2.2) chDown() - 채널 1 감소
  int chDown() { 
  	if(0 < getCh() && getCh() <= 30) { ch--; }  
  	
  	else if(0 >= getCh() || getCh() > 30) { setCh(1); getCh(); }
  	
  	else { System.out.println("Wrong Input !"); }
  	
  	return ch; 
  } // chDown() fin

  
  // 메소드 3) volUp() - 볼륨 증가 
  // volume 은 0~10 까지 있으며 0 이면 음소거 10 이상이면 10 으로 설정 
  int volUp() { 
  	if(0 <= getVol() && getVol() <= 10) { vol++; } 
  	
  	else if (getVol() >= 10) { setVol(10); }
  	
  	else { System.out.println("Wrong Input !"); }
  	
  	return vol;
  } // volup() fin
  
  
  // 메소드 3.1) volDown() - 볼륨 감소 
  int volDown() { 
  	if(0 <= getVol() && getVol() <= 10) { vol--; }
  	
  	else if(getVol() <= 0) { System.out.println("Mute..!"); }
  	
  	else { System.out.println("Wrong Input !"); }
  	
  	return vol;
  } // volDown() fin
	
  
  // 메소드 4) Getter 와 Setter()
	public boolean isPower() { return power; }
	

	public void setPower(boolean power) { this.power = power; }


	public int getVol() { return vol; }


	public void setVol(int vol) { this.vol = vol; }


	public int getCh() { return ch; }


	public void setCh(int ch) { this.ch = ch; }
}