package day03;

// println() 은 줄바꿈이 있는 출력 
// print() 는 줄바꿈이 없는 출력으로 출력값이 없으면 Error 발생 
// printf() 는 지시자 (형식 지정자) 를 이용한 출력 가능
public class Printf01 {
	public static void main(String[] args) {
		// 형식 지정자 - 1) %f : 실수형 출력
		System.out.println("형식 지정자의 유형 - 1) %f : 실수형 출력");
		
		// float 형 사용 시 숫자 뒤 f 붙여야 함 
		float pi = 3.1415926536f;
		
		// 일반 형식
		System.out.printf("%f%n", pi);
		
		// 소수점 3자리 까지 출력 (반올림 출력)
		System.out.printf("%.3f%n%n", pi);

		
		// 형식 지정자 - 2) %d : 정수형 출력
		System.out.println("형식 지정자의 유형 - 2) %d : 정수형 출력");
		
		int i = 77;
		System.out.printf("① %d%n%n",i);
		
		// 세 자리 수 형식으로 출력 
		System.out.printf("② %3d%n%n", i);
		
		// 5자리 형식으로 출력 
		System.out.printf("③ %5d%n%n", i);

		
		// 빈칸을 0으로 채워 출력 
		
		
		//형식 지정자 - 3) %n : 줄바꿈
		System.out.println("형식 지정자 - 3) %n : 줄바꿈");
	}
}
