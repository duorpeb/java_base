// 학생 정보를 관리하기 위한 클래스 생성 
// 학생 정보가 담겨있는 클래스 = Student
// 학생 정보는 이름, 생년월일, 연락처, 나이 
// 학원 정보는 학원 이름 (상수로 지정, final = "Korea IT"), 지점
// 수강 정보는 수강 과목, 기간 (최대 5과목을 들을 수 있음, 배열의 길이 5) 
// 각 정보는 따로 출력 

// 출력 형식 
	// 학생 정보
		// 홍길동 010101 010-1234-5678 (25)

	// 학원 정보 	
		// Korea IT, 강남 지점

	// 수강정보 (나중에 추가 가능, null 값 대입 가능) (추가만 가능)
		// 공공데이터 국비 (25-02-26~25-08-01)
		// Java (25-01-05~25-02-05)

// 메서드 1) studentDisplay() - 학생의 기본 정보를 출력하는 메서드
// 메서드 2) studentCourse() - 학생의 수강 정보를 출력하는 메서드
// 메서드 3) studentCourseAdd() - 학생의 수강 정보를 추가하는 메서드
package day09;

public class Exam02Main {
  public static void main(String[] args) {
		// 기본 생성자, 학생 1
  	Exam02Student a = new Exam02Student("Lee", "020226","010-1234-5678","24");
  	
  	a.setPlace("강남");
  	a.courseAdd("Java","250226","250816");
  	a.courseAdd("DB","250311","250910");
  	
  	// 생성자 오버로딩 (1), 학생 2 
  	Exam02Student b = new Exam02Student("Kim","010-9876-5432","부산");
  	
  	b.setDate("030303");
  	b.setAge("23");
  	b.courseAdd("공공데이터 국비","250110","250630");
  	
  	// 생성자 오버로딩 (1), 학생 3
  	Exam02Student c = new Exam02Student("Ji","010-1240-1923","강남");
  	
  	c.setDate("991110");
  	c.setAge("27");
  	c.courseAdd("DB","250311","250910");
  	
  	// 생성자 오버로딩 (1), 학생 4
  	Exam02Student d = new Exam02Student("Ki","010-9273-2432","신촌");
  	
  	d.setDate("971230");
  	d.setAge("29");
  	d.courseAdd("Java","250226","250816");
  	
  	// 생성자 오버로딩 (1), 학생 5
  	Exam02Student e = new Exam02Student("Hwang","010-9273-2432","인천");
  	
  	e.setDate("000101");
  	e.setAge("26");
  	e.courseAdd("Java","250226","250816");
  	e.courseAdd("공공데이터 국비","250110","250630");
  	
  	// 생성자 오버로딩 (1), 학생 6
  	Exam02Student f = new Exam02Student("Son","010-7175-6620","강남");
  	
  	f.setDate("000730");
  	f.setAge("26");
  	f.courseAdd("Java","250226","250816");
  	f.courseAdd("공공데이터 국비","250110","250630");
  	f.courseAdd("DB","250311","250910");
  	
  	// 생성자 오버로딩 (1), 학생 7
  	Exam02Student g = new Exam02Student("Park","010-2939-7920","신촌");
  	
  	g.setDate("981030");
  	g.setAge("28");
  	g.courseAdd("DB","250311","250910");
  	
  	// 생성자 오버로딩 (1), 학생 8
  	Exam02Student h = new Exam02Student("Jang","010-8603-5513","강남");
  	
  	h.setDate("010101");
  	h.setAge("26");
  	h.courseAdd("공공데이터 국비","250110","250630");
  	
  	// Student 객체 8개를 배열로 가지는 studentArr 생성
  	Exam02Student[] studentArr = new Exam02Student[8];
  	studentArr[0] = a;
  	studentArr[1] = b;
  	studentArr[2] = c;
  	studentArr[3] = d;
  	studentArr[4] = e;
  	studentArr[5] = f;
  	studentArr[6] = g;
  	studentArr[7] = h;
  	
  	// 각 학생의 정보 확인
//  	for(int i = 0; i < studentArr.length; i++) {
//  		studentArr[i].studentDisplay();
//  		System.out.println("----------------------");
//  	}
  	
  	
  	// 특정 학생 정보를 이름으로 찾기 
//  	String searchName = "Ki";
//  	
//		for(int i = 0; i < studentArr.length; i++) {
//			if (studentArr[i].getName().equals(searchName) == true) {
//				studentArr[i].studentDisplay();
//			}
//		}
//		System.out.println("------------------------");
//		
		
		// 특정 학생 정보와 학원 정보를 과목으로 찾기 
		String searchCourse = "Java";
		
		for(int i = 0; i < studentArr.length; i++) {
			for(int j = 0; j < studentArr[i].getCnt(); j++) {
				if (studentArr[i].getCourseArr()[j].getCourse().equals(searchCourse)) {
					studentArr[i].studentDisplay();
				}
			}
		}
		System.out.println("------------------------");
		
		// 확인
		// getCourseArr() 의 값 확인 - 참조 배열은 주소를 참조
		// 즉, 값이 아닌 주소를 반환 
//		for(int i = 0; i < studentArr.length; i++) {
//			System.out.println(studentArr[i]);
//		}
		
		// 확인 - courseArr[i] 또한 주소를 반환 
//		for(int i = 0; i < 5; i++) {
//			System.out.println(a.courseArr[i]);  
//		}
		
//		// null
//		Exam02SdCourse tmp = new Exam02SdCourse(); 
//		System.out.println(tmp.getCourse());
		
		
		// 특정 학생 정보와 학원 정보를 지점으로 찾기   
		String searchPlace = "강남";
		
		for(int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getPlace().equals(searchPlace) == true &&
					studentArr[i].getPlace() != null) 
			{
				studentArr[i].studentDisplay();
				System.out.println();
			} 
		} // for fin
		
		
	} // main fin
}


