package day04;

// 주민등록 번호의 생년월일만 추출 
public class String02 {
	public static void main(String[] args) {

		String regNum = "990101-1234567";
		
		String key = "-";
		
		System.out.print("주민등록번호의 생년월일 : ");
		System.out.println(regNum.substring(0,regNum.indexOf(key)));
	}
}
