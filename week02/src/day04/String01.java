package day04;

public class String01 {
	public static void main(String[] args) {
		// 클래스 사용 시 "클래스명_객체명 = new_클래스명()" 형식으로 사용 
		
		String str1 = new String("ABC");
		String str2 = "DEF";
		
		// str1 == str2 의 의미는 각 객체의 주소가 같은지 물어보는 것
		
		
		// length 는 전체 글자수 (글자의 길이) 를 반환 
		System.out.println("str2 의 length : " + str2.length());
		System.out.println("---------------------------------------");
		
		
		// charAt(index) 는 index 번지에 있는 문자를 반환 
		System.out.println("str2 의 charAt(0) : " + str2.charAt(0));
		System.out.println("---------------------------------------");
		
		
		// substring 은 문자열 추출 메서드로 substring(시작점, 종료지점)  
		// index 는 0 부터 시작하고 시작점의 index 는 포함하지만 
		// 종료지점의 Index 는 포함하지 않음 
		System.out.println("str2 의 2번째 글자부터 끝까지의 substring : " + str2.substring(2));
		System.out.println("---------------------------------------");
		
		System.out.println("str2 의 0번째 글자부터 끝까지의 substring : " + str2.substring(0,3));
		System.out.println("---------------------------------------");
		
		
		// "~".compareTo("~") 는 앞 문자열을 기준으로 뒤 문자열과 비교하여 
		// 사전순으로 앞이면 -1, 같으면 0, 뒤면 1 을 반환 
		// 사전순으로 떨어진 간격만큼의 숫자값이 반환 
		System.out.print("문자열 A 와 B 의 비교값 : ");
		System.out.println("A".compareTo("B"));
		System.out.println("---------------------------------------");
		
		System.out.print("문자열 A 와 Z 의 비교값 : ");
		System.out.println("A".compareTo("Z"));
		System.out.println("---------------------------------------");
		
		
		// equals() 는 두 문자의 대소문자까지 구분하여 두 문자가 같은지 비교 
		// 같으면 true, 다르면 false 를 반환 
		// 참조 자료형을 == 로 비교하면 주소가 같은지 비교하며 값의 비교는 기본 자료형만 가능
		System.out.print("hello 와 Hello 의 equals() : ");
		System.out.println("hello".equals("Hello"));
		System.out.println("---------------------------------------");
		
		
		// indexOf() 는 괄호 안의 문자를 문자열에서 탐색하여 
		// 찾는 문자가 있으면 해당 문자의 index 를 반환하고 찾는 문자가 없으면 -1 을 반환
		// 해당 문자열에 같은 문자가 여러 개 있는 경우 처음 만나는 위치의 값을 반환 
		System.out.print("Hello, World! 의 indexOf(H) : ");
		System.out.println("Hello, World!".indexOf("H"));
		
		System.out.print("Hello, World! 의 indexOf(l) : ");
		System.out.println("Hello, World!".indexOf("l"));
		System.out.println("---------------------------------------");
		
		
		// lastIndexOf() 는 괄호 안의 문자를 마지막 index 부터 탐색하여 
		// 찾는 문자가 있으면 해당 문자의 index 를 반환하고 찾는 문자가 없으면 -1 을 반환
		// 해당 문자열에 같은 문자가 여러 개 있는 경우 처음 만나는 위치의 값을 반환 
		System.out.print("Hello, World! 의 lastIndexOf(H) : ");
		System.out.println("Hello, World!".lastIndexOf("H"));
		
		System.out.print("Hello, World! 의 lastIndexOf(l) : ");
		System.out.println("Hello, World!".lastIndexOf("l"));
		System.out.println("---------------------------------------");
		
		
		// substring indexOf() 를 사용하여 id 를 추출 
		String email = "ABCmart123@gmail.com";
		int e = email.indexOf("@");
		
		System.out.print("email 의 0 번째 Index 부터 7번째 Index 까지 문자열 추출 : ");
		System.out.println(email.substring(0,8));
		
		System.out.print("email 의 0 번째 Index 부터 @ 까지 문자열 추출 : ");
		System.out.print(email.substring(0,e) + ", ");
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println("---------------------------------------");
		
		
		// contains() 는 해당 문자열에 해당 문자를 포함하는지 체크 
		String str3 = "Hello,World!";
		
		System.out.print("contains() 를 사용하여 World 를 포함하는지 체크 : ");
		System.out.println(str3.contains("World"));
		System.out.println("---------------------------------------");
		
		
		// concat() 은 문자열을 이어붙이는 용도로 사용되는 메소드로 (덧셈 연산자와 동일)
		String str4 = "Good ";
		String str5 = "Boy";
		
		System.out.print("concat() 를 사용하여 str4 와 str5 문자열 이어붙이기 : ");
		System.out.println(str4.concat(str5));
		System.out.println("---------------------------------------");

	}
}
