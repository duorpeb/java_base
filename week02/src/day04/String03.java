package day04;

public class String03 {
	public static void main(String[] args) {
		String str1 = "Lee Young Seok";
		
		// toLowerCase() 는 모든 문자열을 소문자로 변환하고
		// toUpperCase() 는 모든 문자열을 대문자로 변환
		System.out.print("Lee Young Seok 의 toLowerCase() : ");
		System.out.println("Lee Young Seok".toLowerCase());
		
		System.out.print("Lee Young Seok 의 toUpperCase() : ");
		System.out.println(str1.toUpperCase());
		System.out.println("--------------------------------------------------");
		
		
		// isEmpty() 는 값이 비었는지 확인
		System.out.print("str 의 isEmpty() : ");
		System.out.println(str1.isEmpty());
		System.out.println("--------------------------------------------------");
	
		
		// trim() 은 문자열의 불필요한 공백을 제거 
		String str2 = "       H  E  L  L  O  !       ";
		
		System.out.print("str2 의 trim() : ");
		System.out.println(str2.trim());
		System.out.println("--------------------------------------------------");
		
		
		// replace() 는 글자를 치환 
		String str3 = "A,B,C,D";
		
		System.out.print("str3 의 replace() : ");
		System.out.println(str3.replace(",", "/"));
		System.out.println("--------------------------------------------------");
		
		
		// split() 은 특정값을 기준으로 나누어 배열로 리턴 
		System.out.print("str3 의 split() : ");
		System.out.println(str3.split(",")); // 객체기에 주소로 리턴
		
		String[] arr = str3.split(",");
		for(int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "]" + ": " );
			System.out.println(arr[i]); 
		}
		
		System.out.println("--------------------------------------------------");
		
		
		
		// Integer.parseInt() 는 문자열을 숫자로 변환
		String str4 = "1234567";
		
		int change_str4 = Integer.parseInt(str4);
		System.out.print("Integer.parseInt(str4) : " + change_str4);
		
		
		// String.valueOf() 는 숫자를 문자열로 변환 
		// instanceof 는 객체의 형이 일치하는지 체크하는 연산자로 클래스 자료형에만 사용 가능 
		String str5 = String.valueOf(str4);
		
		System.out.println("String.valueOf(str4) : " + str5);
		System.out.println(str5 instanceof String);
	}
}
