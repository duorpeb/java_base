// 상수는 변하지 않는 값으로 final 키워드를 사용
// e.g., final double PI = 3.141592
package day09;

import java.text.DecimalFormat;

public class Constant01 {	
	public static void main(String[] args) {
		final double PI = 3.141592;
		
		int r = 2;
		
		DecimalFormat df = new DecimalFormat("0");
		
		df = new DecimalFormat("#.000");
		
		double circumference = 2 * PI * r;
		double area = PI * r * r;
		
		
		
		System.out.println("Area of Circle : " + df.format(area));
		System.out.println("Circumference of Circle : " + df.format(circumference));
	}
}
