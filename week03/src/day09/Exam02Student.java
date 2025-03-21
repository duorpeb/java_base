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

public class Exam02Student {
 final String ACADEMY = "Korea IT"; 
	
  private String name;
	private String date;
  private String phone;
  private String age; 
  private String place;
  private Exam02SdCourse[] courseArr = new Exam02SdCourse[5];
  
  // 기간을 배열로 생성 
  // String[] period = new String[5]; 
  private int cnt = 0;
  
  
  // 기본 생성자
	public Exam02Student(String name, String date, String phone, String age) { 
		this.name = name;
		this.date = date;
		this.phone = phone;
		this.age = age;
	}
	
	
	// 생성자 오버로딩 (1)
	public Exam02Student(String name, String phone, String place){
		this.name = name;
		this.phone = phone;
		this.place = place;
	}
	
	
	// 생성자 오버로딩 (2)
	public Exam02Student(String name, String date, String phone, String age
			,String place) {
		// 생성자 호출
		// 생성자 호출은 첫 라인에서만 호출 가능하며 첫 라인이 아닌 경우 Error 발생 
		this(name,date,phone,age);
		this.place = place;
	}
	
	
 public
   // studentDisplay()
	 void studentDisplay() {
		System.out.println("<학생 정보>"); 
		System.out.println("이름 : " + getName());
		System.out.println("생일 : " + getDate());
		System.out.println("연락처 : " + getPhone());
		System.out.println("나이 : " + getAge());
	} // stduentDisplay() fin
	
 	
//  // academyInput() - setPlace() 와 중복된 코드 
//  void academyInput(String place) { setPlace(place); }
 
  
  // academyDisplay()
  void academyDisplay() {
  	System.out.println("<학원 정보>");
  	System.out.println("지점 : " + ACADEMY + " " + getPlace() + "지점");
  } // academyDisplay() fin
	
  
  // courseAdd()
  void courseAdd(String course, String dateStart, String dateEnd) {
  	// course[4] 를 넘어가면 배열을 복사해서 다시 생성 
  	if(cnt >= 5) { 
  		// 
  		// System.out.println("더 이상 추가할 수 없습니다"); return; 
  		
  		// 배열 복사 후 추가 생성 
//  		String courseTmp[] = new String[courseArr.length+5];
//			String periodTmp[] = new String[this.period.length+5];
//			
//			// arraycopy
//			System.arraycopy(course, 0, courseTmp, 0, courseArr.length);
//			System.arraycopy(this.period, 0, periodTmp, 0, this.period.length);
//			
//			// 기존 배열의 참조변수와 객체를 바꿔치기
//			this.courseArr = courseTmp;
//			this.period = periodTmp;
  	}
  	
  	courseArr[cnt] = new Exam02SdCourse(course, dateStart, dateEnd); 
  	cnt++;
  } // courseAdd() fin


	// courseDisplay()
  void courseDisplay() {
  	if(cnt == 0) { System.out.println("수강 과목이 없습니다"); return; } 
  	
	 for(int i = 0; i < cnt; i++) {
		 System.out.println("<수강 정보 " + (i+1) + ">");
		 System.out.println("수강 과목 : " + courseArr[i].getCourse());
		 System.out.println("개강일 : " + courseArr[i].getDateStart());
		 System.out.println("종료일 : " + courseArr[i].getDateEnd());
		 System.out.println();
	 }
 } // courseDisplay() fin
  
  
  // Getter(), Setter()
  // getName(), setName()
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	
	// getDate(), setDate()
	public String getDate() { return date; }

	public void setDate(String date) { this.date = date; }
	
	
	// getPhone(), setPhone()
	public String getPhone() { return phone; }

	public void setPhone(String phone) { this.phone = phone; }

	
	// getPlace(), setPlace()
	public String getPlace() { return place; }

	public void setPlace(String place) { this.place = place; }
	
	
	// getAge(), setAge()
	public String getAge() { return age; }
	
	public void setAge(String age) { this.age = age; }
	
	
	// getCourseArr(), setCourseArr()
  public Exam02SdCourse[] getCourseArr() {
		return courseArr;
	}

	public void setCourseArr(Exam02SdCourse[] courseArr) {
		this.courseArr = courseArr;
	}
	
	
  public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
} // Exam02Studen class fin
