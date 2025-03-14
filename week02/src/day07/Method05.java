package day07;

//두 정수를 입력받아 최소공배수를 리턴하는 메서드
public class Method05 {
	// gcd (최대 공약수) ,lcm (최소 공배수) 리턴 
	
	
	// 두 정수를 입력받아 최대공약수를 리턴하는 메서드 
	// gcd
	public static int gcd(int a, int b) {
		// 최대공약수를 구하기 위한 변수 생성 
		int gcd = 0;
		
		// a < b 인 경우
		if(a < b){
			for(int i = 1; i <= b; i++) {
				if(a % i == 0 && b % i == 0) { gcd = i; }
			}
		} // if fin
			// b > a 인 경우
			else {
				for(int i = 1; i <= a; i++) {
					if(a % i == 0 && b % i == 0) { gcd = i;}
				}
		}
		
		return gcd;
	} // gcd fin
	
	
	
	// lcm
	// 최소 공배수 (LCM) = (a*b)/최대 공약수(GCD)
	public static int lcm(int a, int b) {
		int result = gcd(a,b);
		
		return (a*b)/result;
	} // lcm fin
	
	
	//main
	public static void main(String[] args) {
		System.out.println(gcd(3,6)); 
		System.out.println(lcm(2,4));
	} // main fin
}
